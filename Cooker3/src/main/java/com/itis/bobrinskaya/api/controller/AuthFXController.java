package com.itis.bobrinskaya.api.controller;

import com.itis.bobrinskaya.api.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ekaterina on 27.05.2016.
 */

@RestController
@RequestMapping(value = "api")
public class AuthFXController {
    @Autowired
    AuthService authService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Boolean> login(String login, String password) {
        if (authService.authAdmin(password, login)) {
            return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
        } else {
            return new ResponseEntity<Boolean>(Boolean.FALSE, HttpStatus.OK);
        }
    }
}
