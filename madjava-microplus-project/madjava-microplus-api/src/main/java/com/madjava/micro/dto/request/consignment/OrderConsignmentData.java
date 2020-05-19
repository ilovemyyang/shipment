package com.madjava.micro.dto.request.consignment;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.madjava.micro.dto.baseservice.ItemData;

import lombok.Data;

@Data public class OrderConsignmentData implements ItemData {

  private static final long                        serialVersionUID = -1444783528087020519L;

  @NotBlank private String                         orderCode;
  @NotBlank private String                         channel;
  @NotNull private Long                            orderId;
  private String                                   fullname;
  private BigDecimal                               payPrice;

  private String                                   province;
  private String                                   city;
  private String                                   district;
  private String                                   town;
  private String                                   mobile;
  private String                                   telephone;
  private String                                   fullAddress;

  @NotNull @NotEmpty private List<ConsignmentData> consignments;

}
