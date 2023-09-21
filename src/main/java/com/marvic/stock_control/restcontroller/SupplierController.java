package com.marvic.stock_control.restcontroller;


import com.marvic.stock_control.entity.Supplier;
import com.marvic.stock_control.model.Response;
import com.marvic.stock_control.service.serviceImplement.SupplierImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController{
    @Autowired
    SupplierImpl objSupplier;

    @GetMapping()
    public ResponseEntity<Response> getSupplierList() {
        return objSupplier.getSupplierList();
    }

    @PostMapping("/createSupplier")
    public ResponseEntity<Response> createSupplier(@RequestBody Supplier supplier) {
        return objSupplier.createSupplier(supplier);
    }

    @GetMapping("/get/{idSupplier}")
    public ResponseEntity<Response> findSupplierById(@PathVariable int id) {
        return objSupplier.findSupplierById(id);
    }

    @PutMapping("/update/{idSupplier}")
    public ResponseEntity<Response> updateSupplier(@RequestBody Supplier supplier) {
        return objSupplier.updateSupplier(supplier);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Response> deleteSupplier(@RequestBody Supplier supplier) {
        return objSupplier.deleteSupplier(supplier);
    }

}
