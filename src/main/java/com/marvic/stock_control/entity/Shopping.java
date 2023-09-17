package com.marvic.stock_control.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDate;
@Data
@Table
@Entity
public class Shopping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private LocalDate date;
    //Relation Shopping - Product
    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false)
    private Product product;
    @Column(nullable = false)
    private int quantity;
    @Column(name = "unitary_price", nullable = false)
    private double unitaryPrice;
    //Relation Shopping-Supplier
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supplier", nullable = false)
    private Supplier supplier;
}
