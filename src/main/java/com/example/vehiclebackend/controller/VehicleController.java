package com.example.vehiclebackend.controller;

import com.example.vehiclebackend.entity.Vehicle;
import com.example.vehiclebackend.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping("/{vehicleId}")
    public Vehicle getVehicleById(@PathVariable Long vehicleId) {
        return vehicleService.getVehicleById(vehicleId);
    }


}
