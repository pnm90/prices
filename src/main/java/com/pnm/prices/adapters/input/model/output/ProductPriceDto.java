package com.pnm.prices.adapters.input.model.output;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class ProductPriceDto {

  String productId;

  String priceList;

  String brand;

  LocalDateTime startDate;

  LocalDateTime endDate;

  BigDecimal finalPrice;

  String currency;

}
