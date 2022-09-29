package com.example.vehiclebackend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "locations")
@Data
public class Location {
    @Id
    @GeneratedValue(generator = "location_id_seq")
    Long id;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "location")
    Vehicle vehicle;

    Double longitude;
    Double latitude;
    Double direction;
}
