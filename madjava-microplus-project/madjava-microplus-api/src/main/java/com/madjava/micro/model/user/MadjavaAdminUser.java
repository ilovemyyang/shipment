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
 * @author madjava-
 */
public class MadjavaAdminUser implements Serializable {

    private static final long serialVersionUID = -4264029675849146688L;

    /**
     */
    private String adminPk;

    /**
     */
    private String username;

    /**
     */
    private String password;

    /**
     */
    private Integer level;
    
    /**
     * 
     */
    private String levelStr;

    /**
     */
    private String channel;
    
    /**
     * 
     */
    private String channelStr;

    /**
     */
    private String mobile;

    /**
     */
    private String nickName;

    /**
     */
    private String mail;

    /**
     */
    private String createUser;

    /**
     */
    private Date createTime;
    
    /**
     * 
     */
    private String createTimeStr;

    /**
     */
    private String updateUser;

    /**
     */
    private Date updateTime;
    
    /**
     * 
     */
    private String updateTimeStr;

    /**
     * <pre>
     * </pre>
     * 
     * @return the adminPk
     */
    public String getAdminPk() {

        return adminPk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param adminPk the adminPk to set
     */
    public void setAdminPk(String adminPk) {

        this.adminPk = adminPk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the username
     */
    public String getUsername() {

        return username;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param username the username to set
     */
    public void setUsername(String username) {

        this.username = username;
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
     * @return the level
     */
    public Integer getLevel() {

        return level;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param level the level to set
     */
    public void setLevel(Integer level) {

        this.level = level;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the channel
     */
    public String getChannel() {

        return channel;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param channel the channel to set
     */
    public void setChannel(String channel) {

        this.channel = channel;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the mobile
     */
    public String getMobile() {

        return mobile;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {

        this.mobile = mobile;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the nickName
     */
    public String getNickName() {

        return nickName;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param nickName the nickName to set
     */
    public void setNickName(String nickName) {

        this.nickName = nickName;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the mail
     */
    public String getMail() {

        return mail;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param mail the mail to set
     */
    public void setMail(String mail) {

        this.mail = mail;
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

	public String getLevelStr() {
		return levelStr;
	}

	public void setLevelStr(String levelStr) {
		this.levelStr = levelStr;
	}

	public String getChannelStr() {
		return channelStr;
	}

	public void setChannelStr(String channelStr) {
		this.channelStr = channelStr;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public String getUpdateTimeStr() {
		return updateTimeStr;
	}

	public void setUpdateTimeStr(String updateTimeStr) {
		this.updateTimeStr = updateTimeStr;
	}
}
