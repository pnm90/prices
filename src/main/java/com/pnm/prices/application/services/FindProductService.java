package com.pnm.prices.application.services;

import com.pnm.prices.application.domain.model.Price;
import com.pnm.prices.application.usecase.FindProductUseCase;
import com.pnm.prices.exception.PriceProductNotFoundException;
import com.pnm.prices.infrastructure.persistence.entities.PriceEntity;
import com.pnm.prices.infrastructure.persistence.mappers.PriceEntityMapper;
import com.pnm.prices.infrastructure.persistence.repositories.PricesReposiroty;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class FindProductService implements FindProductUseCase {

  private final PricesReposiroty pricesReposiroty;
  @Override
  public Price findProductPriceInPeriod(int productId, LocalDateTime applicationDate,
      String brand) {

    List<PriceEntity> products = pricesReposiroty.findAllByProductId(productId);
    List<PriceEntity> productsBrand = products.stream()
        .filter(item -> item.getBrand().getName().equals(brand))
        .filter(item -> applicationDate.isAfter(item.getStartDate()) || applicationDate.isBefore(item.getEndDate()))
        .sorted(Comparator.comparingInt(PriceEntity::getPriority))
        .toList();
    if (productsBrand.isEmpty()) {
      throw new PriceProductNotFoundException(productId);
    }
    return PriceEntityMapper.toDomain(productsBrand.getFirst());
  }

}
