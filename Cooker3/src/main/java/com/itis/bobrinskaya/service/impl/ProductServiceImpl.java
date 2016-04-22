package com.itis.bobrinskaya.service.impl;

import com.itis.bobrinskaya.model.Featuredmeals;
import com.itis.bobrinskaya.model.Mealsofday;
import com.itis.bobrinskaya.model.Product;
import com.itis.bobrinskaya.model.Slider;
import com.itis.bobrinskaya.model.enums.ProductTypeEnum;
import com.itis.bobrinskaya.repository.FeaturedmealsRepository;
import com.itis.bobrinskaya.repository.MealsOfDayRepository;
import com.itis.bobrinskaya.repository.ProductRepository;
import com.itis.bobrinskaya.repository.SliderRepository;
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

    @Autowired
    SliderRepository sliderRepository;

    @Autowired
    MealsOfDayRepository mealsOfDayRepository;

    @Autowired
    FeaturedmealsRepository featuredmealsRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getOne(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public void updateslider(String prod1, String prod2, String prod3) {
        sliderRepository.deleteAll();
        List<String> list = new ArrayList<>();
        list.add(prod1);
        list.add(prod2);
        list.add(prod3);
        for(String prod : list){
            Slider element = new Slider();
            element.setProduct(productRepository.findByName(prod));
            sliderRepository.save(element);
        }


    }

    @Override
    public List<Product> getSlider() {
        List<Slider> list = sliderRepository.findAll();
        List<Product> products = new ArrayList<>();
        for( Slider s : list){
            products.add(s.getProduct());
        }
        return products;
    }

    @Override
    public void updateMealsOfDay(String prod1, String prod2, String prod3, String prod4, String prod5) {
        mealsOfDayRepository.deleteAll();
        List<String> list = new ArrayList<>();
        list.add(prod1);
        list.add(prod2);
        list.add(prod3);
        list.add(prod4);
        list.add(prod5);
        for(String prod : list){
            Mealsofday element = new Mealsofday();
            element.setProduct(productRepository.findByName(prod));
            mealsOfDayRepository.save(element);
        }



    }

    @Override
    public List<Product> getMealsOfDay() {
        List<Mealsofday> list = mealsOfDayRepository.findAll();
        List<Product> products = new ArrayList<>();
        for(Mealsofday mealsofday: list){
            products.add(mealsofday.getProduct());
        }
        return products;
    }

    @Override
    public void updateFeaturedMeals(String prod1, String prod2, String prod3) {
        featuredmealsRepository.deleteAll();
        List<String> list = new ArrayList<>();
        list.add(prod1);
        list.add(prod2);
        list.add(prod3);
        for(String prod : list){
            Featuredmeals element = new Featuredmeals();
            element.setProduct(productRepository.findByName(prod));
            featuredmealsRepository.save(element);
        }



    }

    @Override
    public List<Product> getFeaturedMeals() {
        List<Featuredmeals> list = featuredmealsRepository.findAll();
        List<Product> products = new ArrayList<>();
        for( Featuredmeals s : list){
            products.add(s.getProduct());
        }
        return products;
    }



    @Override
    public List<Product> sendToListing(ProductTypeEnum type) {
        List<Product> products = productRepository.findByType(type);
        return products;
    }

    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }
}
