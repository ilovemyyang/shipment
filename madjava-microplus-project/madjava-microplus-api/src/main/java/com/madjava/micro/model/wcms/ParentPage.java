package com.madjava.micro.model.wcms;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2020-03-30 23:47:57
 */
@Table(name = "parent_page")
public class ParentPage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    public static final String _PK = "pk";
	
	    //页面类型：首页-homepage，活动页-campaignpage，内置页-internalpage
    public static final String _PAGETYPE = "pageType";
	
	    //是否再用
    public static final String _ISUSED = "isUsed";
	
	    //页面logo
    public static final String _LOGO = "logo";
	
	    //渠道
    public static final String _CHANNELCODE = "channelCode";
	
	    //页面名称
    public static final String _NAME = "name";
	
	    //副标题
    public static final String _SUBTITLE = "subtitle";
	
	    //优先级
    public static final String _PRIORITY = "priority";
	
	    //页面有效开始时间
    public static final String _STARTDATE = "startDate";
	
	    //页面有效结束时间
    public static final String _ENDDATE = "endDate";
	
	    //创建时间
    public static final String _CREATETIME = "createTime";
	
	    //创建人
    public static final String _CREATEBY = "createBy";
	
	    //更新时间
    public static final String _UPDATETIME = "updateTime";
	
	    //更新人
    public static final String _UPDATEBY = "updateBy";
	
	
	    //
    @Id
    private String pk;
	
	    //页面类型：首页-homepage，活动页-campaignpage，内置页-internalpage
    @Column(name = "page_type")
    private String pageType;
	
	    //是否再用
    @Column(name = "is_used")
    private Boolean isUsed;
	
	    //页面logo
    @Column(name = "logo")
    private String logo;
	
	    //渠道
    @Column(name = "channel_code")
    private String channelCode;
	
	    //页面名称
    @Column(name = "name")
    private String name;
	
	    //副标题
    @Column(name = "subtitle")
    private String subtitle;
	
	    //优先级
    @Column(name = "priority")
    private Integer priority;
	
	    //页面有效开始时间
    @Column(name = "start_date")
    private Date startDate;
	
	    //页面有效结束时间
    @Column(name = "end_date")
    private Date endDate;
	
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
	 * 设置：
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}
	/**
	 * 获取：
	 */
	public String getPk() {
		return pk;
	}
	/**
	 * 设置：页面类型：首页-homepage，活动页-campaignpage，内置页-internalpage
	 */
	public void setPageType(String pageType) {
		this.pageType = pageType;
	}
	/**
	 * 获取：页面类型：首页-homepage，活动页-campaignpage，内置页-internalpage
	 */
	public String getPageType() {
		return pageType;
	}
	/**
	 * 设置：是否再用
	 */
	public void setIsUsed(Boolean isUsed) {
		this.isUsed = isUsed;
	}
	/**
	 * 获取：是否再用
	 */
	public Boolean getIsUsed() {
		return isUsed;
	}
	/**
	 * 设置：页面logo
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}
	/**
	 * 获取：页面logo
	 */
	public String getLogo() {
		return logo;
	}
	/**
	 * 设置：渠道
	 */
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	/**
	 * 获取：渠道
	 */
	public String getChannelCode() {
		return channelCode;
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
	 * 设置：优先级
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	/**
	 * 获取：优先级
	 */
	public Integer getPriority() {
		return priority;
	}
	/**
	 * 设置：页面有效开始时间
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取：页面有效开始时间
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 设置：页面有效结束时间
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * 获取：页面有效结束时间
	 */
	public Date getEndDate() {
		return endDate;
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
}
