package com.madjava.micro.model.cart;

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
 * @author accenture-
 */
public class DeliveryArea implements Serializable {

    private static final long serialVersionUID = 2993015273203620436L;

    /**
     * 主键
     */
    private String pk;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 商品code
     */
    private String productCode;

    /**
     * 商品类型
     */
    private Byte producttype;

    /**
     * 仓库编码
     */
    private String warehouse;

    /**
     * 城市列表,多个城市以逗号隔开
     */
    private String citys;

    /**
     * 是否启用
     */
    private Byte enabled;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date modifyDate;

    /**
     * <pre>
     * 主键
     * </pre>
     * 
     * @return the pk
     */
    public String getPk() {

        return pk;
    }

    /**
     * <pre>
     * 主键
     * </pre>
     * 
     * @param pk the pk to set
     */
    public void setPk(String pk) {

        this.pk = pk;
    }

    /**
     * <pre>
     * 编码
     * </pre>
     * 
     * @return the code
     */
    public String getCode() {

        return code;
    }

    /**
     * <pre>
     * 编码
     * </pre>
     * 
     * @param code the code to set
     */
    public void setCode(String code) {

        this.code = code;
    }

    /**
     * <pre>
     * 名称
     * </pre>
     * 
     * @return the name
     */
    public String getName() {

        return name;
    }

    /**
     * <pre>
     * 名称
     * </pre>
     * 
     * @param name the name to set
     */
    public void setName(String name) {

        this.name = name;
    }

    /**
     * <pre>
     * 商品code,多个商品以逗号隔开
     * </pre>
     * 
     * @return the productCode
     */
    public String getProductCode() {

        return productCode;
    }

    /**
     * <pre>
     * 商品code
     * </pre>
     * 
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {

        this.productCode = productCode;
    }

    /**
     * <pre>
     * 商品类型
     * </pre>
     * 
     * @return the producttype
     */
    public Byte getProducttype() {

        return producttype;
    }

    /**
     * <pre>
     * 商品类型
     * </pre>
     * 
     * @param producttype the producttype to set
     */
    public void setProducttype(Byte producttype) {

        this.producttype = producttype;
    }

    /**
     * <pre>
     * 仓库编码
     * </pre>
     * 
     * @return the warehouse
     */
    public String getWarehouse() {

        return warehouse;
    }

    /**
     * <pre>
     * 仓库编码
     * </pre>
     * 
     * @param warehouse the warehouse to set
     */
    public void setWarehouse(String warehouse) {

        this.warehouse = warehouse;
    }

    /**
     * <pre>
     * 城市列表,多个城市以逗号隔开
     * </pre>
     * 
     * @return the citys
     */
    public String getCitys() {

        return citys;
    }

    /**
     * <pre>
     * 城市列表,多个城市以逗号隔开
     * </pre>
     * 
     * @param citys the citys to set
     */
    public void setCitys(String citys) {

        this.citys = citys;
    }

    /**
     * <pre>
     * 是否启用
     * </pre>
     * 
     * @return the enabled
     */
    public Byte getEnabled() {

        return enabled;
    }

    /**
     * <pre>
     * 是否启用
     * </pre>
     * 
     * @param enabled the enabled to set
     */
    public void setEnabled(Byte enabled) {

        this.enabled = enabled;
    }

    /**
     * <pre>
     * 创建时间
     * </pre>
     * 
     * @return the createDate
     */
    public Date getCreateDate() {

        return createDate;
    }

    /**
     * <pre>
     * 创建时间
     * </pre>
     * 
     * @param createDate the createDate to set
     */
    public void setCreateDate(Date createDate) {

        this.createDate = createDate;
    }

    /**
     * <pre>
     * 更新时间
     * </pre>
     * 
     * @return the modifyDate
     */
    public Date getModifyDate() {

        return modifyDate;
    }

    /**
     * <pre>
     * 更新时间
     * </pre>
     * 
     * @param modifyDate the modifyDate to set
     */
    public void setModifyDate(Date modifyDate) {

        this.modifyDate = modifyDate;
    }
}
