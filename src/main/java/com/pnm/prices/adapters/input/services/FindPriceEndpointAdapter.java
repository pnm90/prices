package com.pnm.prices.adapters.input.services;

import com.pnm.prices.adapters.input.model.input.PricesRequestDto;
import com.pnm.prices.adapters.input.model.output.ProductPriceDto;
import com.pnm.prices.application.domain.model.Price;
import com.pnm.prices.application.usecase.FindProductUseCase;
import com.pnm.prices.ports.input.services.FindPriceEndpointPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FindPriceEndpointAdapter implements FindPriceEndpointPort {

  private final FindProductUseCase findProductUseCase;

  @Override
  public ProductPriceDto findProductPriceInPeriod(PricesRequestDto requestDto) {
    Price priceItem = findProductUseCase.findProductPriceInPeriod(requestDto.getProductIdentifier(),
        requestDto.getApplicationDate(), requestDto.getBrandIdentifier());

    return buildResponse(priceItem);
  }

  private ProductPriceDto buildResponse(Price priceItem) {
    return ProductPriceDto.builder().productId(priceItem.getProductId().toString())
        .priceList(priceItem.getPriceList().toString()).brand(priceItem.getBrandName())
        .finalPrice(priceItem.getPriceValue()).currency(priceItem.getCurrency()).build();
  }
}
