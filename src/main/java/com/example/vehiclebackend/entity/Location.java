package com.example.vehiclebackend.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "locations")
@Data
public class Location {
    @Id
    @GeneratedValue(generator = "location_id_seq")
    Long id;
    Double longitude;
    Double latitude;
    Double direction;
}
