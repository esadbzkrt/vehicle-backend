package com.example.vehiclebackend.repository;

import com.example.vehiclebackend.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}

