package com.marvic.stock_control.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Table
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private int stock;

    //Relation Product - Supplier
    @ManyToMany
    @JoinTable(name = "Supplier_Product",joinColumns = @JoinColumn(name = "id_product", nullable = false), inverseJoinColumns = @JoinColumn(name = "id_supplier", nullable = false))
    private List<Supplier> supplierList = new ArrayList<>();

    //Relation Product - Costumer
    @ManyToMany
    @JoinTable(name = "Costumer_Product", joinColumns = @JoinColumn(name = "id_product", nullable = false), inverseJoinColumns = @JoinColumn(name = "id_costumer", nullable = false))
    private List<Costumer> costumerList = new ArrayList<>();

    //Relation Product - Shopping
    @ManyToMany
    @JoinTable(name = "Product_Shopping", joinColumns = @JoinColumn(name = "id_product", nullable = false), inverseJoinColumns = @JoinColumn(name = "id_shopping", nullable = false))
    private List<Shopping> shoppingList = new ArrayList<>();

    //Relation Product = Sales
    @ManyToMany
    @JoinTable(name = "Product_Sales", joinColumns = @JoinColumn(name = "id_product", nullable = false),inverseJoinColumns = @JoinColumn(name = "id_sale", nullable = false))
    private List<Sales> salesList = new ArrayList<>();

}
