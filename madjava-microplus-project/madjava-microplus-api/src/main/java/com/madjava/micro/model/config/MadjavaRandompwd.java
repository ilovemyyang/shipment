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
public class MadjavaRandompwd implements Serializable {

    private static final long serialVersionUID = 339498979069116722L;

    /**
     */
    private String cellphone;

    /**
     */
    private String password;

    /**
     */
    private Byte used;

    /**
     */
    private Integer userType;

    /**
     */
    private Date invalidTime;

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
     * @return the cellphone
     */
    public String getCellphone() {

        return cellphone;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param cellphone the cellphone to set
     */
    public void setCellphone(String cellphone) {

        this.cellphone = cellphone;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the password
     */
    public String getPassword() {

        return password;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param password the password to set
     */
    public void setPassword(String password) {

        this.password = password;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the used
     */
    public Byte getUsed() {

        return used;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param used the used to set
     */
    public void setUsed(Byte used) {

        this.used = used;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the userType
     */
    public Integer getUserType() {

        return userType;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param userType the userType to set
     */
    public void setUserType(Integer userType) {

        this.userType = userType;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the invalidTime
     */
    public Date getInvalidTime() {

        return invalidTime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param invalidTime the invalidTime to set
     */
    public void setInvalidTime(Date invalidTime) {

        this.invalidTime = invalidTime;
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
