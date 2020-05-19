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
import com.madjava.micro.conveter.EnumvalueConvert;
import com.madjava.micro.dto.PageData;
import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.baseservice.EnumvalueData;
import com.madjava.micro.facade.baseservice.EnumvalueFacade;
import com.madjava.micro.model.baseservice.EnumvalueModel;
import com.madjava.micro.service.EnumvalueService;
import com.madjava.micro.utils.Constant;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname EnumvalueFacade
 * @Description FacadeImpl层
 * @Date 2020-05-14 17:29:42
 * @Created by zhuoxing.yan
 */
@Component
@Slf4j
public class EnumvalueFacadeImpl implements EnumvalueFacade{

    @Autowired
    private EnumvalueConvert enumvalueConvert;

    @Autowired
    private EnumvalueService enumvalueService;


    /**
     * @param enumvalueData
     * @return
     */
    public PageResponseData<EnumvalueData> selectPage(Integer pageNo, Integer pageSize, String orderFiled,
                                boolean isAsc, EnumvalueData enumvalueData) {

		PageResponseData<EnumvalueData> pageResponseData = new PageResponseData<>();
		PageData<EnumvalueData> pageData = new PageData<EnumvalueData>();

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

        EnumvalueModel model = enumvalueConvert.convertToModel(enumvalueData);
        IPage<EnumvalueModel> page = enumvalueService.queryPage(pageParams, model);

        List<EnumvalueData> dataList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(page.getRecords())) {
            for (EnumvalueModel pageRecord : page.getRecords()) {
                dataList.add(enumvalueConvert.convertToData(pageRecord));
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
     * @param enumvalueData
     * @return
     */
    public boolean save(EnumvalueData enumvalueData) {
            EnumvalueModel model = enumvalueConvert.convertToModel(enumvalueData);
            return enumvalueService.save(model);
    }

    /**
     * @param enumvalueData
     * @return
     */
    public boolean updateById(EnumvalueData enumvalueData) {
        EnumvalueModel model = enumvalueConvert.convertToModel(enumvalueData);
        return enumvalueService.updateById(model);
    }

    /**
     * @param ids
     * @return
     */
    public boolean removeByIds(String[] ids) {
        return enumvalueService.removeByIds(Arrays.asList(ids));
    }

    /**
     * @param id
     * @return
     */
    public boolean removeByIds(String id) {
        return enumvalueService.removeById(id);
    }

    /**
     * @param id
     * @return
     */
    public EnumvalueData getById(String id) {
        EnumvalueModel model = enumvalueService.getById(id);
        return enumvalueConvert.convertToData(model);
    }
}
