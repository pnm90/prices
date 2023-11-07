package com.pnm.prices.application.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class Price {

  @NonNull
  private Integer id;

  @NonNull
  private String brandName;

  private LocalDateTime startDate;

  private LocalDateTime endDate;

  private Integer priceList;

  private Integer productId;

  private Integer priority;

  @NonNull
  private BigDecimal priceValue;

  @NonNull
  private String currency;
}
