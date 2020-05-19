package com.madjava.micro.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madjava.micro.baseservice.mapper.SystemSettingMapper;
import com.madjava.micro.model.baseservice.SystemSettingModel;
import com.madjava.micro.service.SystemSettingService;
import com.madjava.micro.utils.Query;

/**
 * @Classname SystemSettingServiceImpl
 * @Description 服务实现类
 * @Date 2020-05-14 15:18:34
 * @Created by yibin.lu
 */
@Service
public class SystemSettingServiceImpl extends ServiceImpl<SystemSettingMapper, SystemSettingModel> implements SystemSettingService {

    @Autowired
    private SystemSettingMapper systemSettingMapper;

    @Override
    public IPage<SystemSettingModel> queryPage(Map<String, Object> pageParams, SystemSettingModel systemSettingModel) {
        IPage<SystemSettingModel> pageRequest = new Query<SystemSettingModel>().getPage(pageParams);
        QueryWrapper queryWrapper = new QueryWrapper<SystemSettingModel>();

        // 查询条件赋值
        if (systemSettingModel.getId() != null) {
            queryWrapper.eq("id", systemSettingModel.getId());
        }
        if (systemSettingModel.getConfigCode() != null) {
            queryWrapper.eq("config_code", systemSettingModel.getConfigCode());
        }
        if (systemSettingModel.getConfigName() != null) {
            queryWrapper.like("config_name", systemSettingModel.getConfigName());
        }
        if (systemSettingModel.getConfigValue() != null) {
            queryWrapper.eq("config_value", systemSettingModel.getConfigValue());
        }
        if (systemSettingModel.getDeleted() != null) {
            queryWrapper.eq("deleted", systemSettingModel.getDeleted());
        }
        if (systemSettingModel.getCreateTime() != null) {
            queryWrapper.eq("create_time", systemSettingModel.getCreateTime());
        }
        if (systemSettingModel.getCreateUser() != null) {
            queryWrapper.eq("create_user", systemSettingModel.getCreateUser());
        }
        if (systemSettingModel.getUpdateTime() != null) {
            queryWrapper.eq("update_time", systemSettingModel.getUpdateTime());
        }
        if (systemSettingModel.getUpdateUser() != null) {
            queryWrapper.eq("update_user", systemSettingModel.getUpdateUser());
        }
        IPage<SystemSettingModel> page = this.page(pageRequest, queryWrapper);
        return page;
    }

}