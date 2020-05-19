package com.madjava.micro.model.config;

import java.io.Serializable;

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
public class Enumerationvalues implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7528791952192071491L;

	/**
     */
    private String pk;

    /**
     */
    private String typestring;

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
     * @return the typestring
     */
    public String getTypestring() {

        return typestring;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param typestring the typestring to set
     */
    public void setTypestring(String typestring) {

        this.typestring = typestring;
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
