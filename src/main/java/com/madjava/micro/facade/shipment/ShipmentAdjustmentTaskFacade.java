package com.madjava.micro.facade.shipment;

import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.shipment.ShipmentAdjustmentTaskData;

/**
 * @Classname ShipmentAdjustmentTaskFacade
 * @Description 出货调整任务Facade层
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
public interface ShipmentAdjustmentTaskFacade {



    /**
     * @param shipmentAdjustmentTaskData
     * @return
     */
    public boolean save(ShipmentAdjustmentTaskData shipmentAdjustmentTaskData);

    /**
     * @param shipmentAdjustmentTaskData
     * @return
     */
    public boolean updateById(ShipmentAdjustmentTaskData shipmentAdjustmentTaskData);
}
