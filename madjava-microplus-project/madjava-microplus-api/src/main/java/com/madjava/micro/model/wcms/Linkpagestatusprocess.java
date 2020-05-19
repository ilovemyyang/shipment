package com.madjava.micro.model.wcms;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author xudong.lin
 * @email xudong.lin@accenture.com
 * @date 2020-04-27 12:01:48
 */
@Table(name = "linkpagestatusprocess")
public class Linkpagestatusprocess implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    public static final String _PK = "pk";
	
	    //页面主键
    public static final String _PAGEPK = "pagePk";
	
	    //页面状态
    public static final String _PAGESTATUS = "pageStatus";
	
	    //更新时间
    public static final String _UPDATETIME = "updateTime";
	
	    //更新人
    public static final String _UPDATEBY = "updateBy";
	
	    //更新状态
    public static final String _PROCESSSTATUS = "processStatus";
	
	
	    //主键
    @Id
    private String pk;
	
	    //页面主键
    @Column(name = "page_pk")
    private String pagePk;
	
	    //页面状态
    @Column(name = "page_status")
    private String pageStatus;
	
	    //更新时间
    @Column(name = "update_time")
    private Date updateTime;
	
	    //更新人
    @Column(name = "update_by")
    private String updateBy;
	
	    //更新状态
    @Column(name = "process_status")
    private String processStatus;
	

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
	 * 设置：页面主键
	 */
	public void setPagePk(String pagePk) {
		this.pagePk = pagePk;
	}
	/**
	 * 获取：页面主键
	 */
	public String getPagePk() {
		return pagePk;
	}
	/**
	 * 设置：页面状态
	 */
	public void setPageStatus(String pageStatus) {
		this.pageStatus = pageStatus;
	}
	/**
	 * 获取：页面状态
	 */
	public String getPageStatus() {
		return pageStatus;
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
	/**
	 * 设置：更新状态
	 */
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	/**
	 * 获取：更新状态
	 */
	public String getProcessStatus() {
		return processStatus;
	}
}
