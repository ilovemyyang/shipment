package com.madjava.micro.model.order;

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
public class CancelConfig implements Serializable {

    private static final long serialVersionUID = 1636686240646818457L;

    /**
     */
    private String cancelCode;

    /**
     */
    private String cancelMessage;

    /**
     */
    private Date createTime;

    /**
     * <pre>
     * </pre>
     * 
     * @return the cancelCode
     */
    public String getCancelCode() {

        return cancelCode;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param cancelCode the cancelCode to set
     */
    public void setCancelCode(String cancelCode) {

        this.cancelCode = cancelCode;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the cancelMessage
     */
    public String getCancelMessage() {

        return cancelMessage;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param cancelMessage the cancelMessage to set
     */
    public void setCancelMessage(String cancelMessage) {

        this.cancelMessage = cancelMessage;
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
}
