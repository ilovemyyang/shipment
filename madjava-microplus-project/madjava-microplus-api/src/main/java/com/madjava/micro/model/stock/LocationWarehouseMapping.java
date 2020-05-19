package com.madjava.micro.model.stock;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "location_warehouse_mapping")
public class LocationWarehouseMapping implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    public static final String _ID = "id";

    //配送区域编码
    public static final String _LOCATIONGROUPCODE = "locationGroupCode";

    //仓库集合编码
    public static final String _WAREHOUSEGROUPCODE = "warehouseGroupCode";


    //
    @Id
    private Long id;

    //配送区域编码
    @Column(name = "location_group_code")
    private String locationGroupCode;

    //仓库集合编码
    @Column(name = "warehouse_group_code")
    private String warehouseGroupCode;


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
     * 设置：配送区域编码
     */
    public void setLocationGroupCode(String locationGroupCode) {
        this.locationGroupCode = locationGroupCode;
    }
    /**
     * 获取：配送区域编码
     */
    public String getLocationGroupCode() {
        return locationGroupCode;
    }
    /**
     * 设置：仓库集合编码
     */
    public void setWarehouseGroupCode(String warehouseGroupCode) {
        this.warehouseGroupCode = warehouseGroupCode;
    }
    /**
     * 获取：仓库集合编码
     */
    public String getWarehouseGroupCode() {
        return warehouseGroupCode;
    }
}