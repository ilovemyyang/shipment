package com.madjava.micro.service;

import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.madjava.micro.model.baseservice.SystemSettingModel;

/**
 * @Classname SystemSettingService
 * @Description 服务接口
 * @Date 2020-05-14 15:18:34
 * @Created by yibin.lu
 */
public interface SystemSettingService extends IService<SystemSettingModel> {

    IPage<SystemSettingModel> queryPage(Map<String, Object> pageParams, SystemSettingModel model);
}

