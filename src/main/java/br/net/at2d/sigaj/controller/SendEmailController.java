package br.net.at2d.sigaj.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.at2d.sigaj.service.SendGridEmailServiceInterface;

import java.io.IOException;

@RestController
public class SendEmailController {

  @Autowired
  SendGridEmailServiceInterface sendGridEmailService;

  @PostMapping("/sendemail")
  void newBouncedMail() {
    try {
      // Timestamp ts = new Timestamp(Long.valueOf(bouncedMail.getTimestamp()));
      sendGridEmailService.sendHTML("douglas@at2d.net.br", "dmoratos@gmail.com", "Resultado de Protocolo 2");
    } catch (IOException e) {
      System.out.println("Error receiving bounced mail: " + e.getMessage());
    }
  }

}
