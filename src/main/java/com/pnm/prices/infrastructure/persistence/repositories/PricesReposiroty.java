package com.pnm.prices.infrastructure.persistence.repositories;

import com.pnm.prices.infrastructure.persistence.entities.PriceEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PricesReposiroty extends CrudRepository<PriceEntity,Integer> {

  List<PriceEntity> findAllByProductId(int productId);

}
