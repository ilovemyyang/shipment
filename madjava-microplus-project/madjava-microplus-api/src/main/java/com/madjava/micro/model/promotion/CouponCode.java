package com.madjava.micro.model.promotion;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 优惠券Code表
 * 
 * @author xiaowu.a.zhang
 * @email xiaowu.a.zhang@accenture.com
 * @date 2020-01-08 17:44:56
 */
@Table(name = "coupon_code")
public class CouponCode implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private String pk;
	
	    //优惠券code
    @Column(name = "code")
    private String code;
	
	    //优惠券pk
    @Column(name = "coupon_pk")
    private String couponPk;
	
	    //使用次数
    @Column(name = "used_count")
    private Integer usedCount;
	
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
	 * 设置：优惠券code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：优惠券code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：优惠券pk
	 */
	public void setCouponPk(String couponPk) {
		this.couponPk = couponPk;
	}
	/**
	 * 获取：优惠券pk
	 */
	public String getCouponPk() {
		return couponPk;
	}
	/**
	 * 设置：使用次数
	 */
	public void setUsedCount(Integer usedCount) {
		this.usedCount = usedCount;
	}
	/**
	 * 获取：使用次数
	 */
	public Integer getUsedCount() {
		return usedCount;
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
