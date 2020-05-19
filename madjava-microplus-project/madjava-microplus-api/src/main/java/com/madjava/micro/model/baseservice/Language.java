package com.madjava.micro.model.baseservice;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Data;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2020-01-10 14:24:05
 */
@Table(name = "language")
@Data
public class Language implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    @Id
    private String pk;
	
	    //语言编码
    @Column(name = "lang_code")
    private String langCode;
	
	    //语言名称
    @Column(name = "name")
    private String name;
	
	    //创建时间
    @Column(name = "create_time")
    private Date createTime;
	
	    //创建人
    @Column(name = "create_by")
    private String createBy;
	
	    //修改时间
    @Column(name = "update_time")
    private Date updateTime;
	
	    //更新人
    @Column(name = "update_by")
    private String updateBy;
	
}
