package br.net.at2d.sigaj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.net.at2d.sigaj.service.BoletoCaixaService;
import br.net.at2d.sigaj.utils.boletoCefRequest;

@RestController
public class BoletoCEFController {

  @Autowired
  private BoletoCaixaService service;

  @RequestMapping(value = "/boletocef", method = RequestMethod.POST)
  public ResponseEntity<?> boletocef(@RequestBody boletoCefRequest cefRequest) throws Exception {
    return ResponseEntity.accepted().body(
        service.RegistrarBoleto(cefRequest.getIdcliente(), cefRequest.getNossonumero(), cefRequest.getValorboleto()));

  }
}
