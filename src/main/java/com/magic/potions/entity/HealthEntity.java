package com.magic.potions.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
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
