package com.madjava.micro.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madjava.micro.mapper.ShipmentNodeRouteLineMapper;
import com.madjava.micro.model.shipment.ShipmentNodeRouteLineModel;
import com.madjava.micro.service.ShipmentNodeRouteLineService;
import com.madjava.micro.utils.Query;

/**
 * @Classname ShipmentNodeRouteLineServiceImpl
 * @Description 节点路由关系表服务实现类
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Service
public class ShipmentNodeRouteLineServiceImpl extends ServiceImpl<ShipmentNodeRouteLineMapper, ShipmentNodeRouteLineModel> implements ShipmentNodeRouteLineService {

    @Autowired
    private ShipmentNodeRouteLineMapper shipmentNodeRouteLineMapper;

    @Override
    public IPage<ShipmentNodeRouteLineModel> queryPage(Map<String, Object> pageParams, ShipmentNodeRouteLineModel shipmentNodeRouteLineModel) {
        IPage<ShipmentNodeRouteLineModel> pageRequest = new Query<ShipmentNodeRouteLineModel>().getPage(pageParams);
        QueryWrapper queryWrapper = new QueryWrapper<ShipmentNodeRouteLineModel>();

        // 查询条件赋值
        if (shipmentNodeRouteLineModel.getId() != null) {
            queryWrapper.eq("id", shipmentNodeRouteLineModel.getId());
        }
        if (shipmentNodeRouteLineModel.getTopologyId() != null) {
            queryWrapper.eq("topology_id", shipmentNodeRouteLineModel.getTopologyId());
        }
        if (shipmentNodeRouteLineModel.getNodeId() != null) {
            queryWrapper.eq("node_id", shipmentNodeRouteLineModel.getNodeId());
        }
        if (shipmentNodeRouteLineModel.getRouteNodeId() != null) {
            queryWrapper.eq("route_node_id", shipmentNodeRouteLineModel.getRouteNodeId());
        }
        if (shipmentNodeRouteLineModel.getRouteFloorNumber() != null) {
            queryWrapper.eq("route_floor_number", shipmentNodeRouteLineModel.getRouteFloorNumber());
        }
        if (shipmentNodeRouteLineModel.getTenantCode() != null) {
            queryWrapper.eq("tenant_code", shipmentNodeRouteLineModel.getTenantCode());
        }
        if (shipmentNodeRouteLineModel.getCreateTime() != null) {
            queryWrapper.eq("create_time", shipmentNodeRouteLineModel.getCreateTime());
        }
        if (shipmentNodeRouteLineModel.getUpdateTime() != null) {
            queryWrapper.eq("update_time", shipmentNodeRouteLineModel.getUpdateTime());
        }
        if (shipmentNodeRouteLineModel.getCreateUser() != null) {
            queryWrapper.eq("create_user", shipmentNodeRouteLineModel.getCreateUser());
        }
        if (shipmentNodeRouteLineModel.getUpdateUser() != null) {
            queryWrapper.eq("update_user", shipmentNodeRouteLineModel.getUpdateUser());
        }
        if (shipmentNodeRouteLineModel.getDeleted() != null) {
            queryWrapper.eq("deleted", shipmentNodeRouteLineModel.getDeleted());
        }
        if (shipmentNodeRouteLineModel.getVersion() != null) {
            queryWrapper.eq("version", shipmentNodeRouteLineModel.getVersion());
        }
        IPage<ShipmentNodeRouteLineModel> page = this.page(pageRequest, queryWrapper);
        return page;
    }

}