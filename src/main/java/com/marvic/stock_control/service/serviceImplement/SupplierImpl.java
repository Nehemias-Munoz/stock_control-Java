package com.marvic.stock_control.service.serviceImplement;

import com.marvic.stock_control.entity.Supplier;
import com.marvic.stock_control.model.Response;
import com.marvic.stock_control.repository.ISupplierRepository;
import com.marvic.stock_control.service.ISupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

import static java.time.LocalDateTime.now;

@Service
public class SupplierImpl implements ISupplier {

    @Autowired
    ISupplierRepository iSupplierRepository;
    @Override
    public ResponseEntity<Response> getSupplierList() {
        return ResponseEntity.ok(Response.builder()
                .timeStamp(now())
                .status(HttpStatus.OK)
                .statusCode(HttpStatus.OK.value())
                .message("All supplier retrieved")
                .data(Map.of("suppliers", iSupplierRepository.findAll()))
                .build()
        );
    }

    @Override
    public ResponseEntity<Response> createSupplier(Supplier supplier) {
        return ResponseEntity.ok(Response.builder()
                .timeStamp(now())
                .status(HttpStatus.CREATED)
                .statusCode(HttpStatus.CREATED.value())
                .message("Supplier created")
                .data(Map.of("suppliers", iSupplierRepository.save(supplier)))
                .build()
        );
    }

    @Override
    public ResponseEntity<Response> findSupplierById(int id) {
        return ResponseEntity.ok(Response.builder()
                .timeStamp(now())
                .status(HttpStatus.OK)
                .statusCode(HttpStatus.OK.value())
                .message("Supplier retrieved")
                .data(Map.of("supplier", iSupplierRepository.findById(id)))
                .build()
        );
    }


    //Todo: implementar metodo update
    @Override
    public ResponseEntity<Response> updateSupplier(Supplier supplier) {
        return ResponseEntity.ok(Response.builder()
                .timeStamp(now())
                .status(HttpStatus.OK)
                .statusCode(HttpStatus.OK.value())
                .message("supplier updated")
                .data(Map.of("suppliers", iSupplierRepository.findAll()))
                .build()
        );
    }

    @Override
    public ResponseEntity<Response> deleteSupplier(Supplier supplier) {
        iSupplierRepository.delete(supplier);
        return ResponseEntity.ok(Response.builder()
                .timeStamp(now())
                .status(HttpStatus.OK)
                .statusCode(HttpStatus.OK.value())
                .message("supplier deleted")
                .data(Map.of("isSupplierDeleted", true))
                .build()
        );
    }
}
