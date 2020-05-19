package com.madjava.micro.model.user;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2020-01-09 15:27:54
 */
@Table(name = "customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private String userPk;
	
	    //
    @Column(name = "uid")
    private String uid;
	
	    //
    @Column(name = "user_name")
    private String userName;
	
	    //
    @Column(name = "password")
    private String password;
	
	    //
    @Column(name = "profile_picture")
    private String profilePicture;
	
	    //
    @Column(name = "login_disabled")
    private Integer loginDisabled;
	
	    //
    @Column(name = "last_login_date")
    private Date lastLoginDate;
	
	    //
    @Column(name = "title")
    private String title;
	
	    //
    @Column(name = "mobile_number")
    private String mobileNumber;
	
	    //
    @Column(name = "crm_id")
    private String crmId;
	
	    //
    @Column(name = "activated_state")
    private String activatedState;
	
	    //
    @Column(name = "activate_date")
    private Date activateDate;
	
	    //
    @Column(name = "create_time")
    private Date createTime;
	
	    //
    @Column(name = "update_time")
    private Date updateTime;
	
	    //
    @Column(name = "description")
    private String description;
	
	    //
    @Column(name = "email")
    private String email;
	
	    //
    @Column(name = "nick_name")
    private String nickName;
	
	    //
    @Column(name = "regist_channel")
    private String registChannel;
	
	    //
    @Column(name = "refmobile")
    private String refmobile;
	
	    //
    @Column(name = "member_district")
    private String memberDistrict;
	
	    //
    @Column(name = "user_level")
    private String userLevel;
	
	    //
    @Column(name = "id_number")
    private String idNumber;
	
	    //
    @Column(name = "id_type")
    private String idType;
	
	    //
    @Column(name = "name")
    private String name;
	
	    //
    @Column(name = "sex")
    private String sex;
	
	    //
    @Column(name = "birthday")
    private Date birthday;
	
	    //
    @Column(name = "userCommodityType")
    private String usercommoditytype;
	

	/**
	 * 设置：
	 */
	public void setUserPk(String userPk) {
		this.userPk = userPk;
	}
	/**
	 * 获取：
	 */
	public String getUserPk() {
		return userPk;
	}
	/**
	 * 设置：
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}
	/**
	 * 获取：
	 */
	public String getUid() {
		return uid;
	}
	/**
	 * 设置：
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置：
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：
	 */
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	/**
	 * 获取：
	 */
	public String getProfilePicture() {
		return profilePicture;
	}
	/**
	 * 设置：
	 */
	public void setLoginDisabled(Integer loginDisabled) {
		this.loginDisabled = loginDisabled;
	}
	/**
	 * 获取：
	 */
	public Integer getLoginDisabled() {
		return loginDisabled;
	}
	/**
	 * 设置：
	 */
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	/**
	 * 获取：
	 */
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	/**
	 * 设置：
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * 获取：
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * 设置：
	 */
	public void setCrmId(String crmId) {
		this.crmId = crmId;
	}
	/**
	 * 获取：
	 */
	public String getCrmId() {
		return crmId;
	}
	/**
	 * 设置：
	 */
	public void setActivatedState(String activatedState) {
		this.activatedState = activatedState;
	}
	/**
	 * 获取：
	 */
	public String getActivatedState() {
		return activatedState;
	}
	/**
	 * 设置：
	 */
	public void setActivateDate(Date activateDate) {
		this.activateDate = activateDate;
	}
	/**
	 * 获取：
	 */
	public Date getActivateDate() {
		return activateDate;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * 获取：
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * 设置：
	 */
	public void setRegistChannel(String registChannel) {
		this.registChannel = registChannel;
	}
	/**
	 * 获取：
	 */
	public String getRegistChannel() {
		return registChannel;
	}
	/**
	 * 设置：
	 */
	public void setRefmobile(String refmobile) {
		this.refmobile = refmobile;
	}
	/**
	 * 获取：
	 */
	public String getRefmobile() {
		return refmobile;
	}
	/**
	 * 设置：
	 */
	public void setMemberDistrict(String memberDistrict) {
		this.memberDistrict = memberDistrict;
	}
	/**
	 * 获取：
	 */
	public String getMemberDistrict() {
		return memberDistrict;
	}
	/**
	 * 设置：
	 */
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	/**
	 * 获取：
	 */
	public String getUserLevel() {
		return userLevel;
	}
	/**
	 * 设置：
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	/**
	 * 获取：
	 */
	public String getIdNumber() {
		return idNumber;
	}
	/**
	 * 设置：
	 */
	public void setIdType(String idType) {
		this.idType = idType;
	}
	/**
	 * 获取：
	 */
	public String getIdType() {
		return idType;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取：
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置：
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * 获取：
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * 设置：
	 */
	public void setUsercommoditytype(String usercommoditytype) {
		this.usercommoditytype = usercommoditytype;
	}
	/**
	 * 获取：
	 */
	public String getUsercommoditytype() {
		return usercommoditytype;
	}
}
