package com.madjava.micro.facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.madjava.micro.conveter.SystemSettingConvert;
import com.madjava.micro.dto.PageData;
import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.baseservice.SystemSettingData;
import com.madjava.micro.facade.baseservice.SystemSettingFacade;
import com.madjava.micro.model.baseservice.SystemSettingModel;
import com.madjava.micro.service.SystemSettingService;
import com.madjava.micro.utils.Constant;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname SystemSettingFacade
 * @Description FacadeImpl层
 * @Date 2020-05-14 15:18:34
 * @Created by yibin.lu
 */
@Component
@Slf4j
public class SystemSettingFacadeImpl implements SystemSettingFacade{

    @Autowired
    private SystemSettingConvert systemSettingConvert;

    @Autowired
    private SystemSettingService systemSettingService;


    /**
     * @param systemSettingData
     * @return
     */
    public PageResponseData<SystemSettingData> selectPage(Integer pageNo, Integer pageSize, String orderFiled,
                                boolean isAsc, SystemSettingData systemSettingData) {

		PageResponseData<SystemSettingData> pageResponseData = new PageResponseData<>();
		PageData<SystemSettingData> pageData = new PageData<SystemSettingData>();

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

        SystemSettingModel model = systemSettingConvert.convertToModel(systemSettingData);
        IPage<SystemSettingModel> page = systemSettingService.queryPage(pageParams, model);

        List<SystemSettingData> dataList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(page.getRecords())) {
            for (SystemSettingModel pageRecord : page.getRecords()) {
                dataList.add(systemSettingConvert.convertToData(pageRecord));
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
     * @param systemSettingData
     * @return
     */
    public boolean save(SystemSettingData systemSettingData) {
            SystemSettingModel model = systemSettingConvert.convertToModel(systemSettingData);
            return systemSettingService.save(model);
    }

    /**
     * @param systemSettingData
     * @return
     */
    public boolean updateById(SystemSettingData systemSettingData) {
        SystemSettingModel model = systemSettingConvert.convertToModel(systemSettingData);
        return systemSettingService.updateById(model);
    }

    /**
     * @param ids
     * @return
     */
    public boolean removeByIds(String[] ids) {
        return systemSettingService.removeByIds(Arrays.asList(ids));
    }

    /**
     * @param id
     * @return
     */
    public boolean removeByIds(String id) {
        return systemSettingService.removeById(id);
    }

    /**
     * @param id
     * @return
     */
    public SystemSettingData getById(String id) {
        SystemSettingModel model = systemSettingService.getById(id);
        return systemSettingConvert.convertToData(model);
    }
}
