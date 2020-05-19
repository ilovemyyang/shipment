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
@Table(name = "linkgroup")
public class Linkgroup implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//主键
    public static final String _PK = "pk";
	
	    //组件名称
    public static final String _NAME = "name";
	
	    //副标题
    public static final String _SUBTITLE = "subtitle";
	
	    //排序
    public static final String _RANK = "rank";
	
	    //有效开始时间
    public static final String _STARTDATE = "startDate";
	
	    //有效结束时间
    public static final String _ENDDATE = "endDate";
	
	    //组件主题
    public static final String _DISPLAYTHEME = "displayTheme";
	
	    //页面pk
    public static final String _PAGEPK = "pagePk";
	
	    //组件内容
    public static final String _CONTENT = "content";
	
	    //创建时间
    public static final String _CREATETIME = "createTime";
	
	    //创建人
    public static final String _CREATEBY = "createBy";
	
	    //更新时间
    public static final String _UPDATETIME = "updateTime";
	
	    //更新人
    public static final String _UPDATEBY = "updateBy";
	
	    //主键
    @Id
    private String pk;
	
	    //组件名称
    @Column(name = "name")
    private String name;
	
	    //副标题
    @Column(name = "subtitle")
    private String subtitle;
	
	    //排序
    @Column(name = "rank")
    private Integer rank;
	
	    //有效开始时间
    @Column(name = "start_date")
    private Date startDate;
	
	    //有效结束时间
    @Column(name = "end_date")
    private Date endDate;
	
	    //组件主题
    @Column(name = "display_theme")
    private String displayTheme;
	
	    //页面pk
    @Column(name = "page_pk")
    private String pagePk;
    
    //组件类型
	@Column(name = "groupType")
	private String groupType;
	
	    //组件内容
    @Column(name = "content")
    private String content;
	
	    //创建时间
    @Column(name = "create_time")
    private Date createTime;
	
	    //创建人
    @Column(name = "create_by")
    private String createBy;
	
	    //更新时间
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
	 * 设置：组件名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：组件名称
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
	 * 设置：排序
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	/**
	 * 获取：排序
	 */
	public Integer getRank() {
		return rank;
	}
	/**
	 * 设置：有效开始时间
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取：有效开始时间
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 设置：有效结束时间
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * 获取：有效结束时间
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * 设置：组件主题
	 */
	public void setDisplayTheme(String displayTheme) {
		this.displayTheme = displayTheme;
	}
	/**
	 * 获取：组件主题
	 */
	public String getDisplayTheme() {
		return displayTheme;
	}
	/**
	 * 设置：页面pk
	 */
	public void setPagePk(String pagePk) {
		this.pagePk = pagePk;
	}
	/**
	 * 获取：页面pk
	 */
	public String getPagePk() {
		return pagePk;
	}
	/**
	 * 设置：组件内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：组件内容
	 */
	public String getContent() {
		return content;
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
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
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
	public String getGroupType() {
		return groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
}
