package br.net.at2d.sigaj.Protocolo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

import br.net.at2d.sigaj.entity.Cnpj;
import br.net.at2d.sigaj.entity.Exprot;
import br.net.at2d.sigaj.entity.Processo;
import br.net.at2d.sigaj.entity.Protex;
import br.net.at2d.sigaj.entity.Registro;
import br.net.at2d.sigaj.entity.Resprot;
import br.net.at2d.sigaj.entity.Sertipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "seq")
public class ProtocoloDTO implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  private Integer seq;

  private String numero;

  private Integer seqprot;

  private String alteradoprazo;

  private Integer assessor;

  private String caminhoArqDig;

  // private Integer codser;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDateTime dataalteradoprazo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDateTime datainsert;

  private String empnome;

  private Integer func;

  private String ncontroledbe;

  private Integer pago;

  private String protant;

  private Integer protantpago;

  private String protnire;

  private Integer proxfase;

  private Integer seqprotant;

  private Integer tipo;

  private Integer tipoemp;

  private String vre2;

  private Processo processo;

  private Set<Resprot> resprots;

  private Set<Exprot> exprots;

  private Set<Registro> registros;

  private Set<Protex> retirada;

  private Set<Cnpj> cnpj;

  private Sertipo servico;

}