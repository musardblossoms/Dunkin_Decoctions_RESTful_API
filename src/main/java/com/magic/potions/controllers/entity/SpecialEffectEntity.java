package com.magic.potions.controllers.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "special_effects")
public class SpecialEffectEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column
    private String name;

    @Column
    private double cost;

    @Column
    private int stock;

    @Column
    private String rarity;

    @Column
    private String description;

    @Column
    private int duration;
}
