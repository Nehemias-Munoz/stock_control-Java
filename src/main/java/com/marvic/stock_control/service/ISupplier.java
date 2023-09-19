package com.marvic.stock_control.service;

import com.marvic.stock_control.entity.Supplier;
import com.marvic.stock_control.model.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ISupplier {
    ResponseEntity<Response> getSupplierList();
    ResponseEntity<Response> createSupplier(Supplier supplier);
    ResponseEntity<Response> findSupplierById(int id);
    ResponseEntity<Response> updateSupplier(Supplier supplier);
    ResponseEntity<Response> deleteSupplier(Supplier supplier);
}
