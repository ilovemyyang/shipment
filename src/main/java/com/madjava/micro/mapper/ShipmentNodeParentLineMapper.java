package com.madjava.micro.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.madjava.micro.model.shipment.ShipmentNodeParentLineModel;

/**
 * @Classname ShipmentNodeParentLineMapper
 * @Description 节点父节点对应关系表DAO层
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Mapper
public interface ShipmentNodeParentLineMapper extends BaseMapper<ShipmentNodeParentLineModel> {
	
}
