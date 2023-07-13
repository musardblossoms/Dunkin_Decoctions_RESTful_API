package com.magic.potions.repositories;

import com.magic.potions.entity.HealthEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthRepository extends JpaRepository<HealthEntity, Long> {

}
