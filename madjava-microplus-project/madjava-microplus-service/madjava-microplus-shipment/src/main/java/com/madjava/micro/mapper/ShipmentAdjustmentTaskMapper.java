package com.madjava.micro.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.madjava.micro.model.shipment.ShipmentAdjustmentTaskModel;

/**
 * @Classname ShipmentAdjustmentTaskMapper
 * @Description 出货调整任务DAO层
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Mapper
public interface ShipmentAdjustmentTaskMapper extends BaseMapper<ShipmentAdjustmentTaskModel> {
	
}
