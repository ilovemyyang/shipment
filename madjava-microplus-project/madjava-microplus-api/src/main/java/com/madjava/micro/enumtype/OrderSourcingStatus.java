package com.madjava.micro.enumtype;

public enum OrderSourcingStatus {

	AWAITING_SOURCING(Integer.valueOf(0), "待寻源"),

	SOURCING_SUCCESS(Integer.valueOf(100), "寻源成功"),

	SOURCING_FAIL(Integer.valueOf(-1), "寻源失败"),

	COMPLATE_FAIL(Integer.valueOf(-2), "推送失败"),
	
	COMPLATE_SUCCESS(Integer.valueOf(200), "推送成功");

	private Integer	index;
	private String	message;

	private OrderSourcingStatus(final Integer index, String message) {
		this.index = index;
		this.message = message;
	}

	public Integer getIndex() {
		return this.index;
	}

	public String getMessage() {
		return message;
	}
}
