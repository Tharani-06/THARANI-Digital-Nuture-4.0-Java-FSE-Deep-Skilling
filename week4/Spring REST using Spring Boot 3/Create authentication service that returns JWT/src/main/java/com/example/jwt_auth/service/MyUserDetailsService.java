package com.example.jwt_auth.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Replace with DB lookup in real apps
        if ("user".equals(username)) {
            return new User("user", "{noop}pwd", new ArrayList<>());
        }
        throw new UsernameNotFoundException("User not found");
    }
}
