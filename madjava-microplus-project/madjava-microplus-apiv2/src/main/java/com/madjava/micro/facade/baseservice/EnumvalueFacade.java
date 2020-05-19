package com.madjava.micro.facade.baseservice;

import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.baseservice.EnumvalueData;

/**
 * @Classname EnumvalueFacade
 * @Description Facade层
 * @Date 2020-05-14 17:29:42
 * @Created by zhuoxing.yan
 */
public interface EnumvalueFacade {


    /**
     * @param enumvalueData
     * @return
     */
    public PageResponseData<EnumvalueData> selectPage(Integer pageNo, Integer pageSize, String orderFiled,
                                boolean isAsc, EnumvalueData enumvalueData);

    /**
     * @param enumvalueData
     * @return
     */
    public boolean save(EnumvalueData enumvalueData);

    /**
     * @param enumvalueData
     * @return
     */
    public boolean updateById(EnumvalueData enumvalueData);

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
    public EnumvalueData getById(String id);
}
