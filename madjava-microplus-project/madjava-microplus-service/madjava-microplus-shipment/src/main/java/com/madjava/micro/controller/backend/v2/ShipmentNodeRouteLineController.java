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
import com.madjava.micro.dto.shipment.ShipmentNodeRouteLineData;
import com.madjava.micro.enumtype.MessageEnum;
import com.madjava.micro.facade.shipment.ShipmentNodeRouteLineFacade;
import com.madjava.micro.service.ShipmentNodeRouteLineService;

/**
 * @Classname ShipmentNodeRouteLineController
 * @Description 节点路由关系表控制器
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@RestController
@RequestMapping("/shipmentnoderouteline")
public class ShipmentNodeRouteLineController {

    @Autowired
    private ShipmentNodeRouteLineService shipmentNodeRouteLineService;

    @Autowired
    private ShipmentNodeRouteLineFacade shipmentNodeRouteLineFacade;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResultData<PageResponseData<ShipmentNodeRouteLineData>> list(Integer pageNo,
                    Integer pageSize,
                    String orderFiled,
                    @RequestParam(value="isAsc", required = false, defaultValue = "fasle") boolean isAsc,
                    ShipmentNodeRouteLineData shipmentNodeRouteLineData){
        PageResponseData<ShipmentNodeRouteLineData> pageResponseData = shipmentNodeRouteLineFacade.selectPage(pageNo, pageSize, orderFiled, isAsc, shipmentNodeRouteLineData);
        return new ResultData<PageResponseData<ShipmentNodeRouteLineData>>(pageResponseData,MessageEnum.SUCCESS);
    }


    /**
     * 信息
     */
    @GetMapping("/info")
    public ResultData<ShipmentNodeRouteLineData> info(@RequestParam(value="id", required = true)  String id){

        ShipmentNodeRouteLineData shipmentNodeRouteLineData = shipmentNodeRouteLineFacade.getById(id);
        return new ResultData<>(shipmentNodeRouteLineData, MessageEnum.SUCCESS);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResultData<String> save(@RequestBody ShipmentNodeRouteLineData shipmentNodeRouteLineData){
		shipmentNodeRouteLineFacade.save(shipmentNodeRouteLineData);

        return new ResultData<>(null, MessageEnum.SUCCESS);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResultData<String> update(@RequestBody ShipmentNodeRouteLineData shipmentNodeRouteLineData){
        shipmentNodeRouteLineFacade.updateById(shipmentNodeRouteLineData);

        return new ResultData<>(null, MessageEnum.SUCCESS);
    }

    /**
     * 删除
     */
    @PostMapping("/batch/delete")
    public ResultData<String> batchDelete(@RequestBody String ids){
		shipmentNodeRouteLineFacade.removeByIds(ids.split(","));

        return new ResultData<>(null, MessageEnum.SUCCESS);
    }

    @PostMapping("/delete")
    public ResultData<String> delete(@RequestParam(value="id", required = true) String id){
        shipmentNodeRouteLineService.removeById(id);
        return new ResultData<>(null, MessageEnum.SUCCESS);
    }
}
