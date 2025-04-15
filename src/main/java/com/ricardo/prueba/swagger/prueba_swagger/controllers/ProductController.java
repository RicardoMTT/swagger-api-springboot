package com.ricardo.prueba.swagger.prueba_swagger.controllers;

import com.ricardo.prueba.swagger.prueba_swagger.services.ProductServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(
        name = "Productos",
        description = "Controlador para productos"
)
public class ProductController {

    final private ProductServiceImpl service;

    public ProductController(ProductServiceImpl service){
        this.service = service;
    }

    @Operation(
            summary = "Listar productos",
            description = "Retorna un lista de todos los productos registrado en la tabla products"
    )
    @GetMapping
    public ResponseEntity<?> list(){
        return ResponseEntity.ok(this.service.findAll());
    }

}
