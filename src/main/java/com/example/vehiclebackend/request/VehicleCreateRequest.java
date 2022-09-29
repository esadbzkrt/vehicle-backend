package com.example.vehiclebackend.request;

import lombok.Data;

@Data
public class VehicleCreateRequest {

        String plate;
        Long modelId;
        Number modelYear;
        String notes;
        Long locationId;

}
