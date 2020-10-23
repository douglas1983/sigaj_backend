/**
 * HEADER_BARRAMENTO_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar;

public class HEADER_BARRAMENTO_TYPE  implements java.io.Serializable {
    private java.lang.String VERSAO;

    private java.lang.String AUTENTICACAO;

    private java.lang.String USUARIO_SERVICO;

    private java.lang.String USUARIO;

    private java.lang.String OPERACAO;

    private java.lang.Integer INDICE;

    private java.lang.String SISTEMA_ORIGEM;

    private java.lang.String UNIDADE;

    private java.lang.String IDENTIFICADOR_ORIGEM;

    private java.lang.String DATA_HORA;

    private java.lang.String ID_PROCESSO;

    public HEADER_BARRAMENTO_TYPE() {
    }

    public HEADER_BARRAMENTO_TYPE(
           java.lang.String VERSAO,
           java.lang.String AUTENTICACAO,
           java.lang.String USUARIO_SERVICO,
           java.lang.String USUARIO,
           java.lang.String OPERACAO,
           java.lang.Integer INDICE,
           java.lang.String SISTEMA_ORIGEM,
           java.lang.String UNIDADE,
           java.lang.String IDENTIFICADOR_ORIGEM,
           java.lang.String DATA_HORA,
           java.lang.String ID_PROCESSO) {
           this.VERSAO = VERSAO;
           this.AUTENTICACAO = AUTENTICACAO;
           this.USUARIO_SERVICO = USUARIO_SERVICO;
           this.USUARIO = USUARIO;
           this.OPERACAO = OPERACAO;
           this.INDICE = INDICE;
           this.SISTEMA_ORIGEM = SISTEMA_ORIGEM;
           this.UNIDADE = UNIDADE;
           this.IDENTIFICADOR_ORIGEM = IDENTIFICADOR_ORIGEM;
           this.DATA_HORA = DATA_HORA;
           this.ID_PROCESSO = ID_PROCESSO;
    }


    /**
     * Gets the VERSAO value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @return VERSAO
     */
    public java.lang.String getVERSAO() {
        return VERSAO;
    }


    /**
     * Sets the VERSAO value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @param VERSAO
     */
    public void setVERSAO(java.lang.String VERSAO) {
        this.VERSAO = VERSAO;
    }


    /**
     * Gets the AUTENTICACAO value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @return AUTENTICACAO
     */
    public java.lang.String getAUTENTICACAO() {
        return AUTENTICACAO;
    }


    /**
     * Sets the AUTENTICACAO value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @param AUTENTICACAO
     */
    public void setAUTENTICACAO(java.lang.String AUTENTICACAO) {
        this.AUTENTICACAO = AUTENTICACAO;
    }


    /**
     * Gets the USUARIO_SERVICO value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @return USUARIO_SERVICO
     */
    public java.lang.String getUSUARIO_SERVICO() {
        return USUARIO_SERVICO;
    }


    /**
     * Sets the USUARIO_SERVICO value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @param USUARIO_SERVICO
     */
    public void setUSUARIO_SERVICO(java.lang.String USUARIO_SERVICO) {
        this.USUARIO_SERVICO = USUARIO_SERVICO;
    }


    /**
     * Gets the USUARIO value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @return USUARIO
     */
    public java.lang.String getUSUARIO() {
        return USUARIO;
    }


    /**
     * Sets the USUARIO value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @param USUARIO
     */
    public void setUSUARIO(java.lang.String USUARIO) {
        this.USUARIO = USUARIO;
    }


    /**
     * Gets the OPERACAO value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @return OPERACAO
     */
    public java.lang.String getOPERACAO() {
        return OPERACAO;
    }


    /**
     * Sets the OPERACAO value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @param OPERACAO
     */
    public void setOPERACAO(java.lang.String OPERACAO) {
        this.OPERACAO = OPERACAO;
    }


    /**
     * Gets the INDICE value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @return INDICE
     */
    public java.lang.Integer getINDICE() {
        return INDICE;
    }


    /**
     * Sets the INDICE value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @param INDICE
     */
    public void setINDICE(java.lang.Integer INDICE) {
        this.INDICE = INDICE;
    }


    /**
     * Gets the SISTEMA_ORIGEM value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @return SISTEMA_ORIGEM
     */
    public java.lang.String getSISTEMA_ORIGEM() {
        return SISTEMA_ORIGEM;
    }


    /**
     * Sets the SISTEMA_ORIGEM value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @param SISTEMA_ORIGEM
     */
    public void setSISTEMA_ORIGEM(java.lang.String SISTEMA_ORIGEM) {
        this.SISTEMA_ORIGEM = SISTEMA_ORIGEM;
    }


    /**
     * Gets the UNIDADE value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @return UNIDADE
     */
    public java.lang.String getUNIDADE() {
        return UNIDADE;
    }


    /**
     * Sets the UNIDADE value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @param UNIDADE
     */
    public void setUNIDADE(java.lang.String UNIDADE) {
        this.UNIDADE = UNIDADE;
    }


    /**
     * Gets the IDENTIFICADOR_ORIGEM value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @return IDENTIFICADOR_ORIGEM
     */
    public java.lang.String getIDENTIFICADOR_ORIGEM() {
        return IDENTIFICADOR_ORIGEM;
    }


    /**
     * Sets the IDENTIFICADOR_ORIGEM value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @param IDENTIFICADOR_ORIGEM
     */
    public void setIDENTIFICADOR_ORIGEM(java.lang.String IDENTIFICADOR_ORIGEM) {
        this.IDENTIFICADOR_ORIGEM = IDENTIFICADOR_ORIGEM;
    }


    /**
     * Gets the DATA_HORA value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @return DATA_HORA
     */
    public java.lang.String getDATA_HORA() {
        return DATA_HORA;
    }


    /**
     * Sets the DATA_HORA value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @param DATA_HORA
     */
    public void setDATA_HORA(java.lang.String DATA_HORA) {
        this.DATA_HORA = DATA_HORA;
    }


    /**
     * Gets the ID_PROCESSO value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @return ID_PROCESSO
     */
    public java.lang.String getID_PROCESSO() {
        return ID_PROCESSO;
    }


    /**
     * Sets the ID_PROCESSO value for this HEADER_BARRAMENTO_TYPE.
     * 
     * @param ID_PROCESSO
     */
    public void setID_PROCESSO(java.lang.String ID_PROCESSO) {
        this.ID_PROCESSO = ID_PROCESSO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HEADER_BARRAMENTO_TYPE)) return false;
        HEADER_BARRAMENTO_TYPE other = (HEADER_BARRAMENTO_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VERSAO==null && other.getVERSAO()==null) || 
             (this.VERSAO!=null &&
              this.VERSAO.equals(other.getVERSAO()))) &&
            ((this.AUTENTICACAO==null && other.getAUTENTICACAO()==null) || 
             (this.AUTENTICACAO!=null &&
              this.AUTENTICACAO.equals(other.getAUTENTICACAO()))) &&
            ((this.USUARIO_SERVICO==null && other.getUSUARIO_SERVICO()==null) || 
             (this.USUARIO_SERVICO!=null &&
              this.USUARIO_SERVICO.equals(other.getUSUARIO_SERVICO()))) &&
            ((this.USUARIO==null && other.getUSUARIO()==null) || 
             (this.USUARIO!=null &&
              this.USUARIO.equals(other.getUSUARIO()))) &&
            ((this.OPERACAO==null && other.getOPERACAO()==null) || 
             (this.OPERACAO!=null &&
              this.OPERACAO.equals(other.getOPERACAO()))) &&
            ((this.INDICE==null && other.getINDICE()==null) || 
             (this.INDICE!=null &&
              this.INDICE.equals(other.getINDICE()))) &&
            ((this.SISTEMA_ORIGEM==null && other.getSISTEMA_ORIGEM()==null) || 
             (this.SISTEMA_ORIGEM!=null &&
              this.SISTEMA_ORIGEM.equals(other.getSISTEMA_ORIGEM()))) &&
            ((this.UNIDADE==null && other.getUNIDADE()==null) || 
             (this.UNIDADE!=null &&
              this.UNIDADE.equals(other.getUNIDADE()))) &&
            ((this.IDENTIFICADOR_ORIGEM==null && other.getIDENTIFICADOR_ORIGEM()==null) || 
             (this.IDENTIFICADOR_ORIGEM!=null &&
              this.IDENTIFICADOR_ORIGEM.equals(other.getIDENTIFICADOR_ORIGEM()))) &&
            ((this.DATA_HORA==null && other.getDATA_HORA()==null) || 
             (this.DATA_HORA!=null &&
              this.DATA_HORA.equals(other.getDATA_HORA()))) &&
            ((this.ID_PROCESSO==null && other.getID_PROCESSO()==null) || 
             (this.ID_PROCESSO!=null &&
              this.ID_PROCESSO.equals(other.getID_PROCESSO())));
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
        if (getVERSAO() != null) {
            _hashCode += getVERSAO().hashCode();
        }
        if (getAUTENTICACAO() != null) {
            _hashCode += getAUTENTICACAO().hashCode();
        }
        if (getUSUARIO_SERVICO() != null) {
            _hashCode += getUSUARIO_SERVICO().hashCode();
        }
        if (getUSUARIO() != null) {
            _hashCode += getUSUARIO().hashCode();
        }
        if (getOPERACAO() != null) {
            _hashCode += getOPERACAO().hashCode();
        }
        if (getINDICE() != null) {
            _hashCode += getINDICE().hashCode();
        }
        if (getSISTEMA_ORIGEM() != null) {
            _hashCode += getSISTEMA_ORIGEM().hashCode();
        }
        if (getUNIDADE() != null) {
            _hashCode += getUNIDADE().hashCode();
        }
        if (getIDENTIFICADOR_ORIGEM() != null) {
            _hashCode += getIDENTIFICADOR_ORIGEM().hashCode();
        }
        if (getDATA_HORA() != null) {
            _hashCode += getDATA_HORA().hashCode();
        }
        if (getID_PROCESSO() != null) {
            _hashCode += getID_PROCESSO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HEADER_BARRAMENTO_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "HEADER_BARRAMENTO_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VERSAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VERSAO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AUTENTICACAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AUTENTICACAO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USUARIO_SERVICO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "USUARIO_SERVICO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USUARIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "USUARIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OPERACAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OPERACAO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDICE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INDICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SISTEMA_ORIGEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SISTEMA_ORIGEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNIDADE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UNIDADE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDENTIFICADOR_ORIGEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IDENTIFICADOR_ORIGEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA_HORA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA_HORA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID_PROCESSO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID_PROCESSO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
