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
public class Channellp extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "pk",type = IdType.ASSIGN_ID)
    private String pk;

    /**
     * 平台编码
     */
    private String channelCode;

    /**
     * 语言编码
     */
    private String langCode;

    /**
     * 平台名称
     */
    private String name;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新人
     */
    private String updateBy;


}
