package com.marvic.stock_control.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    @ManyToMany(mappedBy = "salesList")
    private List<Product> productsList = new ArrayList<>();
    @Column(nullable = false)
    private int quantity;
    @Column(name = "unitary_price", nullable = false)
    private double unitaryPrice;
    //Relation Sales - Costumer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_costumer", nullable = false)
    private Costumer costumer;

}
