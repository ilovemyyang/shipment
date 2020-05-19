package com.madjava.micro.enumtype;

/**
 *  授权枚举类型
 *  用户，用户组和client用
 * @author Administrator
 *
 */
public enum EnabledEnum {

	FALSE(0, "未启用"),
	TRUE(1, "启用");
	
	private int code;
	
	private String message;
	
	private EnabledEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		
		return code;
	}
	
	public String getMessage() {
		return message;
	}

	/**
	 *  设置权限静态方法
	 * @param code
	 * @return
	 */
	public static EnabledEnum getEnabledEnum(String code) {
		
		if (code.equals(FALSE.getCode())) {
			
			return FALSE;
		}
		
		return TRUE;
	}
}
