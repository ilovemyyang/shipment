package com.madjava.micro.model.product;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2020-04-13 17:22:02
 */
@Table(name = "brand")
public class Brand implements Serializable {
	private static final long serialVersionUID = 1L;

	// 主键
	public static final String _PK = "pk";

	// 品牌编码
	public static final String _CODE = "code";

	// 媒介
	public static final String _MEDIAID = "mediaId";

	// media的url
	public static final String _MEDIAIDUrl = "mediaUrl";

	//
	public static final String _NAME = "name";

	// 创建时间
	public static final String _CREATETIME = "createTime";

	// 创建人
	public static final String _CREATEBY = "createBy";

	// 修改时间
	public static final String _UPDATETIME = "updateTime";

	// 更新人
	public static final String _UPDATEBY = "updateBy";

	// 主键
	@Id
	private String pk;

	// 品牌编码
	@Column(name = "code")
	private String code;

	// 媒介
	@Column(name = "media_id")
	private String mediaId;

	//
	@Column(name = "name")
	private String name;

	@Column(name = "media_url")
	private String mediaUrl;

	public String getMediaUrl() {
		return mediaUrl;
	}

	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

	// 创建时间
	@Column(name = "create_time")
	private Date createTime;

	// 创建人
	@Column(name = "create_by")
	private String createBy;

	// 修改时间
	@Column(name = "update_time")
	private Date updateTime;

	// 更新人
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
	 * 设置：品牌编码
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取：品牌编码
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置：媒介
	 */
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	/**
	 * 获取：媒介
	 */
	public String getMediaId() {
		return mediaId;
	}

	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取：
	 */
	public String getName() {
		return name;
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
