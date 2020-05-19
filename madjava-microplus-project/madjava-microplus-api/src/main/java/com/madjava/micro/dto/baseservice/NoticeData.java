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
public class NoticeData implements Serializable {
	private static final long serialVersionUID = 293566046828935909L;
	
	@ApiModelProperty(value = "公告物理主键", example = "4545124842", required = false)
	private String pk;
	
	@ApiModelProperty(value = "公告标题", dataType = "String")
	@NotBlank(message = "公告标题不能为空")
	private String title;
	
	@ApiModelProperty(value = "公告内容", dataType = "String")
	@NotBlank(message = "公告内容不能为空")
	private String content;
	
	@ApiModelProperty(value = "是否启用", dataType = "Boolean")
	@NotNull(message = "启用状态不能为空")
	private Boolean enable;
	
	@ApiModelProperty(value = "是否置顶", dataType = "Boolean")
	@NotNull(message = "置顶状态不能为空")
    private Boolean isTop;
    
	@ApiModelProperty(value = "公告优先级", dataType = "int")
	@NotNull(message = "公告优先级不能为空")
    private Integer priority;
	
    @ApiModelProperty(value = "创建时间", required = false)
    private Date createTime;
    
	@ApiModelProperty(value = "创建人", required = false)
	private String createBy;
	
	@ApiModelProperty(value = "修改时间", required = false)
	private Date updateTime;

	@ApiModelProperty(value = "更新人", required = false)
	private String updateBy;
	
}
