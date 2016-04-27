package com.itis.bobrinskaya.controller;

import com.itis.bobrinskaya.form.RegistrationForm;
import com.itis.bobrinskaya.model.Users;
import com.itis.bobrinskaya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by Ekaterina on 26.04.2016.
 */
@Controller
public class AuthenticationController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/index")
    public String getLoginPage(@RequestParam(value = "error", required = false) Boolean error, Model model) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        return "index";
    }

    @RequestMapping("/default")
    public String defaultAfterLogin(HttpServletRequest request) {
        if (request.isUserInRole("ROLE_CONTENT_ADMIN")) {
            return "redirect:/contentadmin";
        } else if (request.isUserInRole("ROLE_USER")) {
            return "redirect:/profile";
        }  else {
            return "redirect:/index";
        }
    }

//    @RequestMapping(value = "/index", method = RequestMethod.GET)
//    public String getRegForm(Model model) {
//        model.addAttribute("moder_form", new RegistrationForm());
//        return "index";
//    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("userform") @Valid RegistrationForm form, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/index";
        }
        String login = form.getLogin();
        String phone = form.getPhone();
        String password = form.getPassword();
        String role = form.getRole();
        Users user = new Users();
        user.setLogin(login);
        user.setPassword(password);
        user.setPhone(phone);
        user.setRole(role);
        userService.createUser(user);
        return "redirect:/index";
    }

}
