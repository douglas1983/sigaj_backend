package br.net.at2d.sigaj.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The primary key class for the SERDES database table.
 * 
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "coddes")
@Embeddable
public class SerdesPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "CODDES")
	private Integer coddes;

	@Column(name = "CODSER")
	private Integer codser;

}