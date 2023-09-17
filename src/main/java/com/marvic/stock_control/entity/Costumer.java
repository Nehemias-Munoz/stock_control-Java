package com.marvic.stock_control.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class Costumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 70)
    private String address;
    @Column(length = 10)
    private String phone;

}
