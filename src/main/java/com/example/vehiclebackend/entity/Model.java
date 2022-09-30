package com.example.vehiclebackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "model", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Vehicle> vehicles;

}
