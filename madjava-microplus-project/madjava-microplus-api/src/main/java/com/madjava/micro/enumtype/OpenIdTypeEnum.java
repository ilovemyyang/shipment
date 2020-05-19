package com.madjava.micro.enumtype;

/**
 *  openIdType枚举类型
 * @author eddy.wanlei.liu
 *
 */
public enum OpenIdTypeEnum {

	WEIBO("WEIBO", "微博"),
	WEIXIN("WEIXIN", "微信"),
	QQ("QQ", "qq");
	
	private String code;
	
	private String message;
	
	private OpenIdTypeEnum(String code, String message) {
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
	public static OpenIdTypeEnum getAuthorizeEnum(String code) {
		
		return OpenIdTypeEnum.valueOf(code);
	}
}
