package br.net.at2d.sigaj.Cliente;

import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the CLIENTE database table.
 * 
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(of = "Seq")

public class ClienteDTO {

  private Integer seq;

  private String celular;

  private String cnpj;

  private String codigo;

  private String diretor;

  private String email;

  private String endbairro;

  private String endcep;

  private String endcidade;

  private String endcomp;

  private String endestado;

  private Integer endnum;

  private String endrua;

  private String fax;

  private String ie;

  private String im;

  private String loginnet;

  private String msg;

  private String nome;

  private String resp;

  private String status;
  private String status2;

  private Integer tabdes;

  private String telefone;

  private Integer tipo;

}