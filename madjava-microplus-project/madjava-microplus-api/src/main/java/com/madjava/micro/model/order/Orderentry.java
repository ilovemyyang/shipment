package com.madjava.micro.model.order;

import java.math.BigDecimal; 
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
public class Orderentry  extends AbstractOrderEntryModel {

    private static final long serialVersionUID = -6326886567629402425L;


    /**
     * 订单编码
     */
    private String orderCode;

    /**
     * 商品重量
     */
    private Integer weight;

    /**
     * 商品总重量
     */
    private Integer totalWeight;

    /**
     * 促销价
     */
    private BigDecimal fixPrice;

    /**
     * 商品总税额
     */
    private BigDecimal totalTax;

    /**
     * 小计
     */
    private BigDecimal totalPrice;

    /**
     * 总拆扣
     */
    private BigDecimal totalDiscount;

    /**
     * 仓库
     */
    private String warehouse;


    /**
     * <pre>
     * 订单编码
     * </pre>
     * 
     * @return the orderCode
     */
    public String getOrderCode() {

        return orderCode;
    }

    /**
     * <pre>
     * 订单编码
     * </pre>
     * 
     * @param orderCode the orderCode to set
     */
    public void setOrderCode(String orderCode) {

        this.orderCode = orderCode;
    }


    /**
     * <pre>
     * 商品重量
     * </pre>
     * 
     * @return the weight
     */
    public Integer getWeight() {

        return weight;
    }

    /**
     * <pre>
     * 商品重量
     * </pre>
     * 
     * @param weight the weight to set
     */
    public void setWeight(Integer weight) {

        this.weight = weight;
    }

    /**
     * <pre>
     * 商品总重量
     * </pre>
     * 
     * @return the totalWeight
     */
    public Integer getTotalWeight() {

        return totalWeight;
    }

    /**
     * <pre>
     * 商品总重量
     * </pre>
     * 
     * @param totalWeight the totalWeight to set
     */
    public void setTotalWeight(Integer totalWeight) {

        this.totalWeight = totalWeight;
    }

    /**
     * <pre>
     * 促销价
     * </pre>
     * 
     * @return the fixPrice
     */
    public BigDecimal getFixPrice() {

        return fixPrice;
    }

    /**
     * <pre>
     * 促销价
     * </pre>
     * 
     * @param fixPrice the fixPrice to set
     */
    public void setFixPrice(BigDecimal fixPrice) {

        this.fixPrice = fixPrice;
    }

    /**
     * <pre>
     * 商品总税额
     * </pre>
     * 
     * @return the totalTax
     */
    public BigDecimal getTotalTax() {

        return totalTax;
    }

    /**
     * <pre>
     * 商品总税额
     * </pre>
     * 
     * @param totalTax the totalTax to set
     */
    public void setTotalTax(BigDecimal totalTax) {

        this.totalTax = totalTax;
    }

    /**
     * <pre>
     * 小计
     * </pre>
     * 
     * @return the totalPrice
     */
    public BigDecimal getTotalPrice() {

        return totalPrice;
    }

    /**
     * <pre>
     * 小计
     * </pre>
     * 
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(BigDecimal totalPrice) {

        this.totalPrice = totalPrice;
    }

    /**
     * <pre>
     * 总拆扣
     * </pre>
     * 
     * @return the totalDiscount
     */
    public BigDecimal getTotalDiscount() {

        return totalDiscount;
    }

    /**
     * <pre>
     * 总拆扣
     * </pre>
     * 
     * @param totalDiscount the totalDiscount to set
     */
    public void setTotalDiscount(BigDecimal totalDiscount) {

        this.totalDiscount = totalDiscount;
    }

    /**
     * <pre>
     * 仓库
     * </pre>
     * 
     * @return the warehouse
     */
    public String getWarehouse() {

        return warehouse;
    }

    /**
     * <pre>
     * 仓库
     * </pre>
     * 
     * @param warehouse the warehouse to set
     */
    public void setWarehouse(String warehouse) {

        this.warehouse = warehouse;
    }

}
