package br.net.at2d.sigaj.utils;

import java.io.Serializable;

public class signupRequest implements Serializable {

  private static final long serialVersionUID = 5926468583005150707L;

  private String email;

  public signupRequest() {
  }

  public signupRequest(String email) {
    this.setEmail(email);

  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}