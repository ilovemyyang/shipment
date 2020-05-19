package com.madjava.micro.model.product;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2019-12-31 11:44:25
 */
@Table(name = "product_image")
public class ProductImage implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//物理主键
    public static final String _PK = "pk";
	
	    //商品编码
    public static final String _PRODUCTCODE = "productCode";
	
	    //图片id
    public static final String _IMAGEID = "imageId";
	
	    //排序
    public static final String _RANKNO = "rankNo";
	
	    //创建时间
    public static final String _CREATETIME = "createTime";
	
	    //创建人
    public static final String _CREATEBY = "createBy";
	
	    //修改时间
    public static final String _UPDATETIME = "updateTime";
	
	    //更新人
    public static final String _UPDATEBY = "updateBy";
	
	    //图片url
    public static final String _URL = "url";
	
	    //物理主键
    @Id
    private String pk;
	
	    //商品编码
    @Column(name = "product_code")
    private String productCode;
	
	    //图片id
    @Column(name = "image_id")
    private String imageId;
	
	    //排序
    @Column(name = "rank_no")
    private Integer rankNo;
	
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
	
	    //图片url
    @Column(name = "url")
    private String url;
	

	/**
	 * 设置：物理主键
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}
	/**
	 * 获取：物理主键
	 */
	public String getPk() {
		return pk;
	}
	/**
	 * 设置：商品编码
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * 获取：商品编码
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * 设置：图片id
	 */
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	/**
	 * 获取：图片id
	 */
	public String getImageId() {
		return imageId;
	}
	/**
	 * 设置：排序
	 */
	public void setRankNo(Integer rankNo) {
		this.rankNo = rankNo;
	}
	/**
	 * 获取：排序
	 */
	public Integer getRankNo() {
		return rankNo;
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
	/**
	 * 设置：图片url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：图片url
	 */
	public String getUrl() {
		return url;
	}
}
