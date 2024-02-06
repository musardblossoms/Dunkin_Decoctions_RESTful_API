package com.magic.potions.controllers;

import com.magic.potions.controllers.entity.HealthEntity;
import com.magic.potions.service.HealthPotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/potions/health")
public class HealthPotionController {

    private final HealthPotionService healthPotionService;

    @Autowired
    public HealthPotionController(HealthPotionService healthPotionService) {
        this.healthPotionService = healthPotionService;
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<HealthEntity>> findByName(@PathVariable String name) {
       List<HealthEntity> potions = healthPotionService.findByName(name);
       return ResponseEntity.ok(potions);
    }

    @GetMapping("/all_potions")
    public ResponseEntity<List<HealthEntity>> findAllPotions(){
        List<HealthEntity> potions = healthPotionService.findAll();
        return ResponseEntity.ok(potions);
    }

    @GetMapping("/rarity/{rarity}")
    public ResponseEntity<List<HealthEntity>> findPotionByRarity(@PathVariable String rarity) {
        List<HealthEntity> potions = healthPotionService.findByRarity(rarity);
        return ResponseEntity.ok(potions);
    }
}
