package com.madjava.micro.dto.shipment;

import java.math.BigDecimal;
import com.madjava.micro.dto.BaseData;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Classname ShipmentAdjustmentTaskData
 * @Description 出货调整任务创建记录Data
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@Data
public class ShipmentAdjustmentTaskData extends BaseData {

	private static final long serialVersionUID = -5537103860302144396L;

			@ApiModelProperty(value = "主键")
		  private String id;
				@ApiModelProperty(value = "拓扑id")
		  private String topologyId;
				@ApiModelProperty(value = "状态，未处理，处理中，已完成等")
		  private String taskStatus;
				@ApiModelProperty(value = "调整数量，正代表加，负代表减")
		  private BigDecimal adjustmentQuantity;
				@ApiModelProperty(value = "当前数量")
		  private BigDecimal currentQuantity;
	
}
