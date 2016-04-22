package com.itis.bobrinskaya.repository;


import com.itis.bobrinskaya.model.Product;
import com.itis.bobrinskaya.model.enums.ProductTypeEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by Ekaterina on 10.04.2016.
 */

public  interface ProductRepository extends JpaRepository<Product, Long> {


     Product findByName(String name);
     List<Product> findByType(ProductTypeEnum type);



}
