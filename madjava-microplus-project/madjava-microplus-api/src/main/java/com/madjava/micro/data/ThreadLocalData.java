package com.madjava.micro.data;

import java.io.Serializable;
import java.util.Locale;

//same as ThreadLocalData in i18n project
public class ThreadLocalData implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8906534752073903431L;
	
	private String siteId;
	
	private String userId;
	
	private String userName;
	
	private Locale language;
	
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Locale getLanguage() {
		return language;
	}
	public void setLanguage(Locale language) {
		this.language = language;
	}
	
	
	
	
}
