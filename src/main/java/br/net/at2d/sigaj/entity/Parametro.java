package br.net.at2d.sigaj.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the PARAMETROS database table.
 * 
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "Seq")
@Table(name = "PARAMETROS")
public class Parametro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SEQ")
	private Integer seq;

	@Column(name = "AGENCIA")
	private String agencia;

	@Column(name = "AGENCIADIG")
	private Integer agenciadig;

	@Column(name = "BANCO")
	private String banco;

	@Column(name = "CAMINHOFUNDO")
	private String caminhofundo;

	@Column(name = "CHECKLISTRECEPCAO")
	private String checklistrecepcao;

	@Column(name = "CID_REG_OBRIG")
	private String cidRegObrig;

	@Column(name = "CNPJ")
	private String cnpj;

	@Column(name = "CODCEDENTE")
	private String codcedente;

	@Column(name = "CODTRANSMISSAO")
	private String codtransmissao;

	@Column(name = "CONTACORRENTE")
	private String contacorrente;

	@Column(name = "CONTADIG")
	private Integer contadig;

	@Column(name = "CONTALANCAIENTRADA")
	private Integer contalancaientrada;

	@Column(name = "CONTALANCAISAIDA")
	private Integer contalancaisaida;

	@Column(name = "CONVENIO")
	private String convenio;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "ENVIAEMAILRESULTADO")
	private String enviaemailresultado;

	@Column(name = "EXIGENCIACOMP")
	private String exigenciacomp;

	@Column(name = "FASECNPJ")
	private String fasecnpj;

	@Column(name = "FINAN_CAMINHO_ARQUIVOS")
	private String finanCaminhoArquivos;

	@Column(name = "FTP_DIRETORIO")
	private String ftpDiretorio;

	@Column(name = "FTP_HOST")
	private String ftpHost;

	@Column(name = "FTP_PASS")
	private String ftpPass;

	@Column(name = "FTP_PASSIVE_MODE")
	private String ftpPassiveMode;

	@Column(name = "FTP_PORT")
	private Integer ftpPort;

	@Column(name = "FTP_USER")
	private String ftpUser;

	@Column(name = "IMPCHQ_CIDADE")
	private String impchqCidade;

	@Column(name = "IMPCHQ_CRUZACHQ")
	private String impchqCruzachq;

	@Column(name = "IMPCHQ_LERCHQ")
	private String impchqLerchq;

	@Column(name = "IMPCHQ_PORTA")
	private String impchqPorta;

	@Column(name = "IMPCHQ_VEL_COM")
	private Integer impchqVelCom;

	@Column(name = "IMPRDADOSPROC")
	private String imprdadosproc;

	@Column(name = "LANCACAIXAMOVFINAN")
	private String lancacaixamovfinan;

	@Column(name = "MODALIDADE")
	private String modalidade;

	@Column(name = "NBOLETOOBRICAIXA")
	private String nboletoobricaixa;

	@Column(name = "NBOLETOOBRIG")
	private String nboletoobrig;

	@Column(name = "NEXPEDICAO")
	private String nexpedicao;

	@Column(name = "NUMEROBOLETO")
	private Integer numeroboleto;

	@Column(name = "PGTOAUTO")
	private String pgtoauto;

	@Column(name = "PORTA")
	private Integer porta;

	@Column(name = "PRAZONORMAL")
	private Integer prazonormal;

	@Column(name = "PREVIA")
	private String previa;

	@Column(name = "PROT_CAMINHO_ARQUIVOS")
	private String protCaminhoArquivos;

	@Column(name = "RAZAOSOCIAL")
	private String razaosocial;

	@Column(name = "SENHA")
	private Integer senha;

	@Column(name = "SENHASMTP")
	private String senhasmtp;

	@Column(name = "SEQREMESSA")
	private Integer seqremessa;

	@Column(name = "SMTP")
	private String smtp;

	@Column(name = "SSL")
	private String ssl;

	@Column(name = "TEXTO1REL")
	private String texto1rel;

	@Column(name = "TEXTO2REL")
	private String texto2rel;

	@Column(name = "TEXTO3REL")
	private String texto3rel;

	@Column(name = "USERSMTP")
	private String usersmtp;

	@Column(name = "RESULTADO_TEMPLATE_ID")
	private String resultadoTemplateId;

	@Column(name = "RESET_TEMPLATE_ID")
	private String resetTemplateId;

	@Column(name = "SIGNUP_TEMPLATE_ID")
	private String signupTemplateId;

}