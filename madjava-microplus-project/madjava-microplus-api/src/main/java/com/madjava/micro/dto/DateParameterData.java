package com.madjava.micro.dto;

import java.io.Serializable;

/**
 * 
 * @author yuxiao.wang
 * 
 * 查询订单搜索条件对象
 *
 */
public class DateParameterData implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1707160992815523411L;

	private String beginTime;
	
	private String orderStatus;

    private String endTime;

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
    
}