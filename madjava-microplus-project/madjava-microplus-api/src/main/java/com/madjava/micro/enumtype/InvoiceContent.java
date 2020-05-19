package com.madjava.micro.enumtype;

import java.util.ArrayList;
import java.util.List;


public enum InvoiceContent
{
	//日用品
	SUPPLIES("SUPPLIES", "日用品", 1),
	//食品
	FOOD("FOOD", "食品", 2),
	//酒水
	LIQUOR("LIQUOR", "酒水", 3);

	private String code;

	private String name;

	private Integer rank;

	private InvoiceContent(final String code, final String name, final Integer rank)
	{
		this.code = code;
		this.name = name;
		this.rank = rank;
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

	/**
	 * @return the rank
	 */
	public Integer getRank()
	{
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(final Integer rank)
	{
		this.rank = rank;
	}

	/**
	 * @return the invoiceContents
	 */
	public List<InvoiceContent> getInvoiceContents()
	{
		final List<InvoiceContent> invoiceContents = new ArrayList<>();
		invoiceContents.add(SUPPLIES);
		invoiceContents.add(FOOD);
		invoiceContents.add(LIQUOR);
		return invoiceContents;
	}



}
