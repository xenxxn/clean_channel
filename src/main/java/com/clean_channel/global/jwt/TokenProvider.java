package com.clean_channel.global.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TokenProvider {

  @Value("${spring.jwt.secret}")
  private String secretKey;
  private final long ACCESS_TOKEN_EXPIRE_TIME = 1000 * 60 * 60;
  private static final String KEY_AUTHORITY = "authority";
  public String generateToken(String memberId, String authority) {
    long now = (new Date()).getTime();

    Claims claims = Jwts.claims().setSubject(memberId);
    claims.put(KEY_AUTHORITY, authority);

    return  Jwts.builder()
        .setClaims(claims)
        .setIssuedAt(new Date())
        .setExpiration(new Date(now + ACCESS_TOKEN_EXPIRE_TIME))
        .signWith(SignatureAlgorithm.HS512, this.secretKey)
        .compact();

  }
}
