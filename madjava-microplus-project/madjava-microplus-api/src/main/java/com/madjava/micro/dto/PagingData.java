package com.madjava.micro.dto;

import java.io.Serializable;
import java.util.List;

import com.madjava.micro.enumtype.MessageEnum;


/**
 *  jquery easy ui 专用分页数据返回模型
 * @author Administrator
 * @param <E>
 * @param <T>
 *
 */
public class PagingData<T> implements Serializable
{

	private boolean isSuccessful;

	private int code;

	private Integer total;

	private Integer totalPage;

	private Integer currentPage;

	private List<T> rows;

	private MessageEnum messageEnum;

	private T info;

	public PagingData(final List<T> serializableData, final MessageEnum messageEnum)
	{
		super();
		this.rows = serializableData;

		if (messageEnum == MessageEnum.SUCCESS)
		{
			isSuccessful = true;
		}

		this.code = messageEnum.getCode();
		this.messageEnum = messageEnum;
	}

	public PagingData()
	{

	}

	public boolean isSuccessful()
	{
		return isSuccessful;
	}

	public void setSuccessful(final boolean isSuccessful)
	{
		this.isSuccessful = isSuccessful;
	}

	public int getCode()
	{
		return code;
	}

	public void setCode(final int code)
	{
		this.code = code;
	}

	public MessageEnum getMessageEnum()
	{
		return messageEnum;
	}

	public void setMessageEnum(final MessageEnum messageEnum)
	{
		this.messageEnum = messageEnum;
	}

	public Integer getTotal()
	{
		return total;
	}

	public void setTotal(final Integer total)
	{
		this.total = total;
	}

	public List<T> getRows()
	{
		return rows;
	}

	public void setRows(final List<T> rows)
	{
		this.rows = rows;
	}

	public Integer getTotalPage()
	{
		return totalPage;
	}

	public void setTotalPage(final Integer totalPage)
	{
		this.totalPage = totalPage;
	}

	public Integer getCurrentPage()
	{
		return currentPage;
	}

	public void setCurrentPage(final Integer currentPage)
	{
		this.currentPage = currentPage;
	}

	/**
	 * @return the info
	 */
	public T getInfo()
	{
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(final T info)
	{
		this.info = info;
	}


}
