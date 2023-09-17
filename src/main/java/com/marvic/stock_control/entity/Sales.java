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
    @Column(name = "id_product", nullable = false)
    private int productId;
    @Column(nullable = false)
    private int quantity;
    @Column(name = "unitary_price", nullable = false)
    private double unitaryPrice;
    @Column(name = "id_client", nullable = false)
    private int clientId;

}
