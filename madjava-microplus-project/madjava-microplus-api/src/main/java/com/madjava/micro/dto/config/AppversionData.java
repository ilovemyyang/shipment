package com.madjava.micro.dto.config;

import java.io.Serializable;


/**
 *
 */
public class AppversionData implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = 4333816436966824270L;

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
	 * @return the versioncode
	 */
	public Integer getVersioncode()
	{
		return versioncode;
	}

	/**
	 * @param versioncode the versioncode to set
	 */
	public void setVersioncode(final Integer versioncode)
	{
		this.versioncode = versioncode;
	}

	/**
	 * @return the url
	 */
	public String getUrl()
	{
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(final String url)
	{
		this.url = url;
	}

	/**
	 * @return the flag
	 */
	public Byte getFlag()
	{
		return flag;
	}

	/**
	 * @param flag the flag to set
	 */
	public void setFlag(final Byte flag)
	{
		this.flag = flag;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(final String type)
	{
		this.type = type;
	}

	/**
	 * @return the appname
	 */
	public String getAppname()
	{
		return appname;
	}

	/**
	 * @param appname the appname to set
	 */
	public void setAppname(final String appname)
	{
		this.appname = appname;
	}

	/**
	 * @return the updateversion
	 */
	public String getUpdateversion()
	{
		return updateversion;
	}

	/**
	 * @param updateversion the updateversion to set
	 */
	public void setUpdateversion(final String updateversion)
	{
		this.updateversion = updateversion;
	}

	/**
	 * @return the versionname
	 */
	public String getVersionname()
	{
		return versionname;
	}

	/**
	 * @param versionname the versionname to set
	 */
	public void setVersionname(final String versionname)
	{
		this.versionname = versionname;
	}

	/**
	 * @return the apptype
	 */
	public String getApptype()
	{
		return apptype;
	}

	/**
	 * @param apptype the apptype to set
	 */
	public void setApptype(final String apptype)
	{
		this.apptype = apptype;
	}

	/**
	 * @return the phonetype
	 */
	public String getPhonetype()
	{
		return phonetype;
	}

	/**
	 * @param phonetype the phonetype to set
	 */
	public void setPhonetype(final String phonetype)
	{
		this.phonetype = phonetype;
	}

	/**
	 * @return the des
	 */
	public String getDes()
	{
		return des;
	}

	/**
	 * @param des the des to set
	 */
	public void setDes(final String des)
	{
		this.des = des;
	}



}
