package com.itis.bobrinskaya.service.impl;

import com.itis.bobrinskaya.model.Product;
import com.itis.bobrinskaya.repository.ProductRepository;
import com.itis.bobrinskaya.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ekaterina on 10.04.2016.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> sendToSlider() {
        List<Product> products = new ArrayList<>();

        products.add(productRepository.findByName("�����"));
        products.add(productRepository.findByName("�����-�����"));
        products.add(productRepository.findByName("����"));



        return products;
    }

    @Override
    public List<Product> sendToMealsOfDay() {
        List<Product> products = new ArrayList<>();

        products.add(productRepository.findByName("�����"));
        products.add(productRepository.findByName("�����-�����"));
        products.add(productRepository.findByName("����"));



        return products;
    }

    @Override
    public List<Product> sendToFeatured() {
        List<Product> products = new ArrayList<>();

        products.add(productRepository.findByName("�����"));
        products.add(productRepository.findByName("�����-�����"));
        products.add(productRepository.findByName("����"));



        return products;
    }

    @Override
    public List<Product> sendToListing(String type) {
        List<Product> products = productRepository.findByType(type);
        return products;
    }
}
