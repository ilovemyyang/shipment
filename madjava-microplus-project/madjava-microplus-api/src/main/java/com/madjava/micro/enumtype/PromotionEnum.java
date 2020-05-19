package com.madjava.micro.enumtype;

/**
 *  商品类型枚举类
 * @author Administrator
 *
 */
public enum PromotionEnum {

	DISCOUNT_TYPE_PERCENT_OFF("1","打折"),
	DISCOUNT_TYPE_FIX_PRICE("2","固定"),
	 
	COUPON_TYPE_SINGLE("single", "单张券"), 
	COUPON_TYPE_SYSTEM("system", "用户领券或系统发券"),
	 
	PROMOTION_TYPE_ORDER("order","订单促销"),
	PROMOTION_TYPE_PRODUCT("product","产品促销"),
	PROMOTION_TYPE_COUPON("coupon","优惠券促销"),
	
	PROMOTION_EXCLUSIVITY_NO("no","没有限制"),
	PROMOTION_EXCLUSIVITY_CLASS("class","不能跟同类促销一起使用"),
	PROMOTION_EXCLUSIVITY_GLOBAL("global","不能跟任何促销一起使用");
	
	
	private String code;
	
	private String name;

	private PromotionEnum(String code, String name) {
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
