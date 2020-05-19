package com.madjava.micro.dto.request.consignment;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.madjava.micro.dto.baseservice.ItemData;

import lombok.Data;

@Data public class ConsignmentData implements ItemData {

  private static final long                             serialVersionUID = 4585475891682954169L;

  @NotNull @NotEmpty private List<ConsignmentEntryData> consignmentEntries;
  @NotBlank private String                              warehouseCode;
  private String                                        consignmentCode;
  private Long                                          consignmentId;

}
