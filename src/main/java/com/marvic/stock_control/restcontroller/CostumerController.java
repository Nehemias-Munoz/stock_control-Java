package com.marvic.stock_control.restcontroller;

import com.marvic.stock_control.entity.Costumer;
import com.marvic.stock_control.service.serviceImplement.CostumerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/costumer")
public class CostumerController {
    @Autowired
    CostumerImpl objCostumer;

    @GetMapping()
    public List<Costumer> getCostumerList() {
        return objCostumer.getCostumerList();
    }

    @PostMapping("/create/")
    public Costumer createCostumer(@RequestBody Costumer costumer) {
        return objCostumer.createCostumer(costumer);
    }

    @GetMapping("/get/{idCostumer}")
    public Costumer findCostumerById(@PathVariable int id) {
        return objCostumer.findCostumerById(id);
    }

    @PutMapping("/update/")
    public Costumer updateCostumer(@RequestBody Costumer costumer) {
        return objCostumer.updateCostumer(costumer);
    }

    @DeleteMapping("/delete/")
    public void deleteCostumer(@RequestBody Costumer costumer) {objCostumer.deleteCostumer(costumer);}
}
