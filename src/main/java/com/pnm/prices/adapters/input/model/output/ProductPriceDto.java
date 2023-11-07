package com.pnm.prices.adapters.input.model.output;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class ProductPriceDto {

  String productId;

  Integer priceList;

  String rate;

  LocalDate startDate;

  LocalDate endDate;

  BigDecimal finalPrice;

}
