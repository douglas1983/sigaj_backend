package br.net.at2d.sigaj.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the EXPEDICAO database table.
 * 
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(of = "codigo")
@Table(name = "EXPEDICAO")

public class Expedicao implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CODIGO")
  private Integer codigo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  @Column(name = "DATA")
  private LocalDateTime data;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  @Column(name = "HORA")
  private LocalDateTime hora;

  @Lob
  @Column(name = "OBS")
  private String obs;

  @Column(name = "RETIRADO")
  private Integer retirado;

  @Column(name = "RETNOME")
  private String retnome;

  @Column(name = "RETRG")
  private String retrg;

  // bi-directional many-to-one association to Func
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "FUNC")
  private Func funcBean;

  // bi-directional many-to-one association to Protex
  @OneToMany(mappedBy = "expedicao", fetch = FetchType.LAZY)
  @JsonIgnore
  private List<Protex> protexs;

}