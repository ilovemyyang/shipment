package com.madjava.micro.model.stock;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2020-01-08 11:15:18
 */
@Table(name = "stock_level")
public class StockLevel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //
    @Column(name = "code")
    private String code;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "channel_product_code")
    private String channelProductCode;
	
	    //
    @Column(name = "total")
    private Integer total;
	
	    //
    @Column(name = "reserve")
    private Integer reserve;
	
	    //
    @Column(name = "status")
    private Integer status;
	
    
    @Column(name = "channel")
    private String channel;
    
    //创建时间
    @Column(name = "create_time")
    private Date createTime;
	
	    //修改时间
    @Column(name = "modify_time")
    private Date modifyTime;
    
	/**
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}
	/**
	 * @param channel the channel to set
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}
	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}
	/**
	 * 获取：
	 */
	public Integer getTotal() {
		return total;
	}
	/**
	 * 设置：
	 */
	public void setReserve(Integer reserve) {
		this.reserve = reserve;
	}
	/**
	 * 获取：
	 */
	public Integer getReserve() {
		return reserve;
	}
	/**
	 * 设置：
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：
	 */
	public Integer getStatus() {
		return status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChannelProductCode() {
		return channelProductCode;
	}
	public void setChannelProductCode(String channelProductCode) {
		this.channelProductCode = channelProductCode;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}
