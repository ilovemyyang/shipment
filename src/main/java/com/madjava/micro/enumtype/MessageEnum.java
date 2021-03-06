package com.madjava.micro.enumtype;

/**
 *  调用结果返回
 * @author Administrator
 *
 */
public enum MessageEnum {

	// 系统相关信息
	SUCCESS(20000, "调用成功"),
	SYSTEM_EXCEPTION(20001, "系统繁忙, 请稍后再试"),
	EXISTING_UNIQUE_CODE(20002, "编码已存在"),
	SYSTEM_ERROR(20003, "系统繁忙, 请稍后再试"),
	SEND_SMS_WAIT(20004, "发送短信的间隔不能小于60秒"),
	SEND_SMS_FAIL(20005, "发送短信失败"),
	PLEASE_SEND_SMS_AGAIN(20006, "请重新发送短信"),
	SMS_CODE_INCORRECT(20007, "短信验证码不正确"),
	PARAMS_INCORRECT(20008, "参数不合法"),
	PARAMS_MISSING(20009, "参数缺失"),
	SECURITY_CODE_MISSING(20010, "验证码缺失"),
	SYSTEM_VERSION_NULL(20011, "查询不到版本信息"),
	FAILED_REMOVED_USED(20012,"被其他项占用,不能删除"),
	
	// 登录认证相关信息
	NO_TOKEN(10000, "非法请求"),
	NO_CLIENT(10001, "无效的client"),
	NO_GRANT_TYPE(10002, "无效的grant_Type"),
	NO_USERNAME_OR_PASSWORD(10003, "用户名或者密码不正确"),
	NO_SUPPORT_GRANT_TYPE(10004, "不支持grant_Type类型的授权认证"),
	INVALID_TOKEN(10005, "token失效"),
	NO_RESOURCE(10006, "访问资源不存在"),
	NO_AUTHORITY(10007, "没有访问该资源的权限"),
	DISABLE_CLIENT(10008, "该client已被禁用"),
	INSERT_MENU_FAIL(10009, "插入菜单失败"),
	DELETE_MENU_FAIL(10010, "删除菜单失败"),
	UPDATE_MENU_FAIL(10011, "更新菜单失败"),
	INSERT_AUTHORITY_FAIL(10012, "插入权限失败"),
	DELETE_AUTHORITY_FAIL(10013, "删除权限失败"),
	UPDATE_AUTHORITY_FAIL(10014, "更新权限失败"),
	NO_RECORD_SELECTED(10015, "请选择至少一个选项"),
	UPLOAD_IMAGE_FAIL(10016, "上传图片失败"),
	
	// 用户相关信息
	EXISTING_USERINFO(30000, "用户信息已经存在"),
	INSERT_USER_FAIL(30001, "用户信息注册失败"),
	NOT_EXISTING_USERINFO(30002, "用户信息不存在!"),
	UPDATE_USER_FAIL(30003, "用户信息更新失败"),
	UPDATE_USER_CONDITION_ERROR(30004, "用户信息更新条件不正确"),
	NO_USER(30005,"用户不存在"),
	INSERT_USER_PARAMS_ERROR(30005, "用户信息注册必要参数缺少"),
	MOBILE_OR_EMAIL_FOMAT_ERROR(30006, "手机或者邮箱格式不正确"),
	USERNAME_IS_NULL(30007, "用户名不能为空"),
	PASSWORD_IS_NULL(30008, "密码不能为空"),
	DELETE_USER_FAIL(30009, "删除用户失败"),
	OPERATE_USER_FAIL(30010, "操作用户失败"),
	INSERT_ADDRESS_FAIL(30011, "插入用户地址列表失败"),
	UPDATE_ADDRESS_FAIL(30012, "更新用户地址列表失败"),
	DELETE_ADDRESS_FAIL(30013, "删除用户地址列表失败"),
	EXISTING_REALNAME_AUTH(30014, "该用户身份证已经存在"),
	REALNAME_AUTH_INSERT_FAIL(30015, "添加实名认证失败"),
	REALNAME_AUTH_NAME_OR_CARTNO_NULL(30016, "姓名或证件号不能为空"),
	REALNAME_AUTH_DEL_FAIL(30017, "删除实名认证失败"),
	REALNAME_AUTH_UPDATE_FAIL(30018, "更新实名认证失败"),
	MOBILE_IS_REGISTED(30019, "手机号已注册"),
	SAVE_SYSTEMCOMMENT_FAIL(30020, "提交留言失败"),
	UPLOAD_HEADPORTRAIT_FAIL(30021, "上传头像失败"),
	UPLOAD_HEADPORTRAIT_OUTSIZE(30022, "上传头像图片尺寸过大"),
	PASSWORD_ERROR(30023, "密码不正确"),
	CHANGE_PASSWORD_FAIL(30024, "更改密码失败"),
	PARAMS_ILLEGAL_FAIL(30025, "参数不合法"),
	MOBILE_FOMAT_ERROR(30026, "手机号码格式不正确"),
	SEND_SMS_ERROR(30029, "验证码发送失败"),
	SMS_CODE_ERROR(30030, "验证码错误"),
	ALREADY_EXIST(30027, "已存在"),
	PARENT_NOT_EXIST(30028, "父节点不存在"),
	ALREADY_REGISTERED(30029, "配置编码已经被使用"),
	// 页面相关
	EXISTING_PAGEINFO(40000, "页面已经存在"),
	INSERT_PAGE_FAIL(40001, "页面信息保存失败"),
	NOT_EXISTING_PAGEINFO(40002, "页面信息不存在"),
	UPDATE_PAGE_FAIL(40003, "页面信息更新失败"),
	UPDATE_PAGE_CONDITION_ERROR(40004, "页面信息更新条件不正确"),
	DELETE_PAGE_FAIL(40005, "删除页面失败"),
	INSERT_GROUP_FAIL(40006, "链接组信息保存失败"),
	NOT_EXISTING_GROUPINFO(40007, "链接组信息不存在"),
	UPDATE_GROUP_FAIL(40008, "链接组信息更新失败"),
	UPDATE_GROUP_CONDITION_ERROR(40009, "链接组信息更新条件不正确"),
	DELETE_GROUP_FAIL(40010, "删除链接组失败"),
	INSERT_ITEM_FAIL(40011, "链接条目信息保存失败"),
	NOT_EXISTING_ITEMINFO(40012, "链接条目信息不存在"),
	UPDATE_ITEM_FAIL(40013, "链接条目信息更新失败"),
	UPDATE_ITEM_CONDITION_ERROR(40014, "链接条目信息更新条件不正确"),
	DELETE_ITEM_FAIL(40015, "删除链接条目失败"),
	
