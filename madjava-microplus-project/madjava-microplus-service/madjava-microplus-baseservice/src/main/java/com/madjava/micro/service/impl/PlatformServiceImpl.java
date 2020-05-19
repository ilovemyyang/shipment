package com.madjava.micro.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madjava.micro.baseservice.mapper.PlatformMapper;
import com.madjava.micro.model.baseservice.Platform;
import com.madjava.micro.service.PlatformService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wei.f.zhang
 * @since 2020-04-21
 */
@Service
public class PlatformServiceImpl extends ServiceImpl<PlatformMapper, Platform> implements PlatformService {

}
