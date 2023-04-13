package com.example.demo.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Auto {
    private Integer id;
    private String nombre;
}
