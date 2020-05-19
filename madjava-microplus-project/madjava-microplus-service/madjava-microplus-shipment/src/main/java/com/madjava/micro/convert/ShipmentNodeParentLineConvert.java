package com.madjava.micro.convert;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

import com.madjava.micro.dto.shipment.ShipmentNodeParentLineData;
import com.madjava.micro.model.shipment.ShipmentNodeParentLineModel;

/**
 * @Classname ShipmentNodeParentLineConvert
 * @Description 节点父节点对应关系表转换器
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Component
@Slf4j
public class ShipmentNodeParentLineConvert {

	public ShipmentNodeParentLineData convertToData(ShipmentNodeParentLineModel shipmentNodeParentLineModel) {

		if (shipmentNodeParentLineModel == null) {
			return null;
		}
		ShipmentNodeParentLineData data = new ShipmentNodeParentLineData();
		if (shipmentNodeParentLineModel.getId() != null) {
			data.setId(shipmentNodeParentLineModel.getId());
		}
		if (shipmentNodeParentLineModel.getTopologyId() != null) {
			data.setTopologyId(shipmentNodeParentLineModel.getTopologyId());
		}
		if (shipmentNodeParentLineModel.getNodeId() != null) {
			data.setNodeId(shipmentNodeParentLineModel.getNodeId());
		}
		if (shipmentNodeParentLineModel.getParentNodeId() != null) {
			data.setParentNodeId(shipmentNodeParentLineModel.getParentNodeId());
		}
		if (shipmentNodeParentLineModel.getParentProportion() != null) {
			data.setParentProportion(shipmentNodeParentLineModel.getParentProportion());
		}
		if (shipmentNodeParentLineModel.getTenantCode() != null) {
			data.setTenantCode(shipmentNodeParentLineModel.getTenantCode());
		}
		if (shipmentNodeParentLineModel.getCreateTime() != null) {
			data.setCreateTime(shipmentNodeParentLineModel.getCreateTime());
		}
		if (shipmentNodeParentLineModel.getUpdateTime() != null) {
			data.setUpdateTime(shipmentNodeParentLineModel.getUpdateTime());
		}
		if (shipmentNodeParentLineModel.getCreateUser() != null) {
			data.setCreateUser(shipmentNodeParentLineModel.getCreateUser());
		}
		if (shipmentNodeParentLineModel.getUpdateUser() != null) {
			data.setUpdateUser(shipmentNodeParentLineModel.getUpdateUser());
		}
		if (shipmentNodeParentLineModel.getVersion() != null) {
			data.setVersion(shipmentNodeParentLineModel.getVersion());
		}
		return data;
	}

	public ShipmentNodeParentLineModel convertToModel(ShipmentNodeParentLineData shipmentNodeParentLineData) {

		if (shipmentNodeParentLineData == null) {
			return null;
		}
		ShipmentNodeParentLineModel model = new ShipmentNodeParentLineModel();
		if (shipmentNodeParentLineData.getId() != null) {
			model.setId(shipmentNodeParentLineData.getId());
		}
		if (shipmentNodeParentLineData.getTopologyId() != null) {
			model.setTopologyId(shipmentNodeParentLineData.getTopologyId());
		}
		if (shipmentNodeParentLineData.getNodeId() != null) {
			model.setNodeId(shipmentNodeParentLineData.getNodeId());
		}
		if (shipmentNodeParentLineData.getParentNodeId() != null) {
			model.setParentNodeId(shipmentNodeParentLineData.getParentNodeId());
		}
		if (shipmentNodeParentLineData.getParentProportion() != null) {
			model.setParentProportion(shipmentNodeParentLineData.getParentProportion());
		}
		if (shipmentNodeParentLineData.getTenantCode() != null) {
			model.setTenantCode(shipmentNodeParentLineData.getTenantCode());
		}
		if (shipmentNodeParentLineData.getCreateTime() != null) {
			model.setCreateTime(shipmentNodeParentLineData.getCreateTime());
		}
		if (shipmentNodeParentLineData.getUpdateTime() != null) {
			model.setUpdateTime(shipmentNodeParentLineData.getUpdateTime());
		}
		if (shipmentNodeParentLineData.getCreateUser() != null) {
			model.setCreateUser(shipmentNodeParentLineData.getCreateUser());
		}
		if (shipmentNodeParentLineData.getUpdateUser() != null) {
			model.setUpdateUser(shipmentNodeParentLineData.getUpdateUser());
		}
		if (shipmentNodeParentLineData.getVersion() != null) {
			model.setVersion(shipmentNodeParentLineData.getVersion());
		}
		return model;
	}

}
