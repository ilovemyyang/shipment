package com.madjava.micro.model.user;

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
public class RealnameAuth implements Serializable {

    private static final long serialVersionUID = 2344964264780091592L;

    /**
     * 主键
     */
    private String pk;

    /**
     * 用户主键
     */
    private String userPk;

    /**
     * 姓名
     */
    private String name;

    /**
     * 证件号码
     */
    private String cardNo;

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
     * 用户主键
     * </pre>
     * 
     * @return the userPk
     */
    public String getUserPk() {

        return userPk;
    }

    /**
     * <pre>
     * 用户主键
     * </pre>
     * 
     * @param userPk the userPk to set
     */
    public void setUserPk(String userPk) {

        this.userPk = userPk;
    }

    /**
     * <pre>
     * 姓名
     * </pre>
     * 
     * @return the name
     */
    public String getName() {

        return name;
    }

    /**
     * <pre>
     * 姓名
     * </pre>
     * 
     * @param name the name to set
     */
    public void setName(String name) {

        this.name = name;
    }

    /**
     * <pre>
     * 证件号码
     * </pre>
     * 
     * @return the cardNo
     */
    public String getCardNo() {

        return cardNo;
    }

    /**
     * <pre>
     * 证件号码
     * </pre>
     * 
     * @param cardNo the cardNo to set
     */
    public void setCardNo(String cardNo) {

        this.cardNo = cardNo;
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
