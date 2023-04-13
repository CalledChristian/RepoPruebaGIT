package com.example.demo.repositories;

import com.example.demo.entities.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository <Auto,Integer> {

}
