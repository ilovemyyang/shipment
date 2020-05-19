package com.madjava.micro.model.stock;

import com.madjava.micro.model.baseservice.ItemModel;

public class LocationGroup extends ItemModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1619158499650947957L;

	private Long id;

    private String locationGroupCode;

    private String locationCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocationGroupCode() {
        return locationGroupCode;
    }

    public void setLocationGroupCode(String locationGroupCode) {
        this.locationGroupCode = locationGroupCode == null ? null : locationGroupCode.trim();
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode == null ? null : locationCode.trim();
    }
}