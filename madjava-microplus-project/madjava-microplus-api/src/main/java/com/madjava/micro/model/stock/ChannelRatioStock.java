package com.madjava.micro.model.stock;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * 
 * @author zhuoxing.yan
 * @email zhuoxing.yan@accenture.com
 * @date 2020-03-21 18:09:22
 */
@Table(name = "channel_ratio_stock")
public class ChannelRatioStock implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //渠道编码
    public static final String _CHANNELCODE = "channelCode";
	
	    //库存比例
    public static final String _RATIO = "ratio";
	
	
	    //渠道编码
    @Id
    private String channelCode;
	
	    //库存比例
    @Column(name = "ratio")
    private Integer ratio;
	

	/**
	 * 设置：渠道编码
	 */
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	/**
	 * 获取：渠道编码
	 */
	public String getChannelCode() {
		return channelCode;
	}
	/**
	 * 设置：库存比例
	 */
	public void setRatio(Integer ratio) {
		this.ratio = ratio;
	}
	/**
	 * 获取：库存比例
	 */
	public Integer getRatio() {
		return ratio;
	}
}
