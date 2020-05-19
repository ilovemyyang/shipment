package com.madjava.micro.facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.madjava.micro.convert.ShipmentNodeParentLineConvert;
import com.madjava.micro.dto.PageData;
import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.shipment.ShipmentNodeParentLineData;
import com.madjava.micro.facade.shipment.ShipmentNodeParentLineFacade;
import com.madjava.micro.model.shipment.ShipmentNodeParentLineModel;
import com.madjava.micro.service.ShipmentNodeParentLineService;
import com.madjava.micro.utils.Constant;

/**
 * @Classname ShipmentNodeParentLineFacade
 * @Description 节点父节点对应关系表FacadeImpl层
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Component
@Slf4j
public class ShipmentNodeParentLineFacadeImpl implements ShipmentNodeParentLineFacade{

    @Autowired
    private ShipmentNodeParentLineConvert shipmentNodeParentLineConvert;

    @Autowired
    private ShipmentNodeParentLineService shipmentNodeParentLineService;

    /**
     * @param shipmentNodeParentLineData
     * @return
     */
    public boolean save(ShipmentNodeParentLineData shipmentNodeParentLineData) {
            ShipmentNodeParentLineModel model = shipmentNodeParentLineConvert.convertToModel(shipmentNodeParentLineData);
            return shipmentNodeParentLineService.save(model);
    }

}
