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
    String plate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "model_id", nullable = false)
    Model model;

    Number modelYear;
    String notes;
    BigDecimal longitude;
    BigDecimal latitude;
    BigDecimal direction;

}
