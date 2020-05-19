package com.madjava.micro.facade.baseservice;

import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.baseservice.SystemSettingData;

/**
 * @Classname SystemSettingFacade
 * @Description Facade层
 * @Date 2020-05-14 15:18:34
 * @Created by yibin.lu
 */
public interface SystemSettingFacade {


    /**
     * @param systemSettingData
     * @return
     */
    public PageResponseData<SystemSettingData> selectPage(Integer pageNo, Integer pageSize, String orderFiled,
                                boolean isAsc, SystemSettingData systemSettingData);

    /**
     * @param systemSettingData
     * @return
     */
    public boolean save(SystemSettingData systemSettingData);

    /**
     * @param systemSettingData
     * @return
     */
    public boolean updateById(SystemSettingData systemSettingData);

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
    public SystemSettingData getById(String id);
}
