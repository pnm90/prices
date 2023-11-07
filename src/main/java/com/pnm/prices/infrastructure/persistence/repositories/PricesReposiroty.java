package com.pnm.prices.infrastructure.persistence.repositories;

import com.pnm.prices.infrastructure.persistence.entities.PricesEntity;
import org.springframework.data.repository.CrudRepository;

public interface PricesReposiroty extends CrudRepository<PricesEntity,Long> {

}
