package com.example.vehiclebackend.response;

import com.example.vehiclebackend.entity.Vehicle;
import lombok.Data;



@Data
public class VehicleResponse {

    Long id;
    String plate;
    String brand;
    String model;
    Number modelYear;
    String notes;

    public VehicleResponse(Vehicle entity) {
        this.id = entity.getId();
        this.plate = entity.getPlate();
        this.brand = entity.getModel().getBrand();
        this.model = entity.getModel().getModel();
        this.modelYear = entity.getModelYear();
        this.notes = entity.getNotes();
    }

}

