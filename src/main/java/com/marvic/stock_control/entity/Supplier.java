package com.marvic.stock_control.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Table
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 70)
    private String address;
    @Column(length = 10)
    private String phone;
    //Relacion Supplier - Shopping
    @OneToMany(mappedBy = "supplier")
    private List<Shopping> shoppingList = new ArrayList<>();
    //Relacion Supplier - Product (ManytoMany)
    @ManyToMany(mappedBy = "supplierList")
    private List<Product> productList = new ArrayList<>();

}
