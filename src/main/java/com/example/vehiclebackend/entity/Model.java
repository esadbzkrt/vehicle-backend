package com.example.vehiclebackend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "models")
@Data
public class Model {
    @Id
    @GeneratedValue(generator = "model_id_seq")
    Long id;
    @Column(nullable = false)
    String brand;
    @Column(unique = true , nullable = false)
    String model;
}
