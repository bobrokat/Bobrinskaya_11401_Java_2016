package com.itis.bobrinskaya.security;


import com.itis.bobrinskaya.model.Users;
import com.itis.bobrinskaya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


@Component
public class MyUserDetailService implements UserDetailsService {

   @Autowired
   UserService userService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Users user = userService.getOneByLogin(login);
        if (user == null) throw new UsernameNotFoundException("User with name " + login + " not found");
        return new MyUserDetailes(user);
    }

}
