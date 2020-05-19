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
public class ShipmentTopologyData extends BaseData {

	private static final long serialVersionUID = -1010197856372322820L;

	@ApiModelProperty(value = "拓扑id,插入时不用填写")
	private String topologyId;
	@ApiModelProperty(value = "出货节点列表")
	private List<ShipmentNodeData> shipmentNodeList;
}
