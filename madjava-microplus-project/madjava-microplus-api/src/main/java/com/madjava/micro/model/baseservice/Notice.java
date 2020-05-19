package com.madjava.micro.model.baseservice;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Data;


/**
 * 
 * 
 * @author zhengquan.xu
 * @email  zhengquan.xu@accenture.com
 * @date 2020-04-08
 */
@Table(name = "notice")
public class Notice implements Serializable {
	private static final long serialVersionUID = 1L;
    //主键
	@Id
	private String pk;
	
    //枚举编号
    @Column(name = "title")
    private String title;
    
    //枚举类型
	@Column(name = "content")
	private String content;
	
    //语言编码
	@Column(name = "enable")
	private Boolean enable;
	
    //名称
    @Column(name = "is_top")
    private Boolean isTop;
    
    //是否禁用
    @Column(name = "priority")
    private Integer priority;
	
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

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Boolean getIsTop() {
		return isTop;
	}

	public void setIsTop(Boolean isTop) {
		this.isTop = isTop;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

}
