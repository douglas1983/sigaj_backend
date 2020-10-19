package br.net.at2d.sigaj.controller;

import java.time.LocalDateTime;

import com.sendgrid.Response;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.net.at2d.sigaj.Cliente.Cliente;
import br.net.at2d.sigaj.Cliente.ClienteService;
import br.net.at2d.sigaj.Security.JwtTokenUtil;
import br.net.at2d.sigaj.utils.confirmPassRequest;
import br.net.at2d.sigaj.utils.expireResetCodeResponse;
import br.net.at2d.sigaj.mappers.ClienteMapper;
import br.net.at2d.sigaj.service.SendGridEmailServiceInterface;
import br.net.at2d.sigaj.utils.ErrorResponse;
import br.net.at2d.sigaj.utils.signupRequest;

@RestController
public class AccessController {
  @Autowired
  ClienteMapper mapper;

  @Autowired
  private JwtTokenUtil jwtTokenUtil;

  @Autowired
  private ClienteService userDetailsService;

  @Autowired
  SendGridEmailServiceInterface sendGridEmailService;

  @RequestMapping(value = "/signup", method = RequestMethod.POST)
  public ResponseEntity<?> signup(@RequestBody signupRequest signupRequest) throws Exception {

    final Cliente userDetails = userDetailsService.findByEmail(signupRequest.getEmail());

    if (userDetails == null) {
      return ResponseEntity.badRequest().body(new ErrorResponse(400, "Bad Request", "Email não encontrado!"));
    }
    final String uuid = jwtTokenUtil.getUUID();

    userDetails.setResetcode(uuid);
    userDetails.setExpireResetCode(LocalDateTime.now().plusDays(2));
    Response response = sendGridEmailService.sendSignupCode(userDetails.getEmail(), uuid);
    if (response.getStatusCode() != 202) {
      System.out.println(response.getBody());
      return ResponseEntity.badRequest().body(new ErrorResponse(400, "Bad Request", response.getBody()));

    } else {
      userDetailsService.Save(userDetails);
      return ResponseEntity.accepted()
          .body(new ErrorResponse(HttpStatus.SC_ACCEPTED, "Accepted", "Email enviado com sussesso"));

    }

  }

  @RequestMapping(value = "/passwordforgot", method = RequestMethod.POST)
  public ResponseEntity<?> passwordForgot(@RequestBody signupRequest signupRequest) throws Exception {

    final Cliente userDetails = userDetailsService.findByEmail(signupRequest.getEmail());
    if (userDetails == null) {
      return ResponseEntity.badRequest().body(new ErrorResponse(400, "Bad Request", "Email não encontrado!"));
    }
    final String uuid = jwtTokenUtil.getUUID();

    userDetails.setResetcode(uuid);
    userDetails.setExpireResetCode(LocalDateTime.now().plusDays(2));
    Response response = sendGridEmailService.sendResetCode(userDetails.getEmail(), uuid);
    if (response.getStatusCode() != 202) {
      System.out.println(response.getBody());
      return ResponseEntity.badRequest().body(new ErrorResponse(400, "Bad Request", response.getBody()));

    } else {
      userDetailsService.Save(userDetails);
      return ResponseEntity.accepted()
          .body(new ErrorResponse(HttpStatus.SC_ACCEPTED, "Accepted", "Email enviado com sussesso"));
    }
  }

  @RequestMapping(value = "/confirmpassword", method = RequestMethod.POST)
  public ResponseEntity<?> passwordForgot(@RequestBody confirmPassRequest confirmPassRequest) throws Exception {
    final Cliente userDetails = userDetailsService.findByEmail(confirmPassRequest.getEmail());

    if (userDetails == null) {
      return ResponseEntity.badRequest().body(new ErrorResponse(400, "Bad Request", "Email não encontrado!"));
    }
    if (userDetails.getResetcode().equals(confirmPassRequest.getCode())) {

      if (userDetails.getExpireResetCode().isBefore(LocalDateTime.now())) {
        return ResponseEntity.badRequest().body(new ErrorResponse(400, "Bad Request", "Reset Code Expirado"));

      }
      userDetails.setSenhanet(confirmPassRequest.getPassword());
      userDetailsService.Save(userDetails);
      return ResponseEntity.accepted()
          .body(new ErrorResponse(HttpStatus.SC_ACCEPTED, "Accepted", "Senha alterada com sucesso"));
    } else {
      return ResponseEntity.badRequest().body(new ErrorResponse(400, "Bad Request", "Email e codigo não conferem"));

    }
  }

  @GetMapping(value = "/validateresetcode/{resetcode}")
  public ResponseEntity<?> validadeResetCode(@PathVariable String resetcode) throws Exception {
    final Cliente userDetails = userDetailsService.findByResetCode(resetcode);

    if (userDetails != null) {
      expireResetCodeResponse expire = new expireResetCodeResponse(userDetails.getEmail(), userDetails.getNome(),
          userDetails.getExpireResetCode().isBefore(LocalDateTime.now()));

      return ResponseEntity.accepted().body(expire);
    } else {
      return ResponseEntity.badRequest().body(new ErrorResponse(400, "Bad Request", "ResetCode não encontrado"));

    }
  }
}
