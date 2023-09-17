package com.marvic.stock_control.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

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
    //Relation Costumer - Product
    @ManyToMany(mappedBy = "costumerList")
    private List<Product> productList = new ArrayList<>();
    //Relation Costumer - Sales
    @OneToMany(mappedBy = "costumer")
    private List<Sales> salesList = new ArrayList<>();

}
