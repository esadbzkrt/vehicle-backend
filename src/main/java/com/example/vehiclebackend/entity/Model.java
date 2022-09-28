package com.example.vehiclebackend.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "models")
@Data
public class Model {
    @Id
    Long id;

    @Column(nullable = false)
    String brand;

    @Column(nullable = false)
    String model;
}
