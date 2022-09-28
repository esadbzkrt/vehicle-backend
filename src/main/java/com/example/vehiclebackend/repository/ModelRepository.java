package com.example.vehiclebackend.repository;

import com.example.vehiclebackend.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModelRepository extends JpaRepository<Model, Long> {
    List<Model> findByBrand(String brand);
}

