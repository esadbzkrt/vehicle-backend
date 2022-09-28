package com.example.vehiclebackend.request.Vehicle;

import lombok.Data;


@Data
public class VehicleUpdateRequest {

    String plate;
    Long modelId;
    Number modelYear;
    String notes;
}
