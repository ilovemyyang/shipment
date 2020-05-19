package com.madjava.micro.service;

import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.madjava.micro.model.baseservice.EnumvalueModel;

/**
 * @Classname EnumvalueService
 * @Description 服务接口
 * @Date 2020-05-14 17:29:42
 * @Created by zhuoxing.yan
 */
public interface EnumvalueService extends IService<EnumvalueModel> {

    IPage<EnumvalueModel> queryPage(Map<String, Object> pageParams, EnumvalueModel model);
}

