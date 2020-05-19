package com.madjava.micro.enumtype;

public enum InvoiceTitle
{

	//团体
	CORPS("CORPS", "团体"),
	//个人
	INDIVIDUAL("INDIVIDUAL", "个人");


	private String code;

	private String name;

	private InvoiceTitle(final String code, final String name)
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
