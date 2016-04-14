package com.itis.bobrinskaya.service;


import com.itis.bobrinskaya.model.Product;

import java.util.List;

/**
 * Created by Ekaterina on 10.04.2016.
 */
public interface ProductService {

    List<Product> getAll();

    List<Product> sendToSlider();
    List<Product> sendToMealsOfDay();
    List<Product> sendToFeatured();


    List<Product> sendToListing(String type);
}
