package com.magic.potions.controllers;

import com.magic.potions.entity.HealthEntity;
import com.magic.potions.repositories.HealthRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HealthController {
    private final HealthRepository healthRepository;

    private HealthEntity healthPotion;

    public HealthController(HealthRepository healthRepository) {
        this.healthRepository = healthRepository;
    }


    /* return potion by id */
    @GetMapping(value = "/health/{id}")
    private ResponseEntity<Optional<HealthEntity>> getHealthPotion(@PathVariable("id") final Long id){
        Optional<HealthEntity> response = healthRepository.findById(id);

        if(response == null){
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok(response);
        }
    }

    /* create potion */
    /* TODO: still getting error when trying to save potion because it continues to say primary key is null*/
    @PostMapping(value = "/health/create")
    public ResponseEntity<?> createHealthPotion(@RequestBody HealthEntity healthPotion){
        System.out.println("Health potion: " + healthPotion);

        healthRepository.save(healthPotion);

        return ResponseEntity.ok(HttpStatus.CREATED);
    }


}
