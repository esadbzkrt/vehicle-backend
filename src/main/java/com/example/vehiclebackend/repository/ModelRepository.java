package com.example.vehiclebackend.repository;

import com.example.vehiclebackend.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Long> {
}

