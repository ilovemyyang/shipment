package com.madjava.micro.util;

import java.util.UUID;

/**
 *  主键生成策略
 * @author Administrator
 *
 */
public class PKGenerateUtil {
	
	/**
	 *  获取业务主键
	 *  长度为36位字符串
	 * @return
	 */
	public static String getGeneratePK() {
		
		return UUID.randomUUID().toString();
	}
	
	/**
	 *  获取主键hashcode
	 * @param pk
	 * @return
	 */
	public static int getGeneratePKHashCode(String pk) {
		
		return Math.abs(pk.hashCode());
	}
	
	/**
	 *  获取主键取模分布值
	 * @param pk
	 * @param mod
	 * @return
	 */
	public static int getPKModValue(String pk, int mod) {
		
		return getGeneratePKHashCode(pk)%mod;
	}
}
