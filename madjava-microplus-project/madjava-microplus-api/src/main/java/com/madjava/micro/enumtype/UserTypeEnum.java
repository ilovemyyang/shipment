package com.madjava.micro.enumtype;

import java.util.ArrayList;
import java.util.List;

import com.madjava.micro.dto.DictionaryData;

/**
 *  用户总体分为前后台用户
 *  前台用户是指通过互联网访问商品信息并下单的用户
 *  后台用户是指通过后台操作的用户，有时也包括商家
 * @author Administrator
 *
 */
public enum UserTypeEnum {

	PORTAL("PORTAL", 99, "前台用户"),
	ADMIN("ADMIN", 1, "超级管理员用户"),
	SYSTEM("SYSTEM", 2, "系统管理员"),
	BUSINESS("ADMIN", 3, "商户");
	
	private String typeCode;
	
	private int power;
	
	private String message;

	private UserTypeEnum(String typeCode, int power, String message) {
		this.typeCode = typeCode;
		this.power = power;
		this.message = message;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public int getPower() {
		return power;
	}

	public String getMessage() {
		return message;
	}
	
	// 根据code获取枚举类型
	public static UserTypeEnum getUserTypeEnum(String code) {
		
		UserTypeEnum result = null;
		switch (code) {
		case "PORTAL":
			result = PORTAL;
			break;
		case "ADMIN":
			result = ADMIN;
			break;
		case "SYSTEM":
			result = SYSTEM;
			break;
		case "BUSINESS":
			result = BUSINESS;
			break;
		default:
			break;
		}
		
		return result;
	}
	
	// 根据code获取枚举类型
	public static UserTypeEnum getUserTypeEnum(int power) {
		
		UserTypeEnum result = null;
		switch (power) {
		case 99:
			result = PORTAL;
			break;
		case 1:
			result = ADMIN;
			break;
		case 2:
			result = SYSTEM;
			break;
		case 3:
			result = BUSINESS;
			break;
		default:
			break;
		}
		
		return result;
	}
	
	// 获取管理用户类型
	public static List<DictionaryData> getAdminUserTypeList() {
		
		List<DictionaryData> list = new ArrayList<DictionaryData>(10);
		
		for (int i = 1; i <= BUSINESS.getPower(); i++) {
			DictionaryData dictionaryData = new DictionaryData();
			
			dictionaryData.setValue(getUserTypeEnum(i).getMessage());
			dictionaryData.setKey(String.valueOf(i));
			
			list.add(dictionaryData);
		}
		
		return list;
	}
}
