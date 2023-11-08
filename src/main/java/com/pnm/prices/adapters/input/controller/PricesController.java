package com.pnm.prices.adapters.input.controller;

import com.pnm.prices.adapters.input.model.input.PricesRequestDto;
import com.pnm.prices.adapters.input.model.output.ProductPriceDto;
import com.pnm.prices.ports.input.controller.PricesOperations;
import com.pnm.prices.ports.input.services.FindPriceEndpointPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/prices")
@RequiredArgsConstructor
public class PricesController implements PricesOperations {

  private final FindPriceEndpointPort findPriceEndpointPort;
  @Override
  public ProductPriceDto findProductPrice(PricesRequestDto request) {

    log.info("Request received {}", request);

    return findPriceEndpointPort.findProductPriceInPeriod(request);
  }
}
