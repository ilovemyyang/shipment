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

}
