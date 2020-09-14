package br.net.at2d.sigaj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the EXPROT database table.
 * 
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(of = "id")
@Table(name = "EXPROT")
public class Exprot implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ExprotPK id;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Lob
	@Column(name = "OBS")
	private String obs;

	// // bi-directional many-to-one association to Restipo
	// @ManyToOne
	// @JoinColumn(name = "CODRES")
	// private Restipo restipo;

	// bi-directional many-to-one association to Protocolo
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumns({
			@JoinColumn(name = "PROTOCOLO", referencedColumnName = "NUMERO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PROTSEQ", referencedColumnName = "SEQPROT", nullable = false, insertable = false, updatable = false) })
	private Protocolo protocoloBean;

}