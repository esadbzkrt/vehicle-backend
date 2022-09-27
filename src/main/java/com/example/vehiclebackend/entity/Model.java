package com.example.vehiclebackend.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "models")
@Data
public class Model {
    @Id
    Long id;
    String brand;
    String model;
}
