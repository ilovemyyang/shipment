package com.madjava.micro.model.baseservice;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2020-01-10 14:24:05
 */
@Table(name = "platformlp")
public class Platformlp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    @Id
    private String pk;
	
	    //平台主键
    @Column(name = "platform_pk")
    private String platformPk;
	
	    //平台名称
    @Column(name = "name")
    private String name;
    
    @Column(name = "lang_code")
    private String langCode;
	

	public String getLangCode() {
		return langCode;
	}
	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}
	/**
	 * 设置：主键
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}
	/**
	 * 获取：主键
	 */
	public String getPk() {
		return pk;
	}
	/**
	 * 设置：平台主键
	 */
	public void setPlatformPk(String platformPk) {
		this.platformPk = platformPk;
	}
	/**
	 * 获取：平台主键
	 */
	public String getPlatformPk() {
		return platformPk;
	}
	/**
	 * 设置：平台名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：平台名称
	 */
	public String getName() {
		return name;
	}
}
