package br.net.at2d.sigaj.utils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class boletoCefRequest implements Serializable {

  private static final long serialVersionUID = 5926468583005150707L;

  private Integer idcliente;

  private String nossonumero;

  private BigDecimal valorboleto;

  public boletoCefRequest() {
  };

  public boletoCefRequest(Integer idcliente, String nossonumero, BigDecimal valorboleto) {
    this.idcliente = idcliente;
    this.nossonumero = nossonumero;
    this.valorboleto = valorboleto;
  }

  public Integer getIdcliente() {
    return this.idcliente;
  }

  public void setIdcliente(Integer idcliente) {
    this.idcliente = idcliente;
  }

  public String getNossonumero() {
    return this.nossonumero;
  }

  public void setNossonumero(String nossonumero) {
    this.nossonumero = nossonumero;
  }

  public BigDecimal getValorboleto() {
    return this.valorboleto;
  }

  public void setValorboleto(BigDecimal valorboleto) {
    this.valorboleto = valorboleto;
  }
}