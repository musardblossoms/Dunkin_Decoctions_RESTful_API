package com.magic.potions.service.Impl;

import com.magic.potions.controllers.entity.HealthEntity;
import com.magic.potions.repositories.HealthPotionRepository;
import com.magic.potions.service.HealthPotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HealthPotionServiceImpl implements HealthPotionService {
    private final HealthPotionRepository healthPotionRepository;

    @Autowired
    public HealthPotionServiceImpl(HealthPotionRepository healthPotionRepository){
        this.healthPotionRepository = healthPotionRepository;
    }
    @Override
    public List<HealthEntity> findByName(String name) {
        return healthPotionRepository.findByName(name);
    }

    @Override
    public List<HealthEntity> findAll() {
        return healthPotionRepository.findAll();
    }

    @Override
    public List<HealthEntity> findByRarity(String rarity) {
        return healthPotionRepository.findByRarity(rarity);
    }
}
