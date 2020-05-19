package com.madjava.micro.service;

import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.madjava.micro.model.shipment.ShipmentNodeModel;

/**
 * @Classname ShipmentNodeService
 * @Description 出货节点服务接口
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
public interface ShipmentNodeService extends IService<ShipmentNodeModel> {

    IPage<ShipmentNodeModel> queryPage(Map<String, Object> pageParams, ShipmentNodeModel model);
}

