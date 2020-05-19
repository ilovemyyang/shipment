package com.madjava.micro.facade.shipment;

import com.madjava.micro.dto.ResultData;
import com.madjava.micro.dto.shipment.ShipmentAdjustmentTaskData;
import com.madjava.micro.dto.shipment.ShipmentTopologyData;

/**
 * @Classname ShipmentNodeFacade
 * @Description 出货节点Facade层
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
public interface ShipmentNodeFacade {

    /**
     * 保存出货路线拓扑图
     * @param shipmentTopologyData
     * @return
     */
    public ResultData<String> saveTopology(ShipmentTopologyData shipmentTopologyData);
    
    /**
     * 调整节点的保存数量
     * @param shipmentAdjustmentTaskData
     * @return
     */
    public ResultData<String> shipmentAdjust(ShipmentAdjustmentTaskData shipmentAdjustmentTaskData);
}
