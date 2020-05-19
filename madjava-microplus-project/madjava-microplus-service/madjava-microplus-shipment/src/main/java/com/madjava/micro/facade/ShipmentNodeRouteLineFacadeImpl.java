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
import com.madjava.micro.convert.ShipmentNodeRouteLineConvert;
import com.madjava.micro.dto.PageData;
import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.shipment.ShipmentNodeRouteLineData;
import com.madjava.micro.facade.shipment.ShipmentNodeRouteLineFacade;
import com.madjava.micro.model.shipment.ShipmentNodeRouteLineModel;
import com.madjava.micro.service.ShipmentNodeRouteLineService;
import com.madjava.micro.utils.Constant;

/**
 * @Classname ShipmentNodeRouteLineFacade
 * @Description 节点路由关系表FacadeImpl层
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Component
@Slf4j
public class ShipmentNodeRouteLineFacadeImpl implements ShipmentNodeRouteLineFacade{

    @Autowired
    private ShipmentNodeRouteLineConvert shipmentNodeRouteLineConvert;

    @Autowired
    private ShipmentNodeRouteLineService shipmentNodeRouteLineService;


    /**
     * @param shipmentNodeRouteLineData
     * @return
     */
    public PageResponseData<ShipmentNodeRouteLineData> selectPage(Integer pageNo, Integer pageSize, String orderFiled,
                                boolean isAsc, ShipmentNodeRouteLineData shipmentNodeRouteLineData) {

		PageResponseData<ShipmentNodeRouteLineData> pageResponseData = new PageResponseData<>();
		PageData<ShipmentNodeRouteLineData> pageData = new PageData<ShipmentNodeRouteLineData>();

        // 分页参数赋值
        Map<String, Object> pageParams = new HashMap<>();
        pageParams.put(Constant.PAGE, pageNo);
        pageParams.put(Constant.LIMIT, pageSize);
        pageParams.put(Constant.ORDER_FIELD, orderFiled);

        if (isAsc) {
            pageParams.put(Constant.ORDER, "asc");
        } else {
            pageParams.put(Constant.ORDER, "desc");
        }

        ShipmentNodeRouteLineModel model = shipmentNodeRouteLineConvert.convertToModel(shipmentNodeRouteLineData);
        IPage<ShipmentNodeRouteLineModel> page = shipmentNodeRouteLineService.queryPage(pageParams, model);

        List<ShipmentNodeRouteLineData> dataList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(page.getRecords())) {
            for (ShipmentNodeRouteLineModel pageRecord : page.getRecords()) {
                dataList.add(shipmentNodeRouteLineConvert.convertToData(pageRecord));
            }
        }
        
		pageData.setPageNo(page.getCurrent());
		pageData.setPageSize(page.getSize());
		pageData.setTotal(page.getTotal());
		pageResponseData.setPageData(pageData);
		pageResponseData.setRecords(dataList);
		
        return pageResponseData;
    }

    /**
     * @param shipmentNodeRouteLineData
     * @return
     */
    public boolean save(ShipmentNodeRouteLineData shipmentNodeRouteLineData) {
            ShipmentNodeRouteLineModel model = shipmentNodeRouteLineConvert.convertToModel(shipmentNodeRouteLineData);
            return shipmentNodeRouteLineService.save(model);
    }

    /**
     * @param shipmentNodeRouteLineData
     * @return
     */
    public boolean updateById(ShipmentNodeRouteLineData shipmentNodeRouteLineData) {
        ShipmentNodeRouteLineModel model = shipmentNodeRouteLineConvert.convertToModel(shipmentNodeRouteLineData);
        return shipmentNodeRouteLineService.updateById(model);
    }

    /**
     * @param ids
     * @return
     */
    public boolean removeByIds(String[] ids) {
        return shipmentNodeRouteLineService.removeByIds(Arrays.asList(ids));
    }

    /**
     * @param id
     * @return
     */
    public boolean removeByIds(String id) {
        return shipmentNodeRouteLineService.removeById(id);
    }

    /**
     * @param id
     * @return
     */
    public ShipmentNodeRouteLineData getById(String id) {
        ShipmentNodeRouteLineModel model = shipmentNodeRouteLineService.getById(id);
        return shipmentNodeRouteLineConvert.convertToData(model);
    }
}
