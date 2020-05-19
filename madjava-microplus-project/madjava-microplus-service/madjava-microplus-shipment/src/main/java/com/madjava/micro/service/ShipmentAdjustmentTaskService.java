package com.madjava.micro.service;

import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.madjava.micro.model.shipment.ShipmentAdjustmentTaskModel;

/**
 * @Classname ShipmentAdjustmentTaskService
 * @Description 出货调整任务服务接口
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
public interface ShipmentAdjustmentTaskService extends IService<ShipmentAdjustmentTaskModel> {

    IPage<ShipmentAdjustmentTaskModel> queryPage(Map<String, Object> pageParams, ShipmentAdjustmentTaskModel model);
}

