package com.itis.bobrinskaya.controller;

import com.itis.bobrinskaya.model.Product;
import com.itis.bobrinskaya.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Ekaterina on 12.04.2016.
 */

@Controller
public class Maincontroller {
    @Autowired
    ProductService productService;

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String hiPage(ModelMap model) {
        List<Product> productsSlider = productService.sendToSlider();
        List<Product> productOfDay = productService.sendToMealsOfDay();
        List<Product> productsFeatured = productService.sendToFeatured();
        model.put("productsSlider", productsSlider);
        model.put("productsOfDay", productOfDay);
        model.put("productsFeatured", productsFeatured);
        return "index";
    }
}
