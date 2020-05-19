package com.madjava.micro.service.config;

import java.util.List;

import com.madjava.micro.model.config.Appversion;


public interface AppversionService
{
	/**
	 * 插入
	 *
	 * @param appversion
	 * @return returnCode
	 */
	int insert(Appversion appversion);

	/**
	 * 删除通过主键
	 *
	 * @param pk
	 * @return returnCode
	 */
	int deleteByPrimaryKey(Long pk);

	/**
	 * 单件更新通过主键(全更新)
	 *
	 * @param appversion
	 * @return returnCode
	 */
	int updateAllByPrimaryKey(Appversion appversion);

	/**
	 * 单件更新通过主键(部分更新)
	 *
	 * @param appversion
	 * @return returnCode
	 */
	int updateByPrimaryKey(Appversion appversion);

	/**
	 * 单件检索通过主键
	 *
	 * @param pk
	 * @return appversion
	 */
	Appversion selectOneByPrimaryKey(Long pk);

	/**
	 * 检索列表
	 *
	 * @param appversion
	 * @return appversionList
	 */
	List<Appversion> selectList(Appversion appversion);

	/**
	 * 检索件数
	 *
	 * @param appversion
	 * @return count
	 */
	int selectCount(Appversion appversion);
}
