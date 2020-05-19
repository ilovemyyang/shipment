package com.madjava.micro.model.wcms;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2020-04-24 14:37:00
 */
@Table(name = "linkcommoncomponent")
public class Linkcommoncomponent implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    public static final String _PK = "pk";
	
	    //通用组件编码
    public static final String _CODE = "code";
	
	    //通用组件名称
    public static final String _NAME = "name";
	
	    //渠道
    public static final String _CHANNELCODE = "channelCode";
	
	    //通用组件logo
    public static final String _LOGO = "logo";
	
	    //版本
    public static final String _VERSION = "version";
	
	    //适用设备
    public static final String _AVAILABLEDEVICE = "availableDevice";
	
	    //通用组件状态
    public static final String _STATUS = "status";
	
	    //通用组件内容
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
	
	    //通用组件编码
    @Column(name = "code")
    private String code;
	
	    //通用组件名称
    @Column(name = "name")
    private String name;
	
	    //渠道
    @Column(name = "channel_code")
    private String channelCode;
	
	    //通用组件logo
    @Column(name = "logo")
    private String logo;
	
	    //版本
    @Column(name = "version")
    private String version;
	
	    //适用设备
    @Column(name = "available_device")
    private String availableDevice;
	
	    //通用组件状态
    @Column(name = "status")
    private String status;
	
	    //通用组件内容
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
	 * 设置：通用组件编码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：通用组件编码
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：通用组件名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：通用组件名称
	 */
	public String getName() {
		return name;
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
	 * 设置：通用组件logo
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}
	/**
	 * 获取：通用组件logo
	 */
	public String getLogo() {
		return logo;
	}
	/**
	 * 设置：版本
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	/**
	 * 获取：版本
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * 设置：适用设备
	 */
	public void setAvailableDevice(String availableDevice) {
		this.availableDevice = availableDevice;
	}
	/**
	 * 获取：适用设备
	 */
	public String getAvailableDevice() {
		return availableDevice;
	}
	/**
	 * 设置：通用组件状态
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：通用组件状态
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：通用组件内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：通用组件内容
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
}
