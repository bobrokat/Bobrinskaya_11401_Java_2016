package com.itis.bobrinskaya.controller;

import com.itis.bobrinskaya.model.Product;
import com.itis.bobrinskaya.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Ekaterina on 14.04.2016.
 */

@Controller
public class ListingController {

    @Autowired
    ProductService productService;

@RequestMapping(value = "/listing", method = RequestMethod.GET)
    public String getListing(ModelMap model, @RequestParam String type){
    List<Product> products = productService.sendToListing(type);
    List<Product> productsFeatured = productService.sendToFeatured();
    model.put("products", products);
    model.put("productsFeatured", productsFeatured);
    return "listing";
}
    @RequestMapping(value = "/single", method = RequestMethod.GET)
    public String getSingle(){

        return "single";
    }


}
