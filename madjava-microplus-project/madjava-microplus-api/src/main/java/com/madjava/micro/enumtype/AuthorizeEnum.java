package com.madjava.micro.enumtype;

/**
 *  授权枚举类型
 *  用户，用户组和client用
 * @author Administrator
 *
 */
public enum AuthorizeEnum {

	ALL("ALL", "全部权限"),
	NO("NO", "没有任何权限");
	
	private String code;
	
	private String message;
	
	private AuthorizeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public String getCode() {
		
		return code;
	}
	
	/**
	 *  设置权限静态方法
	 * @param code
	 * @return
	 */
	public static AuthorizeEnum getAuthorizeEnum(String code) {
		
		if (code.equals(ALL.getCode())) {
			
			return ALL;
		}
		
		return NO;
	}
}
