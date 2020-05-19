package com.madjava.micro.model.stock;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2020-03-31 18:49:46
 */
@Table(name = "delivery_limitation")
public class DeliveryLimitation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    public static final String _ID = "id";
	
	    //
    public static final String _LOCATIONCODE = "locationCode";
	
	    //
    public static final String _WAREHOUSECODE = "warehouseCode";
	
	    //
    public static final String _LIMITATION = "limitation";
	
	
	    //
    @Id
    private Long id;
	
	    //
    @Column(name = "location_code")
    private String locationCode;
	
	    //
    @Column(name = "warehouse_code")
    private String warehouseCode;
	
	    //
    @Column(name = "limitation")
    private String limitation;
	

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	/**
	 * 获取：
	 */
	public String getLocationCode() {
		return locationCode;
	}
	/**
	 * 设置：
	 */
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	/**
	 * 获取：
	 */
	public String getWarehouseCode() {
		return warehouseCode;
	}

	public String getLimitation() {
		return limitation;
	}

	public void setLimitation(String limitation) {
		this.limitation = limitation;
	}
}
