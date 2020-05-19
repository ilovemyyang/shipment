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
@Table(name = "promotion_benefit_item")
public class PromotionBenefitItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    @Id
    private String pk;
	
	    //benefitItemId
    @Column(name = "benefit_item_id")
    private String benefitItemId;
	
	    //命中促销提示信息
    @Column(name = "applied_message")
    private String appliedMessage;
	
	    //潜在提示信息
    @Column(name = "prompt_message")
    private String promptMessage;
	
	    //allowable_source
    @Column(name = "allowable_source")
    private String allowableSource;
	
	    //benefit类型
    @Column(name = "type")
    private String type;
	
	    //对应benefit类型，特定信息
    @Column(name = "type_info")
    private String typeInfo;
	
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
	 * 设置：benefitItemId
	 */
	public void setBenefitItemId(String benefitItemId) {
		this.benefitItemId = benefitItemId;
	}
	/**
	 * 获取：benefitItemId
	 */
	public String getBenefitItemId() {
		return benefitItemId;
	}
	/**
	 * 设置：命中促销提示信息
	 */
	public void setAppliedMessage(String appliedMessage) {
		this.appliedMessage = appliedMessage;
	}
	/**
	 * 获取：命中促销提示信息
	 */
	public String getAppliedMessage() {
		return appliedMessage;
	}
	/**
	 * 设置：潜在提示信息
	 */
	public void setPromptMessage(String promptMessage) {
		this.promptMessage = promptMessage;
	}
	/**
	 * 获取：潜在提示信息
	 */
	public String getPromptMessage() {
		return promptMessage;
	}
	/**
	 * 设置：allowable_source
	 */
	public void setAllowableSource(String allowableSource) {
		this.allowableSource = allowableSource;
	}
	/**
	 * 获取：allowable_source
	 */
	public String getAllowableSource() {
		return allowableSource;
	}
	/**
	 * 设置：benefit类型
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：benefit类型
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：对应benefit类型，特定信息
	 */
	public void setTypeInfo(String typeInfo) {
		this.typeInfo = typeInfo;
	}
	/**
	 * 获取：对应benefit类型，特定信息
	 */
	public String getTypeInfo() {
		return typeInfo;
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
