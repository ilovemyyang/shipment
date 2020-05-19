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
 * @Classname ShipmentNodeModel
 * @Description 出货节点 实体类
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Data
@TableName("t_shipment_node")
public class ShipmentNodeModel extends BaseEntity {
	private static final long serialVersionUID = 1861546825669656733L;


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
	 * 节点名称
	 */
	@TableField("node_name")
	private String nodeName;

	/**
	 * 层编号
	 */
	@TableField("floor_number")
	private Integer floorNumber;

	/**
	 * 状态，生效，有效等
	 */
	@TableField("node_status")
	private String nodeStatus;

	/**
	 * 调整状态，调整中，调整完成
	 */
	@TableField("adjustment_status")
	private String adjustmentStatus;

	/**
	 * 占父节点数量比例，来自父分割则小于1，来自父合并则等于1
	 */
	@TableField("proportion")
	private BigDecimal proportion;

	/**
	 * 扩展用,数量计算公式
	 */
	@TableField("quantity_formula")
	private String quantityFormula;

	/**
	 * 当前数量
	 */
	@TableField("current_quantity")
	private BigDecimal currentQuantity;


}
