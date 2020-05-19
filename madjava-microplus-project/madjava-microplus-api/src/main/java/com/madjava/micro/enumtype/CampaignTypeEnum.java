package com.madjava.micro.enumtype;

public enum CampaignTypeEnum {
	SEND_COUPON(1,"用户领券"),
	COUPON(2, "优惠券营销活动"),
	PROMOTION(3, "商品或订单促销"),
	REGIST_USER(4, "注册送券营销活动");
	private Integer code;
	
	private String message;

	private CampaignTypeEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}	

