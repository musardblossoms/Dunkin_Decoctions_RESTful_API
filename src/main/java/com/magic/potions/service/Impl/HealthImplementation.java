package com.magic.potions.service.Impl;

import com.magic.potions.entity.HealthEntity;
import com.magic.potions.repositories.HealthRepository;
import com.magic.potions.service.HealthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class HealthImplementation implements HealthService {
    @Autowired
    private HealthRepository healthRepository;

    @Autowired
    public void HealthService (HealthRepository healthRepository) {this.healthRepository = healthRepository; }

    private HealthEntity healthPotion;

    @Override
    public HealthEntity saveHealthPotion(HealthEntity healthEntity){

        return healthRepository.save(healthEntity);
    }

    @Override
    public HealthEntity getHealthPotion(Long id) {
        log.info("Looking for the potion with id " + id);
        Optional<HealthEntity> healthEntityOptional = healthRepository.findById(id);

//        add throw exception
        return healthEntityOptional.get();
    }

    @Override
    public List<HealthEntity> getAllHealthPotions() {
        log.info("Looking for all health potions...");
        return healthRepository.findAll();
    }

    @Override
    public void deleteHealthPotion(Long id) {
        Optional<HealthEntity> healthEntityOptional = healthRepository.findById(id);

//       needs a throw exception
        HealthEntity HealthPotionToDelete = healthEntityOptional.get();
        healthRepository.delete(HealthPotionToDelete);
    }

    /* build a health potion */
    private HealthEntity createHealthPotion(String name, int cost, int stock, String rarity, int hp_recovery){
        healthPotion.setName(name);
        healthPotion.setCost(cost);
        healthPotion.setStock(stock);
        healthPotion.setRarity(rarity);
        healthPotion.setHp_recovery(hp_recovery);

        return healthPotion;

    }
}
