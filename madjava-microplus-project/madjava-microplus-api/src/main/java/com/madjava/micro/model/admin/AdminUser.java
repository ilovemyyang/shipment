package com.madjava.micro.model.admin;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "base_user")
public class AdminUser implements java.io.Serializable
{
	/**
	 *
	 */
	private static final long serialVersionUID = -5871859737367358347L;

	@Id
	private Integer id;

	private String username;

	private String password;

	private String name;

	private String birthday;

	private String address;

	@Column(name = "mobile_phone")
	private String mobilePhone;

	@Column(name = "tel_phone")
	private String telPhone;

	private String email;

	private String sex;

	private String type;

	private String status;

	private String description;

	@Column(name = "crt_time")
	private Date crtTime;

	@Column(name = "crt_user")
	private String crtUser;

	@Column(name = "crt_name")
	private String crtName;

	@Column(name = "crt_host")
	private String crtHost;

	@Column(name = "upd_time")
	private Date updTime;

	@Column(name = "upd_user")
	private String updUser;

	@Column(name = "upd_name")
	private String updName;

	@Column(name = "upd_host")
	private String updHost;

	private String attr1;

	private String attr2;

	private String attr3;

	private String attr4;

	private String attr5;

	private String attr6;

	private String attr7;

	private String attr8;

	/**
	 * @return id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * @param id
	 */
	public void setId(final Integer id) {
		this.id = id;
	}

	/**
	 * @return username
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * @param username
	 */
	public void setUsername(final String username) {
		this.username = username;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @param password
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return birthday
	 */
	public String getBirthday() {
		return this.birthday;
	}

	/**
	 * @param birthday
	 */
	public void setBirthday(final String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * @param address
	 */
	public void setAddress(final String address) {
		this.address = address;
	}

	/**
	 * @return mobile_phone
	 */
	public String getMobilePhone() {
		return this.mobilePhone;
	}

	/**
	 * @param mobilePhone
	 */
	public void setMobilePhone(final String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	/**
	 * @return tel_phone
	 */
	public String getTelPhone() {
		return this.telPhone;
	}

	/**
	 * @param telPhone
	 */
	public void setTelPhone(final String telPhone) {
		this.telPhone = telPhone;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param email
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * @return sex
	 */
	public String getSex() {
		return this.sex;
	}

	/**
	 * @param sex
	 */
	public void setSex(final String sex) {
		this.sex = sex;
	}

	/**
	 * @return type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @param type
	 */
	public void setType(final String type) {
		this.type = type;
	}

	/**
	 * @return status
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * @param status
	 */
	public void setStatus(final String status) {
		this.status = status;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param description
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @return crt_time
	 */
	public Date getCrtTime() {
		return this.crtTime;
	}

	/**
	 * @param crtTime
	 */
	public void setCrtTime(final Date crtTime) {
		this.crtTime = crtTime;
	}

	/**
	 * @return crt_user
	 */
	public String getCrtUser() {
		return this.crtUser;
	}

	/**
	 * @param crtUser
	 */
	public void setCrtUser(final String crtUser) {
		this.crtUser = crtUser;
	}

	/**
	 * @return crt_name
	 */
	public String getCrtName() {
		return this.crtName;
	}

	/**
	 * @param crtName
	 */
	public void setCrtName(final String crtName) {
		this.crtName = crtName;
	}

	/**
	 * @return crt_host
	 */
	public String getCrtHost() {
		return this.crtHost;
	}

	/**
	 * @param crtHost
	 */
	public void setCrtHost(final String crtHost) {
		this.crtHost = crtHost;
	}

	/**
	 * @return upd_time
	 */
	public Date getUpdTime() {
		return this.updTime;
	}

	/**
	 * @param updTime
	 */
	public void setUpdTime(final Date updTime) {
		this.updTime = updTime;
	}

	/**
	 * @return upd_user
	 */
	public String getUpdUser() {
		return this.updUser;
	}

	/**
	 * @param updUser
	 */
	public void setUpdUser(final String updUser) {
		this.updUser = updUser;
	}

	/**
	 * @return upd_name
	 */
	public String getUpdName() {
		return this.updName;
	}

	/**
	 * @param updName
	 */
	public void setUpdName(final String updName) {
		this.updName = updName;
	}

	/**
	 * @return upd_host
	 */
	public String getUpdHost() {
		return this.updHost;
	}

	/**
	 * @param updHost
	 */
	public void setUpdHost(final String updHost) {
		this.updHost = updHost;
	}

	/**
	 * @return attr1
	 */
	public String getAttr1() {
		return this.attr1;
	}

	/**
	 * @param attr1
	 */
	public void setAttr1(final String attr1) {
		this.attr1 = attr1;
	}

	/**
	 * @return attr2
	 */
	public String getAttr2() {
		return this.attr2;
	}

	/**
	 * @param attr2
	 */
	public void setAttr2(final String attr2) {
		this.attr2 = attr2;
	}

	/**
	 * @return attr3
	 */
	public String getAttr3() {
		return this.attr3;
	}

	/**
	 * @param attr3
	 */
	public void setAttr3(final String attr3) {
		this.attr3 = attr3;
	}

	/**
	 * @return attr4
	 */
	public String getAttr4() {
		return this.attr4;
	}

	/**
	 * @param attr4
	 */
	public void setAttr4(final String attr4) {
		this.attr4 = attr4;
	}

	/**
	 * @return attr5
	 */
	public String getAttr5() {
		return this.attr5;
	}

	/**
	 * @param attr5
	 */
	public void setAttr5(final String attr5) {
		this.attr5 = attr5;
	}

	/**
	 * @return attr6
	 */
	public String getAttr6() {
		return this.attr6;
	}

	/**
	 * @param attr6
	 */
	public void setAttr6(final String attr6) {
		this.attr6 = attr6;
	}

	/**
	 * @return attr7
	 */
	public String getAttr7() {
		return this.attr7;
	}

	/**
	 * @param attr7
	 */
	public void setAttr7(final String attr7) {
		this.attr7 = attr7;
	}

	/**
	 * @return attr8
	 */
	public String getAttr8() {
		return this.attr8;
	}

	/**
	 * @param attr8
	 */
	public void setAttr8(final String attr8) {
		this.attr8 = attr8;
	}
}