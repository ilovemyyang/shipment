package com.madjava.micro.model.product;

import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  类别
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author 埃森哲-
 */
public class Categories implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7111408613248602742L;

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
    private String catalogpk;

    /**
     */
    private String media;

    /**
     */
    private String code;

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
     * @return the catalogpk
     */
    public String getCatalogpk() {

        return catalogpk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param catalogpk the catalogpk to set
     */
    public void setCatalogpk(String catalogpk) {

        this.catalogpk = catalogpk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the media
     */
    public String getMedia() {

        return media;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param media the media to set
     */
    public void setMedia(String media) {

        this.media = media;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the code
     */
    public String getCode() {

        return code;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param code the code to set
     */
    public void setCode(String code) {

        this.code = code;
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
