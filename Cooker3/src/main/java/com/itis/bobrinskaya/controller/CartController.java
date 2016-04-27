package com.itis.bobrinskaya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ekaterina on 27.04.2016.
 */
@Controller
@RequestMapping(value = "/cart")
public class CartController {
    @RequestMapping (value = "", method = RequestMethod.GET)
    public String getCard(){
        return "cart";
    }
}
