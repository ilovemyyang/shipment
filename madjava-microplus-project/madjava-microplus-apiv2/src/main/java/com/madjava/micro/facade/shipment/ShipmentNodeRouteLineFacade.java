package com.madjava.micro.facade.shipment;

import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.shipment.ShipmentNodeRouteLineData;

/**
 * @Classname ShipmentNodeRouteLineFacade
 * @Description 节点路由关系表Facade层
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
public interface ShipmentNodeRouteLineFacade {


    /**
     * @param shipmentNodeRouteLineData
     * @return
     */
    public PageResponseData<ShipmentNodeRouteLineData> selectPage(Integer pageNo, Integer pageSize, String orderFiled,
                                boolean isAsc, ShipmentNodeRouteLineData shipmentNodeRouteLineData);

    /**
     * @param shipmentNodeRouteLineData
     * @return
     */
    public boolean save(ShipmentNodeRouteLineData shipmentNodeRouteLineData);

    /**
     * @param shipmentNodeRouteLineData
     * @return
     */
    public boolean updateById(ShipmentNodeRouteLineData shipmentNodeRouteLineData);

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
    public ShipmentNodeRouteLineData getById(String id);
}
