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

@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(of = "codigo")
@Entity
@Table(name = "PROCESSO")
public class Processo implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CODIGO")
  private Integer codigo;

  // @Column(name = "ASSESSOR")
  // private Integer assessor;

  @ManyToOne()
  @JoinColumn(name = "ASSESSOR")
  private Func assessor;

  @Column(name = "CHECKLIST")
  private String checklist;

  @Column(name = "CODCLI")
  private String codcli;

  @Column(name = "CODCLI2")
  private String codcli2;

  @Column(name = "COMPEDENCIA")
  private String compedencia;

  @Column(name = "CONTROLENET")
  private String controlenet;

  @Column(name = "EMPCIDADE")
  private String empcidade;

  @Column(name = "EMPNIRE")
  private String empnire;

  @Column(name = "EMPNOME")
  private String empnome;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  @Column(name = "ENTDATA")
  private LocalDateTime entdata;

  // @Column(name = "ENTFUNC")
  // private Integer entfunc;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  @Column(name = "ENTHORA")
  private LocalDateTime enthora;

  @Column(name = "EXCLUI")
  private String exclui;

  @Column(name = "IDREMESSADIGITAL")
  private Integer idremessadigital;

  @Column(name = "LOCATENDIMENTO")
  private Integer locatendimento;

  @Column(name = "NUMBOLETO")
  private String numboleto;

  @Column(name = "NUMPASTA")
  private String numpasta;

  @Column(name = "OBS")
  private String obs;

  @Column(name = "OFICIO")
  private String oficio;

  @Column(name = "OPCAOCLIENTE")
  private String opcaocliente;

  @Column(name = "PRAZO")
  private Integer prazo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  @Column(name = "PREVENTREGA")
  private LocalDateTime preventrega;

  @Column(name = "PREVIA")
  private String previa;

  @Column(name = "PROXFASE")
  private Integer proxfase;

  @Column(name = "REGIME")
  private Integer regime;

  @Column(name = "SENHA")
  private String senha;

  // bi-directional many-to-one association to Protocolo
  @OneToMany(mappedBy = "processo", fetch = FetchType.LAZY)
  @JsonIgnore
  private List<Protocolo> protocolos;

  // bi-directional many-to-one association to Func
  @ManyToOne()
  @JoinColumn(name = "ENTFUNC")
  private Func funcionario;

}