package com.madjava.micro.dto.shipment;

import java.math.BigDecimal;

import com.madjava.micro.dto.BaseData;

import java.util.Date;
import java.util.List;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Classname ShipmentNodeData
 * @Description 出货节点创建记录Data
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Data
public class ShipmentNodeData extends BaseData {

	private static final long serialVersionUID = -1010197856372322820L;

	@ApiModelProperty(value = "主键")
	private String id;
	@ApiModelProperty(value = "拓扑id")
	private String topologyId;
	@ApiModelProperty(value = "节点名称")
	private String nodeName;
	@ApiModelProperty(value = "层编号")
	private Integer floorNumber;
	@ApiModelProperty(value = "状态，生效，有效等")
	private String nodeStatus;
	@ApiModelProperty(value = "调整状态，调整中，调整完成")
	private String adjustmentStatus;
	@ApiModelProperty(value = "占父节点数量比例，来自父分割则小于1，来自父合并则等于1")
	private BigDecimal proportion;
	@ApiModelProperty(value = "扩展用,数量计算公式")
	private String quantityFormula;
	@ApiModelProperty(value = "当前数量")
	private BigDecimal currentQuantity;
	@ApiModelProperty(value = "父节点行列表")
	private List<ShipmentNodeParentLineData> shipmentNodeParentLineDataList;
}
