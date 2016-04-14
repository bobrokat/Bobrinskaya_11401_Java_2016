package com.itis.bobrinskaya.repository;


import com.itis.bobrinskaya.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by Ekaterina on 10.04.2016.
 */

public  interface ProductRepository extends JpaRepository<Product, Long> {

//@Query("select p from com.itis.bobrinskaya.model.Product p where p.name = :name")
     Product findByName(String name);

     List<Product> findByType(String type);

}
