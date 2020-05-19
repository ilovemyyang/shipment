package com.madjava.micro.model.wcms;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2020-01-03 17:46:43
 */
@Table(name = "linkgrouplp")
public class Linkgrouplp implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//主键
    public static final String _PK = "pk";
	
	    //页面名称
    public static final String _NAME = "name";
	
	    //副标题
    public static final String _SUBTITLE = "subtitle";
	
	    //语言编码
    public static final String _LANGCODE = "langCode";
	
	    //组件pk
    public static final String _GROUPPK = "groupPk";
	
	    //创建时间
    public static final String _CREATETIME = "createTime";
	
	    //创建人
    public static final String _CREATEBY = "createBy";
	
	    //修改时间
    public static final String _UPDATETIME = "updateTime";
	
	    //更新人
    public static final String _UPDATEBY = "updateBy";
	
	    //主键
    @Id
    private String pk;
	
	    //页面名称
    @Column(name = "name")
    private String name;
	
	    //副标题
    @Column(name = "subtitle")
    private String subtitle;
	
	    //语言编码
    @Column(name = "lang_code")
    private String langCode;
	
	    //组件pk
    @Column(name = "group_pk")
    private String groupPk;
	
	    //创建时间
    @Column(name = "create_time")
    private Date createTime;
	
	    //创建人
    @Column(name = "create_by")
    private String createBy;
	
	    //修改时间
    @Column(name = "update_time")
    private Date updateTime;
	
	    //更新人
    @Column(name = "update_by")
    private String updateBy;
	

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
	 * 设置：页面名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：页面名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：副标题
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	/**
	 * 获取：副标题
	 */
	public String getSubtitle() {
		return subtitle;
	}
	/**
	 * 设置：语言编码
	 */
	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}
	/**
	 * 获取：语言编码
	 */
	public String getLangCode() {
		return langCode;
	}
	/**
	 * 设置：组件pk
	 */
	public void setGroupPk(String groupPk) {
		this.groupPk = groupPk;
	}
	/**
	 * 获取：组件pk
	 */
	public String getGroupPk() {
		return groupPk;
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
	 * 设置：创建人
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreateBy() {
		return createBy;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：更新人
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	/**
	 * 获取：更新人
	 */
	public String getUpdateBy() {
		return updateBy;
	}
}
