package com.madjava.micro.model.admin;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "base_group_member")
public class GroupMember implements Serializable {

	private static final long serialVersionUID = 9152463145802798870L;

	@Id
	private Integer id;
	
	private Integer groupId;
	
	private Integer userId;
	
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getCrtTime() {
		return crtTime;
	}

	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}

	public String getCrtUser() {
		return crtUser;
	}

	public void setCrtUser(String crtUser) {
		this.crtUser = crtUser;
	}

	public String getCrtName() {
		return crtName;
	}

	public void setCrtName(String crtName) {
		this.crtName = crtName;
	}

	public String getCrtHost() {
		return crtHost;
	}

	public void setCrtHost(String crtHost) {
		this.crtHost = crtHost;
	}

	public Date getUpdTime() {
		return updTime;
	}

	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}

	public String getUpdUser() {
		return updUser;
	}

	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}

	public String getUpdName() {
		return updName;
	}

	public void setUpdName(String updName) {
		this.updName = updName;
	}

	public String getUpdHost() {
		return updHost;
	}

	public void setUpdHost(String updHost) {
		this.updHost = updHost;
	}
}
