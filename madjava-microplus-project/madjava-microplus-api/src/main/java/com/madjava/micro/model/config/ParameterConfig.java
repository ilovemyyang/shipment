package com.madjava.micro.model.config;

import java.io.Serializable;

/**
 * <pre>
 * =============================================================================
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author 埃森哲-
 */
public class ParameterConfig implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -9112609426026559502L;

	/**
     */
    private String pk;

    /**
     * code
     */
    private String code;

    /**
     * 多个值以逗号,分割
     */
    private String val;

    /**
     * 备注
     */
    private String remarks;

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