	// catalog 相关
	EXISTING_CATALOGINFO(50000, "目录已经存在"),
	INSERT_CATALOG_FAIL(50001, "目录信息保存失败"),
	NOT_EXISTING_CATALOGINFO(50002, "目录信息不存在"),
	UPDATE_CATALOG_FAIL(50003, "目录信息更新失败"),
	DELETE_CATALOG_FAIL(50004, "删除页面失败"),
	CATALOGINFO_NOTALLOW_DELETE(50005, "类别信息存在子类别，不允许删除"),
	
	EXISTING_CATEGORYINFO(60000, "类别已经存在"),
	INSERT_CATEGORY_FAIL(60001, "类别信息保存失败"),
	NOT_EXISTING_CATEGORYINFO(60002, "类别信息不存在"),
	UPDATE_CATEGORY_FAIL(60003, "类别信息更新失败"),
	DELETE_CATEGORY_FAIL(60004, "删除类别失败"),
	CATEGORYINFO_NOTALLOW_DELETE(60005, "类别信息存在子类别，不允许删除"),
	CATEGORY_NOTALLOW_BYPRODUCT_DELETE(60006, "类别存在商品绑定关系，不允许删除"),
	
	ADD_SUBCATEGORY_FAIL(70001, "添加子类别失败"),
	ADD_PRODUCTTOCATEGORY_FAIL(80001, "添加子类别失败"),
	
	
	EXISTING_PRODUCTINFO(90000, "产品已经存在"),
	INSERT_PRODUCT_FAIL(90001, "产品信息保存失败"),
	NOT_EXISTING_PRODUCTINFO(90002, "产品信息不存在"),
	UPDATE_PRODUCT_FAIL(90003, "产品信息更新失败"),
	DELETE_PRODUCT_FAIL(90004, "删除产品失败"),
	CREAT_VARIANTOPTIONVALUE_FAIL(90005, "缺少子品选项名称失败"),
	
