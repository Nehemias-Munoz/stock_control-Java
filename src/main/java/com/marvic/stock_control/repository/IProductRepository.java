package com.marvic.stock_control.repository;

import com.marvic.stock_control.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Integer> {
}
