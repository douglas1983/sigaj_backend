package br.net.at2d.sigaj.service;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Dados_entrada_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Endereco_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Ficha_compensacao_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Inclui_boleto_entrada_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Inclui_boleto_saida_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Juros_mora_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Juros_mora_TypeTIPO;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancariaProxy;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancariaSOAPStub;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Multa_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Pagador_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Pagamento_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Pagamento_TypeTIPO;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Pos_vencimento_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Pos_vencimento_TypeACAO;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Recibo_pagador_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_entrada_negocial_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_saida_negocial_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Titulo_entrada_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Titulo_entrada_TypeFLAG_ACEITE;
import br.net.at2d.sigaj.Cliente.Cliente;
import br.net.at2d.sigaj.Cliente.ClienteRepository;
import br.net.at2d.sigaj.utils.CEFWebService;

@Service
public class BoletoCaixaService {
  @Autowired
  ClienteRepository clienteRepo;

  public String RegistrarBoleto(Integer idCliente, String NossoNumero, BigDecimal valorboleto) {
    try {
      String retCod = "-1";
      Cliente cliente = clienteRepo.findById(idCliente).orElse(null);

      Inclui_boleto_entrada_Type cobranca = new Inclui_boleto_entrada_Type();

      Titulo_entrada_Type titulo = new Titulo_entrada_Type();
      titulo.setCODIGO_MOEDA(Short.valueOf("09"));
      titulo.setDATA_EMISSAO(new Date(System.currentTimeMillis()));
      titulo.setDATA_VENCIMENTO(java.sql.Date.valueOf(LocalDate.now().plusDays(10)));

      // var desconto = new BoletoCaixa.Proxy.desconto_Type();
      // desconto.TIPO = BoletoCaixa.Proxy.desconto_TypeTIPO.ISENTO;
      // desconto.DATASpecified = true;

      // titulo.DESCONTOS = new BoletoCaixa.Proxy.desconto_Type[] { desconto };

      Ficha_compensacao_Type fichacom = new Ficha_compensacao_Type();
      fichacom.setMENSAGENS(new String[] { "Não Receber após o vencimento" });
      titulo.setFICHA_COMPENSACAO(fichacom);
      titulo.setFLAG_ACEITE(Titulo_entrada_TypeFLAG_ACEITE.N);
      titulo.setIDENTIFICACAO_EMPRESA(NossoNumero);

      Juros_mora_Type juros = new Juros_mora_Type();
      juros.setDATA(titulo.getDATA_VENCIMENTO());
      juros.setTIPO(Juros_mora_TypeTIPO.ISENTO);
      juros.setPERCENTUAL(BigDecimal.ZERO);
      juros.setVALOR(BigDecimal.ZERO);
      titulo.setJUROS_MORA(juros);

      Multa_Type multa = new Multa_Type();
      multa.setDATA(titulo.getDATA_VENCIMENTO());
      multa.setPERCENTUAL(BigDecimal.ZERO);
      multa.setVALOR(BigDecimal.ZERO);

      titulo.setMULTA(multa);

      titulo.setNOSSO_NUMERO(Long.parseLong(NossoNumero));
      titulo.setNUMERO_DOCUMENTO(NossoNumero.substring(10));
      Pagador_Type pagador = new Pagador_Type();
      Endereco_Type enderecopag = new Endereco_Type();
      enderecopag.setCEP(Integer.parseInt(cliente.getEndcep()));
      enderecopag.setBAIRRO(
          cliente.getEndbairro().length() > 15 ? cliente.getEndbairro().substring(0, 15) : cliente.getEndbairro());
      enderecopag.setCIDADE(
          cliente.getEndcidade().length() > 15 ? cliente.getEndcidade().substring(0, 15) : cliente.getEndcidade());
      enderecopag.setLOGRADOURO(
          cliente.getEndrua().length() > 40 ? cliente.getEndrua().substring(0, 40) : cliente.getEndrua());
      enderecopag.setUF(cliente.getEndestado());
      pagador.setENDERECO(enderecopag);
      long cnpj = 0;
      long cpf = 0;
      String razaosocial = "";
      String nome = "";

      if (cliente.getCnpj().length() > 11) {
        cnpj = Long.parseLong(cliente.getCnpj());
        razaosocial = cliente.getNome().length() > 40 ? cliente.getNome().substring(0, 40) : cliente.getNome();
        pagador.setCNPJ(cnpj);
        pagador.setRAZAO_SOCIAL(razaosocial);
      } else {
        cpf = Long.parseLong(cliente.getCnpj());
        nome = cliente.getNome().length() > 40 ? cliente.getNome().substring(0, 40) : cliente.getNome();
        pagador.setCPF(cpf);
        pagador.setNOME(nome);

      }
      ;

      titulo.setPAGADOR(pagador);
      Pagamento_Type pagamento = new Pagamento_Type();
      pagamento.setTIPO(Pagamento_TypeTIPO.NAO_ACEITA_VALOR_DIVERGENTE);
      pagamento.setQUANTIDADE_PERMITIDA(Short.valueOf("0"));
      pagamento.setPERCENTUAL_MAXIMO(BigDecimal.ZERO);
      pagamento.setPERCENTUAL_MINIMO(BigDecimal.ZERO);
      pagamento.setVALOR_MAXIMO(BigDecimal.ZERO);
      pagamento.setVALOR_MINIMO(BigDecimal.ZERO);

      titulo.setPAGAMENTO(pagamento);
      Pos_vencimento_Type posvenc = new Pos_vencimento_Type();
      posvenc.setACAO(Pos_vencimento_TypeACAO.DEVOLVER);
      posvenc.setNUMERO_DIAS(Short.valueOf("11"));
      titulo.setPOS_VENCIMENTO(posvenc);
      Recibo_pagador_Type recpag = new Recibo_pagador_Type();
      recpag.setMENSAGENS(new String[] { "Não Receber após o vencimento" });
      titulo.setRECIBO_PAGADOR(recpag);

      titulo.setTIPO_ESPECIE((short) 4);
      titulo.setVALOR(valorboleto);
      titulo.setVALOR_ABATIMENTO(BigDecimal.ZERO);
      titulo.setVALOR_IOF(BigDecimal.ZERO);

      Servico_entrada_negocial_Type servicoentrada = new Servico_entrada_negocial_Type();
      HEADER_BARRAMENTO_TYPE header = new HEADER_BARRAMENTO_TYPE();
      header.setVERSAO("1.2");
      String VVVVVVVVVV = StringUtils.leftPad(valorboleto.toString().replace(",", "").replace(".", ""), 15, "0");
      CEFWebService cef = new CEFWebService();
      DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
      header.setAUTENTICACAO(cef.DO_HASHB64("0820421" + "00000000000000000"
          + dateFormat.format(titulo.getDATA_VENCIMENTO()) + VVVVVVVVVV + "54135728000150"));
      header.setUSUARIO_SERVICO("SGCBS02P");
      header.setOPERACAO("INCLUI_BOLETO");
      header.setINDICE(0);
      header.setSISTEMA_ORIGEM("SIGCB");
      header.setUNIDADE("0316");
      InetAddress ia = InetAddress.getLocalHost();

      DateFormat format = new SimpleDateFormat("ddMMyyyyHHmmss");
      header.setIDENTIFICADOR_ORIGEM(ia.getHostAddress());
      header.setDATA_HORA(format.format(new Date(System.currentTimeMillis())));
      header.setID_PROCESSO("82042");
      Dados_entrada_Type dados = new Dados_entrada_Type();
      cobranca.setCODIGO_BENEFICIARIO((Integer) 820421);// codigo de jundiai
      cobranca.setTITULO(titulo);

      dados.setINCLUI_BOLETO(cobranca);

      servicoentrada.setHEADER(header);
      servicoentrada.setDADOS(dados);

      Manutencao_cobranca_bancariaProxy enviar = new Manutencao_cobranca_bancariaProxy();
      Servico_saida_negocial_Type saida = new Servico_saida_negocial_Type();
      saida = enviar.INCLUI_BOLETO(servicoentrada);
      if (saida.getCOD_RETORNO().equals("00")) {
        retCod = saida.getDADOS().getCONTROLE_NEGOCIAL()[0].getCOD_RETORNO();
      } else
        retCod = saida.getCOD_RETORNO();

      if (retCod != "0") {
        return saida.getCOD_RETORNO() + "-- " + saida.getMSG_RETORNO();

      } else {
        // BoletoCaixa.Proxy.inclui_boleto_saida_Type itemsaida = new
        // BoletoCaixa.Proxy.inclui_boleto_saida_Type();

        String urlCX = saida.getDADOS().getINCLUI_BOLETO().getURL();
        // urlCX = itemsaida.Item.URL;
        Long numeroBoletoCx = saida.getDADOS().getINCLUI_BOLETO().getNOSSO_NUMERO();
        return urlCX + ':' + numeroBoletoCx.toString();
      }
    }

    catch (Exception ex) {

      return ex.getMessage();
    }
  }
}
