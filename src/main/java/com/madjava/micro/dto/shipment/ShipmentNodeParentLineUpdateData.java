package com.madjava.micro.dto.shipment;

import java.math.BigDecimal;
import com.madjava.micro.dto.BaseData;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Classname ShipmentNodeParentLineUpdateData
 * @Description 节点父节点对应关系表创建记录Data
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Data
public class ShipmentNodeParentLineUpdateData extends BaseData {

	private static final long serialVersionUID = -733224050980875822L;

			@ApiModelProperty(value = "主键")
		private String id;
				@ApiModelProperty(value = "拓扑id")
		private String topologyId;
				@ApiModelProperty(value = "节点id")
		private String nodeId;
				@ApiModelProperty(value = "父节点id")
		private String parentNodeId;
				@ApiModelProperty(value = "扩展用，所占父节点数量比例")
		private BigDecimal parentProportion;
	
}
