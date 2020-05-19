package com.madjava.micro.service.config;

import java.util.List;

import com.madjava.micro.enumtype.SmsTemplateEnum;
import com.madjava.micro.model.config.MadjavaSmsConfig;

public interface MadjavaSmsConfigService {

	/**
     * 插入
     * 
     * @param madjavaSmsConfig
     * @return returnCode
     */
    int insert(MadjavaSmsConfig madjavaSmsConfig);

    /**
     * 删除通过主键
     * 
     * @param smsPk
     * @return returnCode
     */
    int deleteByPrimaryKey(String smsPk);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param madjavaSmsConfig
     * @return returnCode
     */
    int updateAllByPrimaryKey(MadjavaSmsConfig madjavaSmsConfig);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param madjavaSmsConfig
     * @return returnCode
     */
    int updateByPrimaryKey(MadjavaSmsConfig madjavaSmsConfig);

    /**
     * 单件检索通过主键
     * 
     * @param smsPk
     * @return madjavaSmsConfig
     */
    MadjavaSmsConfig selectOneByPrimaryKey(String smsPk);

    /**
     * 检索列表
     * 
     * @param madjavaSmsConfig
     * @return madjavaSmsConfigList
     */
    List<MadjavaSmsConfig> selectList(MadjavaSmsConfig madjavaSmsConfig);

    /**
     * 检索件数
     * 
     * @param madjavaSmsConfig
     * @return count
     */
    int selectCount(MadjavaSmsConfig madjavaSmsConfig);
    
    /**
     *  根据手机号 短信模板 发送短信
     * @param mobile
     * @param mode
     * @param params
     * @return
     */
    boolean sendSms(String mobile, SmsTemplateEnum mode, String... params);
}
