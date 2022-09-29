package com.example.vehiclebackend.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "vehicles")
@Data
public class Vehicle {

    @Id
    @GeneratedValue(generator = "vehicle_id_seq")
    Long id;
    @Column(unique = true, nullable = false)
    String plate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "model_id", nullable = false)
    Model model;

    @Column(nullable = false)
    Number modelYear;

    @Column(nullable = true)
    String notes;

    @Column(nullable = true)
    Double longitude;
    @Column(nullable = true)
    Double latitude;
    @Column(nullable = true)
    Double direction;

}
