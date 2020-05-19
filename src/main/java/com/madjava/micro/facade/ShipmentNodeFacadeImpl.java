package com.madjava.micro.facade;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.madjava.micro.convert.ShipmentNodeConvert;
import com.madjava.micro.convert.ShipmentNodeParentLineConvert;
import com.madjava.micro.dto.ResultData;
import com.madjava.micro.dto.shipment.ShipmentAdjustmentTaskData;
import com.madjava.micro.dto.shipment.ShipmentNodeData;
import com.madjava.micro.dto.shipment.ShipmentTopologyData;
import com.madjava.micro.enumtype.MessageEnum;
import com.madjava.micro.enumtype.shipment.ShipmentEnum;
import com.madjava.micro.facade.shipment.ShipmentAdjustmentTaskFacade;
import com.madjava.micro.facade.shipment.ShipmentNodeFacade;
import com.madjava.micro.mapper.ShipmentNodeMapper;
import com.madjava.micro.model.shipment.ShipmentNodeModel;
import com.madjava.micro.service.ShipmentNodeParentLineService;
import com.madjava.micro.service.ShipmentNodeService;
import com.madjava.micro.service.id.generator.IdGenerator;

/**
 * @Classname ShipmentNodeFacade
 * @Description 出货节点FacadeImpl层
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Component
@Slf4j
public class ShipmentNodeFacadeImpl implements ShipmentNodeFacade{

    @Autowired
    private ShipmentNodeConvert shipmentNodeConvert;

    @Autowired
    private ShipmentNodeService shipmentNodeService;

	@Autowired
	private IdGenerator idGenerator;
	
	@Autowired
	private ShipmentNodeParentLineService shipmentNodeParentLineService;
	
	@Autowired
	private ShipmentNodeParentLineConvert shipmentNodeParentLineConvert;
	
	@Autowired
	private ShipmentNodeMapper shipmentNodeMapper;
	
	@Autowired
	private ShipmentAdjustmentTaskFacade shipmentAdjustmentTaskFacade;
    
	static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");
	
    /**
     * 保存出货路线拓扑图
     * @param shipmentTopologyData
     * @return
     */
    @Override
    @Transactional
    public ResultData<String> saveTopology(ShipmentTopologyData shipmentTopologyData) {
    	//list为空则直接返回
    	List<ShipmentNodeData> shipmentNodeList = shipmentTopologyData.getShipmentNodeList();
    	if(CollectionUtils.isEmpty(shipmentNodeList)) {
    		return new ResultData<>(null, MessageEnum.SUCCESS);
    	}
    	String topologyId = String.valueOf(idGenerator.generateId());
    	//设置拓扑id
    	shipmentTopologyData.setTopologyId(topologyId);
    	Optional.ofNullable(shipmentNodeList)
		.orElseGet(Collections::emptyList)
		.stream()
		.filter(Objects::nonNull)
		.forEach(node ->
			//设置拓扑id和初始化字段
			{
				//节点id字段来自前端通过后端获取到之后固定下来
				//初始生效状态
				node.setNodeStatus(ShipmentEnum.ShipmentNodeStatus.EFFECT.getCode());
				//初始调整完成状态
				node.setAdjustmentStatus(ShipmentEnum.ShipmentNodeAdjustmentStatus.ADJUSTED.getCode());
				//设置比例
				//占父节点比例，=1，代表有一个或者多个父，则代表本节点来自合并，
				//占父节点比例小于等于1代表来自分裂，并且只有一个父
				//为空或者0，默认设置为1，也可以返回报错，根据业务情况定，有多个父，设置为1
				if(null == node.getProportion() || BigDecimal.ZERO.compareTo(node.getProportion()) >= 0 || (!CollectionUtils.isEmpty(node.getShipmentNodeParentLineDataList()) && node.getShipmentNodeParentLineDataList().size() > 1)) {
					node.setProportion(new BigDecimal(1));
				}

				//处理父节点关系行，ShipmentNodeParentLineData中的parentProportion用于扩展，可以设置每个父类出资多大比例，目前可以默认设置为1，全部出资
		    	Optional.ofNullable(node.getShipmentNodeParentLineDataList())
				.orElseGet(Collections::emptyList)
				.stream()
				.filter(Objects::nonNull)
				.forEach(parentLine -> {
						//重置关联节点id
						parentLine.setNodeId(node.getId());
						//父节点id来自前端通过后端获取后固定下来
						//设置拓扑id
						parentLine.setTopologyId(topologyId);
						//如果没有比例，设置为1
						if(null == parentLine.getParentProportion() || BigDecimal.ZERO.compareTo(parentLine.getParentProportion()) >= 0 ) {
							parentLine.setParentProportion(new BigDecimal(1));
						}
					});
				//设置计算公式，{{root}}作为根节点占位符,其他节点{{nodeId}}代表节点的公式，后面集中生成用于替换
		    	//如果没有父节点，则表明是根节点
		    	if(CollectionUtils.isEmpty(node.getShipmentNodeParentLineDataList())) {
		    		node.setQuantityFormula("|root|");
		    	} else {
		    		//如果父节点只有一个，则为分割，如果有多个，则为合并，需要累加
		    		if(!CollectionUtils.isEmpty(node.getShipmentNodeParentLineDataList()) && node.getShipmentNodeParentLineDataList().size() == 1) {
		    			//占位符填父节点id，代表此节点公式
		    			node.setQuantityFormula(String.valueOf(node.getProportion()) + "*" + "{" + node.getShipmentNodeParentLineDataList().get(0).getParentNodeId() + "}");
		    			//重设占父节点比例关系
		    			node.getShipmentNodeParentLineDataList().get(0).setParentProportion(node.getProportion());
		    		} else if(!CollectionUtils.isEmpty(node.getShipmentNodeParentLineDataList()) && node.getShipmentNodeParentLineDataList().size() > 1){
		    			//累加公式
		    			String quantityFormula = 
		    			node.getShipmentNodeParentLineDataList()
		    			.stream()
		    			.map(parentLine -> {return "{" + parentLine.getParentNodeId() + "}" + "*" + String.valueOf(parentLine.getParentProportion());})
		    			.collect(Collectors.joining("+"));
		    			node.setQuantityFormula(quantityFormula);
		    		}
		    	}
				node.setTopologyId(topologyId);
			}
		);
    	

		//分层统计节点
		Map<Integer, List<ShipmentNodeData>> nodeMap = Optional.ofNullable(shipmentNodeList)
				.orElseGet(Collections::emptyList)
				.parallelStream()
				.collect(Collectors.groupingBy(ShipmentNodeData::getFloorNumber));
		
		//分层排序
		TreeMap<Integer, List<ShipmentNodeData>> sortNodeMap = new TreeMap<Integer, List<ShipmentNodeData>>(new Comparator<Integer>(){
		    @Override
		    public int compare(Integer str1, Integer str2) {
		        
		        return str1 - str2;
		    }
		});
		sortNodeMap.putAll(nodeMap);
		
		//获取根节点层,根节点可能有多个吗
		//TODO 支持根节点有多个，如果需要实现，则需要设置不同的根替换符，暂时只实现支持一个根
		Map.Entry<Integer, List<ShipmentNodeData>> firstEntry = sortNodeMap.firstEntry();
		Integer rootFloorKey = firstEntry.getKey();
		
		//分层处理节点的计算公式，将每一层的平层节点id公式替换成从上到下的root变化公式
		//分层可以保证父节点一定先初始化公式了，但是无法确定是否可以跨层合并，如果是这样，需要注意构建拓扑的顺序，需要从上到下顺序，节点跨层合并的话，取最大的所在那一层作为主父节点，这样保证之前的父节点都先初始化公式
		String regex = "\\{([^}]*)\\}";//匹配大括号
		Pattern compile = Pattern.compile(regex);
		//nodeFormulaMap用来缓存已经计算过的节点
		Map<String, ShipmentNodeData> nodeFormulaMap = new HashMap<String, ShipmentNodeData>();
		for(Map.Entry<Integer, List<ShipmentNodeData>> entry : sortNodeMap.entrySet()){
			Integer mapKey = entry.getKey();
			//顺序处理每一层，第一层是根节点不处理
			if(mapKey != rootFloorKey) {
					List<ShipmentNodeData> floorNodeList = entry.getValue();
					floorNodeList
					.stream()
					.forEach(node -> {
						//根据比例可以区分出究竟是分割还是合并,比例是小数则代表分割
						//根据nodeid来获取公式，并替换
						String quantityFormula = node.getQuantityFormula();
						Matcher matcher = compile.matcher(quantityFormula);
						while(matcher.find()){
							String group = matcher.group();
//							System.out.print(group+";");
							String parentId = this.getSubString(group, "{", "}");
							if(!nodeFormulaMap.containsKey(parentId)) {
								nodeFormulaMap.put(parentId, this.getNodeByNodeId(shipmentNodeList, parentId));
							}
							ShipmentNodeData parentNodeData = nodeFormulaMap.get(parentId);
							//将父节点id占位符替换为父计算公式
							if(parentNodeData != null) {
								quantityFormula = quantityFormula.replace(group, "(" + parentNodeData.getQuantityFormula() + ")");
							} else {
								//如果找不到，则公式错误
								node.setQuantityFormula(null);
							}
						}
						//设置公式
						node.setQuantityFormula(quantityFormula);
					});
			}
		}
		
		//计算并设置每个节点数量
    	Optional.ofNullable(shipmentNodeList)
		.orElseGet(Collections::emptyList)
		.stream()
		.filter(Objects::nonNull)
		.forEach(node -> {
			if(node.getQuantityFormula() != null) {
				//TODO 暂时只实现支持一个根
				String formula = node.getQuantityFormula().replace("|root|", String.valueOf(firstEntry.getValue().get(0).getCurrentQuantity()));
				try {
					Object temp = jse.eval(formula);
					//四舍五入
					node.setCurrentQuantity(new BigDecimal(temp.toString()).setScale(2, BigDecimal.ROUND_HALF_UP));
					System.out.println("节点初始值:" + node.getId() + "=" + node.getCurrentQuantity());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//保存每个节点和节点跟父节点对应关系
    	Optional.ofNullable(shipmentNodeList)
		.orElseGet(Collections::emptyList)
		.stream()
		.filter(Objects::nonNull)
		.forEach(node -> {
			shipmentNodeService.save(shipmentNodeConvert.convertToModel(node));
			Optional.ofNullable(node.getShipmentNodeParentLineDataList())
			.orElseGet(Collections::emptyList)
			.stream()
			.filter(Objects::nonNull)
			.forEach(line -> {
				//重设line的主键，或者置空让数据库自动生成，这里先手动生成分布式主键吧，都可以
				line.setId(String.valueOf(idGenerator.generateId()));
				shipmentNodeParentLineService.save(shipmentNodeParentLineConvert.convertToModel(line));
			});

		});
    	return new ResultData<String>(topologyId, MessageEnum.SUCCESS);
    }
    
    @Override
    @Transactional
    public ResultData<String> shipmentAdjust(ShipmentAdjustmentTaskData shipmentAdjustmentTaskData) {
    	ShipmentNodeModel nodeModel = new ShipmentNodeModel();
    	nodeModel.setTopologyId(shipmentAdjustmentTaskData.getTopologyId());
    	//查出所有节点，并行执行调整
    	QueryWrapper<ShipmentNodeModel> wapNode = new QueryWrapper<>(nodeModel);
//    	wapNode.lambda().last("").eq(column, val);
    	//zhy test
    	List<ShipmentNodeModel> test = shipmentNodeService.list(wapNode);
    	Optional.ofNullable(shipmentNodeService.list(wapNode))
		.orElseGet(Collections::emptyList)
		.parallelStream()
		.filter(Objects::nonNull)
		.forEach(node -> {
			if(node.getQuantityFormula() != null) {
				//TODO 暂时只实现支持一个根
				String formula = node.getQuantityFormula().replace("|root|", String.valueOf(shipmentAdjustmentTaskData.getAdjustmentQuantity()));
				try {
					Object temp = jse.eval(formula);
					//四舍五入
					shipmentNodeMapper.adjustNodeQuantity(node.getId(), new BigDecimal(temp.toString()).setScale(2, BigDecimal.ROUND_HALF_UP));
					System.out.println("调整值:" + node.getId() + "=" + new BigDecimal(temp.toString()).setScale(2, BigDecimal.ROUND_HALF_UP));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    	//task表改成任务已完成
    	shipmentAdjustmentTaskData.setTaskStatus(ShipmentEnum.ShipmentNodeAdjustmentStatus.ADJUSTED.getCode());
    	shipmentAdjustmentTaskFacade.updateById(shipmentAdjustmentTaskData);
    	return new ResultData<>(null, MessageEnum.SUCCESS);
    }
    
    /**
     * 根据节点id获取节点对象
     * @param shipmentNodeList
     * @param nodeId
     * @return
     */
    private ShipmentNodeData getNodeByNodeId(List<ShipmentNodeData> shipmentNodeList, String nodeId) {
    	if(null == nodeId || CollectionUtils.isEmpty(shipmentNodeList)) {
    		return null;
    	}
    	return shipmentNodeList.parallelStream().filter(node -> nodeId.equals(node.getId())).findFirst().get();
    }
    
    /**
    * 取两个文本之间的文本值
    * @param text 源文本 比如：欲取全文本为 12345
    * @param left 文本前面
    * @param right 后面文本
    * @return 返回 String
    */
    private String getSubString(String text, String left, String right) {
		String result = "";
		int zLen;
		if (left == null || left.isEmpty()) {
			zLen = 0;
		} else {
			zLen = text.indexOf(left);
			if (zLen > -1) {
				zLen += left.length();
			} else {
				zLen = 0;
			}
		}
		int yLen = text.indexOf(right, zLen);
		if (yLen < 0 || right == null || right.isEmpty()) {
			yLen = text.length();
		}
		result = text.substring(zLen, yLen);
		return result;
    }
    
}
