package com.madjava.micro.enumtype;

public enum DeliveryTrackMessageEnum
{
	AWAITING_PAYMENT("AWAITING_PAYMENT", "您已提交了订单，等待支付"),
	SHIPPED("SHIPPED", "您的订单已出库，等待配送"),
	CANCELLING("CANCELLING", "您的订单取消申请受理中"),
	CANCELLED("CANCELLED", "您的订单已经取消成功"),
	CANCELLFAIL("CANCELLFAIL", "您的订单取消失败"),
	COMPLETED("COMPLETED", "您的订单已签收，感谢您在永辉购物，欢迎再次惠顾！");

	private String code;

	private String name;

	private DeliveryTrackMessageEnum(final String code, final String name)
	{
		this.code = code;
		this.name = name;
	}

	/**
	 * @return the code
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(final String code)
	{
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(final String name)
	{
		this.name = name;
	}

}
