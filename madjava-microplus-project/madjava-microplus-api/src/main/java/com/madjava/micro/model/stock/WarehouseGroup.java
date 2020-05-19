package com.madjava.micro.model.stock;

import com.madjava.micro.model.baseservice.ItemModel;

public class WarehouseGroup extends ItemModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2650015492027122145L;

	private Long id;

    private String warehouseGroupCode;

    private String warehouseCode;

    private Integer priority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWarehouseGroupCode() {
        return warehouseGroupCode;
    }

    public void setWarehouseGroupCode(String warehouseGroupCode) {
        this.warehouseGroupCode = warehouseGroupCode == null ? null : warehouseGroupCode.trim();
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode == null ? null : warehouseCode.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}