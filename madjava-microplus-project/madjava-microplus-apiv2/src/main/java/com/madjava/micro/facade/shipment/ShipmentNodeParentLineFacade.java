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
    public PageResponseData<ShipmentNodeParentLineData> selectPage(Integer pageNo, Integer pageSize, String orderFiled,
                                boolean isAsc, ShipmentNodeParentLineData shipmentNodeParentLineData);

    /**
     * @param shipmentNodeParentLineData
     * @return
     */
    public boolean save(ShipmentNodeParentLineData shipmentNodeParentLineData);

    /**
     * @param shipmentNodeParentLineData
     * @return
     */
    public boolean updateById(ShipmentNodeParentLineData shipmentNodeParentLineData);

    /**
     * @param ids
     * @return
     */
    public boolean removeByIds(String[] ids);

    /**
     * @param id
     * @return
     */
    public boolean removeByIds(String id);

    /**
     * @param id
     * @return
     */
    public ShipmentNodeParentLineData getById(String id);
}
