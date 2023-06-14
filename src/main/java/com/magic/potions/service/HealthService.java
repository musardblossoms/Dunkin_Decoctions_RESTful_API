package com.magic.potions.service;

import com.magic.potions.entity.HealthEntity;

import java.util.List;

public interface HealthService {
    HealthEntity create (HealthEntity healthPotion);

    HealthEntity getHealthPotion (Long id);

    List<HealthEntity> getAllHealthPotions();

    void deleteHealthPotion(Long id);
}
