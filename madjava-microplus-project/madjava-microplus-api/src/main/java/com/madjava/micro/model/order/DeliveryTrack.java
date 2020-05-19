package com.madjava.micro.model.order;


import java.io.Serializable;
import java.util.Date;


/**
 * <pre>
 * =============================================================================
 * 内容:
 * =============================================================================
 * </pre>
 *
 * @author 埃森哲-
 */
public class DeliveryTrack implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = -8294351487308790162L;

	/**
	 */
	private String pk;

	/**
	 * 订单编码
	 */
	private String orderCode;

	/**
	 * 快递单号
	 */
	private String expressCode;

	/**
	 * 快递公司编码
	 */
	private String companyCode;

	/**
	 * 物流时间
	 */
	private Date optime;

	/**
	 * 物流轨迹
	 */
	private String context;

	/**
	 */
	private Date createTime;

	/**
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
	 * 快递单号
	 * </pre>
	 *
	 * @return the expressCode
	 */
	public String getExpressCode()
	{

		return expressCode;
	}

	/**
	 * <pre>
	 * 快递单号
	 * </pre>
	 *
	 * @param expressCode the expressCode to set
	 */
	public void setExpressCode(final String expressCode)
	{

		this.expressCode = expressCode;
	}

	/**
	 * <pre>
	 * 快递公司编码
	 * </pre>
	 *
	 * @return the companyCode
	 */
	public String getCompanyCode()
	{

		return companyCode;
	}

	/**
	 * <pre>
	 * 快递公司编码
	 * </pre>
	 *
	 * @param companyCode the companyCode to set
	 */
	public void setCompanyCode(final String companyCode)
	{

		this.companyCode = companyCode;
	}

	/**
	 * <pre>
	 * 物流时间
	 * </pre>
	 *
	 * @return the optime
	 */
	public Date getOptime()
	{

		return optime;
	}

	/**
	 * <pre>
	 * 物流时间
	 * </pre>
	 *
	 * @param optime the optime to set
	 */
	public void setOptime(final Date optime)
	{

		this.optime = optime;
	}

	/**
	 * <pre>
	 * 物流轨迹
	 * </pre>
	 *
	 * @return the context
	 */
	public String getContext()
	{

		return context;
	}

	/**
	 * <pre>
	 * 物流轨迹
	 * </pre>
	 *
	 * @param context the context to set
	 */
	public void setContext(final String context)
	{

		this.context = context;
	}

	/**
	 * <pre>
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
	 * </pre>
	 *
	 * @param modifyTime the modifyTime to set
	 */
	public void setModifyTime(final Date modifyTime)
	{

		this.modifyTime = modifyTime;
	}
}
