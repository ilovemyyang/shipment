package com.madjava.micro.dto;

import java.io.Serializable;
import java.util.List;

public class MmsMonitorData implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1628632567303734548L;

	/**
	 * 待MMS处理订单
	 */
	private Long mmsToDeal;
	
	/**
	 * MMS处理中订单
	 */
	private Long mmsDealing;
	
	/**
	 * MMS处理成功订单
	 */
	private Long mmsDealSuccess;
	
	/**
	 * MMS处理失败订单
	 */
	private Long mmsDealFail;
	
	/**
	 * MMS下发成功订单
	 */
	private Long mmsSendSuccess;
	
	/**
	 * MMS下发失败订单
	 */
	private Long mmsSendFail;
	
	/**
	 * 渠道订单销量	
	 */
	private List<MmsChannelMonitorData> channelOrder;
	
	/**
	 * 各个渠道当天累计订单数量总和
	 */
	private Long allChannelOrder;
	
	/**
	 * MMS处理订单总数量
	 */
	private Long mmsDealOrder;
	
	/**
	 * OMS待处理订单
	 */
	private Long omsToDeal;
	
	/**
	 * OMS下发成功订单
	 */
	private Long omsSendSuccess;
	
	/**
	 * OMS下发失败订单
	 */
	private Long omsSendFail;
	
	/**
	 * OMS已处理订单总计
	 */
	private Long omsDealOrder;
	
	

	public Long getMmsToDeal() {
		return mmsToDeal;
	}

	public void setMmsToDeal(Long mmsToDeal) {
		this.mmsToDeal = mmsToDeal;
	}

	public Long getMmsDealing() {
		return mmsDealing;
	}

	public void setMmsDealing(Long mmsDealing) {
		this.mmsDealing = mmsDealing;
	}

	public Long getMmsDealSuccess() {
		return mmsDealSuccess;
	}

	public void setMmsDealSuccess(Long mmsDealSuccess) {
		this.mmsDealSuccess = mmsDealSuccess;
	}

	public Long getMmsDealFail() {
		return mmsDealFail;
	}

	public void setMmsDealFail(Long mmsDealFail) {
		this.mmsDealFail = mmsDealFail;
	}

	public Long getMmsSendSuccess() {
		return mmsSendSuccess;
	}

	public void setMmsSendSuccess(Long mmsSendSuccess) {
		this.mmsSendSuccess = mmsSendSuccess;
	}

	public Long getMmsSendFail() {
		return mmsSendFail;
	}

	public void setMmsSendFail(Long mmsSendFail) {
		this.mmsSendFail = mmsSendFail;
	}

	public List<MmsChannelMonitorData> getChannelOrder() {
		return channelOrder;
	}

	public void setChannelOrder(List<MmsChannelMonitorData> channelOrder) {
		this.channelOrder = channelOrder;
	}

	public Long getAllChannelOrder() {
		return allChannelOrder;
	}

	public void setAllChannelOrder(Long allChannelOrder) {
		this.allChannelOrder = allChannelOrder;
	}

	public Long getMmsDealOrder() {
		return mmsDealOrder;
	}

	public void setMmsDealOrder(Long mmsDealOrder) {
		this.mmsDealOrder = mmsDealOrder;
	}

	public Long getOmsToDeal() {
		return omsToDeal;
	}

	public void setOmsToDeal(Long omsToDeal) {
		this.omsToDeal = omsToDeal;
	}

	public Long getOmsSendSuccess() {
		return omsSendSuccess;
	}

	public void setOmsSendSuccess(Long omsSendSuccess) {
		this.omsSendSuccess = omsSendSuccess;
	}

	public Long getOmsSendFail() {
		return omsSendFail;
	}

	public void setOmsSendFail(Long omsSendFail) {
		this.omsSendFail = omsSendFail;
	}

	public Long getOmsDealOrder() {
		return omsDealOrder;
	}

	public void setOmsDealOrder(Long omsDealOrder) {
		this.omsDealOrder = omsDealOrder;
	}

	
}
