package br.net.at2d.sigaj.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the SERDES database table.
 * 
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
@Table(name = "SERDES")
@NamedEntityGraph(name = "Serdes.codser", attributeNodes = @NamedAttributeNode("codser"))
public class Serdes implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SerdesPK id;

	@Column(name = "DES24")
	private Double des24;

	@Column(name = "DESN")
	private Double desn;

	// bi-directional many-to-one association to Desconto
	// @ManyToOne(fetch = FetchType.LAZY)
	// @JsonIgnore
	// @JoinColumn(name = "CODDES", nullable = false, insertable = false, updatable
	// = false)
	// private Desconto desconto;

	// bi-directional many-to-one association to Desconto
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODSER", nullable = false, insertable = false, updatable = false)
	private Sertipo codser;

}