package com.magic.potions.repositories;

import com.magic.potions.controllers.entity.HealthEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface HealthPotionRepository extends JpaRepository<HealthEntity, Long> {

    List<HealthEntity> findByName(String name);


}
