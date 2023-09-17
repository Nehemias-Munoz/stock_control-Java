package com.marvic.stock_control.repository;

import com.marvic.stock_control.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISupplierRepository extends JpaRepository<Supplier,Integer> {
}
