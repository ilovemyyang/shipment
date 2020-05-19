package com.madjava.micro.enumtype;

/**
 *  订单状态枚举类
 * @author Administrator
 *
 */
public enum OrderListStatusEnum {

	AWAITING_PAYMENT("AWAITING_PAYMENT", "待付款"),
	AWAITING_TAKE_DELIVERY("AWAITING_TAKE_DELIVERY", "未发货"),
	AWAITING_DELIVERY("AWAITING_DELIVERY", "已发货"),
	COMPLETED("COMPLETED", "已完成");
	
	private String code;
	
	private String name;

	private OrderListStatusEnum(String code, String name) {
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
