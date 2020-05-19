package com.madjava.micro.model.admin;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author l.jin
 * @email l.jin@accenture.com
 * @date 2020-03-28 23:07:31
 */
@Table(name = "madjava_citys")
public class MadjavaCitys implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    public static final String _CITYPK = "cityPk";
	
	    //编码
    public static final String _ISOCODE = "isocode";
	
	    //名称
    public static final String _CITYNAME = "cityName";
	
	    //省份
    public static final String _REGIONPK = "regionPk";
	
	    //启用状态
    public static final String _ACTIVEFLAG = "activeFlag";
	
	    //
    public static final String _FIRSTSPELL = "firstSpell";
	
	
	    //主键
    @Id
    private String cityPk;
	
	    //编码
    @Column(name = "isocode")
    private String isocode;
	
	    //名称
    @Column(name = "city_name")
    private String cityName;
	
	    //省份
    @Column(name = "region_pk")
    private Long regionPk;
	
	    //启用状态
    @Column(name = "active_flag")
    private Integer activeFlag;
	
	    //
    @Column(name = "first_spell")
    private String firstSpell;
	

	/**
	 * 设置：主键
	 */
	public void setCityPk(String cityPk) {
		this.cityPk = cityPk;
	}
	/**
	 * 获取：主键
	 */
	public String getCityPk() {
		return cityPk;
	}
	/**
	 * 设置：编码
	 */
	public void setIsocode(String isocode) {
		this.isocode = isocode;
	}
	/**
	 * 获取：编码
	 */
	public String getIsocode() {
		return isocode;
	}
	/**
	 * 设置：名称
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * 获取：名称
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * 设置：省份
	 */
	public void setRegionPk(Long regionPk) {
		this.regionPk = regionPk;
	}
	/**
	 * 获取：省份
	 */
	public Long getRegionPk() {
		return regionPk;
	}
	/**
	 * 设置：启用状态
	 */
	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}
	/**
	 * 获取：启用状态
	 */
	public Integer getActiveFlag() {
		return activeFlag;
	}
	/**
	 * 设置：
	 */
	public void setFirstSpell(String firstSpell) {
		this.firstSpell = firstSpell;
	}
	/**
	 * 获取：
	 */
	public String getFirstSpell() {
		return firstSpell;
	}
}
