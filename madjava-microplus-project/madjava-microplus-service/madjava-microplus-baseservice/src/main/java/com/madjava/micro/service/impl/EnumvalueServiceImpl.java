package com.madjava.micro.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madjava.micro.baseservice.mapper.EnumvalueMapper;
import com.madjava.micro.model.baseservice.EnumvalueModel;
import com.madjava.micro.service.EnumvalueService;
import com.madjava.micro.utils.Query;

/**
 * @Classname EnumvalueServiceImpl
 * @Description 服务实现类
 * @Date 2020-05-14 17:29:42
 * @Created by zhuoxing.yan
 */
@Service
public class EnumvalueServiceImpl extends ServiceImpl<EnumvalueMapper, EnumvalueModel> implements EnumvalueService {

    @Autowired
    private EnumvalueMapper enumvalueMapper;

    @Override
    public IPage<EnumvalueModel> queryPage(Map<String, Object> pageParams, EnumvalueModel enumvalueModel) {
        IPage<EnumvalueModel> pageRequest = new Query<EnumvalueModel>().getPage(pageParams);
        QueryWrapper queryWrapper = new QueryWrapper<EnumvalueModel>();

        // 查询条件赋值
        if (enumvalueModel.getId() != null) {
            queryWrapper.eq("id", enumvalueModel.getId());
        }
        if (enumvalueModel.getEnumType() != null) {
            queryWrapper.eq("enum_type", enumvalueModel.getEnumType());
        }
        if (enumvalueModel.getCode() != null) {
            queryWrapper.eq("code", enumvalueModel.getCode());
        }
        if (enumvalueModel.getName() != null) {
            queryWrapper.like("name", enumvalueModel.getName());
        }
        if (enumvalueModel.getRankNo() != null) {
            queryWrapper.eq("rank_no", enumvalueModel.getRankNo());
        }
        if (enumvalueModel.getLangCode() != null) {
            queryWrapper.eq("lang_code", enumvalueModel.getLangCode());
        }
        if (enumvalueModel.getDisabled() != null) {
            queryWrapper.eq("disabled", enumvalueModel.getDisabled());
        }
        if (enumvalueModel.getDeleted() != null) {
            queryWrapper.eq("deleted", enumvalueModel.getDeleted());
        }
        if (enumvalueModel.getCreateTime() != null) {
            queryWrapper.eq("create_time", enumvalueModel.getCreateTime());
        }
        if (enumvalueModel.getCreateUser() != null) {
            queryWrapper.eq("create_user", enumvalueModel.getCreateUser());
        }
        if (enumvalueModel.getUpdateTime() != null) {
            queryWrapper.eq("update_time", enumvalueModel.getUpdateTime());
        }
        if (enumvalueModel.getUpdateUser() != null) {
            queryWrapper.eq("update_user", enumvalueModel.getUpdateUser());
        }
        IPage<EnumvalueModel> page = this.page(pageRequest, queryWrapper);
        return page;
    }

}