package com.itis.bobrinskaya.security;

import com.itis.bobrinskaya.model.Users;
import com.itis.bobrinskaya.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ekaterina on 26.04.2016.
 */
public class AuthProviderImpl implements AuthenticationProvider {

    @Autowired
    UserRepository userRepository;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();

        Users user = userRepository.findByLogin(login);
        if (user == null) {
            System.out.println("user not found");
            throw new UsernameNotFoundException("user not found");

        }
        String password = authentication.getCredentials().toString();
        if (!encoder.matches(password, user.getPassword()) && !password.equals(user.getPassword())) {
            System.out.println("invalid password");
            throw new BadCredentialsException("invalid password");
        }

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(user.getRole()));

        return new UsernamePasswordAuthenticationToken(user, null, authorities);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
