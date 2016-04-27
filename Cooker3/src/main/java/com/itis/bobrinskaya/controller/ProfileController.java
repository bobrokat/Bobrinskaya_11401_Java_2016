package com.itis.bobrinskaya.controller;

import com.itis.bobrinskaya.model.Users;
import com.itis.bobrinskaya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by Ekaterina on 27.04.2016.
 */
@Controller
@RequestMapping(value = "/profile")
public class ProfileController {
    @Autowired
    UserService service;

    @RequestMapping(value = "")
    public String moderDefault(RedirectAttributes redirectAttributes){
        Users user = (Users) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        redirectAttributes.addAttribute("login", user.getLogin());
        return "redirect:/profile/{login}";
    }
    @RequestMapping(value = "/{login}",method = RequestMethod.GET)
    public String getProfile(ModelMap modelMap, @PathVariable String login) {
        modelMap.addAttribute("user", service.getOneByLogin(login));

        return "profile";
    }
}
