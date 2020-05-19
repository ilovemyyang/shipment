package com.madjava.micro.convert;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

import com.madjava.micro.dto.shipment.ShipmentAdjustmentTaskData;
import com.madjava.micro.model.shipment.ShipmentAdjustmentTaskModel;

/**
 * @Classname ShipmentAdjustmentTaskConvert
 * @Description 出货调整任务转换器
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Component
@Slf4j
public class ShipmentAdjustmentTaskConvert {

	public ShipmentAdjustmentTaskData convertToData(ShipmentAdjustmentTaskModel shipmentAdjustmentTaskModel) {

		if (shipmentAdjustmentTaskModel == null) {
			return null;
		}
		ShipmentAdjustmentTaskData data = new ShipmentAdjustmentTaskData();
		if (shipmentAdjustmentTaskModel.getId() != null) {
			data.setId(shipmentAdjustmentTaskModel.getId());
		}
		if (shipmentAdjustmentTaskModel.getTopologyId() != null) {
			data.setTopologyId(shipmentAdjustmentTaskModel.getTopologyId());
		}
		if (shipmentAdjustmentTaskModel.getTaskStatus() != null) {
			data.setTaskStatus(shipmentAdjustmentTaskModel.getTaskStatus());
		}
		if (shipmentAdjustmentTaskModel.getAdjustmentQuantity() != null) {
			data.setAdjustmentQuantity(shipmentAdjustmentTaskModel.getAdjustmentQuantity());
		}
		if (shipmentAdjustmentTaskModel.getCurrentQuantity() != null) {
			data.setCurrentQuantity(shipmentAdjustmentTaskModel.getCurrentQuantity());
		}
		if (shipmentAdjustmentTaskModel.getTenantCode() != null) {
			data.setTenantCode(shipmentAdjustmentTaskModel.getTenantCode());
		}
		if (shipmentAdjustmentTaskModel.getCreateTime() != null) {
			data.setCreateTime(shipmentAdjustmentTaskModel.getCreateTime());
		}
		if (shipmentAdjustmentTaskModel.getUpdateTime() != null) {
			data.setUpdateTime(shipmentAdjustmentTaskModel.getUpdateTime());
		}
		if (shipmentAdjustmentTaskModel.getCreateUser() != null) {
			data.setCreateUser(shipmentAdjustmentTaskModel.getCreateUser());
		}
		if (shipmentAdjustmentTaskModel.getUpdateUser() != null) {
			data.setUpdateUser(shipmentAdjustmentTaskModel.getUpdateUser());
		}
		if (shipmentAdjustmentTaskModel.getVersion() != null) {
			data.setVersion(shipmentAdjustmentTaskModel.getVersion());
		}
		return data;
	}

	public ShipmentAdjustmentTaskModel convertToModel(ShipmentAdjustmentTaskData shipmentAdjustmentTaskData) {

		if (shipmentAdjustmentTaskData == null) {
			return null;
		}
		ShipmentAdjustmentTaskModel model = new ShipmentAdjustmentTaskModel();
		if (shipmentAdjustmentTaskData.getId() != null) {
			model.setId(shipmentAdjustmentTaskData.getId());
		}
		if (shipmentAdjustmentTaskData.getTopologyId() != null) {
			model.setTopologyId(shipmentAdjustmentTaskData.getTopologyId());
		}
		if (shipmentAdjustmentTaskData.getTaskStatus() != null) {
			model.setTaskStatus(shipmentAdjustmentTaskData.getTaskStatus());
		}
		if (shipmentAdjustmentTaskData.getAdjustmentQuantity() != null) {
			model.setAdjustmentQuantity(shipmentAdjustmentTaskData.getAdjustmentQuantity());
		}
		if (shipmentAdjustmentTaskData.getCurrentQuantity() != null) {
			model.setCurrentQuantity(shipmentAdjustmentTaskData.getCurrentQuantity());
		}
		if (shipmentAdjustmentTaskData.getTenantCode() != null) {
			model.setTenantCode(shipmentAdjustmentTaskData.getTenantCode());
		}
		if (shipmentAdjustmentTaskData.getCreateTime() != null) {
			model.setCreateTime(shipmentAdjustmentTaskData.getCreateTime());
		}
		if (shipmentAdjustmentTaskData.getUpdateTime() != null) {
			model.setUpdateTime(shipmentAdjustmentTaskData.getUpdateTime());
		}
		if (shipmentAdjustmentTaskData.getCreateUser() != null) {
			model.setCreateUser(shipmentAdjustmentTaskData.getCreateUser());
		}
		if (shipmentAdjustmentTaskData.getUpdateUser() != null) {
			model.setUpdateUser(shipmentAdjustmentTaskData.getUpdateUser());
		}
		if (shipmentAdjustmentTaskData.getVersion() != null) {
			model.setVersion(shipmentAdjustmentTaskData.getVersion());
		}
		return model;
	}

}