	NOT_EXISTING_PRODUCTPRICEINFO(90005, "产品价格信息不存在"),
	INSERT_PRODUCTPRICE_FAIL(90006, "产品价格保存失败"),
	INSERT_PRODUCTPRICE_PRODUCTNULL(90007, "产品价格保存失败,产品为空"),
	EXISTING_PRODUCTPRICEINFO(90008, "产品价格信息已存在"),
	NOEXISTING_PRODUCTPRICEINFO(900014, "产品价格信息不存在"),
	UPDATE_PRODUCTPRICE_FAIL(90009, "产品价格更新失败"),
	DELETE_PRODUCTPRICE_FAIL(90010, "删除价格失败"),
	EXIST_PRODUCT_LOW_STOCK(90011, "商品库存不足"),
	PRODUCT_NOT_APPROVED(90012, "商品没有上架"),
	EXIST_PRODUCT_NOT_APPROVED(90013, "存在商品没有上架，请返回购物车"),	
	NOT_CHANGE_ONLINE_PRODUCT(90014, "线上产品不能修改"),
	// 购物车 相关
	NOT_EXISTING_CART(1000001, "购物车不存在"),
	UPDATE_ENTRY_FAIL(1000002, "更新购物车商品数量失败"),
	NULL_CART(1000003, "购物车为空"),
	DELIVERY_ADDRESS_NOT_SUPPORT(1000004, "收货地址不支持配送"),
	DELIVERY_DELIVERY_AREA_IS_NULL(1000005, "配送模板为空"),
	NOT_SELECTED_CART(1000006, "无选中的购物车行"),
	EXISTS_MORE_ONE_PRODUCTTYPE(1000007, "不同产品类型不能一起结算"),
	NOT_EXISTING_ADDRESS_CART(1000008, "购物车没有收货地址或该地址不支持配送"),
	NOT_EXISTING_PAYMODE_CART(1000009, "购物车没有支付方式"),
	NOT_EXISTING_REALNAME_CART(1000010, "购物车没有实名认证"),
	REALNAME_NOT_TRUE(1000010, "实名认证信息不正确"),
	FALSE_AMOUNT_CART(1000011, "购物车价格不正确"),
	ADDRESS_IS_NOT_EXIST(1000012, "地址不存在"),
	VOUCHER_TIMELIMIT(1000013, "优惠券已过期或不可用"),
	VOUCHER_NOTEXIST(1000014, "优惠券不存在"),
	VOUCHER_USEUP(1000015, "优惠券可以使用次数已经用完"),
	VOUCHER_AMOUNTLIMIT(1000016, "购物车金额没有达到优惠券使用额度"),
	VOUCHER_NOTOWN(1000017, "没有此优惠券的使用权"),
	ADD_PAYMODE_TO_CART_FAIL(1000018, "支付方式加入购物车失败"),
	ADD_REALNAME_AUTH_TO_CART_FAIL(1000019, "实名认证加入购物车失败"),
	ADD_INVOICE_TO_CART_FAIL(1000020, "发票信息加入购物车失败"),
	PRODUCT_NOTEXIST(1000021, "产品不存在"),
	
	// 支付方式 相关
	PAYMODE_IS_NULL(1010001, "支付方式列表为空"),
	PAYMENT_FAIL(1010002, "支付失败"),
	PAYMENT_OPENID_NULL(1010003, "微信内支付，openId不可为空"),
	
	// 订单 相关
	ORDER_IS_NULL(1020001, "订单不存在"),
	ORDER_IS_PAID(1020002, "订单已支付"),
	ORDER_UPDATE_PAYMODE_FAIL(1020003, "修改支付方式失败"),
	CANCEL_ORDER_FAIL(1020004, "取消订单失败"),
	NOT_ALLOW_CANCEL_ORDER(1020005, "该订单不允许取消"),
	ORDER_CODES_IS_NULL(1020006, "传过来的订单号为空"),
	
	//商品相关
	EAN_PRODUCT_IS_NOT_EXIST(1030001, "条形码不存在"),
	PART_PRODUCT_IS_UPDATE(1030002, "部份商品更新成功"),
	ALL_PRODUCT_IS_NOT_UPDATE(1030003, "所有商品没有更新"),
	SYNC_PRODUCT_IS_NULL(1030004, "同步商品为空"),
	
	PART_PRODUCT_IMAGE_IS_UPDATE(1030005, "部份商品图片更新成功"),
	ALL_PRODUCT_IMAGE_IS_NOT_UPDATE(1030006, "所有商品图片没有更新"),
	SYNC_PRODUCT_IMAGE_IS_NULL(1030007, "同步商品图片为空"),
	
	// 物流相关
	EXISTING_DELIVERYWAITING(1040001, "订单物流信息已经存在"),
	NOT_EXIST_DELIVERYWAITING(1040002, "订单物流信息不存在"),
	// 发票相关
 	INVOICETITLE_OR_INVOICECONTENT_NOT_NULL(1050001, "发票内容或类型不能为空"),
	
