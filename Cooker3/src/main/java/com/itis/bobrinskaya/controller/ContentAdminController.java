package com.itis.bobrinskaya.controller;

import com.itis.bobrinskaya.model.Product;
import com.itis.bobrinskaya.model.enums.ProductTypeEnum;
import com.itis.bobrinskaya.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Ekaterina on 15.04.2016.
 */
@Controller
@RequestMapping(value = "/contentadmin")
@SessionAttributes (types = String.class)
public class ContentAdminController {


    @Autowired
    ProductService productService;



    @RequestMapping( value = "", method = RequestMethod.GET)
    public String getTopage() {
        return "contentadmin";
    }


    @RequestMapping(value = "/addtoDB", method = RequestMethod.POST)
    public String addToDB(@RequestParam String name, @RequestParam double price, @RequestParam String type, @RequestParam String description, @RequestParam MultipartFile photo) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        ProductTypeEnum productTypeEnum = null;
        switch (type){
            case "PIZZA": productTypeEnum = ProductTypeEnum.PIZZA;
                break;
            case "ROLL": productTypeEnum = ProductTypeEnum.ROLL;
                break;
            case "WOK": productTypeEnum = ProductTypeEnum.WOK;
                break;
            case "DESERT": productTypeEnum = ProductTypeEnum.DESERT;
                break;
            case "DRINK": productTypeEnum = ProductTypeEnum.DRINK;
                break;
            case "ANOTHER": productTypeEnum = ProductTypeEnum.ANOTHER;
                break;
            case "KOMBO": productTypeEnum = ProductTypeEnum.KOMBO;
        }
        product.setType(productTypeEnum);
        product.setDescription(description);
        product.setPhoto(savefile(photo));

        productService.createProduct(product);
        return "redirect:/contentadmin";
    }

    public String savefile(MultipartFile photo){
        if (!photo.isEmpty()) {
            try {
                byte[] bytes = photo.getBytes();


                String rootPath = "C:\\Work\\Bobrinskaya_11401_Java_2016\\Cooker3\\target\\Cooker3-1.0-SNAPSHOT\\images";
                String rootPath2 = "C:\\Work\\Bobrinskaya_11401_Java_2016\\Cooker3\\src\\main\\webapp\\images";
                System.out.println("Server rootPath: " + rootPath);
                File dir = new File(rootPath);
                File dir2 = new File(rootPath2);

                if (!dir.exists()) {
                    dir.mkdirs();
                }
                String photoname = photo.getOriginalFilename();

                File uploadedFile = new File(dir.getAbsolutePath() + File.separator + photoname);
                File uploadedFile2 = new File(dir2.getAbsolutePath() + File.separator + photoname);

                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadedFile));
                stream.write(bytes);
                stream.flush();
                stream.close();
                BufferedOutputStream stream2 = new BufferedOutputStream(new FileOutputStream(uploadedFile2));
                stream2.write(bytes);
                stream2.flush();
                stream2.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "images/" + photo.getOriginalFilename();
    }

            @RequestMapping(value = "/addtoSlider", method = RequestMethod.POST)
    public String addToSlider(  @RequestParam String prod1, @RequestParam String prod2, @RequestParam String prod3) {
        productService.updateslider(prod1, prod2, prod3);
                return "redirect:/contentadmin";

    }

    @RequestMapping(value = "/removeProduct", method = RequestMethod.POST)
    public String removeProduct(@RequestParam String prodremove){
        Product product = productService.getOne(prodremove);
        productService.deleteProd(product);

        return "redirect:/contentadmin";
    }

}
