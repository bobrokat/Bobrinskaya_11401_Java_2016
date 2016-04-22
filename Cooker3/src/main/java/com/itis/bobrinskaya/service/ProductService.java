package com.itis.bobrinskaya.service;


import com.itis.bobrinskaya.model.Product;
import com.itis.bobrinskaya.model.enums.ProductTypeEnum;

import java.util.List;

/**
 * Created by Ekaterina on 10.04.2016.
 */
public interface ProductService {

    List<Product> getAll();

    Product getOne(String name);

    void updateslider(String prod1, String prod2, String prod3);
    List<Product> getSlider();

    void updateMealsOfDay(String prod1, String prod2, String prod3, String prod4, String prod5);
    List<Product> getMealsOfDay();

    void updateFeaturedMeals(String prod1, String prod2, String prod3);
    List<Product> getFeaturedMeals();

    List<Product> sendToListing(ProductTypeEnum type);

    void createProduct(Product product);
}
