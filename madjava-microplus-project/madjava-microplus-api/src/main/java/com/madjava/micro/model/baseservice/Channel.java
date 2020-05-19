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
@Table(name = "channel")
@Data
public class Channel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Long id;
	
	    //
    @Column(name = "code")
    private String code;
	
	    //
    @Column(name = "name")
    private String name;
	
	    //
    @Column(name = "enabled")
    private Boolean enabled;
	
	    //
    @Column(name = "platform_id")
    private Long platformId;
	
}
