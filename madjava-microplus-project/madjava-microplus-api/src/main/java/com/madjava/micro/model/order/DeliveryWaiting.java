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
public class DeliveryWaiting implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

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
	 * 接收时间
	 */
	private String acceptTime;

	/**
	 */
	private Byte needToGet;

	/**
	 * 物流轨迹对应状态编码
	 */
	private String opcode;

	/**
	 * 备注
	 */
	private String remark;

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
	 * 接收时间
	 * </pre>
	 *
	 * @return the acceptTime
	 */
	public String getAcceptTime()
	{

		return acceptTime;
	}

	/**
	 * <pre>
	 * 接收时间
	 * </pre>
	 *
	 * @param acceptTime the acceptTime to set
	 */
	public void setAcceptTime(final String acceptTime)
	{

		this.acceptTime = acceptTime;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @return the needToGet
	 */
	public Byte getNeedToGet()
	{

		return needToGet;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @param needToGet the needToGet to set
	 */
	public void setNeedToGet(final Byte needToGet)
	{

		this.needToGet = needToGet;
	}

	/**
	 * <pre>
	 * 物流轨迹对应状态编码
	 * </pre>
	 *
	 * @return the opcode
	 */
	public String getOpcode()
	{

		return opcode;
	}

	/**
	 * <pre>
	 * 物流轨迹对应状态编码
	 * </pre>
	 *
	 * @param opcode the opcode to set
	 */
	public void setOpcode(final String opcode)
	{

		this.opcode = opcode;
	}

	/**
	 * <pre>
	 * 备注
	 * </pre>
	 *
	 * @return the remark
	 */
	public String getRemark()
	{

		return remark;
	}

	/**
	 * <pre>
	 * 备注
	 * </pre>
	 *
	 * @param remark the remark to set
	 */
	public void setRemark(final String remark)
	{

		this.remark = remark;
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
