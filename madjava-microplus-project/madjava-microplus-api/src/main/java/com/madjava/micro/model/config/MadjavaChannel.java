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
 * @author madjava-
 */
public class MadjavaChannel implements Serializable {

    private static final long serialVersionUID = -7407550188111327750L;

    /**
     */
    private Integer id;

    /**
     */
    private String channelCode;

    /**
     */
    private String channelName;

    /**
     */
    private String createUser;

    /**
     */
    private Date createTime;

    /**
     */
    private String updateUser;

    /**
     */
    private Date updateTime;

    /**
     * <pre>
     * </pre>
     * 
     * @return the id
     */
    public Integer getId() {

        return id;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param id the id to set
     */
    public void setId(Integer id) {

        this.id = id;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the channelCode
     */
    public String getChannelCode() {

        return channelCode;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param channelCode the channelCode to set
     */
    public void setChannelCode(String channelCode) {

        this.channelCode = channelCode;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the channelName
     */
    public String getChannelName() {

        return channelName;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param channelName the channelName to set
     */
    public void setChannelName(String channelName) {

        this.channelName = channelName;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the createUser
     */
    public String getCreateUser() {

        return createUser;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param createUser the createUser to set
     */
    public void setCreateUser(String createUser) {

        this.createUser = createUser;
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
     * @return the updateUser
     */
    public String getUpdateUser() {

        return updateUser;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param updateUser the updateUser to set
     */
    public void setUpdateUser(String updateUser) {

        this.updateUser = updateUser;
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
