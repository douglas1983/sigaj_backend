package br.net.at2d.sigaj.Cliente;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the CLIENTE database table.
 * 
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(of = "Seq")

@Table(name = "\"CLIENTE\"")
public class Cliente implements UserDetails {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Seq")
  private Integer seq;

  @Column(name = "CELULAR")
  private String celular;

  @Column(name = "CNPJ")
  private String cnpj;

  @Column(name = "CODCLI2")
  private String codcli2;

  @Column(name = "CODIGO")
  private String codigo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  @Column(name = "DATAINSERT")
  private LocalDateTime datainsert;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  @Column(name = "DATAUPDATE")
  private LocalDateTime dataupdate;

  @Column(name = "DIRETOR")
  private String diretor;

  @Column(name = "EMAIL")
  private String email;

  @Column(name = "ENDBAIRRO")
  private String endbairro;

  @Column(name = "ENDCEP")
  private String endcep;

  @Column(name = "ENDCIDADE")
  private String endcidade;

  @Column(name = "ENDCOMP")
  private String endcomp;

  @Column(name = "ENDESTADO")
  private String endestado;

  @Column(name = "ENDNUM")
  private Integer endnum;

  @Column(name = "ENDRUA")
  private String endrua;

  @Column(name = "FAX")
  private String fax;

  @Column(name = "IE")
  private String ie;

  @Column(name = "IM")
  private String im;

  @Column(name = "LOGINNET")
  private String loginnet;

  @Column(name = "MSG")
  private String msg;

  @Column(name = "NOME")
  private String nome;

  @Column(name = "RESP")
  private String resp;

  @Column(name = "SENHANET")
  private String senhanet;

  @Column(name = "RESETCODE")
  private String resetcode;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  @Column(name = "EXPIRERESETCODE")
  private LocalDateTime expireResetCode;

  @Column(name = "STATUS")
  private String status;

  @Column(name = "STATUS2")
  private String status2;

  @Column(name = "TABDES")
  private Integer tabdes;

  @Column(name = "TELEFONE")
  private String telefone;

  @Column(name = "TIPO")
  private Integer tipo;

  @Column(name = "USUINSERT")
  private Integer usuinsert;

  @Column(name = "USUUPDATE")
  private Integer usuupdate;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    final Set<GrantedAuthority> _grntdAuths = new HashSet<GrantedAuthority>();
    SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ADMIN");
    _grntdAuths.add(authority);
    return _grntdAuths;
  }

  @Override
  public String getPassword() {

    return this.senhanet;
  }

  @Override
  public String getUsername() {

    return this.email;
  }

  @Override
  public boolean isAccountNonExpired() {

    return true;
  }

  @Override
  public boolean isAccountNonLocked() {

    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {

    return true;
  }

  @Override
  public boolean isEnabled() {

    return true;
  }

}