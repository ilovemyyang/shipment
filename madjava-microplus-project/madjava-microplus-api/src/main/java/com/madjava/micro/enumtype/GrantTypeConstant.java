package com.madjava.micro.enumtype;

public class GrantTypeConstant {

	/**
	 *  密码模式(将用户名,密码传过去,直接获取token)
	 */
	public static final String PASSWORD = "password";
	
	/**
	 * 客户端模式(无用户,用户向客户端注册,然后客户端以自己的名义向’服务端’获取资源)
	 */
	public static final String CLIENT_CREDENTIALS = "client_credentials";
	
	/**
	 * 简化模式(在redirect_uri 的Hash传递token; Auth客户端运行在浏览器中,如JS,Flash)
	 */
	public static final String IMPLICIT = "implicit";
	
	/**
	 *  授权码模式(即先登录获取code,再获取token)
	 */
	public static final String AUTHORIZATION_CODE = "authorization_code";
	
	/**
	 *  刷新access_token
	 */
	public static final String REFRESH_TOKEN = "refresh_token";
	
	/**
	 *  后台管理简单Token
	 */
	public static final String ADMIN_IMPLICIT = "admin_implicit";
}
