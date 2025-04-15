package com.ricardo.prueba.swagger.prueba_swagger.services;

import com.ricardo.prueba.swagger.prueba_swagger.models.Product;
import com.ricardo.prueba.swagger.prueba_swagger.repositories.ProductRepository;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl {

    final private ProductRepository repository;
    final private  Environment environment;

    public ProductServiceImpl(ProductRepository repository, Environment environment){
        this.repository = repository;
        this.environment = environment;
    }

    @Transactional
    public List<Product> findAll() {
        return ((List<Product>)repository.findAll()).stream().map(product -> {
            product.setPort(Integer.parseInt(this.environment.getProperty("local.server.port")));
            return product;
        }).collect(Collectors.toList());
    }


}
