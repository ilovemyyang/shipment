package com.madjava.micro.constant;

public class CommonConstants {
	public final static String RESOURCE_TYPE_MENU = "menu";
	public final static String RESOURCE_TYPE_BTN = "button";
	// 用户，以及基础信息异常 40000开始
	// 用户token异常
	public static final Integer EX_USER_INVALID_CODE = 40101;
	public static final Integer EX_USER_PASS_INVALID_CODE = 40001;
	// 客户端token异常
	public static final Integer EX_CLIENT_INVALID_CODE = 40301;
	public static final Integer EX_CLIENT_FORBIDDEN_CODE = 40331;
	public static final Integer EX_OTHER_CODE = 500;
	public static final String CONTEXT_KEY_USER_ID = "currentUserId";
	public static final String CONTEXT_KEY_USERNAME = "currentUserName";
	public static final String CONTEXT_KEY_USER_NAME = "currentUser";
	public static final String CONTEXT_KEY_USER_TOKEN = "currentUserToken";
	public static final String JWT_KEY_USER_ID = "userId";
	public static final String JWT_KEY_NAME = "name";
	public static final String JWT_KEY_TOKENTYPE = "tokentype";
	public static final String REDIS_SITE_KEY = "SITE_DATA";
	public static final String REDIS_ENUM_KEY = "ENUM_VALUE";
	public static final int REDIS_TOKEN_EXPIRED= 1800; //TimeUnit: seconds
	
	// product 异常20000开始
	
	// 订单、购物车异常 30000 开始
	
	// 库存异常 50000 开始
	
	// romotion 异常 60000开始
	
	//通用异常 10000开始
	
	
}
