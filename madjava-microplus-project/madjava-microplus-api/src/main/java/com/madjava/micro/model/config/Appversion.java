package com.madjava.micro.model.config;


import java.io.Serializable;
import java.util.Date;


/**
 * <pre>
 * =============================================================================
 * 内容:
 * =============================================================================
 * </pre>
 *
 * @author 埃森哲-
 */
public class Appversion implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = -6427808528001626443L;

	/**
	 */
	private Long pk;

	/**
	 * 最新版本号
	 */
	private Integer versioncode;

	/**
	 * 更新url
	 */
	private String url;

	/**
	 * 是否强更
	 */
	private Byte flag;

	/**
	 * 类型
	 */
	private String type;

	/**
	 * 应用
	 */
	private String appname;

	/**
	 * 更新版本
	 */
	private String updateversion;

	/**
	 * 版本名称
	 */
	private String versionname;

	/**
	 * APP类型
	 */
	private String apptype;

	/**
	 * 手机类型
	 */
	private String phonetype;

	/**
	 * 描述
	 */
	private String des;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 修改时间
	 */
	private Date modifyTime;

	/**
	 * <pre>
	 * </pre>
	 *
	 * @return the pk
	 */
	public Long getPk()
	{

		return pk;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @param pk the pk to set
	 */
	public void setPk(final Long pk)
	{

		this.pk = pk;
	}

	/**
	 * <pre>
	 * 最新版本号
	 * </pre>
	 *
	 * @return the versioncode
	 */
	public Integer getVersioncode()
	{

		return versioncode;
	}

	/**
	 * <pre>
	 * 最新版本号
	 * </pre>
	 *
	 * @param versioncode the versioncode to set
	 */
	public void setVersioncode(final Integer versioncode)
	{

		this.versioncode = versioncode;
	}

	/**
	 * <pre>
	 * 更新url
	 * </pre>
	 *
	 * @return the url
	 */
	public String getUrl()
	{

		return url;
	}

	/**
	 * <pre>
	 * 更新url
	 * </pre>
	 *
	 * @param url the url to set
	 */
	public void setUrl(final String url)
	{

		this.url = url;
	}

	/**
	 * <pre>
	 * 是否强更
	 * </pre>
	 *
	 * @return the flag
	 */
	public Byte getFlag()
	{

		return flag;
	}

	/**
	 * <pre>
	 * 是否强更
	 * </pre>
	 *
	 * @param flag the flag to set
	 */
	public void setFlag(final Byte flag)
	{

		this.flag = flag;
	}

	/**
	 * <pre>
	 * 类型
	 * </pre>
	 *
	 * @return the type
	 */
	public String getType()
	{

		return type;
	}

	/**
	 * <pre>
	 * 类型
	 * </pre>
	 *
	 * @param type the type to set
	 */
	public void setType(final String type)
	{

		this.type = type;
	}

	/**
	 * <pre>
	 * 应用
	 * </pre>
	 *
	 * @return the appname
	 */
	public String getAppname()
	{

		return appname;
	}

	/**
	 * <pre>
	 * 应用
	 * </pre>
	 *
	 * @param appname the appname to set
	 */
	public void setAppname(final String appname)
	{

		this.appname = appname;
	}

	/**
	 * <pre>
	 * 更新版本
	 * </pre>
	 *
	 * @return the updateversion
	 */
	public String getUpdateversion()
	{

		return updateversion;
	}

	/**
	 * <pre>
	 * 更新版本
	 * </pre>
	 *
	 * @param updateversion the updateversion to set
	 */
	public void setUpdateversion(final String updateversion)
	{

		this.updateversion = updateversion;
	}

	/**
	 * <pre>
	 * 版本名称
	 * </pre>
	 *
	 * @return the versionname
	 */
	public String getVersionname()
	{

		return versionname;
	}

	/**
	 * <pre>
	 * 版本名称
	 * </pre>
	 *
	 * @param versionname the versionname to set
	 */
	public void setVersionname(final String versionname)
	{

		this.versionname = versionname;
	}

	/**
	 * <pre>
	 * APP类型
	 * </pre>
	 *
	 * @return the apptype
	 */
	public String getApptype()
	{

		return apptype;
	}

	/**
	 * <pre>
	 * APP类型
	 * </pre>
	 *
	 * @param apptype the apptype to set
	 */
	public void setApptype(final String apptype)
	{

		this.apptype = apptype;
	}

	/**
	 * <pre>
	 * 手机类型
	 * </pre>
	 *
	 * @return the phonetype
	 */
	public String getPhonetype()
	{

		return phonetype;
	}

	/**
	 * <pre>
	 * 手机类型
	 * </pre>
	 *
	 * @param phonetype the phonetype to set
	 */
	public void setPhonetype(final String phonetype)
	{

		this.phonetype = phonetype;
	}

	/**
	 * <pre>
	 * 描述
	 * </pre>
	 *
	 * @return the des
	 */
	public String getDes()
	{

		return des;
	}

	/**
	 * <pre>
	 * 描述
	 * </pre>
	 *
	 * @param des the des to set
	 */
	public void setDes(final String des)
	{

		this.des = des;
	}

	/**
	 * <pre>
	 * 创建时间
	 * </pre>
	 *
	 * @return the createTime
	 */
	public Date getCreateTime()
	{

		return createTime;
	}

	/**
	 * <pre>
	 * 创建时间
	 * </pre>
	 *
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(final Date createTime)
	{

		this.createTime = createTime;
	}

	/**
	 * <pre>
	 * 修改时间
	 * </pre>
	 *
	 * @return the modifyTime
	 */
	public Date getModifyTime()
	{

		return modifyTime;
	}

	/**
	 * <pre>
	 * 修改时间
	 * </pre>
	 *
	 * @param modifyTime the modifyTime to set
	 */
	public void setModifyTime(final Date modifyTime)
	{

		this.modifyTime = modifyTime;
	}
}
