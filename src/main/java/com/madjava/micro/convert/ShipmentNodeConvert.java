package com.madjava.micro.convert;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

import com.madjava.micro.dto.shipment.ShipmentNodeData;
import com.madjava.micro.model.shipment.ShipmentNodeModel;

/**
 * @Classname ShipmentNodeConvert
 * @Description 出货节点转换器
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Component
@Slf4j
public class ShipmentNodeConvert {

	public ShipmentNodeData convertToData(ShipmentNodeModel shipmentNodeModel) {

		if (shipmentNodeModel == null) {
			return null;
		}
		ShipmentNodeData data = new ShipmentNodeData();
		if (shipmentNodeModel.getId() != null) {
			data.setId(shipmentNodeModel.getId());
		}
		if (shipmentNodeModel.getTopologyId() != null) {
			data.setTopologyId(shipmentNodeModel.getTopologyId());
		}
		if (shipmentNodeModel.getNodeName() != null) {
			data.setNodeName(shipmentNodeModel.getNodeName());
		}
		if (shipmentNodeModel.getFloorNumber() != null) {
			data.setFloorNumber(shipmentNodeModel.getFloorNumber());
		}
		if (shipmentNodeModel.getNodeStatus() != null) {
			data.setNodeStatus(shipmentNodeModel.getNodeStatus());
		}
		if (shipmentNodeModel.getAdjustmentStatus() != null) {
			data.setAdjustmentStatus(shipmentNodeModel.getAdjustmentStatus());
		}
		if (shipmentNodeModel.getProportion() != null) {
			data.setProportion(shipmentNodeModel.getProportion());
		}
		if (shipmentNodeModel.getQuantityFormula() != null) {
			data.setQuantityFormula(shipmentNodeModel.getQuantityFormula());
		}
		if (shipmentNodeModel.getCurrentQuantity() != null) {
			data.setCurrentQuantity(shipmentNodeModel.getCurrentQuantity());
		}
		if (shipmentNodeModel.getTenantCode() != null) {
			data.setTenantCode(shipmentNodeModel.getTenantCode());
		}
		if (shipmentNodeModel.getCreateTime() != null) {
			data.setCreateTime(shipmentNodeModel.getCreateTime());
		}
		if (shipmentNodeModel.getUpdateTime() != null) {
			data.setUpdateTime(shipmentNodeModel.getUpdateTime());
		}
		if (shipmentNodeModel.getCreateUser() != null) {
			data.setCreateUser(shipmentNodeModel.getCreateUser());
		}
		if (shipmentNodeModel.getUpdateUser() != null) {
			data.setUpdateUser(shipmentNodeModel.getUpdateUser());
		}
		if (shipmentNodeModel.getVersion() != null) {
			data.setVersion(shipmentNodeModel.getVersion());
		}
		return data;
	}

	public ShipmentNodeModel convertToModel(ShipmentNodeData shipmentNodeData) {

		if (shipmentNodeData == null) {
			return null;
		}
		ShipmentNodeModel model = new ShipmentNodeModel();
		if (shipmentNodeData.getId() != null) {
			model.setId(shipmentNodeData.getId());
		}
		if (shipmentNodeData.getTopologyId() != null) {
			model.setTopologyId(shipmentNodeData.getTopologyId());
		}
		if (shipmentNodeData.getNodeName() != null) {
			model.setNodeName(shipmentNodeData.getNodeName());
		}
		if (shipmentNodeData.getFloorNumber() != null) {
			model.setFloorNumber(shipmentNodeData.getFloorNumber());
		}
		if (shipmentNodeData.getNodeStatus() != null) {
			model.setNodeStatus(shipmentNodeData.getNodeStatus());
		}
		if (shipmentNodeData.getAdjustmentStatus() != null) {
			model.setAdjustmentStatus(shipmentNodeData.getAdjustmentStatus());
		}
		if (shipmentNodeData.getProportion() != null) {
			model.setProportion(shipmentNodeData.getProportion());
		}
		if (shipmentNodeData.getQuantityFormula() != null) {
			model.setQuantityFormula(shipmentNodeData.getQuantityFormula());
		}
		if (shipmentNodeData.getCurrentQuantity() != null) {
			model.setCurrentQuantity(shipmentNodeData.getCurrentQuantity());
		}
		if (shipmentNodeData.getTenantCode() != null) {
			model.setTenantCode(shipmentNodeData.getTenantCode());
		}
		if (shipmentNodeData.getCreateTime() != null) {
			model.setCreateTime(shipmentNodeData.getCreateTime());
		}
		if (shipmentNodeData.getUpdateTime() != null) {
			model.setUpdateTime(shipmentNodeData.getUpdateTime());
		}
		if (shipmentNodeData.getCreateUser() != null) {
			model.setCreateUser(shipmentNodeData.getCreateUser());
		}
		if (shipmentNodeData.getUpdateUser() != null) {
			model.setUpdateUser(shipmentNodeData.getUpdateUser());
		}
		if (shipmentNodeData.getVersion() != null) {
			model.setVersion(shipmentNodeData.getVersion());
		}
		return model;
	}

}
