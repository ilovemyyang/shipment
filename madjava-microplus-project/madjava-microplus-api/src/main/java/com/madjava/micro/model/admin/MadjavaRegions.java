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
@Table(name = "madjava_regions")
public class MadjavaRegions implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    public static final String _REGIONPK = "regionPk";
	
	    //����
    public static final String _ISOCODE = "isocode";
	
	    //����
    public static final String _REGIONNAME = "regionName";
	
	    //����״̬
    public static final String _ACTIVEFLAG = "activeFlag";
	
	
	    //
    @Id
    private String regionPk;
	
	    //����
    @Column(name = "isocode")
    private String isocode;
	
	    //����
    @Column(name = "region_name")
    private String regionName;
	
	    //����״̬
    @Column(name = "active_flag")
    private Integer activeFlag;
	

	/**
	 * 设置：
	 */
	public void setRegionPk(String regionPk) {
		this.regionPk = regionPk;
	}
	/**
	 * 获取：
	 */
	public String getRegionPk() {
		return regionPk;
	}
	/**
	 * 设置：����
	 */
	public void setIsocode(String isocode) {
		this.isocode = isocode;
	}
	/**
	 * 获取：����
	 */
	public String getIsocode() {
		return isocode;
	}
	/**
	 * 设置：����
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	/**
	 * 获取：����
	 */
	public String getRegionName() {
		return regionName;
	}
	/**
	 * 设置：����״̬
	 */
	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}
	/**
	 * 获取：����״̬
	 */
	public Integer getActiveFlag() {
		return activeFlag;
	}
}
