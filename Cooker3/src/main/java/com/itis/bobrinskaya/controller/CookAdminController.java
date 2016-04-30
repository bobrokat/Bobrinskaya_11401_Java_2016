package com.itis.bobrinskaya.controller;

import com.itis.bobrinskaya.model.Orders;
import com.itis.bobrinskaya.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Ekaterina on 29.04.2016.
 */
@Controller
@RequestMapping(value = "/cookadmin")
public class CookAdminController {
    @Autowired
    OrderService orderService;
    @RequestMapping(method = RequestMethod.GET)
    public String getCookPage(ModelMap modelMap){
       List<Orders> orders = orderService.getNotReady();
        System.out.println(orders);
        modelMap.put("orders", orders);
        return "cookadmin";
    }

}
