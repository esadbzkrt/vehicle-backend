package com.example.vehiclebackend.service;

import com.example.vehiclebackend.entity.Vehicle;
import com.example.vehiclebackend.repository.VehicleRepository;
import com.example.vehiclebackend.request.VehicleCreateRequest;
import com.example.vehiclebackend.request.VehicleUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    private final ModelService modelService;

    public VehicleService(VehicleRepository vehicleRepository, ModelService modelService) {
        this.vehicleRepository = vehicleRepository;
        this.modelService = modelService;
    }


    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle getVehicleById(Long vehicleId) {
        return vehicleRepository.findById(vehicleId).orElse(null);
    }


    public void deleteVehicleById(Long vehicleId) {
        vehicleRepository.deleteById(vehicleId);
    }

    public Vehicle saveVehicle(VehicleCreateRequest newVehicle) {
        Vehicle vehicle = new Vehicle();
        vehicle.setPlate(newVehicle.getPlate());
        vehicle.setModel(modelService.getModel(newVehicle.getModelId()));
        vehicle.setModelYear(newVehicle.getModelYear());
        vehicle.setNotes(newVehicle.getNotes());
        vehicleRepository.save(vehicle);
        return vehicle;
    }

    public Vehicle updateVehicle(Long vehicleId, VehicleUpdateRequest vehicleUpdateRequest) {
        Optional<Vehicle> vehicle = vehicleRepository.findById(vehicleId);
        if (vehicle.isPresent()) {
            Vehicle updatedVehicle = vehicle.get();
            updatedVehicle.setPlate(vehicleUpdateRequest.getPlate());
            updatedVehicle.setModel(modelService.getModel(vehicleUpdateRequest.getModelId()));
            updatedVehicle.setModelYear(vehicleUpdateRequest.getModelYear());
            updatedVehicle.setNotes(vehicleUpdateRequest.getNotes());
            vehicleRepository.save(updatedVehicle);
            return updatedVehicle;
        }
        return null;
    }
}
