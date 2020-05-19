package com.madjava.micro.dto.request.consignment;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.madjava.micro.dto.baseservice.ItemData;

import lombok.Data;

@Data public class ConsignmentEntryData implements ItemData {

  private static final long        serialVersionUID = 4585475891682954169L;

  @NotBlank private String         sku;
  @NotNull @Min(1) private Integer qty;
}
