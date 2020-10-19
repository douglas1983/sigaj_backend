package br.net.at2d.sigaj.Security;

import static br.net.at2d.sigaj.Security.SecurityConstants.HEADER_STRING;
import static br.net.at2d.sigaj.Security.SecurityConstants.TOKEN_PREFIX;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.net.at2d.sigaj.Cliente.Cliente;
import br.net.at2d.sigaj.Cliente.ClienteService;
import br.net.at2d.sigaj.mappers.ClienteMapper;
import br.net.at2d.sigaj.service.SendGridEmailServiceInterface;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

  @Autowired
  ClienteMapper mapper;

  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private JwtTokenUtil jwtTokenUtil;

  @Autowired
  private ClienteService userDetailsService;

  @Autowired
  SendGridEmailServiceInterface sendGridEmailService;

  @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
  public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
    authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
    final Cliente userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());

    final String token = jwtTokenUtil.generateToken((UserDetails) userDetails);
    HttpHeaders responseHeaders = new HttpHeaders();
    responseHeaders.set(HEADER_STRING, TOKEN_PREFIX + token);

    return ResponseEntity.ok().headers(responseHeaders).body(new JwtResponse(token, mapper.map(userDetails)));
  }

  @RequestMapping(value = "/authenticatecnpj", method = RequestMethod.POST)
  public ResponseEntity<?> createAuthenticationCnpjToken(@RequestBody JwtRequestCnpj authenticationRequest)
      throws Exception {

    final Cliente userDetails = authenticateCnpj(authenticationRequest.getCnpj());
    final String token = jwtTokenUtil.generateToken((UserDetails) userDetails);
    HttpHeaders responseHeaders = new HttpHeaders();
    responseHeaders.set(HEADER_STRING, TOKEN_PREFIX + token);

    return ResponseEntity.ok().headers(responseHeaders).body(new JwtResponse(token, mapper.map(userDetails)));
  }

  private void authenticate(String username, String password) throws Exception {
    try {
      authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
    } catch (DisabledException e) {
      throw new Exception("USER_DISABLED", e);
    } catch (BadCredentialsException e) {
      throw new Exception("INVALID_CREDENTIALS", e);
    }
  }

  private Cliente authenticateCnpj(String cnpj) throws Exception {
    try {
      final Cliente userDetails = userDetailsService.loadByCnpj(cnpj);
      authenticationManager
          .authenticate(new UsernamePasswordAuthenticationToken(userDetails.getUsername(), userDetails.getPassword()));
      return userDetails;
    } catch (DisabledException e) {
      throw new Exception("USER_DISABLED", e);
    } catch (BadCredentialsException e) {
      throw new Exception("INVALID_CREDENTIALS", e);
    }
  }
}