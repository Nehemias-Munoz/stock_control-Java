package com.marvic.stock_control.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Table
@Entity
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private LocalDate date;
    //Relation Sales - Product
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "id_product", nullable = false)
    private Product product;
    @Column(nullable = false)
    private int quantity;
    @Column(name = "unitary_price", nullable = false)
    private double unitaryPrice;
    //Relation Sales - Costumer
    @Column(name = "id_costumer", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Costumer costumer;

}
