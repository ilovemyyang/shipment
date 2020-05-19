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
 * @Classname ShipmentAdjustmentTaskModel
 * @Description 出货调整任务 实体类
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Data
@TableName("t_shipment_adjustment_task")
public class ShipmentAdjustmentTaskModel extends BaseEntity {
	private static final long serialVersionUID = 5730931385272649503L;


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
	 * 状态，未处理，处理中，已完成等
	 */
	@TableField("task_status")
	private String taskStatus;

	/**
	 * 调整数量，正代表加，负代表减
	 */
	@TableField("adjustment_quantity")
	private BigDecimal adjustmentQuantity;

	/**
	 * 当前数量
	 */
	@TableField("current_quantity")
	private BigDecimal currentQuantity;


}
