package com.madjava.micro.enumtype;

/**
 *  短信模板枚举类
 * @author sheng.han
 *
 */
public enum SmsTemplateEnum {

	// 手机验证码：{0} - 您正在进行手机验证申请, 请在网页输入本短信内的验证码。验证码10分钟内有效。
	ValidateCellphone("ValidateCellphone", 1),
	StorePutInGiveAway("StorePutInGiveAway", 2),
	StorePutInDeposit("StorePutInDeposit", 3),
	StorePickUp("StorePickUp", 4),
	StoreChange("StoreChange", 5),
	ReturnRejected("ReturnRejected", 6),
	ReturnConfirmed_returnToshop("ReturnConfirmed_returnToshop", 7),
	ReturnConfirmed_returnStandardGross("ReturnConfirmed_returnStandardGross", 8),
	ReturnConfirmed_returnExpress_haitao("ReturnConfirmed_returnExpress_haitao", 9),
	ReturnConfirmed_returnExpress("ReturnConfirmed_returnExpress", 10),
	ResetPassword("ResetPassword", 11),
	PersonalStockExpire("PersonalStockExpire", 12),
	Ordertocking("Ordertocking", 13),
	OrderDonation("OrderDonation", 14),
	
	// 验证码为{0}, 您正在进行手机验证，切勿告知他人验证码，如有疑问请致电400-009-9870
	MobileAuthenticate("MobileAuthenticate", 15),
	HaitaoOrderInvalid("HaitaoOrderInvalid", 16),
	DynamicPassword("DynamicPassword", 17);
	
	private String code;
	
	private Integer userType;

	private SmsTemplateEnum(String code, Integer userType) {
		this.code = code;
		this.userType = userType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}
}
