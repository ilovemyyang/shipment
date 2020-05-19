package com.madjava.micro.service;

import java.util.List;

/**
 * The Interface DatabaseVersionService.
 * 数据库版本管理
 */
public interface DatabaseVersionService {
	
	/**
	 * 列出某个Site的数据库版本历史数据，Backoffice用
	 * 具体查看表schema_history_${site}
	 * @param siteId the site id
	 * @return the list
	 */
	List<String> listVersionHistory(String siteId);

	/**
	 * Update database.
	 * 更新某个Site的数据库到最新版本，Backoffice用
	 * @param siteId the site id
	 * @return true, if successful
	 */
	boolean updateDatabase(String[] siteId);
	
	/**
	 * Gets the site list.
	 * 获得所有Site的列表，Backoffice用
	 * @return the site list
	 */
	List<String> getSiteList();

}
