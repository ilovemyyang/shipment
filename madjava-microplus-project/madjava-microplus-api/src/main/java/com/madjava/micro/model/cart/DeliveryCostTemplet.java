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
public class DeliveryCostTemplet implements Serializable {

    private static final long serialVersionUID = -3040397232116795010L;

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
     * 商品类型
     */
    private Byte producttype;

    /**
     * 仓库编码
     */
    private String warehouse;

    /**
     * 省isoCode
     */
    private String province;

    /**
     * 起步费
     */
    private Double initialcost;

    /**
     * 首重
     */
    private Double initialweight;

    /**
     * 续重1kg的费用
     */
    private Double addcost;

    /**
     * 满额基数
     */
    private Double costreducethreshold;

    /**
     * 优惠重量
     */
    private Double reducedweight;

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
     * 省列表,多个省以逗号隔开
     * </pre>
     * 
     * @return the province
     */
    public String getProvince() {

        return province;
    }

    /**
     * <pre>
     * 省列表,多个省以逗号隔开
     * </pre>
     * 
     * @param province the province to set
     */
    public void setProvince(String province) {

        this.province = province;
    }

    /**
     * <pre>
     * 起步费
     * </pre>
     * 
     * @return the initialcost
     */
    public Double getInitialcost() {

        return initialcost;
    }

    /**
     * <pre>
     * 起步费
     * </pre>
     * 
     * @param initialcost the initialcost to set
     */
    public void setInitialcost(Double initialcost) {

        this.initialcost = initialcost;
    }

    /**
     * <pre>
     * 首重
     * </pre>
     * 
     * @return the initialweight
     */
    public Double getInitialweight() {

        return initialweight;
    }

    /**
     * <pre>
     * 首重
     * </pre>
     * 
     * @param initialweight the initialweight to set
     */
    public void setInitialweight(Double initialweight) {

        this.initialweight = initialweight;
    }

    /**
     * <pre>
     * 续重1kg的费用
     * </pre>
     * 
     * @return the addcost
     */
    public Double getAddcost() {

        return addcost;
    }

    /**
     * <pre>
     * 续重1kg的费用
     * </pre>
     * 
     * @param addcost the addcost to set
     */
    public void setAddcost(Double addcost) {

        this.addcost = addcost;
    }

    /**
     * <pre>
     * 满额基数
     * </pre>
     * 
     * @return the costreducethreshold
     */
    public Double getCostreducethreshold() {

        return costreducethreshold;
    }

    /**
     * <pre>
     * 满额基数
     * </pre>
     * 
     * @param costreducethreshold the costreducethreshold to set
     */
    public void setCostreducethreshold(Double costreducethreshold) {

        this.costreducethreshold = costreducethreshold;
    }

    /**
     * <pre>
     * 优惠重量
     * </pre>
     * 
     * @return the reducedweight
     */
    public Double getReducedweight() {

        return reducedweight;
    }

    /**
     * <pre>
     * 优惠重量
     * </pre>
     * 
     * @param reducedweight the reducedweight to set
     */
    public void setReducedweight(Double reducedweight) {

        this.reducedweight = reducedweight;
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
