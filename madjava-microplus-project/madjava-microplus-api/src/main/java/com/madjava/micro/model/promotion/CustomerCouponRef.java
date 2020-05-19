package com.madjava.micro.model.promotion;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 用户和券关系表
 * 
 * @author xiaowu.a.zhang
 * @email xiaowu.a.zhang@accenture.com
 * @date 2020-01-08 17:44:56
 */
@Table(name = "customer_coupon_ref")
public class CustomerCouponRef implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private String pk;
	
	    //
    @Column(name = "user_pk")
    private String userPk;
	
	    //使用次数,不能超过coupons表的次数
    @Column(name = "used_num")
    private Integer usedNum;
	
	    //
    @Column(name = "coupons_pk")
    private String couponsPk;
	
	    //
    @Column(name = "coupons_code")
    private String couponsCode;
	
	    //0:未用,1:部分使用,2:已使用
    @Column(name = "status")
    private Integer status;
	
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
	 * 设置：
	 */
	public void setUserPk(String userPk) {
		this.userPk = userPk;
	}
	/**
	 * 获取：
	 */
	public String getUserPk() {
		return userPk;
	}
	/**
	 * 设置：使用次数,不能超过coupons表的次数
	 */
	public void setUsedNum(Integer usedNum) {
		this.usedNum = usedNum;
	}
	/**
	 * 获取：使用次数,不能超过coupons表的次数
	 */
	public Integer getUsedNum() {
		return usedNum;
	}
	/**
	 * 设置：
	 */
	public void setCouponsPk(String couponsPk) {
		this.couponsPk = couponsPk;
	}
	/**
	 * 获取：
	 */
	public String getCouponsPk() {
		return couponsPk;
	}
	/**
	 * 设置：
	 */
	public void setCouponsCode(String couponsCode) {
		this.couponsCode = couponsCode;
	}
	/**
	 * 获取：
	 */
	public String getCouponsCode() {
		return couponsCode;
	}
	/**
	 * 设置：0:未用,1:部分使用,2:已使用
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：0:未用,1:部分使用,2:已使用
	 */
	public Integer getStatus() {
		return status;
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
