package com.example.vehiclebackend.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "vehicles")
@Data
public class Vehicle {

    @Id
    Long id;
    @Column(unique = true)
    String plate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "model_id", nullable = false)
    Model model;

    Number modelYear;

    @Column(nullable = true)
    String notes;

    @Column(nullable = true)
    BigDecimal longitude;

    @Column(nullable = true)
    BigDecimal latitude;

    @Column(nullable = true)
    BigDecimal direction;

}
