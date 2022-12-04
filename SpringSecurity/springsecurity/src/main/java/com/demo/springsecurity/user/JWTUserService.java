package com.demo.springsecurity.user;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JWTUserService {


    private static String SECRET="jbhv31iug08asdfh10i4u3vt01u48y8g08hbngqojrbg";

    private static String CLAIM_USER="username";

    private static int expirationDate= 120000;  // 12 min

    Algorithm algorithm= Algorithm.HMAC256(SECRET);
    public String createTokenFromUsername(String username) {
        var jwtToken=JWT.create()
                .withClaim(CLAIM_USER,username)
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(new Date().getTime()+expirationDate))
                .sign(algorithm);

        return jwtToken;
    }
    public void getUserFromJwtToken(String jwtToken) {

    }
}
