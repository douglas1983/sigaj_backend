package br.net.at2d.sigaj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.net.at2d.sigaj.service.BoletoCaixaService;
import br.net.at2d.sigaj.utils.boletoCefRequest;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class BoletoCEFController {

  @Autowired
  private BoletoCaixaService service;

  @RequestMapping(value = "/boletocef", method = RequestMethod.POST)
  public ResponseEntity<?> boletocef(@RequestBody boletoCefRequest request) throws Exception {
    return ResponseEntity.accepted()
        .body(service.RegistrarBoleto(request.getIdcliente(), request.getNossonumero(), request.getValorboleto()));

  }
}
