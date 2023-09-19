package com.marvic.stock_control.service;

import com.marvic.stock_control.entity.Costumer;

import java.util.List;

public interface ICostumer {
    List<Costumer> getCostumerList();
    Costumer createCostumer(Costumer costumer);
    Costumer findCostumerById(int id);
    Costumer updateCostumer(Costumer costumer);
    void deleteCostumer(Costumer costumer);
}
