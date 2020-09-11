package br.net.at2d.sigaj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The primary key class for the EXPROT database table.
 * 
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "protocolo")
@Embeddable
public class ProtexPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "PROTOCOLO")
	private String protocolo;

	@Column(name = "PROTSEQ")
	private Integer protseq;

}