package com.madjava.micro.model.promotion;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 优惠券码表
 * 
 * @author xiaowu.a.zhang
 * @email xiaowu.a.zhang@accenture.com
 * @date 2020-01-08 17:44:56
 */
@Table(name = "coupon")
public class Coupon implements Serializable {
	private static final long serialVersionUID = 1L;

	//
	@Id
	private String pk;

	//
	@Column(name = "coupon_prefix")
	private String couponPrefix;

	// single,multiple,system
	@Column(name = "coupon_type")
	private String couponType;

	// 使用类型online线上offline线下
	@Column(name = "coupon_group")
	private String couponGroup;

	// 描述
	@Column(name = "description")
	private String description;
	
	// 标题
	@Column(name = "title")
	private String title;
	
	// 图片
	@Column(name = "cover")
	private String cover;

	// 是否启用
	@Column(name = "enabled")
	private Integer enabled;

	// 每个coupons可用次数
	@Column(name = "redemption_per_code")
	private Integer redemptionPerCode;

	// 每人可用次数
	@Column(name = "redemption_per_cust")
	private Integer redemptionPerCust;

	// 最大发行总量
	@Column(name = "num_codes")
	private Long numCodes;

	// 已发行次数
	@Column(name = "delivery_num")
	private Long deliveryNum;

	// 创建时间
	@Column(name = "start_time")
	private Date startTime;

	// 创建时间
	@Column(name = "end_time")
	private Date endTime;

	// 生效开始时间
	@Column(name = "create_time")
	private Date createTime;

	// 生效结束时间
	@Column(name = "update_time")
	private Date updateTime;

	// 创建人
	@Column(name = "create_by")
	private String createBy;

	// 更新人
	@Column(name = "update_by")
	private String updateBy;

	
	private boolean received;

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
	 * 设置：
	 */
	public void setCouponPrefix(String couponPrefix) {
		this.couponPrefix = couponPrefix;
	}

	/**
	 * 获取：
	 */
	public String getCouponPrefix() {
		return couponPrefix;
	}

	/**
	 * 设置：single,multiple,system
	 */
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	/**
	 * 获取：single,multiple,system
	 */
	public String getCouponType() {
		return couponType;
	}

	/**
	 * 设置：使用类型online线上offline线下
	 */
	public void setCouponGroup(String couponGroup) {
		this.couponGroup = couponGroup;
	}

	/**
	 * 获取：使用类型online线上offline线下
	 */
	public String getCouponGroup() {
		return couponGroup;
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
	 * 设置：是否启用
	 */
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	/**
	 * 获取：是否启用
	 */
	public Integer getEnabled() {
		return enabled;
	}

	/**
	 * 设置：每个coupons可用次数
	 */
	public void setRedemptionPerCode(Integer redemptionPerCode) {
		this.redemptionPerCode = redemptionPerCode;
	}

	/**
	 * 获取：每个coupons可用次数
	 */
	public Integer getRedemptionPerCode() {
		return redemptionPerCode;
	}

	/**
	 * 设置：每人可用次数
	 */
	public void setRedemptionPerCust(Integer redemptionPerCust) {
		this.redemptionPerCust = redemptionPerCust;
	}

	/**
	 * 获取：每人可用次数
	 */
	public Integer getRedemptionPerCust() {
		return redemptionPerCust;
	}

	/**
	 * 设置：最大发行总量
	 */
	public void setNumCodes(Long numCodes) {
		this.numCodes = numCodes;
	}

	/**
	 * 获取：最大发行总量
	 */
	public Long getNumCodes() {
		return numCodes;
	}

	/**
	 * 设置：已发行次数
	 */
	public void setDeliveryNum(Long deliveryNum) {
		this.deliveryNum = deliveryNum;
	}

	/**
	 * 获取：已发行次数
	 */
	public Long getDeliveryNum() {
		return deliveryNum;
	}

	/**
	 * 设置：创建时间
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * 获取：创建时间
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * 设置：创建时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * 获取：创建时间
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * 设置：生效开始时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取：生效开始时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置：生效结束时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取：生效结束时间
	 */
	public Date getUpdateTime() {
		return updateTime;
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

	public boolean isReceived() {
		return received;
	}

	public void setReceived(boolean received) {
		this.received = received;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

}
