package com.madjava.micro.enumtype;

/**
 *  支付状态枚举类
 * @author Administrator
 *
 */
public enum PaymentStatusEnum {

	NOTPAID("NOTPAID", "未付款"),
	PAID("PAID", "已付款"),
	REFUNDED("REFUNDED", "退款完成"),
	PARTPAID("PARTPAID", "部分付款"),
	REFUNDEDING("REFUNDEDING", "退款申请中");
	
	private String code;
	
	private String name;

	private PaymentStatusEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static PaymentStatusEnum getPaymentByCode(String code) {
		
		PaymentStatusEnum result = null;
		switch (code) {
		case "NOTPAID":
			result = NOTPAID;
			break;

		case "PAID":
			result = PAID;
			break;
		case "REFUNDED":
			result = REFUNDED;
			break;
		case "PARTPAID":
			result = PARTPAID;
			break;
		case "REFUNDEDING":
			result = REFUNDEDING;
			break;
		default:
			break;
		}
		
		return result;
	}
}
