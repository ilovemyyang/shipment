package com.madjava.micro.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madjava.micro.baseservice.mapper.ChannellpMapper;
import com.madjava.micro.model.baseservice.Channellp;
import com.madjava.micro.service.ChannellpService;

@Service
public class ChannellpServiceImpl extends ServiceImpl<ChannellpMapper, Channellp>implements ChannellpService {

}
