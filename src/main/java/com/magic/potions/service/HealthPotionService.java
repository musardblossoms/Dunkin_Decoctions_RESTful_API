package com.magic.potions.service;

import com.magic.potions.controllers.entity.HealthEntity;

import java.util.List;

public interface HealthPotionService {
    List<HealthEntity> findByName(String name);
}
