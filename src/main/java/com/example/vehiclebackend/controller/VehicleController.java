package com.example.vehiclebackend.controller;

import com.example.vehiclebackend.entity.Vehicle;
import com.example.vehiclebackend.request.VehicleCreateRequest;
import com.example.vehiclebackend.request.VehicleUpdateRequest;
import com.example.vehiclebackend.response.VehicleResponse;
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
    public List<VehicleResponse> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping("/{vehicleId}")
    public VehicleResponse getVehicleById(@PathVariable Long vehicleId) {
        return vehicleService.getVehicleById(vehicleId);
    }

    @PutMapping("/{vehicleId}")
    public Vehicle updateVehicle(@PathVariable Long vehicleId, @RequestBody VehicleUpdateRequest vehicleUpdateRequest) {
        return vehicleService.updateVehicle(vehicleId, vehicleUpdateRequest);
    }

    @PostMapping
    public Vehicle createVehicle(@RequestBody VehicleCreateRequest newVehicle) {
        return vehicleService.saveVehicle(newVehicle);
    }

    @DeleteMapping("/{vehicleId}")
    public void deleteVehicle(@PathVariable Long vehicleId) {
        vehicleService.deleteVehicleById(vehicleId);
    }



}
