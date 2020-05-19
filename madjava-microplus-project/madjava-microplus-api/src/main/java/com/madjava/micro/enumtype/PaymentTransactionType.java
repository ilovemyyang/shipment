package com.madjava.micro.enumtype;

public enum PaymentTransactionType {

	REQUEST("REQUEST", "发起支付请求"),
	NOTIFY("NOTIFY", "支付异步通知"),
	PREPARE_REFUND("PREPARE_REFUND", "退款请求发起"),
	NOTIFY_AFTER_REFUND("NOTIFY_AFTER_REFUND", "退款成功异步通知");
	
	private String code;
	
	private String name;

	private PaymentTransactionType(String code, String name) {
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
