package com.madjava.micro.controller.backend.v2;

import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.ResultData;
import com.madjava.micro.dto.shipment.ShipmentAdjustmentTaskData;
import com.madjava.micro.enumtype.MessageEnum;
import com.madjava.micro.facade.shipment.ShipmentAdjustmentTaskFacade;
import com.madjava.micro.service.ShipmentAdjustmentTaskService;

/**
 * @Classname ShipmentAdjustmentTaskController
 * @Description 出货调整任务控制器
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@RestController
@RequestMapping("/shipmentadjustmenttask")
public class ShipmentAdjustmentTaskController {

    @Autowired
    private ShipmentAdjustmentTaskService shipmentAdjustmentTaskService;

    @Autowired
    private ShipmentAdjustmentTaskFacade shipmentAdjustmentTaskFacade;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResultData<PageResponseData<ShipmentAdjustmentTaskData>> list(Integer pageNo,
                    Integer pageSize,
                    String orderFiled,
                    @RequestParam(value="isAsc", required = false, defaultValue = "fasle") boolean isAsc,
                    ShipmentAdjustmentTaskData shipmentAdjustmentTaskData){
        PageResponseData<ShipmentAdjustmentTaskData> pageResponseData = shipmentAdjustmentTaskFacade.selectPage(pageNo, pageSize, orderFiled, isAsc, shipmentAdjustmentTaskData);
        return new ResultData<PageResponseData<ShipmentAdjustmentTaskData>>(pageResponseData,MessageEnum.SUCCESS);
    }


    /**
     * 信息
     */
    @GetMapping("/info")
    public ResultData<ShipmentAdjustmentTaskData> info(@RequestParam(value="id", required = true)  String id){

        ShipmentAdjustmentTaskData shipmentAdjustmentTaskData = shipmentAdjustmentTaskFacade.getById(id);
        return new ResultData<>(shipmentAdjustmentTaskData, MessageEnum.SUCCESS);
    }

    /**
     * 保存
     */
    @ApiOperation("保存前判断是否有正在调整的任务，如果有未完成的任务则不允许提交，后续可以改成异步模式，提交任务，job来处理，目前为同步模式")
    @PostMapping("/save")
    public ResultData<String> save(@RequestBody ShipmentAdjustmentTaskData shipmentAdjustmentTaskData){
    	boolean saveResult = shipmentAdjustmentTaskFacade.save(shipmentAdjustmentTaskData);
    	if(!saveResult) {
    		return new ResultData<>(null, MessageEnum.SYSTEM_ERROR);
    	}
        return new ResultData<>(null, MessageEnum.SUCCESS);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResultData<String> update(@RequestBody ShipmentAdjustmentTaskData shipmentAdjustmentTaskData){
        shipmentAdjustmentTaskFacade.updateById(shipmentAdjustmentTaskData);

        return new ResultData<>(null, MessageEnum.SUCCESS);
    }

    /**
     * 删除
     */
    @PostMapping("/batch/delete")
    public ResultData<String> batchDelete(@RequestBody String ids){
		shipmentAdjustmentTaskFacade.removeByIds(ids.split(","));

        return new ResultData<>(null, MessageEnum.SUCCESS);
    }

    @PostMapping("/delete")
    public ResultData<String> delete(@RequestParam(value="id", required = true) String id){
        shipmentAdjustmentTaskService.removeById(id);
        return new ResultData<>(null, MessageEnum.SUCCESS);
    }
    
}
