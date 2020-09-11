package br.net.at2d.sigaj.Security;

import static br.net.at2d.sigaj.Security.SecurityConstants.EXPIRATION_TIME;
import static br.net.at2d.sigaj.Security.SecurityConstants.SECRET;
import static com.auth0.jwt.algorithms.Algorithm.HMAC512;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import br.net.at2d.sigaj.Cliente.Cliente;

@Component
public class JwtTokenUtil implements Serializable {
  private static final long serialVersionUID = -2550185165626007488L;
  public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;

  // retorna o username do token jwt
  public String getUsernameFromToken(String token) {
    return getJWT(token).getSubject();
  }

  // retorna expiration date do token jwt
  public Date getExpirationDateFromToken(String token) {
    return getJWT(token).getExpiresAt();
  }

  // para retornar qualquer informação do token nos iremos precisar da secret key
  private DecodedJWT getJWT(String token) {
    try {
      DecodedJWT jwt = JWT.decode(token);

      return jwt;
    } catch (JWTDecodeException exception) {
      // Invalid token
      return null;
    }

  }

  // check if the token has expired
  private Boolean isTokenExpired(String token) {
    final Date expiration = getExpirationDateFromToken(token);
    return expiration.before(new Date());
  }

  // gera token para user
  public String generateToken(UserDetails userDetails) {
    Map<String, Object> claims = new HashMap<>();
    return doGenerateToken(claims, userDetails.getUsername(), ((Cliente) userDetails).getCodigo().toString());
  }

  // Cria o token e devine tempo de expiração pra ele
  private String doGenerateToken(Map<String, Object> claims, String subject, String issuer) {
    String token = JWT.create().withSubject(subject).withIssuer(issuer)
        .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME)).sign(HMAC512(SECRET.getBytes()));

    return token;
  }

  // valida o token
  public Boolean validateToken(String token, UserDetails userDetails) {
    final String username = getUsernameFromToken(token);
    return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
  }

  public String getIssuerFromToken(String token) {
    return getJWT(token).getIssuer();
  }

  public String getIssuerFromContext() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();

    return (String) auth.getCredentials();
  }

  public String getUsernameFromContext() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();

    return (String) auth.getPrincipal();
  }
}