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
    public PageResponseData<ShipmentNodeParentLineData> selectPage(Integer pageNo, Integer pageSize, String orderFiled,
                                boolean isAsc, ShipmentNodeParentLineData shipmentNodeParentLineData) {

		PageResponseData<ShipmentNodeParentLineData> pageResponseData = new PageResponseData<>();
		PageData<ShipmentNodeParentLineData> pageData = new PageData<ShipmentNodeParentLineData>();

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

        ShipmentNodeParentLineModel model = shipmentNodeParentLineConvert.convertToModel(shipmentNodeParentLineData);
        IPage<ShipmentNodeParentLineModel> page = shipmentNodeParentLineService.queryPage(pageParams, model);

        List<ShipmentNodeParentLineData> dataList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(page.getRecords())) {
            for (ShipmentNodeParentLineModel pageRecord : page.getRecords()) {
                dataList.add(shipmentNodeParentLineConvert.convertToData(pageRecord));
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
     * @param shipmentNodeParentLineData
     * @return
     */
    public boolean save(ShipmentNodeParentLineData shipmentNodeParentLineData) {
            ShipmentNodeParentLineModel model = shipmentNodeParentLineConvert.convertToModel(shipmentNodeParentLineData);
            return shipmentNodeParentLineService.save(model);
    }

    /**
     * @param shipmentNodeParentLineData
     * @return
     */
    public boolean updateById(ShipmentNodeParentLineData shipmentNodeParentLineData) {
        ShipmentNodeParentLineModel model = shipmentNodeParentLineConvert.convertToModel(shipmentNodeParentLineData);
        return shipmentNodeParentLineService.updateById(model);
    }

    /**
     * @param ids
     * @return
     */
    public boolean removeByIds(String[] ids) {
        return shipmentNodeParentLineService.removeByIds(Arrays.asList(ids));
    }

    /**
     * @param id
     * @return
     */
    public boolean removeByIds(String id) {
        return shipmentNodeParentLineService.removeById(id);
    }

    /**
     * @param id
     * @return
     */
    public ShipmentNodeParentLineData getById(String id) {
        ShipmentNodeParentLineModel model = shipmentNodeParentLineService.getById(id);
        return shipmentNodeParentLineConvert.convertToData(model);
    }
}
