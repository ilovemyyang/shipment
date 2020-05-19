package com.madjava.micro.model.paymenttransactionentry;

import java.util.Date;

import java.io.Serializable;
import java.math.BigDecimal; 
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
public class Paymenttransactionentry implements Serializable {

    private static final long serialVersionUID = 5682729142864706378L;

    /**
     */
    private String pk;

    /**
     */
    private Date paymenttime;

    /**
     */
    private Date requesttime;

    /**
     */
    private String requestpacket;

    /**
     */
    private String responsepacket;

    /**
     */
    private String type;

    /**
     */
    private BigDecimal payamount;

    /**
     */
    private String paymenttransactionpk;

    /**
     */
    private String notifyid;

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
     * @return the paymenttime
     */
    public Date getPaymenttime() {

        return paymenttime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param paymenttime the paymenttime to set
     */
    public void setPaymenttime(Date paymenttime) {

        this.paymenttime = paymenttime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the requesttime
     */
    public Date getRequesttime() {

        return requesttime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param requesttime the requesttime to set
     */
    public void setRequesttime(Date requesttime) {

        this.requesttime = requesttime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the requestpacket
     */
    public String getRequestpacket() {

        return requestpacket;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param requestpacket the requestpacket to set
     */
    public void setRequestpacket(String requestpacket) {

        this.requestpacket = requestpacket;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the responsepacket
     */
    public String getResponsepacket() {

        return responsepacket;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param responsepacket the responsepacket to set
     */
    public void setResponsepacket(String responsepacket) {

        this.responsepacket = responsepacket;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the type
     */
    public String getType() {

        return type;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param type the type to set
     */
    public void setType(String type) {

        this.type = type;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the payamount
     */
    public BigDecimal getPayamount() {

        return payamount;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param payamount the payamount to set
     */
    public void setPayamount(BigDecimal payamount) {

        this.payamount = payamount;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the paymenttransactionpk
     */
    public String getPaymenttransactionpk() {

        return paymenttransactionpk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param paymenttransactionpk the paymenttransactionpk to set
     */
    public void setPaymenttransactionpk(String paymenttransactionpk) {

        this.paymenttransactionpk = paymenttransactionpk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the notifyid
     */
    public String getNotifyid() {

        return notifyid;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param notifyid the notifyid to set
     */
    public void setNotifyid(String notifyid) {

        this.notifyid = notifyid;
    }
}
