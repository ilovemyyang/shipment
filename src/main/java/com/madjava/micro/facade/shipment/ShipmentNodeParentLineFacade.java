package com.madjava.micro.facade.shipment;

import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.shipment.ShipmentNodeParentLineData;

/**
 * @Classname ShipmentNodeParentLineFacade
 * @Description 节点父节点对应关系表Facade层
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
public interface ShipmentNodeParentLineFacade {

    /**
     * @param shipmentNodeParentLineData
     * @return
     */
    public boolean save(ShipmentNodeParentLineData shipmentNodeParentLineData);

}
