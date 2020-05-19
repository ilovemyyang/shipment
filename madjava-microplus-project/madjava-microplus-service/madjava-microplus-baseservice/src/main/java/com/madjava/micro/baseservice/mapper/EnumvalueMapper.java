package com.madjava.micro.baseservice.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.madjava.micro.model.baseservice.EnumvalueModel;

/**
 * @Classname EnumvalueMapper
 * @Description DAO层
 * @Date 2020-05-14 17:29:42
 * @Created by zhuoxing.yan
 */
@Mapper
public interface EnumvalueMapper extends BaseMapper<EnumvalueModel> {
	
}
