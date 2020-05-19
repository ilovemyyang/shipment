package com.madjava.micro.model.promotion;

import java.util.Date;

import java.io.Serializable;
import java.math.BigDecimal; 
/**
 * <pre>
 * 活动和用户组关系
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author accenture-
 */
public class Campaign implements Serializable {

    private static final long serialVersionUID = -5391878824200475811L;

    /**
     */
    private String pk;

    /**
     * 活动名称
     */
    private String title;

    /**
     * 活动简介
     */
    private String description;

    /**
     * 活动类型(用来区分是否是领券)
     */
    private String type;

    /**
     * 是否启用
     */
    private Byte enabled;
    
    /**
     */
    private String image;
    
    /**
     */
    private BigDecimal amount;

    /**
     */
    private Date startDate;

    /**
     */
    private Date endDate;

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
     * @return the pk
     */
    public String getPk() {

        return pk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param pk the pk to set
     */
    public void setPk(String pk) {

        this.pk = pk;
    }

    /**
     * <pre>
     * 活动名称
     * </pre>
     * 
     * @return the title
     */
    public String getTitle() {

        return title;
    }

    /**
     * <pre>
     * 活动名称
     * </pre>
     * 
     * @param title the title to set
     */
    public void setTitle(String title) {

        this.title = title;
    }

    /**
     * <pre>
     * 活动简介
     * </pre>
     * 
     * @return the description
     */
    public String getDescription() {

        return description;
    }

    /**
     * <pre>
     * 活动简介
     * </pre>
     * 
     * @param description the description to set
     */
    public void setDescription(String description) {

        this.description = description;
    }

    /**
     * <pre>
     * 活动类型(用来区分是否是领券)
     * </pre>
     * 
     * @return the type
     */
    public String getType() {

        return type;
    }

    /**
     * <pre>
     * 活动类型(用来区分是否是领券)
     * </pre>
     * 
     * @param type the type to set
     */
    public void setType(String type) {

        this.type = type;
    }

    /**
     * <pre>
     * 是否启用
     * </pre>
     * 
     * @return the enabled
     */
    public Byte getEnabled() {

        return enabled;
    }

    /**
     * <pre>
     * 是否启用
     * </pre>
     * 
     * @param enabled the enabled to set
     */
    public void setEnabled(Byte enabled) {

        this.enabled = enabled;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the startDate
     */
    public Date getStartDate() {

        return startDate;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {

        this.startDate = startDate;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the endDate
     */
    public Date getEndDate() {

        return endDate;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {

        this.endDate = endDate;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
