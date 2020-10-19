package br.net.at2d.sigaj.utils;

import java.io.Serializable;

public class expireResetCodeResponse implements Serializable {

  private static final long serialVersionUID = 5926468583005150707L;

  private String email;

  private String nome;

  private Boolean expired;

  public expireResetCodeResponse() {

  }

  public expireResetCodeResponse(String email, String nome, Boolean expired) {
    this.email = email;
    this.nome = nome;
    this.expired = expired;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Boolean isExpired() {
    return this.expired;
  }

  public Boolean getExpired() {
    return this.expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

}