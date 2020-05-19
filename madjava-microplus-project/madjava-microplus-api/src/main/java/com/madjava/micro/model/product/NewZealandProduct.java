package com.madjava.micro.model.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * @author yuxiao.wang
 */
public class NewZealandProduct implements Serializable
{

	/**
	*
	*/
	private static final long serialVersionUID = 1L;

	/**
	  * 产品sku
	  */
	private String sku;

	/**
	 * 中文描述
	 */
	private String productDescribe;

	/**
	 * 条形码
	 */
	private String barCode;

	/**
	 * 规格型号
	 */
	private String specifications;

	/**
	 * 商品HS编码
	 */
	private String hsCode;

	/**
	 * 原产国
	 */
	private String country;

	/**
	 * 申报单位
	 */
	private String declarationUnit;

	/**
	 * 净重
	 */
	private BigDecimal weight;

	/**
	 */
	private BigDecimal price;

	/**
	 */
	private BigDecimal taxRate;

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
	 * 产品sku
	 * </pre>
	 *
	 * @return the sku
	 */
	public String getSku()
	{

		return sku;
	}

	/**
	 * <pre>
	 * 产品sku
	 * </pre>
	 *
	 * @param sku the sku to set
	 */
	public void setSku(final String sku)
	{

		this.sku = sku;
	}

	/**
	 * <pre>
	 * 中文描述
	 * </pre>
	 *
	 * @return the productDescribe
	 */
	public String getProductDescribe()
	{

		return productDescribe;
	}

	/**
	 * <pre>
	 * 中文描述
	 * </pre>
	 *
	 * @param productDescribe the productDescribe to set
	 */
	public void setProductDescribe(final String productDescribe)
	{

		this.productDescribe = productDescribe;
	}

	/**
	 * <pre>
	 * 条形码
	 * </pre>
	 *
	 * @return the barCode
	 */
	public String getBarCode()
	{

		return barCode;
	}

	/**
	 * <pre>
	 * 条形码
	 * </pre>
	 *
	 * @param barCode the barCode to set
	 */
	public void setBarCode(final String barCode)
	{

		this.barCode = barCode;
	}

	/**
	 * <pre>
	 * 规格型号
	 * </pre>
	 *
	 * @return the specifications
	 */
	public String getSpecifications()
	{

		return specifications;
	}

	/**
	 * <pre>
	 * 规格型号
	 * </pre>
	 *
	 * @param specifications the specifications to set
	 */
	public void setSpecifications(final String specifications)
	{

		this.specifications = specifications;
	}

	/**
	 * <pre>
	 * 商品HS编码
	 * </pre>
	 *
	 * @return the hsCode
	 */
	public String getHsCode()
	{

		return hsCode;
	}

	/**
	 * <pre>
	 * 商品HS编码
	 * </pre>
	 *
	 * @param hsCode the hsCode to set
	 */
	public void setHsCode(final String hsCode)
	{

		this.hsCode = hsCode;
	}

	/**
	 * <pre>
	 * 原产国
	 * </pre>
	 *
	 * @return the country
	 */
	public String getCountry()
	{

		return country;
	}

	/**
	 * <pre>
	 * 原产国
	 * </pre>
	 *
	 * @param country the country to set
	 */
	public void setCountry(final String country)
	{

		this.country = country;
	}

	/**
	 * <pre>
	 * 申报单位
	 * </pre>
	 *
	 * @return the declarationUnit
	 */
	public String getDeclarationUnit()
	{

		return declarationUnit;
	}

	/**
	 * <pre>
	 * 申报单位
	 * </pre>
	 *
	 * @param declarationUnit the declarationUnit to set
	 */
	public void setDeclarationUnit(final String declarationUnit)
	{

		this.declarationUnit = declarationUnit;
	}

	/**
	 * <pre>
	 * 净重
	 * </pre>
	 *
	 * @return the weight
	 */
	public BigDecimal getWeight()
	{

		return weight;
	}

	/**
	 * <pre>
	 * 净重
	 * </pre>
	 *
	 * @param weight the weight to set
	 */
	public void setWeight(final BigDecimal weight)
	{

		this.weight = weight;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @return the price
	 */
	public BigDecimal getPrice()
	{

		return price;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @param price the price to set
	 */
	public void setPrice(final BigDecimal price)
	{

		this.price = price;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @return the taxRate
	 */
	public BigDecimal getTaxRate()
	{

		return taxRate;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @param taxRate the taxRate to set
	 */
	public void setTaxRate(final BigDecimal taxRate)
	{

		this.taxRate = taxRate;
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
