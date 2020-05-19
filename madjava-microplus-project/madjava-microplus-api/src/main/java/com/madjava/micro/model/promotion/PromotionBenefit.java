package com.madjava.micro.model.promotion;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2019-12-20 15:36:33
 */
@Table(name = "promotion_benefit")
public class PromotionBenefit implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    @Id
    private String pk;
	
	    //benefitId
    @Column(name = "benefit_id")
    private String benefitId;
	
	    //是否与其他benefit冲突
    @Column(name = "conflict_other")
    private Integer conflictOther;
	
	    //
    @Column(name = "conflict_hash")
    private String conflictHash;
	
	    //冲突促销列表，多个逗号分割
    @Column(name = "conflict_promotion_list")
    private String conflictPromotionList;
	
	    //命中促销信息前缀
    @Column(name = "applied_message_prefix")
    private String appliedMessagePrefix;
	
	    //提示信息前缀
    @Column(name = "prompt_message_prefix")
    private String promptMessagePrefix;
	
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
	 * 设置：benefitId
	 */
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	/**
	 * 获取：benefitId
	 */
	public String getBenefitId() {
		return benefitId;
	}
	/**
	 * 设置：是否与其他benefit冲突
	 */
	public void setConflictOther(Integer conflictOther) {
		this.conflictOther = conflictOther;
	}
	/**
	 * 获取：是否与其他benefit冲突
	 */
	public Integer getConflictOther() {
		return conflictOther;
	}
	/**
	 * 设置：
	 */
	public void setConflictHash(String conflictHash) {
		this.conflictHash = conflictHash;
	}
	/**
	 * 获取：
	 */
	public String getConflictHash() {
		return conflictHash;
	}
	/**
	 * 设置：冲突促销列表，多个逗号分割
	 */
	public void setConflictPromotionList(String conflictPromotionList) {
		this.conflictPromotionList = conflictPromotionList;
	}
	/**
	 * 获取：冲突促销列表，多个逗号分割
	 */
	public String getConflictPromotionList() {
		return conflictPromotionList;
	}
	/**
	 * 设置：命中促销信息前缀
	 */
	public void setAppliedMessagePrefix(String appliedMessagePrefix) {
		this.appliedMessagePrefix = appliedMessagePrefix;
	}
	/**
	 * 获取：命中促销信息前缀
	 */
	public String getAppliedMessagePrefix() {
		return appliedMessagePrefix;
	}
	/**
	 * 设置：提示信息前缀
	 */
	public void setPromptMessagePrefix(String promptMessagePrefix) {
		this.promptMessagePrefix = promptMessagePrefix;
	}
	/**
	 * 获取：提示信息前缀
	 */
	public String getPromptMessagePrefix() {
		return promptMessagePrefix;
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
