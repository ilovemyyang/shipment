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
@Table(name = "promotion_condition_item")
public class PromotionConditionItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    @Id
    private String pk;
	
	    //规则条目id
    @Column(name = "condition_item_id")
    private String conditionItemId;
	
	    //命中促销提示消息
    @Column(name = "fired_message")
    private String firedMessage;
	
	    //部分命中促销提示消息
    @Column(name = "partially_fired_message")
    private String partiallyFiredMessage;
	
	    //命中次数
    @Column(name = "applied_times")
    private Integer appliedTimes;
	
	    //规则类型
    @Column(name = "type")
    private String type;
	
	    //对应规则类型，特定信息
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
	 * 设置：规则条目id
	 */
	public void setConditionItemId(String conditionItemId) {
		this.conditionItemId = conditionItemId;
	}
	/**
	 * 获取：规则条目id
	 */
	public String getConditionItemId() {
		return conditionItemId;
	}
	
	/**
	 * 设置：命中促销提示消息
	 */
	public void setFiredMessage(String firedMessage) {
		this.firedMessage = firedMessage;
	}
	/**
	 * 获取：命中促销提示消息
	 */
	public String getFiredMessage() {
		return firedMessage;
	}
	/**
	 * 设置：部分命中促销提示消息
	 */
	public void setPartiallyFiredMessage(String partiallyFiredMessage) {
		this.partiallyFiredMessage = partiallyFiredMessage;
	}
	/**
	 * 获取：部分命中促销提示消息
	 */
	public String getPartiallyFiredMessage() {
		return partiallyFiredMessage;
	}
	/**
	 * 设置：命中次数
	 */
	public void setAppliedTimes(Integer appliedTimes) {
		this.appliedTimes = appliedTimes;
	}
	/**
	 * 获取：命中次数
	 */
	public Integer getAppliedTimes() {
		return appliedTimes;
	}
	/**
	 * 设置：规则类型
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：规则类型
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：对应规则类型，特定信息
	 */
	public void setTypeInfo(String typeInfo) {
		this.typeInfo = typeInfo;
	}
	/**
	 * 获取：对应规则类型，特定信息
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
