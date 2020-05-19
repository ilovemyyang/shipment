package com.madjava.micro.convert;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

import com.madjava.micro.dto.shipment.ShipmentNodeRouteLineData;
import com.madjava.micro.model.shipment.ShipmentNodeRouteLineModel;

/**
 * @Classname ShipmentNodeRouteLineConvert
 * @Description 节点路由关系表转换器
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Component
@Slf4j
public class ShipmentNodeRouteLineConvert {

	public ShipmentNodeRouteLineData convertToData(ShipmentNodeRouteLineModel shipmentNodeRouteLineModel) {

		if (shipmentNodeRouteLineModel == null) {
			return null;
		}
		ShipmentNodeRouteLineData data = new ShipmentNodeRouteLineData();
		if (shipmentNodeRouteLineModel.getId() != null) {
			data.setId(shipmentNodeRouteLineModel.getId());
		}
		if (shipmentNodeRouteLineModel.getTopologyId() != null) {
			data.setTopologyId(shipmentNodeRouteLineModel.getTopologyId());
		}
		if (shipmentNodeRouteLineModel.getNodeId() != null) {
			data.setNodeId(shipmentNodeRouteLineModel.getNodeId());
		}
		if (shipmentNodeRouteLineModel.getRouteNodeId() != null) {
			data.setRouteNodeId(shipmentNodeRouteLineModel.getRouteNodeId());
		}
		if (shipmentNodeRouteLineModel.getRouteFloorNumber() != null) {
			data.setRouteFloorNumber(shipmentNodeRouteLineModel.getRouteFloorNumber());
		}
		if (shipmentNodeRouteLineModel.getTenantCode() != null) {
			data.setTenantCode(shipmentNodeRouteLineModel.getTenantCode());
		}
		if (shipmentNodeRouteLineModel.getCreateTime() != null) {
			data.setCreateTime(shipmentNodeRouteLineModel.getCreateTime());
		}
		if (shipmentNodeRouteLineModel.getUpdateTime() != null) {
			data.setUpdateTime(shipmentNodeRouteLineModel.getUpdateTime());
		}
		if (shipmentNodeRouteLineModel.getCreateUser() != null) {
			data.setCreateUser(shipmentNodeRouteLineModel.getCreateUser());
		}
		if (shipmentNodeRouteLineModel.getUpdateUser() != null) {
			data.setUpdateUser(shipmentNodeRouteLineModel.getUpdateUser());
		}
		if (shipmentNodeRouteLineModel.getVersion() != null) {
			data.setVersion(shipmentNodeRouteLineModel.getVersion());
		}
		return data;
	}

	public ShipmentNodeRouteLineModel convertToModel(ShipmentNodeRouteLineData shipmentNodeRouteLineData) {

		if (shipmentNodeRouteLineData == null) {
			return null;
		}
		ShipmentNodeRouteLineModel model = new ShipmentNodeRouteLineModel();
		if (shipmentNodeRouteLineData.getId() != null) {
			model.setId(shipmentNodeRouteLineData.getId());
		}
		if (shipmentNodeRouteLineData.getTopologyId() != null) {
			model.setTopologyId(shipmentNodeRouteLineData.getTopologyId());
		}
		if (shipmentNodeRouteLineData.getNodeId() != null) {
			model.setNodeId(shipmentNodeRouteLineData.getNodeId());
		}
		if (shipmentNodeRouteLineData.getRouteNodeId() != null) {
			model.setRouteNodeId(shipmentNodeRouteLineData.getRouteNodeId());
		}
		if (shipmentNodeRouteLineData.getRouteFloorNumber() != null) {
			model.setRouteFloorNumber(shipmentNodeRouteLineData.getRouteFloorNumber());
		}
		if (shipmentNodeRouteLineData.getTenantCode() != null) {
			model.setTenantCode(shipmentNodeRouteLineData.getTenantCode());
		}
		if (shipmentNodeRouteLineData.getCreateTime() != null) {
			model.setCreateTime(shipmentNodeRouteLineData.getCreateTime());
		}
		if (shipmentNodeRouteLineData.getUpdateTime() != null) {
			model.setUpdateTime(shipmentNodeRouteLineData.getUpdateTime());
		}
		if (shipmentNodeRouteLineData.getCreateUser() != null) {
			model.setCreateUser(shipmentNodeRouteLineData.getCreateUser());
		}
		if (shipmentNodeRouteLineData.getUpdateUser() != null) {
			model.setUpdateUser(shipmentNodeRouteLineData.getUpdateUser());
		}
		if (shipmentNodeRouteLineData.getVersion() != null) {
			model.setVersion(shipmentNodeRouteLineData.getVersion());
		}
		return model;
	}

}
