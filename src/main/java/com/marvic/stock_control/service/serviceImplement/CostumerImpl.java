package com.marvic.stock_control.service.serviceImplement;

import com.marvic.stock_control.entity.Costumer;
import com.marvic.stock_control.repository.ICostumerRepository;
import com.marvic.stock_control.service.ICostumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service()
public class CostumerImpl implements ICostumer {
    @Autowired
    ICostumerRepository iCostumerRepository;
    @Override
    public List<Costumer> getCostumerList() {
        return iCostumerRepository.findAll();
    }

    @Override
    public Costumer createCostumer(Costumer costumer) {
        return iCostumerRepository.save(costumer);
    }

    @Override
    public Costumer findCostumerById(int id) {
        return iCostumerRepository.findById(id).orElseThrow(()-> new NoSuchElementException(("Cliente no encontrado")));
    }

    @Override
    public Costumer updateCostumer(Costumer costumer) {
        Costumer newDataCostumer = new Costumer();
        if (iCostumerRepository.existsById(costumer.getId())){
            newDataCostumer = this.findCostumerById(costumer.getId());
            newDataCostumer.setName(costumer.getName());
            newDataCostumer.setAddress(costumer.getAddress());
            newDataCostumer.setPhone(costumer.getPhone());
            newDataCostumer.setSalesList(costumer.getSalesList());
            newDataCostumer.setProductList(costumer.getProductList());
        }
        return iCostumerRepository.save(newDataCostumer) ;
    }

    @Override
    public void deleteCostumer(Costumer costumer) {
        if (iCostumerRepository.existsById(costumer.getId())){
            iCostumerRepository.delete(costumer);
        }
    }
}
