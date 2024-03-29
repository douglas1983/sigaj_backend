package br.net.at2d.sigaj.Security;

import com.auth0.jwt.JWT;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import br.net.at2d.sigaj.Cliente.Cliente;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import static com.auth0.jwt.algorithms.Algorithm.HMAC512;
import static br.net.at2d.sigaj.Security.SecurityConstants.EXPIRATION_TIME;
import static br.net.at2d.sigaj.Security.SecurityConstants.HEADER_STRING;
import static br.net.at2d.sigaj.Security.SecurityConstants.SECRET;
import static br.net.at2d.sigaj.Security.SecurityConstants.TOKEN_PREFIX;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
  private AuthenticationManager authenticationManager;

  public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
    this.authenticationManager = authenticationManager;
  }

  @Override
  public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
      throws AuthenticationException {
    try {
      Cliente creds = new ObjectMapper().readValue(req.getInputStream(), Cliente.class);

      return authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(creds.getUsername(), creds.getPassword(), new ArrayList<>()));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, FilterChain chain,
      Authentication auth) throws IOException, ServletException {

    String token = JWT.create().withSubject(((User) auth.getPrincipal()).getUsername())
        .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME)).sign(HMAC512(SECRET.getBytes()));
    res.addHeader(HEADER_STRING, TOKEN_PREFIX + token);
    res.getWriter().write(token);
    res.getWriter().flush();
    res.getWriter().close();
  }
}