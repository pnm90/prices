package com.pnm.prices.infrastructure.persistence.repositories;

import com.pnm.prices.infrastructure.persistence.entities.BrandEntity;
import org.springframework.data.repository.CrudRepository;

public interface BrandsRepository extends CrudRepository<BrandEntity, Integer> {

}
