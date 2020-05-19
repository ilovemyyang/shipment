package com.madjava.micro.model.order;


import java.io.Serializable;
import java.util.Date;

import com.madjava.micro.enumtype.InvoiceTypeEnum;


/**
 * <pre>
 * =============================================================================
 * 内容:
 * =============================================================================
 * </pre>
 *
 * @author 埃森哲-
 */
public class InvoiceType implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = -6702111215323555222L;

	/**
	 */
	private String pk;

	/**
	 * 发票类型名
	 */
	private String name;

	/**
	 * 订单类型
	 */
	private String productType;

	/**
	 * 发票类型
	 */
	private InvoiceTypeEnum invoiceTypeEnum;

	/**
	 * 区分发票抬头是个人还是团体
	 */
	private String rank;

	/**
	 * 注意
	 */
	private String note;

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
	 * 发票类型名
	 * </pre>
	 *
	 * @return the name
	 */
	public String getName()
	{

		return name;
	}

	/**
	 * <pre>
	 * 发票类型名
	 * </pre>
	 *
	 * @param name the name to set
	 */
	public void setName(final String name)
	{

		this.name = name;
	}

	/**
	 * <pre>
	 * 订单类型
	 * </pre>
	 *
	 * @return the productType
	 */
	public String getProductType()
	{

		return productType;
	}

	/**
	 * <pre>
	 * 订单类型
	 * </pre>
	 *
	 * @param productType the productType to set
	 */
	public void setProductType(final String productType)
	{

		this.productType = productType;
	}

	/**
	 * <pre>
	 * 发票类型
	 * </pre>
	 *
	 * @return the invoiceTypeEnum
	 */
	public InvoiceTypeEnum getInvoiceTypeEnum()
	{

		return invoiceTypeEnum;
	}

	/**
	 * <pre>
	 * 发票类型
	 * </pre>
	 *
	 * @param invoiceTypeEnum the invoiceTypeEnum to set
	 */
	public void setInvoiceTypeEnum(final InvoiceTypeEnum invoiceTypeEnum)
	{

		this.invoiceTypeEnum = invoiceTypeEnum;
	}

	/**
	 * <pre>
	 * 区分发票抬头是个人还是团体
	 * </pre>
	 *
	 * @return the rank
	 */
	public String getRank()
	{

		return rank;
	}

	/**
	 * <pre>
	 * 区分发票抬头是个人还是团体
	 * </pre>
	 *
	 * @param rank the rank to set
	 */
	public void setRank(final String rank)
	{

		this.rank = rank;
	}

	/**
	 * <pre>
	 * 注意
	 * </pre>
	 *
	 * @return the note
	 */
	public String getNote()
	{

		return note;
	}

	/**
	 * <pre>
	 * 注意
	 * </pre>
	 *
	 * @param note the note to set
	 */
	public void setNote(final String note)
	{

		this.note = note;
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
}
