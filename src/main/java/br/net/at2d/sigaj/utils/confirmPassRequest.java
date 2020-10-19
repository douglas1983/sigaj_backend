package br.net.at2d.sigaj.utils;

import java.io.Serializable;

public class confirmPassRequest implements Serializable {

  private static final long serialVersionUID = 5926468583005150707L;

  private String email;

  private String code;

  private String password;

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public confirmPassRequest() {
  }

  public confirmPassRequest(String email, String code, String password) {
    this.setEmail(email);
    this.setCode(code);
    this.setPassword(password);

  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}