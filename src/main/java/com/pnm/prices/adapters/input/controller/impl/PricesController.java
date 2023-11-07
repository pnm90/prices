package com.pnm.prices.adapters.input.controller.impl;

import com.pnm.prices.adapters.input.controller.PricesOperations;
import com.pnm.prices.adapters.input.model.input.PricesRequestDto;
import com.pnm.prices.adapters.input.model.output.ProductPriceDto;
import com.pnm.prices.exception.UserNotFoundException;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/prices")
public class PricesController  implements PricesOperations {

  private static final String ENDPOINT_VERSION = "v1";

  private static final String PATH = "api/prices";

  @Override
  public ProductPriceDto findProductPrice() {

    log.info("Request received");

    throw new UserNotFoundException("Product prices");
//    return ProductPriceDto.builder()
//        .productId("1")
//        .priceList(1)
//        .rate("1")
//        .finalPrice(BigDecimal.valueOf(1000))
//        .startDate(LocalDate.now())
//        .endDate(LocalDate.now())
//        .build();
  }
}
