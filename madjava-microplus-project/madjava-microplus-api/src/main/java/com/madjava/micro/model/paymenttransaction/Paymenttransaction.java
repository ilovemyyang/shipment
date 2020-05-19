package com.madjava.micro.model.paymenttransaction;

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
public class Paymenttransaction implements Serializable {

    private static final long serialVersionUID = 8083581867810689084L;

    /**
     */
    private String pk;

    /**
     */
    private String ordercode;

    /**
     */
    private String paymentprovider;

    /**
     */
    private String latesttradestatus;

    /**
     */
    private String tradeno;

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
     * @return the paymentprovider
     */
    public String getPaymentprovider() {

        return paymentprovider;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param paymentprovider the paymentprovider to set
     */
    public void setPaymentprovider(String paymentprovider) {

        this.paymentprovider = paymentprovider;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the latesttradestatus
     */
    public String getLatesttradestatus() {

        return latesttradestatus;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param latesttradestatus the latesttradestatus to set
     */
    public void setLatesttradestatus(String latesttradestatus) {

        this.latesttradestatus = latesttradestatus;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the tradeno
     */
    public String getTradeno() {

        return tradeno;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param tradeno the tradeno to set
     */
    public void setTradeno(String tradeno) {

        this.tradeno = tradeno;
    }
}
