package com.example.vehiclebackend.service;

import com.example.vehiclebackend.entity.Vehicle;
import com.example.vehiclebackend.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }




}
