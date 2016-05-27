package itis.bobrinskaya.service.impl;

import itis.bobrinskaya.service.LoginService;
import itis.bobrinskaya.web.WebLinks;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Ekaterina on 27.05.2016.
 */
public class LoginServiceImpl implements LoginService {

    RestTemplate restTemplate = new RestTemplate();
    @Override
    public ResponseEntity<Boolean> signIn(String login, String password) {
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        params.add("login", login);
        params.add("password", password);
        return restTemplate.postForEntity(WebLinks.SIGN_IN, params, Boolean.class);
    }
}
