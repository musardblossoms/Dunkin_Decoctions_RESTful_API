package com.magic.potions.repositories;

import com.magic.potions.controllers.entity.HealthEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HealthRepository extends CrudRepository<HealthEntity, Long> {

    List<HealthEntity> findAll();
//    06/13: may have to make a save method?
}
