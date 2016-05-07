package com.itis.bobrinskaya.service;

import com.itis.bobrinskaya.model.Users;

/**
 * Created by Ekaterina on 22.04.2016.
 */

public interface UserService {


     Users getOneById(Long id);
     Users getOneByLogin(String login);
     void createUser(Users user);

     Users getOneByPhone(String phone);
}
