package com.madjava.micro.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madjava.micro.mapper.ShipmentNodeParentLineMapper;
import com.madjava.micro.model.shipment.ShipmentNodeParentLineModel;
import com.madjava.micro.service.ShipmentNodeParentLineService;
import com.madjava.micro.utils.Query;

/**
 * @Classname ShipmentNodeParentLineServiceImpl
 * @Description 节点父节点对应关系表服务实现类
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Service
public class ShipmentNodeParentLineServiceImpl extends ServiceImpl<ShipmentNodeParentLineMapper, ShipmentNodeParentLineModel> implements ShipmentNodeParentLineService {

    @Autowired
    private ShipmentNodeParentLineMapper shipmentNodeParentLineMapper;

    @Override
    public IPage<ShipmentNodeParentLineModel> queryPage(Map<String, Object> pageParams, ShipmentNodeParentLineModel shipmentNodeParentLineModel) {
        IPage<ShipmentNodeParentLineModel> pageRequest = new Query<ShipmentNodeParentLineModel>().getPage(pageParams);
        QueryWrapper queryWrapper = new QueryWrapper<ShipmentNodeParentLineModel>();

        // 查询条件赋值
        if (shipmentNodeParentLineModel.getId() != null) {
            queryWrapper.eq("id", shipmentNodeParentLineModel.getId());
        }
        if (shipmentNodeParentLineModel.getTopologyId() != null) {
            queryWrapper.eq("topology_id", shipmentNodeParentLineModel.getTopologyId());
        }
        if (shipmentNodeParentLineModel.getNodeId() != null) {
            queryWrapper.eq("node_id", shipmentNodeParentLineModel.getNodeId());
        }
        if (shipmentNodeParentLineModel.getParentNodeId() != null) {
            queryWrapper.eq("parent_node_id", shipmentNodeParentLineModel.getParentNodeId());
        }
        if (shipmentNodeParentLineModel.getParentProportion() != null) {
            queryWrapper.eq("parent_proportion", shipmentNodeParentLineModel.getParentProportion());
        }
        if (shipmentNodeParentLineModel.getTenantCode() != null) {
            queryWrapper.eq("tenant_code", shipmentNodeParentLineModel.getTenantCode());
        }
        if (shipmentNodeParentLineModel.getCreateTime() != null) {
            queryWrapper.eq("create_time", shipmentNodeParentLineModel.getCreateTime());
        }
        if (shipmentNodeParentLineModel.getUpdateTime() != null) {
            queryWrapper.eq("update_time", shipmentNodeParentLineModel.getUpdateTime());
        }
        if (shipmentNodeParentLineModel.getCreateUser() != null) {
            queryWrapper.eq("create_user", shipmentNodeParentLineModel.getCreateUser());
        }
        if (shipmentNodeParentLineModel.getUpdateUser() != null) {
            queryWrapper.eq("update_user", shipmentNodeParentLineModel.getUpdateUser());
        }
        if (shipmentNodeParentLineModel.getDeleted() != null) {
            queryWrapper.eq("deleted", shipmentNodeParentLineModel.getDeleted());
        }
        if (shipmentNodeParentLineModel.getVersion() != null) {
            queryWrapper.eq("version", shipmentNodeParentLineModel.getVersion());
        }
        IPage<ShipmentNodeParentLineModel> page = this.page(pageRequest, queryWrapper);
        return page;
    }

}