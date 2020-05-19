package com.madjava.micro.model.product;

import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author 埃森哲-
 */
public class Catalogs implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3796250371598002008L;

	/**
     */
    private String pk;

    /**
     */
    private Date createdts;

    /**
     */
    private Date modifiedts;

    /**
     */
    private String id;

    /**
     */
    private String name;

    /**
     * <pre>
     * </pre>
     * 
     * @return the pk
     */
    public String getPk() {

        return pk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param pk the pk to set
     */
    public void setPk(String pk) {

        this.pk = pk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the createdts
     */
    public Date getCreatedts() {

        return createdts;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param createdts the createdts to set
     */
    public void setCreatedts(Date createdts) {

        this.createdts = createdts;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the modifiedts
     */
    public Date getModifiedts() {

        return modifiedts;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param modifiedts the modifiedts to set
     */
    public void setModifiedts(Date modifiedts) {

        this.modifiedts = modifiedts;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the id
     */
    public String getId() {

        return id;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param id the id to set
     */
    public void setId(String id) {

        this.id = id;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the name
     */
    public String getName() {

        return name;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param name the name to set
     */
    public void setName(String name) {

        this.name = name;
    }
}
