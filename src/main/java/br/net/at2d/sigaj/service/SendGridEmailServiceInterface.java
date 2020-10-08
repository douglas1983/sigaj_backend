package br.net.at2d.sigaj.service;

import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;

import com.sendgrid.helpers.mail.objects.Email;
import com.sendgrid.helpers.mail.objects.Personalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SendGridEmailServiceInterface {

  private SendGrid sendGridClient;

  @Autowired
  public SendGridEmailServiceInterface(SendGrid sendGridClient) {
    this.sendGridClient = sendGridClient;
  }

  public void sendHTML(String from, String to, String subject) throws IOException {
    sendEmail(from, to, subject);

  }

  private Response sendEmail(String fromM, String toM, String subjectM) throws IOException {
    Mail mail = new Mail();
    mail.setFrom(new Email(fromM));
    mail.setTemplateId("d-13694169e5fc4460a6b3d4e782c17b19");

    Personalization personalization = new Personalization();
    personalization.addDynamicTemplateData("escritorio", "Escritorio Teste");
    personalization.addDynamicTemplateData("empresa", "Empresa Teste");
    personalization.addDynamicTemplateData("protocolo", "14.111.111/20-1");
    personalization.addDynamicTemplateData("resultado", "Indeferido");
    personalization.addDynamicTemplateData("colorresult", "#ff0000");

    personalization.addTo(new Email(toM));
    personalization.setSubject(subjectM);
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
