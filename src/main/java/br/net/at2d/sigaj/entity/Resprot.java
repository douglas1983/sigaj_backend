package br.net.at2d.sigaj.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Lob;

import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the RESPROT database table.
 * 
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "RESPROT")
public class Resprot implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "RESPROTID")
  private int resprotid;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  @Column(name = "DATA")
  private LocalDateTime data;

  @Lob
  @Column(name = "OBS")
  private String obs;

  @Column(name = "RESULTADO")
  private Integer resultado;

  @Column(name = "PROTSEQ")
  private Integer protseq;

  @Column(name = "PROTOCOLO")
  private String protocolo;
  // @JsonIgnore
  // @ManyToOne(fetch = FetchType.LAZY)
  // @JoinColumns({
  // @JoinColumn(name = "PROTOCOLO", referencedColumnName = "NUMERO", nullable =
  // false, insertable = false, updatable = false),
  // @JoinColumn(name = "PROTSEQ", referencedColumnName = "SEQPROT", nullable =
  // false, insertable = false, updatable = false) })
  // private Protocolo protocoloResult;

}