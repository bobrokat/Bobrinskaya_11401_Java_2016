package com.itis.bobrinskaya.controller;

import com.itis.bobrinskaya.model.Orders;
import com.itis.bobrinskaya.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ekaterina on 07.05.2016.
 */
@Controller
public class PdfController {
    @Autowired
    OrderService orderService;
    @RequestMapping(value = "/pdf", method= RequestMethod.POST)
    public ModelAndView pdf(@RequestParam int orderidid) {
        Orders order = orderService.getOne(orderidid);

        System.out.println("ExcelPDFController pdf is called");
        //pdfDocument - look excel-pdf-config.xml
        return new ModelAndView("pdfDocument", "modelObject", order);

    }
}
