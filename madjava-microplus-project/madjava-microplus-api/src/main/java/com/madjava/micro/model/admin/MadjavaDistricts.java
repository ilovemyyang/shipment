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
@Table(name = "madjava_districts")
public class MadjavaDistricts implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    public static final String _DISTRICTPK = "districtPk";
	
	    //编码
    public static final String _IOSCODE = "ioscode";
	
	    //区名称
    public static final String _DISTRICTNAME = "districtName";
	
	    //城市主键
    public static final String _CITYPK = "cityPk";
	
	    //启用状态
    public static final String _ACTIVEFLAG = "activeFlag";
	
	
	    //主键
    @Id
    private String districtPk;
	
	    //编码
    @Column(name = "ioscode")
    private String ioscode;
	
	    //区名称
    @Column(name = "district_name")
    private String districtName;
	
	    //城市主键
    @Column(name = "city_pk")
    private Long cityPk;
	
	    //启用状态
    @Column(name = "active_flag")
    private Integer activeFlag;
	

	/**
	 * 设置：主键
	 */
	public void setDistrictPk(String districtPk) {
		this.districtPk = districtPk;
	}
	/**
	 * 获取：主键
	 */
	public String getDistrictPk() {
		return districtPk;
	}
	/**
	 * 设置：编码
	 */
	public void setIoscode(String ioscode) {
		this.ioscode = ioscode;
	}
	/**
	 * 获取：编码
	 */
	public String getIoscode() {
		return ioscode;
	}
	/**
	 * 设置：区名称
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	/**
	 * 获取：区名称
	 */
	public String getDistrictName() {
		return districtName;
	}
	/**
	 * 设置：城市主键
	 */
	public void setCityPk(Long cityPk) {
		this.cityPk = cityPk;
	}
	/**
	 * 获取：城市主键
	 */
	public Long getCityPk() {
		return cityPk;
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
}
