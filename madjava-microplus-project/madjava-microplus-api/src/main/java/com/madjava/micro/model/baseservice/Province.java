package com.madjava.micro.model.baseservice;

import java.io.Serializable;

import javax.persistence.Table;

@Table(name = "province")
public class Province implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4558073857607330919L;

	private String id;

    private String name;

    private String area;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }
}