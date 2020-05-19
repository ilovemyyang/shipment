package com.madjava.micro.model.config;

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
 * @author 埃森哲-
 */
public class MadjavaSmsConfig implements Serializable {

    private static final long serialVersionUID = 1524818209223350161L;

    /**
     */
    private String smsPk;

    /**
     */
    private String smsMessage;

    /**
     */
    private Date createTime;

    /**
     */
    private Date updateTime;

    /**
     * <pre>
     * </pre>
     * 
     * @return the smsPk
     */
    public String getSmsPk() {

        return smsPk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param smsPk the smsPk to set
     */
    public void setSmsPk(String smsPk) {

        this.smsPk = smsPk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the smsMessage
     */
    public String getSmsMessage() {

        return smsMessage;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param smsMessage the smsMessage to set
     */
    public void setSmsMessage(String smsMessage) {

        this.smsMessage = smsMessage;
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
     * @return the updateTime
     */
    public Date getUpdateTime() {

        return updateTime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Date updateTime) {

        this.updateTime = updateTime;
    }
}
