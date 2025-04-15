package com.ricardo.prueba.swagger.prueba_swagger.repositories;

import com.ricardo.prueba.swagger.prueba_swagger.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {

}
