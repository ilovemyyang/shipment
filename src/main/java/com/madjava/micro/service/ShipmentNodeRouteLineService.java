package com.madjava.micro.service;

import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.madjava.micro.model.shipment.ShipmentNodeRouteLineModel;

/**
 * @Classname ShipmentNodeRouteLineService
 * @Description 节点路由关系表服务接口
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
public interface ShipmentNodeRouteLineService extends IService<ShipmentNodeRouteLineModel> {

    IPage<ShipmentNodeRouteLineModel> queryPage(Map<String, Object> pageParams, ShipmentNodeRouteLineModel model);
}

