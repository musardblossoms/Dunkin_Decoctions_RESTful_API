package com.magic.potions.controllers.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "one_time_use")
public class OneTimeUseEntity {

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
}
