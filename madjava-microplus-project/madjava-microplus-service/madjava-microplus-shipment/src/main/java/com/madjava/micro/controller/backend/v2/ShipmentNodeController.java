package com.madjava.micro.controller.backend.v2;

import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.ResultData;
import com.madjava.micro.dto.shipment.ShipmentNodeData;
import com.madjava.micro.dto.shipment.ShipmentTopologyData;
import com.madjava.micro.enumtype.MessageEnum;
import com.madjava.micro.facade.shipment.ShipmentNodeFacade;
import com.madjava.micro.service.ShipmentNodeService;
import com.madjava.micro.service.id.generator.IdGenerator;

/**
 * @Classname ShipmentNodeController
 * @Description 出货节点控制器
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@RestController
@RequestMapping("/shipmentnode")
public class ShipmentNodeController {

    @Autowired
    private ShipmentNodeService shipmentNodeService;

    @Autowired
    private ShipmentNodeFacade shipmentNodeFacade;

	@Autowired
	private IdGenerator idGenerator;
    /**
     * 列表
     */
    @GetMapping("/list")
    public ResultData<PageResponseData<ShipmentNodeData>> list(Integer pageNo,
                    Integer pageSize,
                    String orderFiled,
                    @RequestParam(value="isAsc", required = false, defaultValue = "fasle") boolean isAsc,
                    ShipmentNodeData shipmentNodeData){
        PageResponseData<ShipmentNodeData> pageResponseData = shipmentNodeFacade.selectPage(pageNo, pageSize, orderFiled, isAsc, shipmentNodeData);
        return new ResultData<PageResponseData<ShipmentNodeData>>(pageResponseData,MessageEnum.SUCCESS);
    }


    /**
     * 信息
     */
    @GetMapping("/info")
    public ResultData<ShipmentNodeData> info(@RequestParam(value="id", required = true)  String id){

        ShipmentNodeData shipmentNodeData = shipmentNodeFacade.getById(id);
        return new ResultData<>(shipmentNodeData, MessageEnum.SUCCESS);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResultData<String> save(@RequestBody ShipmentNodeData shipmentNodeData){
		shipmentNodeFacade.save(shipmentNodeData);

        return new ResultData<>(null, MessageEnum.SUCCESS);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResultData<String> update(@RequestBody ShipmentNodeData shipmentNodeData){
        shipmentNodeFacade.updateById(shipmentNodeData);

        return new ResultData<>(null, MessageEnum.SUCCESS);
    }

    /**
     * 删除
     */
    @PostMapping("/batch/delete")
    public ResultData<String> batchDelete(@RequestBody String ids){
		shipmentNodeFacade.removeByIds(ids.split(","));

        return new ResultData<>(null, MessageEnum.SUCCESS);
    }

    @PostMapping("/delete")
    public ResultData<String> delete(@RequestParam(value="id", required = true) String id){
        shipmentNodeService.removeById(id);
        return new ResultData<>(null, MessageEnum.SUCCESS);
    }
    
    /**
     * 保存
     */
    @PostMapping("/saveTopology")
    @ApiOperation("保存出货路线拓扑图")
    public ResultData<String> saveTopology(@RequestBody ShipmentTopologyData shipmentTopologyData){
		return shipmentNodeFacade.saveTopology(shipmentTopologyData);
    }
    
    /**
     * 获取节点id
     */
    @PostMapping("/getNodeId")
    @ApiOperation("获取节点id")
    public ResultData<String> getNodeId(){
        return new ResultData<String>(String.valueOf(idGenerator.generateId()), MessageEnum.SUCCESS);
    }
    
    /**
     * TODO 跟新拓扑图，即使跟新了某个节点也需要同步跟新每个节点计算公式
     */
    @PostMapping("/updateTopology")
    @ApiOperation("跟新拓扑图，即使跟新了某个节点也需要同步跟新每个节点计算公式")
    public ResultData<String> updateTopology(){
        return new ResultData<String>(null, MessageEnum.SUCCESS);
    }
    
    
}
