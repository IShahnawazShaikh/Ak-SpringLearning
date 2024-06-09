package com.demo.springsecurity.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationConverter;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class JWTAuthenticationConverter implements AuthenticationConverter {
    @Override
    public Authentication convert(HttpServletRequest request) {
        var headerRequest=request.getHeader("Authorization");
        if(headerRequest!=null && headerRequest.startsWith("Bearer ")){
            var token=headerRequest.substring(7);

        }
        return null;
    }
}
