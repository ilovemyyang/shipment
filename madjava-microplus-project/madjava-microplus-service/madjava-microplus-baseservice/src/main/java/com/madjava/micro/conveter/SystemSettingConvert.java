package com.madjava.micro.conveter;

import org.springframework.stereotype.Component;

import com.madjava.micro.dto.baseservice.SystemSettingData;
import com.madjava.micro.model.baseservice.SystemSettingModel;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname SystemSettingConvert
 * @Description 转换器
 * @Date 2020-05-14 15:18:34
 * @Created by yibin.lu
 */
@Component
@Slf4j
public class SystemSettingConvert {

	public SystemSettingData convertToData(SystemSettingModel systemSettingModel) {

		if (systemSettingModel == null) {
			return null;
		}
		SystemSettingData data = new SystemSettingData();
		if (systemSettingModel.getId() != null) {
			data.setId(systemSettingModel.getId());
		}
		if (systemSettingModel.getConfigCode() != null) {
			data.setConfigCode(systemSettingModel.getConfigCode());
		}
		if (systemSettingModel.getConfigName() != null) {
			data.setConfigName(systemSettingModel.getConfigName());
		}
		if (systemSettingModel.getConfigValue() != null) {
			data.setConfigValue(systemSettingModel.getConfigValue());
		}
		if (systemSettingModel.getCreateTime() != null) {
			data.setCreateTime(systemSettingModel.getCreateTime());
		}
		if (systemSettingModel.getCreateUser() != null) {
			data.setCreateUser(systemSettingModel.getCreateUser());
		}
		if (systemSettingModel.getUpdateTime() != null) {
			data.setUpdateTime(systemSettingModel.getUpdateTime());
		}
		if (systemSettingModel.getUpdateUser() != null) {
			data.setUpdateUser(systemSettingModel.getUpdateUser());
		}
		return data;
	}

	public SystemSettingModel convertToModel(SystemSettingData systemSettingData) {

		if (systemSettingData == null) {
			return null;
		}
		SystemSettingModel model = new SystemSettingModel();
		if (systemSettingData.getId() != null) {
			model.setId(systemSettingData.getId());
		}
		if (systemSettingData.getConfigCode() != null) {
			model.setConfigCode(systemSettingData.getConfigCode());
		}
		if (systemSettingData.getConfigName() != null) {
			model.setConfigName(systemSettingData.getConfigName());
		}
		if (systemSettingData.getConfigValue() != null) {
			model.setConfigValue(systemSettingData.getConfigValue());
		}
		return model;
	}

}
