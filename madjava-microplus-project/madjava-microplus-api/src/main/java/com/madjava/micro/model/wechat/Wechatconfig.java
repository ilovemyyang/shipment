package com.madjava.micro.model.wechat;

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
public class Wechatconfig implements Serializable {

    private static final long serialVersionUID = -9177084521836808266L;

    /**
     */
    private String pk;

    /**
     */
    private String appid;

    /**
     */
    private String appsecret;

    /**
     */
    private String accesstoken;

    /**
     */
    private String apiticket;

    /**
     */
    private Date tokenexpiretime;

    /**
     */
    private Date ticketexpiretime;

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
     * @return the appid
     */
    public String getAppid() {

        return appid;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param appid the appid to set
     */
    public void setAppid(String appid) {

        this.appid = appid;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the appsecret
     */
    public String getAppsecret() {

        return appsecret;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param appsecret the appsecret to set
     */
    public void setAppsecret(String appsecret) {

        this.appsecret = appsecret;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the accesstoken
     */
    public String getAccesstoken() {

        return accesstoken;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param accesstoken the accesstoken to set
     */
    public void setAccesstoken(String accesstoken) {

        this.accesstoken = accesstoken;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the apiticket
     */
    public String getApiticket() {

        return apiticket;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param apiticket the apiticket to set
     */
    public void setApiticket(String apiticket) {

        this.apiticket = apiticket;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the tokenexpiretime
     */
    public Date getTokenexpiretime() {

        return tokenexpiretime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param tokenexpiretime the tokenexpiretime to set
     */
    public void setTokenexpiretime(Date tokenexpiretime) {

        this.tokenexpiretime = tokenexpiretime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the ticketexpiretime
     */
    public Date getTicketexpiretime() {

        return ticketexpiretime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param ticketexpiretime the ticketexpiretime to set
     */
    public void setTicketexpiretime(Date ticketexpiretime) {

        this.ticketexpiretime = ticketexpiretime;
    }
}
