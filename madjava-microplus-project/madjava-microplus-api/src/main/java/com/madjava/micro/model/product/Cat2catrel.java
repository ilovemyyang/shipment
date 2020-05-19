package com.madjava.micro.model.product;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2019-12-30 10:36:04
 */
@Table(name = "cat2catrel")
public class Cat2catrel implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//主键
    public static final String _PK = "pk";
	
	    //源id
    public static final String _SOURCECATEGORYCODE = "sourceCategoryCode";
	
	    //目标id
    public static final String _TARGETCATEGORYCODE = "targetCategoryCode";
	
	    //创建时间
    public static final String _CREATETIME = "createTime";
	
	    //创建人
    public static final String _CREATEBY = "createBy";
	
	    //修改时间
    public static final String _UPDATETIME = "updateTime";
	
	    //更新人
    public static final String _UPDATEBY = "updateBy";
	
	    //主键
    @Id
    private String pk;
	
	    //源id
    @Column(name = "source_category_code")
    private String sourceCategoryCode;
	
	    //目标id
    @Column(name = "target_category_code")
    private String targetCategoryCode;
	
	    //创建时间
    @Column(name = "create_time")
    private Date createTime;
	
	    //创建人
    @Column(name = "create_by")
    private String createBy;
	
	    //修改时间
    @Column(name = "update_time")
    private Date updateTime;
	
	    //更新人
    @Column(name = "update_by")
    private String updateBy;
	

	/**
	 * 设置：主键
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}
	/**
	 * 获取：主键
	 */
	public String getPk() {
		return pk;
	}
	/**
	 * 设置：源id
	 */
	public void setSourceCategoryCode(String sourceCategoryCode) {
		this.sourceCategoryCode = sourceCategoryCode;
	}
	/**
	 * 获取：源id
	 */
	public String getSourceCategoryCode() {
		return sourceCategoryCode;
	}
	/**
	 * 设置：目标id
	 */
	public void setTargetCategoryCode(String targetCategoryCode) {
		this.targetCategoryCode = targetCategoryCode;
	}
	/**
	 * 获取：目标id
	 */
	public String getTargetCategoryCode() {
		return targetCategoryCode;
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
	 * 设置：修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
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
