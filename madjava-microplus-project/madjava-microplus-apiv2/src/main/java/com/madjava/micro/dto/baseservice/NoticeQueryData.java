package com.madjava.micro.dto.baseservice;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class NoticeQueryData implements Serializable {
	private static final long serialVersionUID = 293566046828935909L;
	
	@ApiModelProperty(value = "公告物理主键", example = "4545124842", required = false)
	private String pk;
	
	@ApiModelProperty(value = "公告标题", dataType = "String")
	private String title;
	
	@ApiModelProperty(value = "公告内容", dataType = "String")
	private String content;
	
	@ApiModelProperty(value = "是否启用", dataType = "Boolean")
	private Boolean enable;
	
	@ApiModelProperty(value = "是否置顶", dataType = "Boolean")
    private Boolean isTop;
	
	@ApiModelProperty(value = "当前页，默认1", dataType = "Integer",example = "1")
    private Integer pageNo = 1;
    @ApiModelProperty(value = "每页数量，默认20", dataType = "Integer",example = "20")
    private Integer pageSize = 20;
    
    @ApiModelProperty(value = "查询条数", dataType = "Integer",example = "20")
    private Integer searchCount;
}
