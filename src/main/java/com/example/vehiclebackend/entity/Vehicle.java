package com.example.vehiclebackend.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "vehicles")
@Data
public class Vehicle {

    @Id
    @GeneratedValue(generator = "vehicle_id_seq")
    Long id;
    @Column(unique = true)
    String plate;

    @ManyToOne(fetch = FetchType.LAZY)
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
