package com.pnm.prices.exception;

import io.github.wimdeblauwe.errorhandlingspringbootstarter.ResponseErrorCode;
import io.github.wimdeblauwe.errorhandlingspringbootstarter.ResponseErrorProperty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@ResponseErrorCode("PRODUCT_NOT_FOUND")
public class ProductNotFoundException extends RuntimeException {

  private final String productId;

  public ProductNotFoundException(String productId) {
    super(String.format("Could not find product with id %s at given date", productId));
    this.productId = productId;
  }

  @ResponseErrorProperty
  public String getProductId() {
    return productId;
  }
}