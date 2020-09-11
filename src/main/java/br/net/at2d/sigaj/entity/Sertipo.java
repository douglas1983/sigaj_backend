package br.net.at2d.sigaj.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the SERTIPO database table.
 * 
 */
@Entity
@Table(name = "SERTIPO")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "codigo")
public class Sertipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO")
	private Integer codigo;

	@Column(name = "CODSER")
	private String codser;

	@Column(name = "DATABAIXAREG")
	private String databaixareg;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "ENCERRARAPOSENVIOSP")
	private String encerraraposenviosp;

	@Column(name = "GRUPOQUANT")
	private String grupoquant;

	@Column(name = "GRUPORECEITA")
	private String gruporeceita;

	@Column(name = "LCMEI")
	private String lcmei;

	@Column(name = "PAGINA", nullable = true)
	private Integer pagina;

	@Column(name = "Portaria30")
	private String portaria30;

	@Column(name = "PROCURACAO")
	private String procuracao;

	@Column(name = "Status")
	private String status;

	@Column(name = "TIPO")
	private String tipo;

	@Column(name = "VALOR24")
	private Double valor24;

	@Column(name = "VALORN")
	private Double valorn;

	@JsonIgnore
	@OneToMany(mappedBy = "codser", fetch = FetchType.LAZY)
	private Set<Serdes> serdes;

}