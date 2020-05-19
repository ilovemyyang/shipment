package com.madjava.micro.enumtype;

/**
 *  订单状态枚举类
 * @author Administrator
 *
 */
public enum OrderStatusEnum {

	AWAITING_PAYMENT("AWAITING_PAYMENT", "已创建"),
	
	PAYMENT_CAPTURED("PAYMENT_CAPTURED", "付款已收讫"),
	AWAITING_DISTRIBUTED("AWAITING_DISTRIBUTED", "待派发"),
	HAS_DISTRIBUTED("HAS_DISTRIBUTED", "已分配"),
	PICKUP_COMPLETE("PICKUP_COMPLETE", "已备货"),
	SHIPPED("SHIPPED", "已出库"),
	IN_DELIVERY("IN_DELIVERY", "送货中"),
	
	COMPLETED("COMPLETED", "已完成"),
	
	CANCELLING("CANCELLING", "正在取消"),
	CANCELLED("CANCELLED", "已取消"),
	CANCELLFAILED("CANCELLFAILED", "取消失败"),
	REJECTED("REJECTED", "已拒收");
	
	private String code;
	
	private String name;

	private OrderStatusEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

}
