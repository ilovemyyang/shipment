package com.madjava.micro.model.shipment;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.madjava.micro.model.BaseEntity;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @Classname ShipmentNodeParentLineModel
 * @Description 节点父节点对应关系表 实体类
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Data
@TableName("t_shipment_node_parent_line")
public class ShipmentNodeParentLineModel extends BaseEntity {
	private static final long serialVersionUID = 7069237471052878427L;


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
	 * 父节点id
	 */
	@TableField("parent_node_id")
	private String parentNodeId;

	/**
	 * 扩展用，所占父节点数量比例
	 */
	@TableField("parent_proportion")
	private BigDecimal parentProportion;


}
