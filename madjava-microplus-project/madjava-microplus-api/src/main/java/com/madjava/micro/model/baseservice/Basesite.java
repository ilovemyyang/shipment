package com.madjava.micro.model.baseservice;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author zhuoxing.yan
 * @email zhuoxing.yan@accenture.com
 * @date 2020-03-22 16:44:03
 */
@Table(name = "basesite")
public class Basesite implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    public static final String _ID = "id";
	
	    //编码
    public static final String _SITECODE = "siteCode";
	
	    //是否启用
    public static final String _ISACTIVE = "isActive";
	
	    //默认语言
    public static final String _DEFAULTLANGUAGE = "defaultLanguage";
	
	    //默认货币
    public static final String _DEFAULTCURRENCY = "defaultCurrency";
	
	    //创建时间
    public static final String _CREATETIME = "createTime";
	
	    //修改时间
    public static final String _MODIFYTIME = "modifyTime";
	
	
	    //主键
    @Id
    private Integer id;
	
	    //编码
    @Column(name = "site_code")
    private String siteCode;
	
	    //是否启用
    @Column(name = "is_active")
    private Boolean isActive;
	
	    //默认语言
    @Column(name = "default_language")
    private String defaultLanguage;
	
	    //默认货币
    @Column(name = "default_currency")
    private String defaultCurrency;
	
	    //创建时间
    @Column(name = "create_time")
    private Date createTime;
	
	    //修改时间
    @Column(name = "modify_time")
    private Date modifyTime;
	

	/**
	 * 设置：主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：编码
	 */
	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}
	/**
	 * 获取：编码
	 */
	public String getSiteCode() {
		return siteCode;
	}
	/**
	 * 设置：是否启用
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	/**
	 * 获取：是否启用
	 */
	public Boolean getIsActive() {
		return isActive;
	}
	/**
	 * 设置：默认语言
	 */
	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}
	/**
	 * 获取：默认语言
	 */
	public String getDefaultLanguage() {
		return defaultLanguage;
	}
	/**
	 * 设置：默认货币
	 */
	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}
	/**
	 * 获取：默认货币
	 */
	public String getDefaultCurrency() {
		return defaultCurrency;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：修改时间
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getModifyTime() {
		return modifyTime;
	}
}
