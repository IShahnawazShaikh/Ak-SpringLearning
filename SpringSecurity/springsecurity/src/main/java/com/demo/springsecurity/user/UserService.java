package com.demo.springsecurity.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private JWTUserService jwtUserService;
    public UserResponseDto loginUser(String username, String password) {
        String jwtToken=jwtUserService.createTokenFromUsername(username);
        UserResponseDto userResponseDto=new UserResponseDto();
        userResponseDto.setToken(jwtToken);
        userResponseDto.setUsername(username);
        userResponseDto.setPassword(password);
        return  userResponseDto;
    }
}
