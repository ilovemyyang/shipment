package com.madjava.micro.dto;

import java.io.Serializable;


public class DeliveryWaitingParameterData implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = -4959501463364257210L;

	/**
	 *  每页的最大记录数
	 *  默认20条
	 */
	private Integer rows;

	/**
	 *  查询的起始位置
	 */
	private Integer offset;

	private Byte needToGet;

	public DeliveryWaitingParameterData(final Integer rows, final Integer offset, final Byte needToGet)
	{
		super();
		this.rows = rows;
		this.offset = offset;
		this.needToGet = needToGet;
	}

	/**
	 * @return the rows
	 */
	public Integer getRows()
	{
		return rows;
	}

	/**
	 * @param rows the rows to set
	 */
	public void setRows(final Integer rows)
	{
		this.rows = rows;
	}

	/**
	 * @return the offset
	 */
	public Integer getOffset()
	{
		return offset;
	}

	/**
	 * @param offset the offset to set
	 */
	public void setOffset(final Integer offset)
	{
		this.offset = offset;
	}

	/**
	 * @return the needToGet
	 */
	public Byte getNeedToGet()
	{
		return needToGet;
	}

	/**
	 * @param needToGet the needToGet to set
	 */
	public void setNeedToGet(final Byte needToGet)
	{
		this.needToGet = needToGet;
	}






}
