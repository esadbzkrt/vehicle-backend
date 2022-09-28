package com.example.vehiclebackend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(generator = "user_id_seq")
    Long id;

    @Column(unique = true)
    String userName;

    String password;
}
