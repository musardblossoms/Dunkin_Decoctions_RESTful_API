package com.magic.potions.controllers;

import com.magic.potions.entity.HealthEntity;
import com.magic.potions.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HealthController {
    @Autowired
    private HealthService healthService;

    /* return potion by id */
    @GetMapping(value = "/health/{id}")
    public String getHealthPotion(@PathVariable("id") final Long id){
        HealthEntity response = healthService.getHealthPotion(id);

        return response.toString();
    }


}
