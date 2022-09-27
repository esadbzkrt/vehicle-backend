package com.example.vehiclebackend.repository;

import com.example.vehiclebackend.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {



}
