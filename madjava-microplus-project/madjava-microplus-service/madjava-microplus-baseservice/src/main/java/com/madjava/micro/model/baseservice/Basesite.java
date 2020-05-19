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
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Basesite extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 编码
     */
    private String siteCode;

    /**
     * 是否启用
     */
    private Boolean isActive;

    /**
     * 默认语言
     */
    private String defaultLanguage;

    /**
     * 默认货币
     */
    private String defaultCurrency;
    
}
