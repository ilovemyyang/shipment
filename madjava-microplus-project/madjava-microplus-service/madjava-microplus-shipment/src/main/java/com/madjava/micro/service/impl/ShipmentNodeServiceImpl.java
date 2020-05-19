package com.madjava.micro.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madjava.micro.mapper.ShipmentNodeMapper;
import com.madjava.micro.model.shipment.ShipmentNodeModel;
import com.madjava.micro.service.ShipmentNodeService;
import com.madjava.micro.utils.Query;

/**
 * @Classname ShipmentNodeServiceImpl
 * @Description 出货节点服务实现类
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Service
public class ShipmentNodeServiceImpl extends ServiceImpl<ShipmentNodeMapper, ShipmentNodeModel> implements ShipmentNodeService {

    @Autowired
    private ShipmentNodeMapper shipmentNodeMapper;

    @Override
    public IPage<ShipmentNodeModel> queryPage(Map<String, Object> pageParams, ShipmentNodeModel shipmentNodeModel) {
        IPage<ShipmentNodeModel> pageRequest = new Query<ShipmentNodeModel>().getPage(pageParams);
        QueryWrapper queryWrapper = new QueryWrapper<ShipmentNodeModel>();

        // 查询条件赋值
        if (shipmentNodeModel.getId() != null) {
            queryWrapper.eq("id", shipmentNodeModel.getId());
        }
        if (shipmentNodeModel.getTopologyId() != null) {
            queryWrapper.eq("topology_id", shipmentNodeModel.getTopologyId());
        }
        if (shipmentNodeModel.getNodeName() != null) {
            queryWrapper.like("node_name", shipmentNodeModel.getNodeName());
        }
        if (shipmentNodeModel.getFloorNumber() != null) {
            queryWrapper.eq("floor_number", shipmentNodeModel.getFloorNumber());
        }
        if (shipmentNodeModel.getNodeStatus() != null) {
            queryWrapper.eq("node_status", shipmentNodeModel.getNodeStatus());
        }
        if (shipmentNodeModel.getAdjustmentStatus() != null) {
            queryWrapper.eq("adjustment_status", shipmentNodeModel.getAdjustmentStatus());
        }
        if (shipmentNodeModel.getProportion() != null) {
            queryWrapper.eq("proportion", shipmentNodeModel.getProportion());
        }
        if (shipmentNodeModel.getQuantityFormula() != null) {
            queryWrapper.eq("quantity_formula", shipmentNodeModel.getQuantityFormula());
        }
        if (shipmentNodeModel.getCurrentQuantity() != null) {
            queryWrapper.eq("current_quantity", shipmentNodeModel.getCurrentQuantity());
        }
        if (shipmentNodeModel.getTenantCode() != null) {
            queryWrapper.eq("tenant_code", shipmentNodeModel.getTenantCode());
        }
        if (shipmentNodeModel.getCreateTime() != null) {
            queryWrapper.eq("create_time", shipmentNodeModel.getCreateTime());
        }
        if (shipmentNodeModel.getUpdateTime() != null) {
            queryWrapper.eq("update_time", shipmentNodeModel.getUpdateTime());
        }
        if (shipmentNodeModel.getCreateUser() != null) {
            queryWrapper.eq("create_user", shipmentNodeModel.getCreateUser());
        }
        if (shipmentNodeModel.getUpdateUser() != null) {
            queryWrapper.eq("update_user", shipmentNodeModel.getUpdateUser());
        }
        if (shipmentNodeModel.getDeleted() != null) {
            queryWrapper.eq("deleted", shipmentNodeModel.getDeleted());
        }
        if (shipmentNodeModel.getVersion() != null) {
            queryWrapper.eq("version", shipmentNodeModel.getVersion());
        }
        IPage<ShipmentNodeModel> page = this.page(pageRequest, queryWrapper);
        return page;
    }

}