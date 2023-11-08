package com.pnm.prices.ports.input.controller;

import com.pnm.prices.adapters.input.model.input.PricesRequestDto;
import com.pnm.prices.adapters.input.model.output.ProductPriceDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Validated
public interface PricesOperations {

  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  @GetMapping(value = "/find-prices",
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  ProductPriceDto findProductPrice(@RequestBody @Valid PricesRequestDto request);
}
