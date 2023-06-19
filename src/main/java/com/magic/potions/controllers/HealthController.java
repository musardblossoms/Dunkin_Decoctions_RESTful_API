package com.magic.potions.controllers;

import com.magic.potions.entity.HealthEntity;
import com.magic.potions.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HealthController {
    @Autowired
    private HealthService healthService;

    private HealthEntity healthPotion;

    /* return potion by id */
    @GetMapping(value = "/health/{id}")
    private ResponseEntity<HealthEntity> getHealthPotion(@PathVariable("id") final Long id){
        HealthEntity response = healthService.getHealthPotion(id);

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
        healthService.saveHealthPotion(healthPotion);

        return ResponseEntity.ok(HttpStatus.CREATED);
    }


}
