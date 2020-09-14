
package br.net.at2d.sigaj.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * The persistent class for the CNPJ database table.
 * 
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(of = "cnpjid")
@Table(name = "CNPJ")

public class Cnpj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CNPJID")
	private Integer cnpjid;

	@Column(name = "CNPJ")
	private String cnpj;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name = "DATA")
	private LocalDateTime data;

	@Lob
	@Column(name = "IMAGEM")
	private byte[] imagem;

	@Column(name = "PROTOCOLO")
	private String protocolo;

	@Column(name = "PROTSEQ")
	private Integer protseq;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "PROTOCOLO", referencedColumnName = "NUMERO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PROTSEQ", referencedColumnName = "SEQPROT", nullable = false, insertable = false, updatable = false) })
	private Protocolo protocoloCnpj;

}