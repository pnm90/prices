package com.pnm.prices.exception;

import io.github.wimdeblauwe.errorhandlingspringbootstarter.ResponseErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
@ResponseErrorCode("NO_SUCH_USER")
public class PriceProductNotFoundException extends RuntimeException {
    public PriceProductNotFoundException(String userId) {
        super("Could not find user with id " + userId);
    }
}