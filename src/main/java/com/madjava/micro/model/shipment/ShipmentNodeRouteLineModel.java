package com.madjava.micro.model.shipment;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.madjava.micro.model.BaseEntity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @Classname ShipmentNodeRouteLineModel
 * @Description 节点路由关系表 实体类
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Data
@TableName("t_shipment_node_route_line")
public class ShipmentNodeRouteLineModel extends BaseEntity {
	private static final long serialVersionUID = -953894277073994507L;


	/**
	 * 主键
	 */
	@TableId(value = "id",type = IdType.ASSIGN_ID)
	private String id;

	/**
	 * 拓扑id
	 */
	@TableField("topology_id")
	private String topologyId;

	/**
	 * 节点id
	 */
	@TableField("node_id")
	private String nodeId;

	/**
	 * 路由节点id
	 */
	@TableField("route_node_id")
	private String routeNodeId;

	/**
	 * 路由层编号
	 */
	@TableField("route_floor_number")
	private Integer routeFloorNumber;


}
