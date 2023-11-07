package com.pnm.prices.application.usecase;

import com.pnm.prices.application.domain.model.Price;
import java.time.LocalDateTime;

public interface FindProductUseCase{

  Price findProductPriceInPeriod(int productId, LocalDateTime applicationDate, String brand);

}
