package br.net.at2d.sigaj.Security;

import java.io.Serializable;

public class JwtRequestCnpj implements Serializable {

  private static final long serialVersionUID = 5926468583005150707L;

  private String cnpj;

  public JwtRequestCnpj() {
  }

  public JwtRequestCnpj(String cnpj) {
    this.setCnpj(cnpj);

  }

  public String getCnpj() {
    return this.cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

}