/*
 * 
 */
package com.madjava.micro.database.mybatis.strategy;

import java.util.List;

/**
 * The Interface TableNameAlterStrategy.
 * 表名替换的策略接口
 */
public interface TableNameAlterStrategy {

	/**
	 * 设置需要替换的表名
	 * @param replaceTables the new table names
	 */
	void setTableNames(List<String> replaceTables);

	/**
	 * 在SQL语句中替换表名 (加上后缀)
	 *
	 * @param sql the sql
	 * @param postfix the postfix
	 * @return the string
	 */
	String replaceTableName(String sql, String postfix);

}
