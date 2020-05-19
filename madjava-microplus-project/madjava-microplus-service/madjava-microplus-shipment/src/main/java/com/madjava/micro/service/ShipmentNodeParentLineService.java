package com.madjava.micro.service;

import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.madjava.micro.model.shipment.ShipmentNodeParentLineModel;

/**
 * @Classname ShipmentNodeParentLineService
 * @Description 节点父节点对应关系表服务接口
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
public interface ShipmentNodeParentLineService extends IService<ShipmentNodeParentLineModel> {

    IPage<ShipmentNodeParentLineModel> queryPage(Map<String, Object> pageParams, ShipmentNodeParentLineModel model);
}

