package br.net.at2d.sigaj.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * The persistent class for the FUNC database table.
 * 
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(of = "codigo")
@Table(name = "FUNC")

public class Func implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO")
	private Integer codigo;

	@Column(name = "CPF")
	private String cpf;

	@Column(name = "ENDBAIRRO")
	private String endbairro;

	@Column(name = "ENDCEP")
	private String endcep;

	@Column(name = "ENDCIDADE")
	private String endcidade;

	@Column(name = "ENDCOMP")
	private String endcomp;

	@Column(name = "ENDESTADO")
	private String endestado;

	@Column(name = "ENDNUM")
	private Integer endnum;

	@Column(name = "ENDRUA")
	private String endrua;

	@Column(name = "FUNCAO")
	private Integer funcao;

	@Column(name = "LOGIN")
	private String login;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "RG")
	private String rg;

	@JsonIgnore
	@Column(name = "SENHA")
	private String senha;

	@Column(name = "STATUS")
	private Integer status;

	@Column(name = "SUPERVISOR")
	private String supervisor;

	@Column(name = "TELEFONE")
	private String telefone;

	@Column(name = "TRABASS")
	private Integer trabass;

	// // bi-directional many-to-one association to Expedicao
	// @OneToMany(mappedBy = "funcBean", fetch = FetchType.LAZY)
	// @JsonIgnore
	// private List<Expedicao> expedicaos;

	// @OneToMany(mappedBy = "funcionario")
	// @JsonIgnore
	// private List<Processo> processos;

}