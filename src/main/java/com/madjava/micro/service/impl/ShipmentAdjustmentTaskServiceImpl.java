package com.madjava.micro.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madjava.micro.mapper.ShipmentAdjustmentTaskMapper;
import com.madjava.micro.model.shipment.ShipmentAdjustmentTaskModel;
import com.madjava.micro.service.ShipmentAdjustmentTaskService;
import com.madjava.micro.utils.Query;

/**
 * @Classname ShipmentAdjustmentTaskServiceImpl
 * @Description 出货调整任务服务实现类
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Service
public class ShipmentAdjustmentTaskServiceImpl extends ServiceImpl<ShipmentAdjustmentTaskMapper, ShipmentAdjustmentTaskModel> implements ShipmentAdjustmentTaskService {

    @Autowired
    private ShipmentAdjustmentTaskMapper shipmentAdjustmentTaskMapper;

    @Override
    public IPage<ShipmentAdjustmentTaskModel> queryPage(Map<String, Object> pageParams, ShipmentAdjustmentTaskModel shipmentAdjustmentTaskModel) {
        IPage<ShipmentAdjustmentTaskModel> pageRequest = new Query<ShipmentAdjustmentTaskModel>().getPage(pageParams);
        QueryWrapper queryWrapper = new QueryWrapper<ShipmentAdjustmentTaskModel>();

        // 查询条件赋值
        if (shipmentAdjustmentTaskModel.getId() != null) {
            queryWrapper.eq("id", shipmentAdjustmentTaskModel.getId());
        }
        if (shipmentAdjustmentTaskModel.getTopologyId() != null) {
            queryWrapper.eq("topology_id", shipmentAdjustmentTaskModel.getTopologyId());
        }
        if (shipmentAdjustmentTaskModel.getTaskStatus() != null) {
            queryWrapper.eq("task_status", shipmentAdjustmentTaskModel.getTaskStatus());
        }
        if (shipmentAdjustmentTaskModel.getAdjustmentQuantity() != null) {
            queryWrapper.eq("adjustment_quantity", shipmentAdjustmentTaskModel.getAdjustmentQuantity());
        }
        if (shipmentAdjustmentTaskModel.getCurrentQuantity() != null) {
            queryWrapper.eq("current_quantity", shipmentAdjustmentTaskModel.getCurrentQuantity());
        }
        if (shipmentAdjustmentTaskModel.getTenantCode() != null) {
            queryWrapper.eq("tenant_code", shipmentAdjustmentTaskModel.getTenantCode());
        }
        if (shipmentAdjustmentTaskModel.getCreateTime() != null) {
            queryWrapper.eq("create_time", shipmentAdjustmentTaskModel.getCreateTime());
        }
        if (shipmentAdjustmentTaskModel.getUpdateTime() != null) {
            queryWrapper.eq("update_time", shipmentAdjustmentTaskModel.getUpdateTime());
        }
        if (shipmentAdjustmentTaskModel.getCreateUser() != null) {
            queryWrapper.eq("create_user", shipmentAdjustmentTaskModel.getCreateUser());
        }
        if (shipmentAdjustmentTaskModel.getUpdateUser() != null) {
            queryWrapper.eq("update_user", shipmentAdjustmentTaskModel.getUpdateUser());
        }
        if (shipmentAdjustmentTaskModel.getDeleted() != null) {
            queryWrapper.eq("deleted", shipmentAdjustmentTaskModel.getDeleted());
        }
        if (shipmentAdjustmentTaskModel.getVersion() != null) {
            queryWrapper.eq("version", shipmentAdjustmentTaskModel.getVersion());
        }
        IPage<ShipmentAdjustmentTaskModel> page = this.page(pageRequest, queryWrapper);
        return page;
    }

}