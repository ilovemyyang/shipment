package com.madjava.micro.model.stock;

import com.madjava.micro.model.baseservice.ItemModel;

import java.util.Date;

public class OrderSourcing extends ItemModel {
    private Long id;

    private String orderCode;

    private String channel;

    private String storeId;

    private Integer province;

    private String entrys;

    private String sourcingResult;

    private Integer status;

    private Boolean isComplate;

    private Integer exeNum;

    private Date nextExecuteTime;

    private Date createTime;

    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public String getEntrys() {
        return entrys;
    }

    public void setEntrys(String entrys) {
        this.entrys = entrys == null ? null : entrys.trim();
    }

    public String getSourcingResult() {
        return sourcingResult;
    }

    public void setSourcingResult(String sourcingResult) {
        this.sourcingResult = sourcingResult == null ? null : sourcingResult.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsComplate() {
        return isComplate;
    }

    public void setIsComplate(Boolean isComplate) {
        this.isComplate = isComplate;
    }

    public Integer getExeNum() {
        return exeNum;
    }

    public void setExeNum(Integer exeNum) {
        this.exeNum = exeNum;
    }

    public Date getNextExecuteTime() {
        return nextExecuteTime;
    }

    public void setNextExecuteTime(Date nextExecuteTime) {
        this.nextExecuteTime = nextExecuteTime;
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
