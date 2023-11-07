package com.pnm.prices.ports.input.services;

import com.pnm.prices.adapters.input.model.input.PricesRequestDto;
import com.pnm.prices.adapters.input.model.output.ProductPriceDto;

public interface FindPriceEndpointPort {

  ProductPriceDto findProductPriceInPeriod(PricesRequestDto requestDto);
}
