package com.madjava.micro.database.mybatis.strategy.impl;

import java.util.Map;

import com.alibaba.druid.sql.ast.statement.SQLExprTableSource;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlASTVisitorAdapter;

/**
 * The Class DruidTableNameVisitor.
 */
public class DruidTableNameVisitor extends MySqlASTVisitorAdapter {
	
	/** The table names. */
	private Map<String, Object> tableNames;
	
	/** The postfix. */
	private String postfix;

	/**
	 * Instantiates a new druid table name visitor.
	 *
	 * @param tableNames the table names
	 * @param postfix the postfix
	 */
	public DruidTableNameVisitor(Map<String, Object> tableNames, String postfix) {
		super();
		this.tableNames = tableNames;
		this.postfix = postfix;
	}

	/**
	 * Visit.
	 *
	 * @param x the x
	 * @return true, if successful
	 */
	@Override
	public boolean visit(SQLExprTableSource x) {
		if (this.tableNames.containsKey(x.getName().getSimpleName().toLowerCase())) {
			x.setExpr(x.getName().getSimpleName() + postfix);
		}
		return false;
	}

}
