package com.madjava.micro.model.filestore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author zhidong.peng
 * @email zhidong.peng@accenture.com
 * @date 2020-01-09 17:37:05
 */
@Table(name = "media")
public class Media implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    @Id
    private String pk;
	
	    //文件名
    @Column(name = "media_name")
    private String mediaName;
    
    //文件別名
    @Column(name = "display_name")
    private String displayName;
	
	    //语言编码
    @Column(name = "media_url")
    private String mediaUrl;
	
	    //类别名称
    @Column(name = "size")
    private Long size;
	
	    //media_format_Id
    @Column(name = "media_format_id")
    private String mediaFormatId;
	
	    //media_container_Id
    @Column(name = "media_container_id")
    private String mediaContainerId;
	
	    //media_folder_Id
    @Column(name = "media_folder_Id")
    private String mediaFolderId;
	
	    //mongo id
    @Column(name = "mongo_object_id")
    private String mongoObjectId;
	
	    //提示文本
    @Deprecated
    @Column(name = "alt_text")
    private String altText;
	
	    //文件类型
    @Column(name = "mime")
    private String mime;
	
	    //描述
    @Deprecated
    @Column(name = "description")
    private String description;
	
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
    
    @Column(name = "occupation_sum",insertable=false,updatable=false)
    private Long occupationSum;
	

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
	 * 设置：类别编码
	 */
	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}
	/**
	 * 获取：类别编码
	 */
	public String getMediaName() {
		return mediaName;
	}
	/**
	 * 设置：语言编码
	 */
	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}
	/**
	 * 获取：语言编码
	 */
	public String getMediaUrl() {
		return mediaUrl;
	}
	/**
	 * 设置：类别名称
	 */
	public void setSize(Long size) {
		this.size = size;
	}
	/**
	 * 获取：类别名称
	 */
	public Long getSize() {
		return size;
	}
	/**
	 * 设置：media_format_Id
	 */
	public void setMediaFormatId(String mediaFormatId) {
		this.mediaFormatId = mediaFormatId;
	}
	/**
	 * 获取：media_format_Id
	 */
	public String getMediaFormatId() {
		return mediaFormatId;
	}
	/**
	 * 设置：media_container_Id
	 */
	public void setMediaContainerId(String mediaContainerId) {
		this.mediaContainerId = mediaContainerId;
	}
	/**
	 * 获取：media_container_Id
	 */
	public String getMediaContainerId() {
		return mediaContainerId;
	}
	/**
	 * 设置：media_folder_Id
	 */
	public void setMediaFolderId(String mediaFolderId) {
		this.mediaFolderId = mediaFolderId;
	}
	/**
	 * 获取：media_folder_Id
	 */
	public String getMediaFolderId() {
		return mediaFolderId;
	}
	/**
	 * 设置：mongo id
	 */
	public void setMongoObjectId(String mongoObjectId) {
		this.mongoObjectId = mongoObjectId;
	}
	/**
	 * 获取：mongo id
	 */
	public String getMongoObjectId() {
		return mongoObjectId;
	}
	/**
	 * 设置：提示文本
	 */
	public void setAltText(String altText) {
		this.altText = altText;
	}
	/**
	 * 获取：提示文本
	 */
	public String getAltText() {
		return altText;
	}
	/**
	 * 设置：文件类型
	 */
	public void setMime(String mime) {
		this.mime = mime;
	}
	/**
	 * 获取：文件类型
	 */
	public String getMime() {
		return mime;
	}
	/**
	 * 设置：描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：描述
	 */
	public String getDescription() {
		return description;
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
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	public Long getOccupationSum() {
		return occupationSum;
	}
	public void setOccupationSum(Long occupationSum) {
		this.occupationSum = occupationSum;
	}
}
