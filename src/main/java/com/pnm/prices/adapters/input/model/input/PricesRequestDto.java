package com.pnm.prices.adapters.input.model.input;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PricesRequestDto {

  @NotNull
  Integer productIdentifier;

//  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
//  @JsonFormat(pattern = "MM/dd/yyyy")
  LocalDateTime applicationDate;

  @NotNull
  String brandIdentifier;


}
