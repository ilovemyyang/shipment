package com.madjava.micro.dto.shipment;

import com.madjava.micro.dto.BaseData;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Classname ShipmentNodeRouteLineUpdateData
 * @Description 节点路由关系表创建记录Data
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Data
public class ShipmentNodeRouteLineUpdateData extends BaseData {

	private static final long serialVersionUID = -9109556224354983084L;

			@ApiModelProperty(value = "主键")
		private String id;
				@ApiModelProperty(value = "拓扑id")
		private String topologyId;
				@ApiModelProperty(value = "节点id")
		private String nodeId;
				@ApiModelProperty(value = "路由节点id")
		private String routeNodeId;
				@ApiModelProperty(value = "路由层编号")
		private Integer routeFloorNumber;
	
}
