package com.madjava.micro.model.order;

import java.util.Date;

import java.io.Serializable;
import java.math.BigDecimal; 
/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author 埃森哲-
 */
public class CancelOrder implements Serializable {

    private static final long serialVersionUID = -2958636680569713911L;

    /**
     */
    private String orderCode;

    /**
     */
    private String parentOrder;

    /**
     */
    private String returnId;

    /**
     */
    private String channel;

    /**
     * 1:待取消；2:同意取消；3:不同意取消；4:同步跨境通；5:同步oms；6同步京东；7:订单取消完成
     */
    private Integer orderState;

    /**
     */
    private String remark;

    /**
     */
    private String rejectType;

    /**
     */
    private String buyerId;

    /**
     */
    private String buyerName;

    /**
     */
    private Date checkTime;

    /**
     */
    private Date applyTime;

    /**
     */
    private BigDecimal returnAmount;

    /**
     */
    private Date createTime;

    /**
     */
    private Date updateTime;

    /**
     * <pre>
     * </pre>
     * 
     * @return the orderCode
     */
    public String getOrderCode() {

        return orderCode;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param orderCode the orderCode to set
     */
    public void setOrderCode(String orderCode) {

        this.orderCode = orderCode;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the parentOrder
     */
    public String getParentOrder() {

        return parentOrder;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param parentOrder the parentOrder to set
     */
    public void setParentOrder(String parentOrder) {

        this.parentOrder = parentOrder;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the returnId
     */
    public String getReturnId() {

        return returnId;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param returnId the returnId to set
     */
    public void setReturnId(String returnId) {

        this.returnId = returnId;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the channel
     */
    public String getChannel() {

        return channel;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param channel the channel to set
     */
    public void setChannel(String channel) {

        this.channel = channel;
    }

    /**
     * <pre>
     * 1:待取消；2:同意取消；3:不同意取消；4:同步跨境通；5:同步oms；6同步京东；7:订单取消完成
     * </pre>
     * 
     * @return the orderState
     */
    public Integer getOrderState() {

        return orderState;
    }

    /**
     * <pre>
     * 1:待取消；2:同意取消；3:不同意取消；4:同步跨境通；5:同步oms；6同步京东；7:订单取消完成
     * </pre>
     * 
     * @param orderState the orderState to set
     */
    public void setOrderState(Integer orderState) {

        this.orderState = orderState;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the remark
     */
    public String getRemark() {

        return remark;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param remark the remark to set
     */
    public void setRemark(String remark) {

        this.remark = remark;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the rejectType
     */
    public String getRejectType() {

        return rejectType;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param rejectType the rejectType to set
     */
    public void setRejectType(String rejectType) {

        this.rejectType = rejectType;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the buyerId
     */
    public String getBuyerId() {

        return buyerId;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param buyerId the buyerId to set
     */
    public void setBuyerId(String buyerId) {

        this.buyerId = buyerId;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the buyerName
     */
    public String getBuyerName() {

        return buyerName;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param buyerName the buyerName to set
     */
    public void setBuyerName(String buyerName) {

        this.buyerName = buyerName;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the checkTime
     */
    public Date getCheckTime() {

        return checkTime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param checkTime the checkTime to set
     */
    public void setCheckTime(Date checkTime) {

        this.checkTime = checkTime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the applyTime
     */
    public Date getApplyTime() {

        return applyTime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param applyTime the applyTime to set
     */
    public void setApplyTime(Date applyTime) {

        this.applyTime = applyTime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the createTime
     */
    public Date getCreateTime() {

        return createTime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {

        this.createTime = createTime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the updateTime
     */
    public Date getUpdateTime() {

        return updateTime;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Date updateTime) {

        this.updateTime = updateTime;
    }

	public BigDecimal getReturnAmount() {
		return returnAmount;
	}

	public void setReturnAmount(BigDecimal returnAmount) {
		this.returnAmount = returnAmount;
	}
}
