/**
 * Altera_boleto_titulo_entrada_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Altera_boleto_titulo_entrada_Type  implements java.io.Serializable {
    private long NOSSO_NUMERO;

    private java.lang.String NUMERO_DOCUMENTO;

    private java.util.Date DATA_VENCIMENTO;

    private java.math.BigDecimal VALOR;

    private java.lang.Short TIPO_ESPECIE;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_titulo_entrada_TypeFLAG_ACEITE FLAG_ACEITE;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_juros_mora_Type JUROS_MORA;

    private java.math.BigDecimal VALOR_ABATIMENTO;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_pos_vencimento_Type POS_VENCIMENTO;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_pagador_Type PAGADOR;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_sacador_avalista_Type SACADOR_AVALISTA;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_multa_Type MULTA;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_desconto_Type[] DESCONTOS;

    private java.math.BigDecimal VALOR_IOF;

    private java.lang.String IDENTIFICACAO_EMPRESA;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_ficha_compensacao_Type FICHA_COMPENSACAO;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_recibo_pagador_Type RECIBO_PAGADOR;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_pagamento_Type PAGAMENTO;

    public Altera_boleto_titulo_entrada_Type() {
    }

    public Altera_boleto_titulo_entrada_Type(
           long NOSSO_NUMERO,
           java.lang.String NUMERO_DOCUMENTO,
           java.util.Date DATA_VENCIMENTO,
           java.math.BigDecimal VALOR,
           java.lang.Short TIPO_ESPECIE,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_titulo_entrada_TypeFLAG_ACEITE FLAG_ACEITE,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_juros_mora_Type JUROS_MORA,
           java.math.BigDecimal VALOR_ABATIMENTO,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_pos_vencimento_Type POS_VENCIMENTO,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_pagador_Type PAGADOR,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_sacador_avalista_Type SACADOR_AVALISTA,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_multa_Type MULTA,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_desconto_Type[] DESCONTOS,
           java.math.BigDecimal VALOR_IOF,
           java.lang.String IDENTIFICACAO_EMPRESA,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_ficha_compensacao_Type FICHA_COMPENSACAO,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_recibo_pagador_Type RECIBO_PAGADOR,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_pagamento_Type PAGAMENTO) {
           this.NOSSO_NUMERO = NOSSO_NUMERO;
           this.NUMERO_DOCUMENTO = NUMERO_DOCUMENTO;
           this.DATA_VENCIMENTO = DATA_VENCIMENTO;
           this.VALOR = VALOR;
           this.TIPO_ESPECIE = TIPO_ESPECIE;
           this.FLAG_ACEITE = FLAG_ACEITE;
           this.JUROS_MORA = JUROS_MORA;
           this.VALOR_ABATIMENTO = VALOR_ABATIMENTO;
           this.POS_VENCIMENTO = POS_VENCIMENTO;
           this.PAGADOR = PAGADOR;
           this.SACADOR_AVALISTA = SACADOR_AVALISTA;
           this.MULTA = MULTA;
           this.DESCONTOS = DESCONTOS;
           this.VALOR_IOF = VALOR_IOF;
           this.IDENTIFICACAO_EMPRESA = IDENTIFICACAO_EMPRESA;
           this.FICHA_COMPENSACAO = FICHA_COMPENSACAO;
           this.RECIBO_PAGADOR = RECIBO_PAGADOR;
           this.PAGAMENTO = PAGAMENTO;
    }


    /**
     * Gets the NOSSO_NUMERO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return NOSSO_NUMERO
     */
    public long getNOSSO_NUMERO() {
        return NOSSO_NUMERO;
    }


    /**
     * Sets the NOSSO_NUMERO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param NOSSO_NUMERO
     */
    public void setNOSSO_NUMERO(long NOSSO_NUMERO) {
        this.NOSSO_NUMERO = NOSSO_NUMERO;
    }


    /**
     * Gets the NUMERO_DOCUMENTO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return NUMERO_DOCUMENTO
     */
    public java.lang.String getNUMERO_DOCUMENTO() {
        return NUMERO_DOCUMENTO;
    }


    /**
     * Sets the NUMERO_DOCUMENTO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param NUMERO_DOCUMENTO
     */
    public void setNUMERO_DOCUMENTO(java.lang.String NUMERO_DOCUMENTO) {
        this.NUMERO_DOCUMENTO = NUMERO_DOCUMENTO;
    }


    /**
     * Gets the DATA_VENCIMENTO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return DATA_VENCIMENTO
     */
    public java.util.Date getDATA_VENCIMENTO() {
        return DATA_VENCIMENTO;
    }


    /**
     * Sets the DATA_VENCIMENTO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param DATA_VENCIMENTO
     */
    public void setDATA_VENCIMENTO(java.util.Date DATA_VENCIMENTO) {
        this.DATA_VENCIMENTO = DATA_VENCIMENTO;
    }


    /**
     * Gets the VALOR value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return VALOR
     */
    public java.math.BigDecimal getVALOR() {
        return VALOR;
    }


    /**
     * Sets the VALOR value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param VALOR
     */
    public void setVALOR(java.math.BigDecimal VALOR) {
        this.VALOR = VALOR;
    }


    /**
     * Gets the TIPO_ESPECIE value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return TIPO_ESPECIE
     */
    public java.lang.Short getTIPO_ESPECIE() {
        return TIPO_ESPECIE;
    }


    /**
     * Sets the TIPO_ESPECIE value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param TIPO_ESPECIE
     */
    public void setTIPO_ESPECIE(java.lang.Short TIPO_ESPECIE) {
        this.TIPO_ESPECIE = TIPO_ESPECIE;
    }


    /**
     * Gets the FLAG_ACEITE value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return FLAG_ACEITE
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_titulo_entrada_TypeFLAG_ACEITE getFLAG_ACEITE() {
        return FLAG_ACEITE;
    }


    /**
     * Sets the FLAG_ACEITE value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param FLAG_ACEITE
     */
    public void setFLAG_ACEITE(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_titulo_entrada_TypeFLAG_ACEITE FLAG_ACEITE) {
        this.FLAG_ACEITE = FLAG_ACEITE;
    }


    /**
     * Gets the JUROS_MORA value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return JUROS_MORA
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_juros_mora_Type getJUROS_MORA() {
        return JUROS_MORA;
    }


    /**
     * Sets the JUROS_MORA value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param JUROS_MORA
     */
    public void setJUROS_MORA(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_juros_mora_Type JUROS_MORA) {
        this.JUROS_MORA = JUROS_MORA;
    }


    /**
     * Gets the VALOR_ABATIMENTO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return VALOR_ABATIMENTO
     */
    public java.math.BigDecimal getVALOR_ABATIMENTO() {
        return VALOR_ABATIMENTO;
    }


    /**
     * Sets the VALOR_ABATIMENTO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param VALOR_ABATIMENTO
     */
    public void setVALOR_ABATIMENTO(java.math.BigDecimal VALOR_ABATIMENTO) {
        this.VALOR_ABATIMENTO = VALOR_ABATIMENTO;
    }


    /**
     * Gets the POS_VENCIMENTO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return POS_VENCIMENTO
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_pos_vencimento_Type getPOS_VENCIMENTO() {
        return POS_VENCIMENTO;
    }


    /**
     * Sets the POS_VENCIMENTO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param POS_VENCIMENTO
     */
    public void setPOS_VENCIMENTO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_pos_vencimento_Type POS_VENCIMENTO) {
        this.POS_VENCIMENTO = POS_VENCIMENTO;
    }


    /**
     * Gets the PAGADOR value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return PAGADOR
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_pagador_Type getPAGADOR() {
        return PAGADOR;
    }


    /**
     * Sets the PAGADOR value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param PAGADOR
     */
    public void setPAGADOR(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_pagador_Type PAGADOR) {
        this.PAGADOR = PAGADOR;
    }


    /**
     * Gets the SACADOR_AVALISTA value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return SACADOR_AVALISTA
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_sacador_avalista_Type getSACADOR_AVALISTA() {
        return SACADOR_AVALISTA;
    }


    /**
     * Sets the SACADOR_AVALISTA value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param SACADOR_AVALISTA
     */
    public void setSACADOR_AVALISTA(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_sacador_avalista_Type SACADOR_AVALISTA) {
        this.SACADOR_AVALISTA = SACADOR_AVALISTA;
    }


    /**
     * Gets the MULTA value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return MULTA
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_multa_Type getMULTA() {
        return MULTA;
    }


    /**
     * Sets the MULTA value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param MULTA
     */
    public void setMULTA(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_multa_Type MULTA) {
        this.MULTA = MULTA;
    }


    /**
     * Gets the DESCONTOS value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return DESCONTOS
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_desconto_Type[] getDESCONTOS() {
        return DESCONTOS;
    }


    /**
     * Sets the DESCONTOS value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param DESCONTOS
     */
    public void setDESCONTOS(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_desconto_Type[] DESCONTOS) {
        this.DESCONTOS = DESCONTOS;
    }


    /**
     * Gets the VALOR_IOF value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return VALOR_IOF
     */
    public java.math.BigDecimal getVALOR_IOF() {
        return VALOR_IOF;
    }


    /**
     * Sets the VALOR_IOF value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param VALOR_IOF
     */
    public void setVALOR_IOF(java.math.BigDecimal VALOR_IOF) {
        this.VALOR_IOF = VALOR_IOF;
    }


    /**
     * Gets the IDENTIFICACAO_EMPRESA value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return IDENTIFICACAO_EMPRESA
     */
    public java.lang.String getIDENTIFICACAO_EMPRESA() {
        return IDENTIFICACAO_EMPRESA;
    }


    /**
     * Sets the IDENTIFICACAO_EMPRESA value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param IDENTIFICACAO_EMPRESA
     */
    public void setIDENTIFICACAO_EMPRESA(java.lang.String IDENTIFICACAO_EMPRESA) {
        this.IDENTIFICACAO_EMPRESA = IDENTIFICACAO_EMPRESA;
    }


    /**
     * Gets the FICHA_COMPENSACAO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return FICHA_COMPENSACAO
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_ficha_compensacao_Type getFICHA_COMPENSACAO() {
        return FICHA_COMPENSACAO;
    }


    /**
     * Sets the FICHA_COMPENSACAO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param FICHA_COMPENSACAO
     */
    public void setFICHA_COMPENSACAO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_ficha_compensacao_Type FICHA_COMPENSACAO) {
        this.FICHA_COMPENSACAO = FICHA_COMPENSACAO;
    }


    /**
     * Gets the RECIBO_PAGADOR value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return RECIBO_PAGADOR
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_recibo_pagador_Type getRECIBO_PAGADOR() {
        return RECIBO_PAGADOR;
    }


    /**
     * Sets the RECIBO_PAGADOR value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param RECIBO_PAGADOR
     */
    public void setRECIBO_PAGADOR(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_recibo_pagador_Type RECIBO_PAGADOR) {
        this.RECIBO_PAGADOR = RECIBO_PAGADOR;
    }


    /**
     * Gets the PAGAMENTO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @return PAGAMENTO
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_pagamento_Type getPAGAMENTO() {
        return PAGAMENTO;
    }


    /**
     * Sets the PAGAMENTO value for this Altera_boleto_titulo_entrada_Type.
     * 
     * @param PAGAMENTO
     */
    public void setPAGAMENTO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_pagamento_Type PAGAMENTO) {
        this.PAGAMENTO = PAGAMENTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Altera_boleto_titulo_entrada_Type)) return false;
        Altera_boleto_titulo_entrada_Type other = (Altera_boleto_titulo_entrada_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.NOSSO_NUMERO == other.getNOSSO_NUMERO() &&
            ((this.NUMERO_DOCUMENTO==null && other.getNUMERO_DOCUMENTO()==null) || 
             (this.NUMERO_DOCUMENTO!=null &&
              this.NUMERO_DOCUMENTO.equals(other.getNUMERO_DOCUMENTO()))) &&
            ((this.DATA_VENCIMENTO==null && other.getDATA_VENCIMENTO()==null) || 
             (this.DATA_VENCIMENTO!=null &&
              this.DATA_VENCIMENTO.equals(other.getDATA_VENCIMENTO()))) &&
            ((this.VALOR==null && other.getVALOR()==null) || 
             (this.VALOR!=null &&
              this.VALOR.equals(other.getVALOR()))) &&
            ((this.TIPO_ESPECIE==null && other.getTIPO_ESPECIE()==null) || 
             (this.TIPO_ESPECIE!=null &&
              this.TIPO_ESPECIE.equals(other.getTIPO_ESPECIE()))) &&
            ((this.FLAG_ACEITE==null && other.getFLAG_ACEITE()==null) || 
             (this.FLAG_ACEITE!=null &&
              this.FLAG_ACEITE.equals(other.getFLAG_ACEITE()))) &&
            ((this.JUROS_MORA==null && other.getJUROS_MORA()==null) || 
             (this.JUROS_MORA!=null &&
              this.JUROS_MORA.equals(other.getJUROS_MORA()))) &&
            ((this.VALOR_ABATIMENTO==null && other.getVALOR_ABATIMENTO()==null) || 
             (this.VALOR_ABATIMENTO!=null &&
              this.VALOR_ABATIMENTO.equals(other.getVALOR_ABATIMENTO()))) &&
            ((this.POS_VENCIMENTO==null && other.getPOS_VENCIMENTO()==null) || 
             (this.POS_VENCIMENTO!=null &&
              this.POS_VENCIMENTO.equals(other.getPOS_VENCIMENTO()))) &&
            ((this.PAGADOR==null && other.getPAGADOR()==null) || 
             (this.PAGADOR!=null &&
              this.PAGADOR.equals(other.getPAGADOR()))) &&
            ((this.SACADOR_AVALISTA==null && other.getSACADOR_AVALISTA()==null) || 
             (this.SACADOR_AVALISTA!=null &&
              this.SACADOR_AVALISTA.equals(other.getSACADOR_AVALISTA()))) &&
            ((this.MULTA==null && other.getMULTA()==null) || 
             (this.MULTA!=null &&
              this.MULTA.equals(other.getMULTA()))) &&
            ((this.DESCONTOS==null && other.getDESCONTOS()==null) || 
             (this.DESCONTOS!=null &&
              java.util.Arrays.equals(this.DESCONTOS, other.getDESCONTOS()))) &&
            ((this.VALOR_IOF==null && other.getVALOR_IOF()==null) || 
             (this.VALOR_IOF!=null &&
              this.VALOR_IOF.equals(other.getVALOR_IOF()))) &&
            ((this.IDENTIFICACAO_EMPRESA==null && other.getIDENTIFICACAO_EMPRESA()==null) || 
             (this.IDENTIFICACAO_EMPRESA!=null &&
              this.IDENTIFICACAO_EMPRESA.equals(other.getIDENTIFICACAO_EMPRESA()))) &&
            ((this.FICHA_COMPENSACAO==null && other.getFICHA_COMPENSACAO()==null) || 
             (this.FICHA_COMPENSACAO!=null &&
              this.FICHA_COMPENSACAO.equals(other.getFICHA_COMPENSACAO()))) &&
            ((this.RECIBO_PAGADOR==null && other.getRECIBO_PAGADOR()==null) || 
             (this.RECIBO_PAGADOR!=null &&
              this.RECIBO_PAGADOR.equals(other.getRECIBO_PAGADOR()))) &&
            ((this.PAGAMENTO==null && other.getPAGAMENTO()==null) || 
             (this.PAGAMENTO!=null &&
              this.PAGAMENTO.equals(other.getPAGAMENTO())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getNOSSO_NUMERO()).hashCode();
        if (getNUMERO_DOCUMENTO() != null) {
            _hashCode += getNUMERO_DOCUMENTO().hashCode();
        }
        if (getDATA_VENCIMENTO() != null) {
            _hashCode += getDATA_VENCIMENTO().hashCode();
        }
        if (getVALOR() != null) {
            _hashCode += getVALOR().hashCode();
        }
        if (getTIPO_ESPECIE() != null) {
            _hashCode += getTIPO_ESPECIE().hashCode();
        }
        if (getFLAG_ACEITE() != null) {
            _hashCode += getFLAG_ACEITE().hashCode();
        }
        if (getJUROS_MORA() != null) {
            _hashCode += getJUROS_MORA().hashCode();
        }
        if (getVALOR_ABATIMENTO() != null) {
            _hashCode += getVALOR_ABATIMENTO().hashCode();
        }
        if (getPOS_VENCIMENTO() != null) {
            _hashCode += getPOS_VENCIMENTO().hashCode();
        }
        if (getPAGADOR() != null) {
            _hashCode += getPAGADOR().hashCode();
        }
        if (getSACADOR_AVALISTA() != null) {
            _hashCode += getSACADOR_AVALISTA().hashCode();
        }
        if (getMULTA() != null) {
            _hashCode += getMULTA().hashCode();
        }
        if (getDESCONTOS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDESCONTOS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDESCONTOS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVALOR_IOF() != null) {
            _hashCode += getVALOR_IOF().hashCode();
        }
        if (getIDENTIFICACAO_EMPRESA() != null) {
            _hashCode += getIDENTIFICACAO_EMPRESA().hashCode();
        }
        if (getFICHA_COMPENSACAO() != null) {
            _hashCode += getFICHA_COMPENSACAO().hashCode();
        }
        if (getRECIBO_PAGADOR() != null) {
            _hashCode += getRECIBO_PAGADOR().hashCode();
        }
        if (getPAGAMENTO() != null) {
            _hashCode += getPAGAMENTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Altera_boleto_titulo_entrada_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "altera_boleto_titulo_entrada_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOSSO_NUMERO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOSSO_NUMERO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMERO_DOCUMENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NUMERO_DOCUMENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA_VENCIMENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA_VENCIMENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIPO_ESPECIE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TIPO_ESPECIE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLAG_ACEITE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FLAG_ACEITE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", ">altera_boleto_titulo_entrada_Type>FLAG_ACEITE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JUROS_MORA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JUROS_MORA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "altera_boleto_juros_mora_Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALOR_ABATIMENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALOR_ABATIMENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POS_VENCIMENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POS_VENCIMENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "altera_boleto_pos_vencimento_Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAGADOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAGADOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "altera_boleto_pagador_Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SACADOR_AVALISTA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SACADOR_AVALISTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "altera_boleto_sacador_avalista_Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MULTA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MULTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "altera_boleto_multa_Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCONTOS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCONTOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "altera_boleto_desconto_Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "DESCONTO"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALOR_IOF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALOR_IOF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDENTIFICACAO_EMPRESA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IDENTIFICACAO_EMPRESA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FICHA_COMPENSACAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FICHA_COMPENSACAO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "altera_boleto_ficha_compensacao_Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RECIBO_PAGADOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RECIBO_PAGADOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "altera_boleto_recibo_pagador_Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAGAMENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAGAMENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "altera_boleto_pagamento_Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
