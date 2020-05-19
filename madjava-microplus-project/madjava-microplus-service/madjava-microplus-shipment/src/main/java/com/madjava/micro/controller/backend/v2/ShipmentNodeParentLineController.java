package com.madjava.micro.controller.backend.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.ResultData;
import com.madjava.micro.dto.shipment.ShipmentNodeParentLineData;
import com.madjava.micro.enumtype.MessageEnum;
import com.madjava.micro.facade.shipment.ShipmentNodeParentLineFacade;
import com.madjava.micro.service.ShipmentNodeParentLineService;

/**
 * @Classname ShipmentNodeParentLineController
 * @Description 节点父节点对应关系表控制器
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@RestController
@RequestMapping("/shipmentnodeparentline")
public class ShipmentNodeParentLineController {

    @Autowired
    private ShipmentNodeParentLineService shipmentNodeParentLineService;

    @Autowired
    private ShipmentNodeParentLineFacade shipmentNodeParentLineFacade;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResultData<PageResponseData<ShipmentNodeParentLineData>> list(Integer pageNo,
                    Integer pageSize,
                    String orderFiled,
                    @RequestParam(value="isAsc", required = false, defaultValue = "fasle") boolean isAsc,
                    ShipmentNodeParentLineData shipmentNodeParentLineData){
        PageResponseData<ShipmentNodeParentLineData> pageResponseData = shipmentNodeParentLineFacade.selectPage(pageNo, pageSize, orderFiled, isAsc, shipmentNodeParentLineData);
        return new ResultData<PageResponseData<ShipmentNodeParentLineData>>(pageResponseData,MessageEnum.SUCCESS);
    }


    /**
     * 信息
     */
    @GetMapping("/info")
    public ResultData<ShipmentNodeParentLineData> info(@RequestParam(value="id", required = true)  String id){

        ShipmentNodeParentLineData shipmentNodeParentLineData = shipmentNodeParentLineFacade.getById(id);
        return new ResultData<>(shipmentNodeParentLineData, MessageEnum.SUCCESS);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResultData<String> save(@RequestBody ShipmentNodeParentLineData shipmentNodeParentLineData){
		shipmentNodeParentLineFacade.save(shipmentNodeParentLineData);

        return new ResultData<>(null, MessageEnum.SUCCESS);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResultData<String> update(@RequestBody ShipmentNodeParentLineData shipmentNodeParentLineData){
        shipmentNodeParentLineFacade.updateById(shipmentNodeParentLineData);

        return new ResultData<>(null, MessageEnum.SUCCESS);
    }

    /**
     * 删除
     */
    @PostMapping("/batch/delete")
    public ResultData<String> batchDelete(@RequestBody String ids){
		shipmentNodeParentLineFacade.removeByIds(ids.split(","));

        return new ResultData<>(null, MessageEnum.SUCCESS);
    }

    @PostMapping("/delete")
    public ResultData<String> delete(@RequestParam(value="id", required = true) String id){
        shipmentNodeParentLineService.removeById(id);
        return new ResultData<>(null, MessageEnum.SUCCESS);
    }
}
