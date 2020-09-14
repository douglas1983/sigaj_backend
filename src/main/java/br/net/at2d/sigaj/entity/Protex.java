package br.net.at2d.sigaj.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the PROTEX database table.
 * 
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(of = "id")
@Table(name = "PROTEX")
public class Protex implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProtexPK id;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "PROTOCOLO", referencedColumnName = "NUMERO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PROTSEQ", referencedColumnName = "SEQPROT", nullable = false, insertable = false, updatable = false) })
	private Protocolo protocoloEx;

	// bi-directional many-to-one association to Expedicao
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODEX")
	private Expedicao expedicao;

}