package br.net.at2d.sigaj.service;

import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;

import com.sendgrid.helpers.mail.objects.Email;
import com.sendgrid.helpers.mail.objects.Personalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.at2d.sigaj.entity.Parametro;
import br.net.at2d.sigaj.repository.ParametroRepository;

import java.io.IOException;

@Service
public class SendGridEmailServiceInterface {

  private SendGrid sendGridClient;

  @Autowired
  private ParametroRepository ParamRepository;

  @Autowired
  public SendGridEmailServiceInterface(SendGrid sendGridClient) {
    this.sendGridClient = sendGridClient;
  }

  public Response sendResetCode(String toM, String resetcode) throws IOException {

    Parametro param = ParamRepository.findAll().get(0);

    Mail mail = new Mail();
    mail.setFrom(new Email(param.getEmail()));
    mail.setTemplateId(param.getResetTemplateId());

    Personalization personalization = new Personalization();
    personalization.addDynamicTemplateData("resetcode", resetcode);

    personalization.addTo(new Email(toM));
    personalization.setSubject("Resetar senha");
    mail.addPersonalization(personalization);

    Request request = new Request();
    try {
      request.setMethod(Method.POST);
      request.setEndpoint("mail/send");
      request.setBody(mail.build());
      Response response = sendGridClient.api(request);

      return response;
    } catch (IOException ex) {
      throw ex;
    }

  }

  public Response sendSignupCode(String toM, String resetcode) throws IOException {

    Parametro param = ParamRepository.findAll().get(0);

    Mail mail = new Mail();
    mail.setFrom(new Email(param.getEmail()));
    mail.setTemplateId(param.getSignupTemplateId());

    Personalization personalization = new Personalization();
    personalization.addDynamicTemplateData("resetcode", resetcode);

    personalization.addTo(new Email(toM));
    personalization.setSubject("Nova senha");
    mail.addPersonalization(personalization);

    Request request = new Request();
    try {
      request.setMethod(Method.POST);
      request.setEndpoint("mail/send");
      request.setBody(mail.build());
      Response response = sendGridClient.api(request);

      return response;
    } catch (IOException ex) {
      throw ex;
    }

  }
}
