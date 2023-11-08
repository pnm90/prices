package com.pnm.prices.exception;

import static java.lang.StringTemplate.STR;

import io.github.wimdeblauwe.errorhandlingspringbootstarter.ResponseErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
@ResponseErrorCode("NO_SUCH_USER")
public class PriceProductNotOldFoundException extends RuntimeException {
    public PriceProductNotOldFoundException(Integer productId) {
        super(STR."Could not find product with id \{productId}");
    }
}