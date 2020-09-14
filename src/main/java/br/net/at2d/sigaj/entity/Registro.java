package br.net.at2d.sigaj.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;

/**
 * The persistent class for the REGISTRO database table.
 * 
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(of = "idReg")
@Table(name = "REGISTRO")
public class Registro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_REG")
	private Integer idReg;

	@Column(name = "PROTOCOLO")
	private String protocolo;

	@Column(name = "PROTSEQ")
	private Integer protseq;

	@Column(name = "CNPJ")
	private String cnpj;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name = "DATA")
	private LocalDateTime data;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name = "DATAREL")
	private LocalDateTime datarel;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FUNC")
	private Func funcionario;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name = "HORA")
	private LocalDateTime hora;

	@Column(name = "MEI")
	private String mei;

	@Column(name = "NIREFILIAL")
	private String nirefilial;

	@Lob
	@Column(name = "OBS")
	private String obs;

	@Column(name = "REGISTRO")
	private String registro;

	@Column(name = "RELATORIO")
	private Integer relatorio;

	@Column(name = "TRANSFERIDO")
	private Integer transferido;

	// bi-directional one-to-one association to Protocolo
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "PROTOCOLO", referencedColumnName = "NUMERO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PROTSEQ", referencedColumnName = "SEQPROT", nullable = false, insertable = false, updatable = false) })
	private Protocolo protocoloRegistro;

}