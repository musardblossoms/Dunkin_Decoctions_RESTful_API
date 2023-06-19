package com.magic.potions.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "health_potions")
public class HealthEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
    private Long id;

@Column
    private String name;

@Column
    private int cost;

@Column
    private int stock;

@Column
    private String rarity;

@Column
    private int hp_recovery;


}
