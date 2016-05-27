package itis.bobrinskaya.service;

import org.springframework.http.ResponseEntity;

/**
 * Created by Ekaterina on 27.05.2016.
 */
public interface LoginService {
    ResponseEntity<Boolean> signIn(String login, String password);
}
