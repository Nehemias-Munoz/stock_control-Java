package com.marvic.stock_control.repository;

import com.marvic.stock_control.entity.Shopping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IShoppingRepository extends JpaRepository<Shopping,Long> {
}
