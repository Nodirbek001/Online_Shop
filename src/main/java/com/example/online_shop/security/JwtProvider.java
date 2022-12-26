package com.example.online_shop.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Date;

@Component
public class JwtProvider {
    private static final long expireTime = 60 * 60 * 100;
    private static final String security = "online Shop";

    public static String generateToken(String username, Collection roles) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expireTime))
                .signWith(SignatureAlgorithm.HS512, security)
                .compact();
    }

    public   String usernameFromToken(String token) {
        try {
            return Jwts.parser()
                    .setSigningKey(security)
                    .parseClaimsJws(token)
                    .getBody()
                    .getSubject();
        }catch (Exception e){
          return null;
        }
    }
}
