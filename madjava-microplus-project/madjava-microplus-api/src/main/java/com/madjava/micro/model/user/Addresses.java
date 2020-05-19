package com.madjava.micro.model.user;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2020-01-09 15:27:54
 */
@Table(name = "addresses")
public class Addresses implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private String addrPk;
	
	    //
    @Column(name = "user_pk")
    private String userPk;
	
	    //
    @Column(name = "full_name")
    private String fullName;
	
	    //
    @Column(name = "cellphone")
    private String cellphone;
	
	    //
    @Column(name = "country_pk")
    private String countryPk;
	
	    //
    @Column(name = "region_pk")
    private String regionPk;
	
	    //
    @Column(name = "city_pk")
    private String cityPk;
	
	    //
    @Column(name = "district_pk")
    private String districtPk;
	
	    //
    @Column(name = "is_default_address")
    private Integer isDefaultAddress;
	
	    //
    @Column(name = "fax")
    private String fax;
	
	    //
    @Column(name = "postcode")
    private String postcode;
	
	    //
    @Column(name = "streetname")
    private String streetname;
	
	    //
    @Column(name = "streetnumber")
    private String streetnumber;
	
	    //
    @Column(name = "lng")
    private String lng;
	
	    //
    @Column(name = "lat")
    private String lat;
	
	    //
    @Column(name = "email")
    private String email;
	
	    //
    @Column(name = "company")
    private String company;
	
	    //
    @Column(name = "department")
    private String department;
	
	    //
    @Column(name = "building")
    private String building;
	
	    //
    @Column(name = "create_date")
    private Date createDate;
	
	    //
    @Column(name = "modify_date")
    private Date modifyDate;
	

	/**
	 * 设置：
	 */
	public void setAddrPk(String addrPk) {
		this.addrPk = addrPk;
	}
	/**
	 * 获取：
	 */
	public String getAddrPk() {
		return addrPk;
	}
	/**
	 * 设置：
	 */
	public void setUserPk(String userPk) {
		this.userPk = userPk;
	}
	/**
	 * 获取：
	 */
	public String getUserPk() {
		return userPk;
	}
	/**
	 * 设置：
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * 获取：
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * 设置：
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	/**
	 * 获取：
	 */
	public String getCellphone() {
		return cellphone;
	}
	/**
	 * 设置：
	 */
	public void setCountryPk(String countryPk) {
		this.countryPk = countryPk;
	}
	/**
	 * 获取：
	 */
	public String getCountryPk() {
		return countryPk;
	}
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
	 * 设置：
	 */
	public void setCityPk(String cityPk) {
		this.cityPk = cityPk;
	}
	/**
	 * 获取：
	 */
	public String getCityPk() {
		return cityPk;
	}
	/**
	 * 设置：
	 */
	public void setDistrictPk(String districtPk) {
		this.districtPk = districtPk;
	}
	/**
	 * 获取：
	 */
	public String getDistrictPk() {
		return districtPk;
	}
	/**
	 * 设置：
	 */
	public void setIsDefaultAddress(Integer isDefaultAddress) {
		this.isDefaultAddress = isDefaultAddress;
	}
	/**
	 * 获取：
	 */
	public Integer getIsDefaultAddress() {
		return isDefaultAddress;
	}
	/**
	 * 设置：
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	/**
	 * 获取：
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * 设置：
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	/**
	 * 获取：
	 */
	public String getPostcode() {
		return postcode;
	}
	/**
	 * 设置：
	 */
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	/**
	 * 获取：
	 */
	public String getStreetname() {
		return streetname;
	}
	/**
	 * 设置：
	 */
	public void setStreetnumber(String streetnumber) {
		this.streetnumber = streetnumber;
	}
	/**
	 * 获取：
	 */
	public String getStreetnumber() {
		return streetnumber;
	}
	/**
	 * 设置：
	 */
	public void setLng(String lng) {
		this.lng = lng;
	}
	/**
	 * 获取：
	 */
	public String getLng() {
		return lng;
	}
	/**
	 * 设置：
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}
	/**
	 * 获取：
	 */
	public String getLat() {
		return lat;
	}
	/**
	 * 设置：
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * 获取：
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * 设置：
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * 获取：
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * 设置：
	 */
	public void setBuilding(String building) {
		this.building = building;
	}
	/**
	 * 获取：
	 */
	public String getBuilding() {
		return building;
	}
	/**
	 * 设置：
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取：
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * 设置：
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	/**
	 * 获取：
	 */
	public Date getModifyDate() {
		return modifyDate;
	}
}
