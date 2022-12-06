package com.demo.springsecurity.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.AuthenticationConverter;
import org.springframework.security.web.authentication.AuthenticationFilter;
import org.springframework.stereotype.Service;

@Service
public class JWTAuthFilter extends AuthenticationFilter {

    public JWTAuthFilter(JWTAuthenticationManager authenticationManager, JWTAuthenticationConverter authenticationConverter) {
        super(authenticationManager, authenticationConverter);
    }
}
