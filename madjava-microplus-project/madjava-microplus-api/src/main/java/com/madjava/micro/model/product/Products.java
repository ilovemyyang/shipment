package com.madjava.micro.model.product;

import java.util.Date;

import java.io.Serializable; 
/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author madjava-
 */
public class Products implements Serializable {

    private static final long serialVersionUID = -2516435493516496139L;

    /**
     */
    private String productPk;

    /**
     */
    private String productCode;

    /**
     */
    private Date onlineDate;

    /**
     */
    private Date offlineDate;

    /**
     */
    private String productEan;

    /**
     */
    private String approvalStatus;

    /**
     */
    private String productName;

    /**
     */
    private String description;

    /**
     */
    private Integer minOrderQuantity;

    /**
     */
    private Integer maxOrderQuantity;

    /**
     */
    private String salesApplication;

    /**
     */
    private String productUnit;

    /**
     */
    private String produceArea;

    /**
     */
    private Integer weight;

    /**
     */
    private String specification;

    /**
     */
    private String taxNo;

    /**
     */
    private Double taxRate;

    /**
     */
    private String expirationDate;

    /**
     */
    private Long salesVolume;

    /**
     */
    private Long numberOfGoodreviews;

    /**
     */
    private String baseProduct;

    /**
     */
    private Date createTime;

    /**
     */
    private Date modifyTime;

    /**
     */
    private String catalog;

    /**
     */
    private Byte producttype;
    
    /**
     * 仓库
     */
    private String warehouse;
    
    /**
     * 第三方产品编码
     */
    private String thirdPartyProductCode;

    /**
     * <pre>
     * </pre>
     * 
     * @return the thirdPartyProductCode
     */
    public String getThirdPartyProductCode() {
		return thirdPartyProductCode;
	}

    /**
     * <pre>
     * </pre>
     * 
     * @param thirdPartyProductCode the thirdPartyProductCode to set
     */
	public void setThirdPartyProductCode(String thirdPartyProductCode) {
		this.thirdPartyProductCode = thirdPartyProductCode;
	}

	/**
     * <pre>
     * </pre>
     * 
     * @return the productPk
     */
    public String getProductPk() {

        return productPk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param productPk the productPk to set
     */
    public void setProductPk(String productPk) {

        this.productPk = productPk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the productCode
     */
    public String getProductCode() {

        return productCode;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {

        this.productCode = productCode;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the onlineDate
     */
    public Date getOnlineDate() {

        return onlineDate;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param onlineDate the onlineDate to set
     */
    public void setOnlineDate(Date onlineDate) {

        this.onlineDate = onlineDate;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the offlineDate
     */
    public Date getOfflineDate() {

        return offlineDate;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param offlineDate the offlineDate to set
     */
    public void setOfflineDate(Date offlineDate) {

        this.offlineDate = offlineDate;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the productEan
     */
    public String getProductEan() {

        return productEan;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param productEan the productEan to set
     */
    public void setProductEan(String productEan) {

        this.productEan = productEan;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the approvalStatus
     */
    public String getApprovalStatus() {

        return approvalStatus;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param approvalStatus the approvalStatus to set
     */
    public void setApprovalStatus(String approvalStatus) {

        this.approvalStatus = approvalStatus;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the productName
     */
    public String getProductName() {

        return productName;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param productName the productName to set
     */
    public void setProductName(String productName) {

        this.productName = productName;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the description
     */
    public String getDescription() {

        return description;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param description the description to set
     */
    public void setDescription(String description) {

        this.description = description;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the minOrderQuantity
     */
    public Integer getMinOrderQuantity() {

        return minOrderQuantity;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param minOrderQuantity the minOrderQuantity to set
     */
    public void setMinOrderQuantity(Integer minOrderQuantity) {

        this.minOrderQuantity = minOrderQuantity;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the maxOrderQuantity
     */
    public Integer getMaxOrderQuantity() {

        return maxOrderQuantity;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param maxOrderQuantity the maxOrderQuantity to set
     */
    public void setMaxOrderQuantity(Integer maxOrderQuantity) {

        this.maxOrderQuantity = maxOrderQuantity;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the salesApplication
     */
    public String getSalesApplication() {

        return salesApplication;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param salesApplication the salesApplication to set
     */
    public void setSalesApplication(String salesApplication) {

        this.salesApplication = salesApplication;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the productUnit
     */
    public String getProductUnit() {

        return productUnit;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param productUnit the productUnit to set
     */
    public void setProductUnit(String productUnit) {

        this.productUnit = productUnit;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the produceArea
     */
    public String getProduceArea() {

        return produceArea;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param produceArea the produceArea to set
     */
    public void setProduceArea(String produceArea) {

        this.produceArea = produceArea;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the weight
     */
    public Integer getWeight() {

        return weight;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param weight the weight to set
     */
    public void setWeight(Integer weight) {

        this.weight = weight;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the specification
     */
    public String getSpecification() {

        return specification;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param specification the specification to set
     */
    public void setSpecification(String specification) {

        this.specification = specification;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the taxNo
     */
    public String getTaxNo() {

        return taxNo;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param taxNo the taxNo to set
     */
    public void setTaxNo(String taxNo) {

        this.taxNo = taxNo;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the taxRate
     */
    public Double getTaxRate() {

        return taxRate;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param taxRate the taxRate to set
     */
    public void setTaxRate(Double taxRate) {

        this.taxRate = taxRate;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the expirationDate
     */
    public String getExpirationDate() {

        return expirationDate;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate(String expirationDate) {

        this.expirationDate = expirationDate;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the salesVolume
     */
    public Long getSalesVolume() {

        return salesVolume;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param salesVolume the salesVolume to set
     */
    public void setSalesVolume(Long salesVolume) {

        this.salesVolume = salesVolume;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the numberOfGoodreviews
     */
    public Long getNumberOfGoodreviews() {

        return numberOfGoodreviews;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param numberOfGoodreviews the numberOfGoodreviews to set
     */
    public void setNumberOfGoodreviews(Long numberOfGoodreviews) {

        this.numberOfGoodreviews = numberOfGoodreviews;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the baseProduct
     */
    public String getBaseProduct() {

        return baseProduct;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param baseProduct the baseProduct to set
     */
    public void setBaseProduct(String baseProduct) {

        this.baseProduct = baseProduct;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the createTime
     */
    public Date getCreateTime() {

        return createTime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {

        this.createTime = createTime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the modifyTime
     */
    public Date getModifyTime() {

        return modifyTime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param modifyTime the modifyTime to set
     */
    public void setModifyTime(Date modifyTime) {

        this.modifyTime = modifyTime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the catalog
     */
    public String getCatalog() {

        return catalog;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param catalog the catalog to set
     */
    public void setCatalog(String catalog) {

        this.catalog = catalog;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the producttype
     */
    public Byte getProducttype() {

        return producttype;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param producttype the producttype to set
     */
    public void setProducttype(Byte producttype) {

        this.producttype = producttype;
    }

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
    
    
}
