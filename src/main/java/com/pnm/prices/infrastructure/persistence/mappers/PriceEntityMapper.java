package com.pnm.prices.infrastructure.persistence.mappers;

import com.pnm.prices.application.domain.model.Price;
import com.pnm.prices.infrastructure.persistence.entities.PriceEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PriceEntityMapper {

  public static Price toDomain(PriceEntity pricesEntity) {
    return Price.builder()
        .id(pricesEntity.getId())
        .brandName(pricesEntity.getBrand().getName())
        .priceList(pricesEntity.getPriceList())
        .priceValue(pricesEntity.getPrice())
        .currency(pricesEntity.getCurrency())
        .productId(pricesEntity.getProductId())
        .endDate(pricesEntity.getEndDate())
        .startDate(pricesEntity.getStartDate())
        .priority(pricesEntity.getPriority())
        .build();
  }

  public static PriceEntity toEntity(Price pricesDomain) {
    return PriceEntity.builder()
        .id(pricesDomain.getId())
        .priority(pricesDomain.getPriority())
        .price(pricesDomain.getPriceValue())
        .currency(pricesDomain.getCurrency())
        .productId(pricesDomain.getProductId())
        .endDate(pricesDomain.getEndDate())
        .startDate(pricesDomain.getStartDate())
        .priority(pricesDomain.getPriority())
        .build();
  }
}
