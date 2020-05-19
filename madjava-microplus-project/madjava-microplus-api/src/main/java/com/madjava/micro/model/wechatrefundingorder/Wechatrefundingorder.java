package com.madjava.micro.model.wechatrefundingorder;

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
public class Wechatrefundingorder implements Serializable {

    private static final long serialVersionUID = -8686956169238277495L;

    /**
     */
    private String pk;

    /**
     */
    private String ordercode;

    /**
     */
    private String refundresult;

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
     * @return the ordercode
     */
    public String getOrdercode() {

        return ordercode;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param ordercode the ordercode to set
     */
    public void setOrdercode(String ordercode) {

        this.ordercode = ordercode;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the refundresult
     */
    public String getRefundresult() {

        return refundresult;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param refundresult the refundresult to set
     */
    public void setRefundresult(String refundresult) {

        this.refundresult = refundresult;
    }
}
