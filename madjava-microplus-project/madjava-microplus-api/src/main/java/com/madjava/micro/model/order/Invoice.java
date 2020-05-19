package com.madjava.micro.model.order;


import java.io.Serializable;
import java.util.Date;

import com.madjava.micro.enumtype.InvoiceContent;
import com.madjava.micro.enumtype.InvoiceTitle;
import com.madjava.micro.enumtype.InvoiceTypeEnum;


/**
 * <pre>
 * =============================================================================
 * 内容:
 * =============================================================================
 * </pre>
 *
 */
public class Invoice implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = 5018276273024338664L;

	/**
	 */
	private String pk;

	/**
	 * 发票类型
	 */
	private InvoiceTypeEnum invoiceType;

	/**
	 * 发票抬头
	 */
	private String invoicedName;

	/**
	 * 发票税号
	 */
	private String invoiceNumber;

	/**
	 * 区分发票抬头是个人还是团体
	 */
	private InvoiceTitle invoiceTitle;

	/**
	 * 发票内容
	 */
	private InvoiceContent invoiceContent;

	/**
	 * 用户pk
	 */
	private String userPk;

	/**
	 * 订单编码
	 */
	private String orderCode;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 修改时间
	 */
	private Date modifyTime;

	/**
	 * <pre>
	 * </pre>
	 *
	 * @return the pk
	 */
	public String getPk()
	{

		return pk;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @param pk the pk to set
	 */
	public void setPk(final String pk)
	{

		this.pk = pk;
	}


	/**
	 * <pre>
	 * 发票抬头
	 * </pre>
	 *
	 * @return the invoicedName
	 */
	public String getInvoicedName()
	{

		return invoicedName;
	}

	/**
	 * <pre>
	 * 发票抬头
	 * </pre>
	 *
	 * @param invoicedName the invoicedName to set
	 */
	public void setInvoicedName(final String invoicedName)
	{

		this.invoicedName = invoicedName;
	}

	/**
	 * <pre>
	 * 发票税号
	 * </pre>
	 *
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber()
	{

		return invoiceNumber;
	}

	/**
	 * <pre>
	 * 发票税号
	 * </pre>
	 *
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(final String invoiceNumber)
	{

		this.invoiceNumber = invoiceNumber;
	}


	/**
	 * <pre>
	 * 用户pk
	 * </pre>
	 *
	 * @return the userPk
	 */
	public String getUserPk()
	{

		return userPk;
	}

	/**
	 * <pre>
	 * 用户pk
	 * </pre>
	 *
	 * @param userPk the userPk to set
	 */
	public void setUserPk(final String userPk)
	{

		this.userPk = userPk;
	}

	/**
	 * <pre>
	 * 订单编码
	 * </pre>
	 *
	 * @return the orderCode
	 */
	public String getOrderCode()
	{

		return orderCode;
	}

	/**
	 * <pre>
	 * 订单编码
	 * </pre>
	 *
	 * @param orderCode the orderCode to set
	 */
	public void setOrderCode(final String orderCode)
	{

		this.orderCode = orderCode;
	}

	/**
	 * <pre>
	 * 创建时间
	 * </pre>
	 *
	 * @return the createTime
	 */
	public Date getCreateTime()
	{

		return createTime;
	}

	/**
	 * <pre>
	 * 创建时间
	 * </pre>
	 *
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(final Date createTime)
	{

		this.createTime = createTime;
	}

	/**
	 * <pre>
	 * 修改时间
	 * </pre>
	 *
	 * @return the modifyTime
	 */
	public Date getModifyTime()
	{

		return modifyTime;
	}

	/**
	 * <pre>
	 * 修改时间
	 * </pre>
	 *
	 * @param modifyTime the modifyTime to set
	 */
	public void setModifyTime(final Date modifyTime)
	{

		this.modifyTime = modifyTime;
	}

	/**
	 * @return the invoiceType
	 */
	public InvoiceTypeEnum getInvoiceType()
	{
		return invoiceType;
	}

	/**
	 * @param invoiceType the invoiceType to set
	 */
	public void setInvoiceType(final InvoiceTypeEnum invoiceType)
	{
		this.invoiceType = invoiceType;
	}

	/**
	 * @return the invoiceTitle
	 */
	public InvoiceTitle getInvoiceTitle()
	{
		return invoiceTitle;
	}

	/**
	 * @param invoiceTitle the invoiceTitle to set
	 */
	public void setInvoiceTitle(final InvoiceTitle invoiceTitle)
	{
		this.invoiceTitle = invoiceTitle;
	}

	/**
	 * @return the invoiceContent
	 */
	public InvoiceContent getInvoiceContent()
	{
		return invoiceContent;
	}

	/**
	 * @param invoiceContent the invoiceContent to set
	 */
	public void setInvoiceContent(final InvoiceContent invoiceContent)
	{
		this.invoiceContent = invoiceContent;
	}


}