	// promotion 相关定义
 	NO_CAMPAIGN(1060000, "没有活动"),
	CAMPAIGN_END(1060001, "活动已经结束"),
	NOT_EXIST_COUPON(1060002, "优惠券不存在"),
	DELIVERED_COUPON(1060003, "优惠券已领取"),
	NOT_EXIST_PROMOTION(1060004, "促销活动不存在"),
	EMPTY_PROMOTIONS(1060005, "促销活动为空"),
	NOT_EXIST_CONDITION_ID(1060006, "促销条件id不存在"),
	EMPTY_CONDITION_ITEMS(1060007, "促销条件items为空"),
	NOT_EXIST_BENEFIT_ID(1060008, "促销结果id不存在"),
	EMPTY_BENEFIT_ITEMS(1060009, "促销结果items为空"), 
	NOT_EXIST_CONDITION_ITEM(1060010, "促销条件item不存在"),
	NOT_EXIST_BENEFIT_ITEM(1060011, "促销结果item不存在"),
	NOT_EXIST_CONDITION_ITEM_REF(1060012, "促销条件item_ref不存在"),
	NOT_EXIST_BENEFIT_ITEM_REF(1060013, "促销结果item_ref不存在"),
	NOT_EXIST_CONDITION_ITEM_TYPE(1060014, "促销条件类型不存在"),
	NOT_EXIST_BENEFIT_ITEM_TYPE(1060015, "促销结果类型不存在"),
	FAIL_TRANSFORM_CONDITION_ITEM_TYPE(1060016, "转化促销条件类型失败"),
	FAIL_TRANSFORM_BENEFIT_ITEM_TYPE(1060017, "转化促销结果类型失败"),
	ERROR_START_END_DATE(1060018, "促销结束时间不能小于开始时间"),
	ERROR_INSERT_PROMOTION(1060019, "新增促销活动失败"),
	ERROR_EXSIT_PROMOTION(1060020, "促销活动已存在"),
	ERROR_PUBLISH_STATUS_PROMOTION(1060021, "当前状态无法发布"),
	ERROR_UNPUBLISH_STATUS_PROMOTION(1060022, "撤回促销失败"),
	ERROR_DETETE_PROMOTION(1060023, "当前状态无法删除"),
	
	EXISTING_DELIVERYCOSTTEMPLETINFO(1070000, "运费模板已经存在"),
	INSERT_DELIVERYCOSTTEMPLET_FAIL(1070001, "运费模板信息保存失败"),
	NOT_EXISTING_DELIVERYCOSTTEMPLETINFO(1070002, "运费模板信息不存在"),
	UPDATE_DELIVERYCOSTTEMPLET_FAIL(1070003, "运费模板信息更新失败"),
	UPDATE_DELIVERYCOSTTEMPLET_CONDITION_ERROR(1070004, "运费模板信息更新条件不正确"),
	DELETE_DELIVERYCOSTTEMPLET_FAIL(1070005, "删除运费模板失败"),
	
	
	EXISTING_DELIVERYAREAINFO(1080000, "配送区域模板已经存在"),
	INSERT_DELIVERYAREA_FAIL(1080001, "配送区域模板信息保存失败"),
	NOT_EXISTING_DELIVERYAREAINFO(1080002, "配送区域模板信息不存在"),
	UPDATE_DELIVERYAREA_FAIL(1080003, "配送区域模板信息更新失败"),
	UPDATE_DELIVERYAREA_CONDITION_ERROR(1080004, "配送区域模板信息更新条件不正确"),
	DELETE_DELIVERYAREA_FAIL(1080005, "删除配送区域模板失败"),
	
	//Media
	EXISTING_MEDIA_FOLDER(1090001, "文件目录已存在"),
	ILLEGAL_MEDIA_QUALIFIER(1090002, "文件目录标识不合法"),
	NOT_EXISTING_MEDIA_FOLDER(1090003, "文件目录标不存在"),
	EXCEED_MAX_DEPTH_MEDIA_FOLDER(1090004, "目录超过最大深度"),
	EXISTING_MEDIA_IDENTIFIER(1090005, "文件已存在"),
	EXCEED_MEDIA_MAX_SIZE_ALLOWED(1090006,"文件超过所允许的最大size"),
	IO_FILE_WRITE_WRONG(1090007,"文件IO写异常"),
	
	NOT_FIND_ENUMVALUE(1100001,"找不到该枚举值"),
	
	//库存相关
	PARAMS_NOT_ILLEGAL(1110001, "库存参数校验不合法"),
	NOT_EXIST_RATIO(1110002, "库存比例渠道不存在"),
	RATIO_NOT_ILLEGAL(1110003, "库存比例渠道参数错误0-100"),
	NOT_EXIST_WAREHOUSE(1110004, "仓库不存在"),
	NOT_EXIST_SOURCINGRULE(1110005, "寻源规则不存在"),
	
	//Notice
	NOT_EXIST_NOTICE_PK(1120001, "公告pk不存在"),
	NOT_EXIST_NOTICE(1120002, "公告不存在"),
	STATUS_FORMAT_ERROR(1120003, "状态不合法"),
	STATUS_SET_ERROR(1120004, "重复设置状态"),
	
	
	PAGE_CHANNEL_TYPE_EXIST(2000000,"渠道首页信息已存在"),
	PAGE_NOT_EXIST(2000001,"页面信息不存在")
	
	;
	
	private int code;
	
	private String message;
	
	public int getCode() {
		
		return code;
	}
	
	public String getMessage() {
		
		return message;
	}

	private MessageEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
}
