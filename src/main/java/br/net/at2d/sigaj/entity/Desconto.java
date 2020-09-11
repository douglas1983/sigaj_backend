package br.net.at2d.sigaj.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * The persistent class for the DESCONTO database table.
 * 
 */
@Entity
@Table(name = "DESCONTO")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "codigo")
public class Desconto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO")
	private Integer codigo;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name = "DATAINICIO")
	private LocalDateTime datainicio;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "OBS")
	private String obs;

	@Column(name = "QTDEDIAS")
	private Integer qtdedias;

	@Column(name = "QTDEPROC")
	private Integer qtdeproc;

	// bi-directional many-to-one association to Serde

	@OneToMany(mappedBy = "desconto", fetch = FetchType.LAZY)
	private List<Serdes> serdes;
}