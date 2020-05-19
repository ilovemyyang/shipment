package com.madjava.micro.baseservice.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.madjava.micro.model.baseservice.SystemSettingModel;

/**
 * @Classname SystemSettingMapper
 * @Description DAO层
 * @Date 2020-05-14 15:18:34
 * @Created by yibin.lu
 */
@Mapper
public interface SystemSettingMapper extends BaseMapper<SystemSettingModel> {
	
}
