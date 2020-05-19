package com.madjava.micro.model.admin;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author l.jin
 * @email l.jin@accenture.com
 * @date 2020-03-28 23:43:04
 */
@Table(name = "madjava_addresses")
public class MadjavaAddresses implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    public static final String _ADDRPK = "addrPk";
	
	    //
    public static final String _USERPK = "userPk";
	
	    //����
    public static final String _FULLNAME = "fullName";
	
	    //�绰����
    public static final String _CELLPHONE = "cellphone";
	
	    //
    public static final String _COUNTRYPK = "countryPk";
	
	    //ʡ
    public static final String _REGIONPK = "regionPk";
	
	    //
    public static final String _CITYPK = "cityPk";
	
	    //
    public static final String _DISTRICTPK = "districtPk";
	
	    //
    public static final String _ISDEFAULTADDRESS = "isDefaultAddress";
	
	    //����
    public static final String _FAX = "fax";
	
	    //�ʱ�
    public static final String _POSTCODE = "postcode";
	
	    //�ֵ�סַ
    public static final String _STREETNAME = "streetname";
	
	    //���ƺ�
    public static final String _STREETNUMBER = "streetnumber";
	
	    //����
    public static final String _LNG = "lng";
	
	    //ά��
    public static final String _LAT = "lat";
	
	    //����
    public static final String _EMAIL = "email";
	
	    //��˾
    public static final String _COMPANY = "company";
	
	    //����
    public static final String _DEPARTMENT = "department";
	
	    //��¥����
    public static final String _BUILDING = "building";
	
	    //����ʱ��
    public static final String _CREATEDATE = "createDate";
	
	    //�޸�ʱ��
    public static final String _MODIFYDATE = "modifyDate";
	
	
	    //
    @Id
    private String addrPk;
	
	    //
    @Column(name = "user_pk")
    private String userPk;
	
	    //����
    @Column(name = "full_name")
    private String fullName;
	
	    //�绰����
    @Column(name = "cellphone")
    private String cellphone;
	
	    //
    @Column(name = "country_pk")
    private String countryPk;
	
	    //ʡ
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
	
	    //����
    @Column(name = "fax")
    private String fax;
	
	    //�ʱ�
    @Column(name = "postcode")
    private String postcode;
	
	    //�ֵ�סַ
    @Column(name = "streetname")
    private String streetname;
	
	    //���ƺ�
    @Column(name = "streetnumber")
    private String streetnumber;
	
	    //����
    @Column(name = "lng")
    private String lng;
	
	    //ά��
    @Column(name = "lat")
    private String lat;
	
	    //����
    @Column(name = "email")
    private String email;
	
	    //��˾
    @Column(name = "company")
    private String company;
	
	    //����
    @Column(name = "department")
    private String department;
	
	    //��¥����
    @Column(name = "building")
    private String building;
	
	    //����ʱ��
    @Column(name = "create_date")
    private Date createDate;
	
	    //�޸�ʱ��
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
	 * 设置：����
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * 获取：����
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * 设置：�绰����
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	/**
	 * 获取：�绰����
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
	 * 设置：ʡ
	 */
	public void setRegionPk(String regionPk) {
		this.regionPk = regionPk;
	}
	/**
	 * 获取：ʡ
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
	 * 设置：����
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	/**
	 * 获取：����
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * 设置：�ʱ�
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	/**
	 * 获取：�ʱ�
	 */
	public String getPostcode() {
		return postcode;
	}
	/**
	 * 设置：�ֵ�סַ
	 */
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	/**
	 * 获取：�ֵ�סַ
	 */
	public String getStreetname() {
		return streetname;
	}
	/**
	 * 设置：���ƺ�
	 */
	public void setStreetnumber(String streetnumber) {
		this.streetnumber = streetnumber;
	}
	/**
	 * 获取：���ƺ�
	 */
	public String getStreetnumber() {
		return streetnumber;
	}
	/**
	 * 设置：����
	 */
	public void setLng(String lng) {
		this.lng = lng;
	}
	/**
	 * 获取：����
	 */
	public String getLng() {
		return lng;
	}
	/**
	 * 设置：ά��
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}
	/**
	 * 获取：ά��
	 */
	public String getLat() {
		return lat;
	}
	/**
	 * 设置：����
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：����
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：��˾
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * 获取：��˾
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * 设置：����
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * 获取：����
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * 设置：��¥����
	 */
	public void setBuilding(String building) {
		this.building = building;
	}
	/**
	 * 获取：��¥����
	 */
	public String getBuilding() {
		return building;
	}
	/**
	 * 设置：����ʱ��
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取：����ʱ��
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * 设置：�޸�ʱ��
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	/**
	 * 获取：�޸�ʱ��
	 */
	public Date getModifyDate() {
		return modifyDate;
	}
}
