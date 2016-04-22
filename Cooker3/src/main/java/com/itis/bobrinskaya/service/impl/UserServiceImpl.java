package com.itis.bobrinskaya.service.impl;

import com.itis.bobrinskaya.model.Users;
import com.itis.bobrinskaya.repository.UserRepository;
import com.itis.bobrinskaya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ekaterina on 22.04.2016.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Users getOneById(Long id) {
       return userRepository.findOne(id);
    }

    @Override
    public Users getOneByLogin(String login) {
        return userRepository.findByLogin(login);
    }
}
