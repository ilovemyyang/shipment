package com.madjava.micro.model.baseservice;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.madjava.micro.model.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wei.f.zhang
 * @since 2020-04-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Channel extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 渠道编码
     */
    private String code;

    /**
     * 渠道名称
     */
    private String name;

    /**
     * 状态
     */
    private Boolean enabled;

    /**
     * 渠道图标
     */
    private String icon;

    /**
     * 主键
     */
    private Long platformId;


}
