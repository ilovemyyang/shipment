package com.madjava.micro.dto;

import java.io.Serializable;

public class MmsChannelMonitorData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2556180528289354062L;

	/**
	 * 渠道
	 */
	private String channel;
	
	/**
	 * 销量
	 */
	private Long num;
	
	/**
	 * 百分比
	 */
	private String percentage;

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
}

