package com.madjava.micro.model.promotion;

import java.io.Serializable; 
/**
 * <pre>
 * 促销和商品关系表
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author accenture-
 */
public class PromotionProductRef implements Serializable {

    private static final long serialVersionUID = -2226792066608631648L;

    /**
     */
    private String pk;

    /**
     */
    private String promotionPk;

    /**
     */
    private String productCode;

    /**
     * Excluded:排除的商品，Qualifying:生效的商品
     */
    private String logicType;

    /**
     * <pre>
     * </pre>
     * 
     * @return the pk
     */
    public String getPk() {

        return pk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param pk the pk to set
     */
    public void setPk(String pk) {

        this.pk = pk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the promotionPk
     */
    public String getPromotionPk() {

        return promotionPk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param promotionPk the promotionPk to set
     */
    public void setPromotionPk(String promotionPk) {

        this.promotionPk = promotionPk;
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
     * Excluded:排除的商品，Qualifying:生效的商品
     * </pre>
     * 
     * @return the logicType
     */
    public String getLogicType() {

        return logicType;
    }

    /**
     * <pre>
     * Excluded:排除的商品，Qualifying:生效的商品
     * </pre>
     * 
     * @param logicType the logicType to set
     */
    public void setLogicType(String logicType) {

        this.logicType = logicType;
    }
}
