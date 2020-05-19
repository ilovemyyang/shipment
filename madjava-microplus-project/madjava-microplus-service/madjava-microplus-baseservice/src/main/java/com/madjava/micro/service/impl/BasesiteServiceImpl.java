package com.madjava.micro.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madjava.micro.baseservice.mapper.BasesiteMapper;
import com.madjava.micro.model.baseservice.Basesite;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wei.f.zhang
 * @since 2020-04-21
 */
@Service
public class BasesiteServiceImpl extends ServiceImpl<BasesiteMapper, Basesite> implements com.madjava.micro.service.BasesiteService {
}
