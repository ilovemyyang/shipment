package com.madjava.micro.model.baseservice;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.madjava.micro.model.BaseEntity;

import lombok.Data;

/**
 * @Classname EnumvalueModel
 * @Description  实体类
 * @Date 2020-05-14 17:29:42
 * @Created by zhuoxing.yan
 */
@Data
@TableName("enumvalue")
public class EnumvalueModel extends BaseEntity {
	private static final long serialVersionUID = -2862124282874936189L;


	/**
	 * 
	 */
	@TableId(value = "id",type = IdType.ASSIGN_ID)
	private String id;

	/**
	 * 枚举类型
	 */
	@TableField("enum_type")
	private String enumType;

	/**
	 * 枚举编号
	 */
	@TableField("code")
	private String code;

	/**
	 * 名称
	 */
	@TableField("name")
	private String name;

	/**
	 * 排序号
	 */
	@TableField("rank_no")
	private Integer rankNo;

	/**
	 * 语言编码
	 */
	@TableField("lang_code")
	private String langCode;

	/**
	 * 是否禁用
	 */
	@TableField("disabled")
	private Boolean disabled;






}
