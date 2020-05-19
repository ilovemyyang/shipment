package com.madjava.micro.model.wcms;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2020-01-09 18:30:20
 */
@Table(name = "linkpage")
public class Linkpage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    public static final String _PK = "pk";
	
	    //页面编码
    public static final String _CODE = "code";
	
	    //页面名称
    public static final String _NAME = "name";
	
	    //副标题
    public static final String _SUBTITLE = "subtitle";
	
	    //渠道
    public static final String _CHANNELCODE = "channelCode";
	
	    //优先级
    public static final String _PRIORITY = "priority";
	
	    //页面有效开始时间
    public static final String _STARTDATE = "startDate";
	
	    //页面有效结束时间
    public static final String _ENDDATE = "endDate";
	
	    //页面logo
    public static final String _LOGO = "logo";
	
	    //是否再用
    public static final String _ISUSED = "isUsed";
	
	    //创建时间
    public static final String _CREATETIME = "createTime";
	
	    //创建人
    public static final String _CREATEBY = "createBy";
	
	    //更新时间
    public static final String _UPDATETIME = "updateTime";
	
	    //更新人
    public static final String _UPDATEBY = "updateBy";
    
		//适用设备
    public static final String _AVAILABLEDEVICE = "availableDevice";
    
	//版本
    public static final String _VERSION = "version";
    
	
	    //主键
    @Id
    private String pk;
	
	    //页面编码
    @Column(name = "code")
    private String code;
	
	    //页面名称
    @Column(name = "name")
    private String name;
	
	    //副标题
    @Column(name = "subtitle")
    private String subtitle;
	
	    //渠道
    @Column(name = "channel_code")
    private String channelCode;
	
	    //优先级
    @Column(name = "priority")
    private Integer priority;
	
	    //页面有效开始时间
    @Column(name = "start_date")
    private Date startDate;
	
	    //页面有效结束时间
    @Column(name = "end_date")
    private Date endDate;
	
	    //页面logo
    @Column(name = "logo")
    private String logo;
	
	    //是否再用
    @Column(name = "is_used")
    private Boolean isUsed;
	
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
    
    	//适用设备
    @Column(name = "available_device")
    private String availableDevice;
    
	//版本
	@Column(name = "version")
	private String version;
	
	//页面内容
	@Column(name = "content")
	private String content;
	
	//状态
	@Column(name = "status")
	private String status;
	
    //页面类型：首页-homepage，活动页-campaignpage，内置页-internalpage
	@Column(name = "page_type")
	private String pageType;
	
	public String getAvailableDevice() {
		return availableDevice;
	}
	public void setAvailableDevice(String availableDevice) {
		this.availableDevice = availableDevice;
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
	 * 设置：页面编码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：页面编码
	 */
	public String getCode() {
		return code;
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
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPageType() {
		return pageType;
	}
	public void setPageType(String pageType) {
		this.pageType = pageType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
