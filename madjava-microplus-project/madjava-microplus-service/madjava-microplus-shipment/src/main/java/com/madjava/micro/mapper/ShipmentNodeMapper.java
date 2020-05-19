package com.madjava.micro.mapper;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.madjava.micro.model.shipment.ShipmentNodeModel;

import org.apache.ibatis.annotations.Param;
/**
 * @Classname ShipmentNodeMapper
 * @Description 出货节点DAO层
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Mapper
public interface ShipmentNodeMapper extends BaseMapper<ShipmentNodeModel> {
	public boolean adjustNodeQuantity(@Param("id")String id, @Param("adjustmentQuantity")BigDecimal adjustmentQuantity);
}
