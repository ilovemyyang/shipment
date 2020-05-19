package com.madjava.micro.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madjava.micro.baseservice.mapper.ChannelMapper;
import com.madjava.micro.model.baseservice.Channel;
import com.madjava.micro.service.ChannelService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wei.f.zhang
 * @since 2020-04-21
 */
@Service
public class ChannelServiceImpl extends ServiceImpl<ChannelMapper, Channel> implements ChannelService {

}
