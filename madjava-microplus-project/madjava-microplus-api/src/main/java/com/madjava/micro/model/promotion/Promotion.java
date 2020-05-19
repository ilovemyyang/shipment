package com.madjava.micro.model.promotion;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2019-12-24 16:20:37
 */
@Table(name = "promotion")
public class Promotion implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    @Id
    private String pk;
	
	    //促销id
    @Column(name = "promotion_id")
    private String promotionId;
	
	    //促销类型
    @Column(name = "promotion_type")
    private String promotionType;
	
	    //促销名称
    @Column(name = "name")
    private String name;
	
	    //促销组
    @Column(name = "promotion_group")
    private String promotionGroup;
	
	    //促销二级组
    @Column(name = "sub_group")
    private String subGroup;
	
	    //触发点，cart，order等
    @Column(name = "trigger_point")
    private String triggerPoint;
	
	    //优先级
    @Column(name = "priority")
    private Integer priority;
	
	    //促销规则id
    @Column(name = "condition_id")
    private String conditionId;
	
	    //促销benefitid
    @Column(name = "benefit_id")
    private String benefitId;
	
	    //促销开始时间
    @Column(name = "start_date")
    private Date startDate;
	
	    //促销结束时间
    @Column(name = "end_date")
    private Date endDate;
	
	    //促销状态0 失效，1 生效
    @Column(name = "status")
    private Integer status;
	
	    //促销信息
    @Column(name = "message")
    private String message;
	
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
	 * 设置：促销id
	 */
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}
	/**
	 * 获取：促销id
	 */
	public String getPromotionId() {
		return promotionId;
	}
	/**
	 * 设置：促销类型
	 */
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}
	/**
	 * 获取：促销类型
	 */
	public String getPromotionType() {
		return promotionType;
	}
	/**
	 * 设置：促销名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：促销名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：促销组
	 */
	public void setPromotionGroup(String promotionGroup) {
		this.promotionGroup = promotionGroup;
	}
	/**
	 * 获取：促销组
	 */
	public String getPromotionGroup() {
		return promotionGroup;
	}
	/**
	 * 设置：促销二级组
	 */
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}
	/**
	 * 获取：促销二级组
	 */
	public String getSubGroup() {
		return subGroup;
	}
	/**
	 * 设置：触发点，cart，order等
	 */
	public void setTriggerPoint(String triggerPoint) {
		this.triggerPoint = triggerPoint;
	}
	/**
	 * 获取：触发点，cart，order等
	 */
	public String getTriggerPoint() {
		return triggerPoint;
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
	 * 设置：促销规则id
	 */
	public void setConditionId(String conditionId) {
		this.conditionId = conditionId;
	}
	/**
	 * 获取：促销规则id
	 */
	public String getConditionId() {
		return conditionId;
	}
	/**
	 * 设置：促销benefitid
	 */
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	/**
	 * 获取：促销benefitid
	 */
	public String getBenefitId() {
		return benefitId;
	}
	/**
	 * 设置：促销开始时间
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取：促销开始时间
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 设置：促销结束时间
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * 获取：促销结束时间
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * 设置：促销状态0 失效，1 生效
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：促销状态0 失效，1 生效
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：促销信息
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * 获取：促销信息
	 */
	public String getMessage() {
		return message;
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
