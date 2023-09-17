package com.marvic.stock_control.repository;

import com.marvic.stock_control.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISalesRepository extends JpaRepository<Sales,Long> {
}
