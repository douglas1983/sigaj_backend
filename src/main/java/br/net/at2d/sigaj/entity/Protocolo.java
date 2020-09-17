package br.net.at2d.sigaj.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(of = "seq")
@Table(name = "PROTOCOLO")
@NamedEntityGraph(name = "Protocolo.all", attributeNodes = { @NamedAttributeNode("servico"),
        @NamedAttributeNode("resprots"), @NamedAttributeNode("processo"), @NamedAttributeNode("exprots"),
        @NamedAttributeNode("registros"), @NamedAttributeNode("retirada"), @NamedAttributeNode("cnpj") })

@NamedEntityGraph(name = "Protocolo.resprot", attributeNodes = { @NamedAttributeNode("resprots"),
        @NamedAttributeNode("processo") })
public class Protocolo implements Serializable {
    // default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEQ")
    private Integer seq;

    @Column(name = "NUMERO")
    private String numero;

    @Column(name = "SEQPROT")
    private Integer seqprot;

    @Column(name = "ALTERADOPRAZO")
    private String alteradoprazo;

    @Column(name = "ASSESSOR")
    private Integer assessor;

    @Column(name = "CAMINHO_ARQ_DIG")
    private String caminhoArqDig;

    // @Column(name = "CODSER")
    // private Integer codser;

    // bi-directional many-to-one association to Desconto
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "CODSER", referencedColumnName = "CODIGO", nullable = false, insertable = false, updatable = false)
    private Sertipo servico;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "DATAALTERADOPRAZO")
    private LocalDateTime dataalteradoprazo;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "DATAINSERT")
    private LocalDateTime datainsert;

    @Column(name = "EMPNOME")
    private String empnome;

    @Column(name = "FUNC")
    private Integer func;

    @Column(name = "NCONTROLEDBE")
    private String ncontroledbe;

    @Column(name = "PAGO")
    private Integer pago;

    @Column(name = "PROTANT")
    private String protant;

    @Column(name = "PROTANTPAGO")
    private Integer protantpago;

    @Column(name = "PROTNIRE")
    private String protnire;

    @Column(name = "PROXFASE")
    private Integer proxfase;

    @Column(name = "SEQPROTANT")
    private Integer seqprotant;

    @Column(name = "TIPO")
    private Integer tipo;

    @Column(name = "TIPOEMP")
    private Integer tipoemp;

    @Column(name = "VRE2")
    private String vre2;

    // bi-directional many-to-one association to Processo
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODPROC", referencedColumnName = "CODIGO")
    private Processo processo;

    // bi-directional one-to-one association to Resprot
    // @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
    // mappedBy = "protocoloResult",
    @JoinColumns({
            @JoinColumn(name = "PROTOCOLO", referencedColumnName = "NUMERO", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "PROTSEQ", referencedColumnName = "SEQPROT", nullable = false, insertable = false, updatable = false) })
    private Set<Resprot> resprots;

    // bi-directional many-to-one association to Exprot
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY) // mappedBy = "protocoloBean",
    @JoinColumns({
            @JoinColumn(name = "PROTOCOLO", referencedColumnName = "NUMERO", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "PROTSEQ", referencedColumnName = "SEQPROT", nullable = false, insertable = false, updatable = false) })
    private Set<Exprot> exprots;

    // bi-directional many-to-one association to Registro
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY) // mappedBy = "protocoloRegistro",
    @JoinColumns({
            @JoinColumn(name = "PROTOCOLO", referencedColumnName = "NUMERO", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "PROTSEQ", referencedColumnName = "SEQPROT", nullable = false, insertable = false, updatable = false) })
    private Set<Registro> registros;

    // bi-directional many-to-one association to PROTEX
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY) // mappedBy = "protocoloEx",
    @JoinColumns({
            @JoinColumn(name = "PROTOCOLO", referencedColumnName = "NUMERO", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "PROTSEQ", referencedColumnName = "SEQPROT", nullable = false, insertable = false, updatable = false) })
    private Set<Protex> retirada;

    // bi-directional many-to-one association to Cnpj
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY) // mappedBy = "protocoloCnpj",
    @JoinColumns({
            @JoinColumn(name = "PROTOCOLO", referencedColumnName = "NUMERO", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "PROTSEQ", referencedColumnName = "SEQPROT", nullable = false, insertable = false, updatable = false) })
    private Set<Cnpj> cnpj;

}