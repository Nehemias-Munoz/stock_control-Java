package com.marvic.stock_control.repository;

import com.marvic.stock_control.entity.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICostumerRepository extends JpaRepository<Costumer,Integer> {
}
