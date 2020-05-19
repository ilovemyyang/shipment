package com.madjava.micro.enumtype;

public enum InvoiceTypeEnum
{
	//普通发票
	REGULARINVOICE("REGULARINVOICE", "普通发票"),
	//增值税发票
	VALUEADDEDTAXINVOICE("VALUEADDEDTAXINVOICE", "增值税发票"),
	//不开发票
	NOINVOICE("NOINVOICE", "不开发票");

	private String code;

	private String name;

	private InvoiceTypeEnum(final String code, final String name)
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
