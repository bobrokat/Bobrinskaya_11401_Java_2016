package com.itis.bobrinskaya.api.controller;

import com.itis.bobrinskaya.api.service.AuthService;
import com.itis.bobrinskaya.model.Product;
import com.itis.bobrinskaya.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Ekaterina on 27.05.2016.
 */

@RestController
@RequestMapping(value = "api")
public class AuthFXController {
    @Autowired
    AuthService authService;

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Boolean> login(String login, String password) {
        if (authService.authAdmin(password, login)) {
            return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
        } else {
            return new ResponseEntity<Boolean>(Boolean.FALSE, HttpStatus.OK);
        }
    }


    @RequestMapping(value = "/getProds", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Product[]> getProds() {
        List<Product> products = productRepository.findAll();
        Product[] products1 = new Product[products.size()];
        for(int i = 0; i < products.size(); i ++){
            products1[i] = products.get(i);
            System.out.println(products1[i].getName());
        }
        ResponseEntity<Product[]> responseEntity = new ResponseEntity<Product[]>(products1, HttpStatus.OK);
        return  responseEntity;
    }



    @RequestMapping(value = "/getProd", method = RequestMethod.POST)
     @ResponseBody
     public ResponseEntity<Product> getProd(String name) {
        Product product = productRepository.findByName(name);
        ResponseEntity<Product> responseEntity = new ResponseEntity<Product>(product, HttpStatus.OK);
        System.out.println(responseEntity.getBody().getName());
        return responseEntity;
    }

    @RequestMapping(value = "/deleteProd", method = RequestMethod.POST)
    @ResponseBody
    public void deleteProd(int id) {
        productRepository.delete(productRepository.findOne((long) id));
    }
}
