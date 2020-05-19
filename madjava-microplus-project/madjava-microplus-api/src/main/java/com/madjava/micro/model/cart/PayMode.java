package com.madjava.micro.model.cart;

import java.io.Serializable; 
/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author accenture-
 */
public class PayMode implements Serializable {

    private static final long serialVersionUID = -1197000139089710764L;

    /**
     * 支付方式code
     */
    private String code;

    /**
     * 支付方式名称
     */
    private String name;

    /**
     * 是否启用
     */
    private Byte enabled;

    /**
     * <pre>
     * 支付方式code
     * </pre>
     * 
     * @return the code
     */
    public String getCode() {

        return code;
    }

    /**
     * <pre>
     * 支付方式code
     * </pre>
     * 
     * @param code the code to set
     */
    public void setCode(String code) {

        this.code = code;
    }

    /**
     * <pre>
     * 支付方式名称
     * </pre>
     * 
     * @return the name
     */
    public String getName() {

        return name;
    }

    /**
     * <pre>
     * 支付方式名称
     * </pre>
     * 
     * @param name the name to set
     */
    public void setName(String name) {

        this.name = name;
    }

    /**
     * <pre>
     * 是否启用
     * </pre>
     * 
     * @return the enabled
     */
    public Byte getEnabled() {

        return enabled;
    }

    /**
     * <pre>
     * 是否启用
     * </pre>
     * 
     * @param enabled the enabled to set
     */
    public void setEnabled(Byte enabled) {

        this.enabled = enabled;
    }
}
