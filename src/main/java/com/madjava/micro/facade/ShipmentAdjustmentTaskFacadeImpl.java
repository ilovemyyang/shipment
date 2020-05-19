package com.madjava.micro.facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.madjava.micro.convert.ShipmentAdjustmentTaskConvert;
import com.madjava.micro.dto.PageData;
import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.shipment.ShipmentAdjustmentTaskData;
import com.madjava.micro.enumtype.shipment.ShipmentEnum;
import com.madjava.micro.facade.shipment.ShipmentAdjustmentTaskFacade;
import com.madjava.micro.facade.shipment.ShipmentNodeFacade;
import com.madjava.micro.model.shipment.ShipmentAdjustmentTaskModel;
import com.madjava.micro.service.ShipmentAdjustmentTaskService;
import com.madjava.micro.utils.Constant;

/**
 * @Classname ShipmentAdjustmentTaskFacade
 * @Description 出货调整任务FacadeImpl层
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Component
@Slf4j
public class ShipmentAdjustmentTaskFacadeImpl implements ShipmentAdjustmentTaskFacade{

    @Autowired
    private ShipmentAdjustmentTaskConvert shipmentAdjustmentTaskConvert;

    @Autowired
    private ShipmentAdjustmentTaskService shipmentAdjustmentTaskService;

    @Autowired
    private ShipmentNodeFacade shipmentNodeFacade;
    

    /**
     * TODO 保存前判断是否有正在调整的任务，如果有未完成的任务则不允许提交，后续可以改成异步模式，提交任务，job来处理
     * @param shipmentAdjustmentTaskData
     * @return
     */
    @Transactional
    public boolean save(ShipmentAdjustmentTaskData shipmentAdjustmentTaskData) {
    	//查询最新的一条任务
    	QueryWrapper<ShipmentAdjustmentTaskModel> wrapperTask = new QueryWrapper<>(shipmentAdjustmentTaskConvert.convertToModel(shipmentAdjustmentTaskData));
    	wrapperTask.select("task_status");
    	wrapperTask.orderByDesc(new String[] {"update_time"});
    	wrapperTask.last("limit 1");
    	//查最新的一条任务
    	ShipmentAdjustmentTaskModel taskModel = shipmentAdjustmentTaskService.getOne(wrapperTask);
    	//如果是未执行或者执行中，则拒绝保存
    	if(taskModel != null && 
    			(ShipmentEnum.ShipmentNodeAdjustmentStatus.ADJUSTING.equals(taskModel.getTaskStatus()) 
    					|| ShipmentEnum.ShipmentNodeAdjustmentStatus.SUBMITTED.equals(taskModel.getTaskStatus()))
    					) {
    		return false;
    	}
    	//初始设置状态已提交
    	shipmentAdjustmentTaskData.setTaskStatus(ShipmentEnum.ShipmentNodeAdjustmentStatus.SUBMITTED.getCode());
        ShipmentAdjustmentTaskModel model = shipmentAdjustmentTaskConvert.convertToModel(shipmentAdjustmentTaskData);
        shipmentAdjustmentTaskService.save(model);
        //TODO 可改成RPC调用，异步执行,异步调用调整服务
        shipmentNodeFacade.shipmentAdjust(shipmentAdjustmentTaskConvert.convertToData(model));
        return true;
    }

    /**
     * @param shipmentAdjustmentTaskData
     * @return
     */
    public boolean updateById(ShipmentAdjustmentTaskData shipmentAdjustmentTaskData) {
        ShipmentAdjustmentTaskModel model = shipmentAdjustmentTaskConvert.convertToModel(shipmentAdjustmentTaskData);
        return shipmentAdjustmentTaskService.updateById(model);
    }

}
