package com.madjava.micro.service.config;

import java.util.List;

import com.madjava.micro.model.config.MadjavaChannel;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author madjava-
 */
public interface MadjavaChannelService {

    /**
     * 插入
     * 
     * @param madjavaChannel
     * @return returnCode
     */
    int insert(MadjavaChannel madjavaChannel);

    /**
     * 删除通过主键
     * 
     * @param id
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param madjavaChannel
     * @return returnCode
     */
    int updateAllByPrimaryKey(MadjavaChannel madjavaChannel);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param madjavaChannel
     * @return returnCode
     */
    int updateByPrimaryKey(MadjavaChannel madjavaChannel);

    /**
     * 单件检索通过主键
     * 
     * @param id
     * @return madjavaChannel
     */
    MadjavaChannel selectOneByPrimaryKey(Integer id);

    /**
     * 检索列表
     * 
     * @param madjavaChannel
     * @return madjavaChannelList
     */
    List<MadjavaChannel> selectList(MadjavaChannel madjavaChannel);

    /**
     * 检索件数
     * 
     * @param madjavaChannel
     * @return count
     */
    int selectCount(MadjavaChannel madjavaChannel);
    
    /**
     *  根据渠道code查询数据
     * @param channelCode
     * @return
     */
    MadjavaChannel selectOneByChannelCode(String channelCode);
}
