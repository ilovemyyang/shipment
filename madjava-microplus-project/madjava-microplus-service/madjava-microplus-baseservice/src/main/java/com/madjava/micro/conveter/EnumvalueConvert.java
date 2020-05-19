package com.madjava.micro.conveter;

import org.springframework.stereotype.Component;

import com.madjava.micro.dto.baseservice.EnumvalueData;
import com.madjava.micro.model.baseservice.EnumvalueModel;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname EnumvalueConvert
 * @Description 转换器
 * @Date 2020-05-14 17:29:42
 * @Created by zhuoxing.yan
 */
@Component
@Slf4j
public class EnumvalueConvert {

	public EnumvalueData convertToData(EnumvalueModel enumvalueModel) {

		if (enumvalueModel == null) {
			return null;
		}
		EnumvalueData data = new EnumvalueData();
		if (enumvalueModel.getId() != null) {
			data.setId(enumvalueModel.getId());
		}
		if (enumvalueModel.getEnumType() != null) {
			data.setEnumType(enumvalueModel.getEnumType());
		}
		if (enumvalueModel.getCode() != null) {
			data.setCode(enumvalueModel.getCode());
		}
		if (enumvalueModel.getName() != null) {
			data.setName(enumvalueModel.getName());
		}
		if (enumvalueModel.getRankNo() != null) {
			data.setRankNo(enumvalueModel.getRankNo());
		}
		if (enumvalueModel.getLangCode() != null) {
			data.setLangCode(enumvalueModel.getLangCode());
		}
		if (enumvalueModel.getDisabled() != null) {
			data.setDisabled(enumvalueModel.getDisabled());
		}
		if (enumvalueModel.getCreateTime() != null) {
			data.setCreateTime(enumvalueModel.getCreateTime());
		}
		if (enumvalueModel.getCreateUser() != null) {
			data.setCreateUser(enumvalueModel.getCreateUser());
		}
		if (enumvalueModel.getUpdateTime() != null) {
			data.setUpdateTime(enumvalueModel.getUpdateTime());
		}
		if (enumvalueModel.getUpdateUser() != null) {
			data.setUpdateUser(enumvalueModel.getUpdateUser());
		}
		return data;
	}

	public EnumvalueModel convertToModel(EnumvalueData enumvalueData) {

		if (enumvalueData == null) {
			return null;
		}
		EnumvalueModel model = new EnumvalueModel();
		if (enumvalueData.getId() != null) {
			model.setId(enumvalueData.getId());
		}
		if (enumvalueData.getEnumType() != null) {
			model.setEnumType(enumvalueData.getEnumType());
		}
		if (enumvalueData.getCode() != null) {
			model.setCode(enumvalueData.getCode());
		}
		if (enumvalueData.getName() != null) {
			model.setName(enumvalueData.getName());
		}
		if (enumvalueData.getRankNo() != null) {
			model.setRankNo(enumvalueData.getRankNo());
		}
		if (enumvalueData.getLangCode() != null) {
			model.setLangCode(enumvalueData.getLangCode());
		}
		if (enumvalueData.getDisabled() != null) {
			model.setDisabled(enumvalueData.getDisabled());
		}
		if (enumvalueData.getCreateTime() != null) {
			model.setCreateTime(enumvalueData.getCreateTime());
		}
		if (enumvalueData.getCreateUser() != null) {
			model.setCreateUser(enumvalueData.getCreateUser());
		}
		if (enumvalueData.getUpdateTime() != null) {
			model.setUpdateTime(enumvalueData.getUpdateTime());
		}
		if (enumvalueData.getUpdateUser() != null) {
			model.setUpdateUser(enumvalueData.getUpdateUser());
		}
		return model;
	}

}
