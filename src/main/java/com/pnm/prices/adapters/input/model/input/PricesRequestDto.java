package com.pnm.prices.adapters.input.model.input;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

@Value
@Builder
public class PricesRequestDto {

  @NotNull
  Integer productIdentifier;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  @JsonFormat(pattern = "MM/dd/yyyy")
  String applicationDate;

  String brandIdentifier;


}
