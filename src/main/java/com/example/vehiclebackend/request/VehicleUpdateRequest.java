package com.example.vehiclebackend.request;

import lombok.Data;


@Data
public class VehicleUpdateRequest {

    String plate;
    Long modelId;
    Number modelYear;
    String notes;
    Double longitude;
    Double latitude;
    Double direction;

}
