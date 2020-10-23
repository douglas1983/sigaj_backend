/**
 * Endereco_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Endereco_Type  implements java.io.Serializable {
    private java.lang.String LOGRADOURO;

    private java.lang.String BAIRRO;

    private java.lang.String CIDADE;

    private java.lang.String UF;

    private int CEP;

    public Endereco_Type() {
    }

    public Endereco_Type(
           java.lang.String LOGRADOURO,
           java.lang.String BAIRRO,
           java.lang.String CIDADE,
           java.lang.String UF,
           int CEP) {
           this.LOGRADOURO = LOGRADOURO;
           this.BAIRRO = BAIRRO;
           this.CIDADE = CIDADE;
           this.UF = UF;
           this.CEP = CEP;
    }


    /**
     * Gets the LOGRADOURO value for this Endereco_Type.
     * 
     * @return LOGRADOURO
     */
    public java.lang.String getLOGRADOURO() {
        return LOGRADOURO;
    }


    /**
     * Sets the LOGRADOURO value for this Endereco_Type.
     * 
     * @param LOGRADOURO
     */
    public void setLOGRADOURO(java.lang.String LOGRADOURO) {
        this.LOGRADOURO = LOGRADOURO;
    }


    /**
     * Gets the BAIRRO value for this Endereco_Type.
     * 
     * @return BAIRRO
     */
    public java.lang.String getBAIRRO() {
        return BAIRRO;
    }


    /**
     * Sets the BAIRRO value for this Endereco_Type.
     * 
     * @param BAIRRO
     */
    public void setBAIRRO(java.lang.String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }


    /**
     * Gets the CIDADE value for this Endereco_Type.
     * 
     * @return CIDADE
     */
    public java.lang.String getCIDADE() {
        return CIDADE;
    }


    /**
     * Sets the CIDADE value for this Endereco_Type.
     * 
     * @param CIDADE
     */
    public void setCIDADE(java.lang.String CIDADE) {
        this.CIDADE = CIDADE;
    }


    /**
     * Gets the UF value for this Endereco_Type.
     * 
     * @return UF
     */
    public java.lang.String getUF() {
        return UF;
    }


    /**
     * Sets the UF value for this Endereco_Type.
     * 
     * @param UF
     */
    public void setUF(java.lang.String UF) {
        this.UF = UF;
    }


    /**
     * Gets the CEP value for this Endereco_Type.
     * 
     * @return CEP
     */
    public int getCEP() {
        return CEP;
    }


    /**
     * Sets the CEP value for this Endereco_Type.
     * 
     * @param CEP
     */
    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Endereco_Type)) return false;
        Endereco_Type other = (Endereco_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.LOGRADOURO==null && other.getLOGRADOURO()==null) || 
             (this.LOGRADOURO!=null &&
              this.LOGRADOURO.equals(other.getLOGRADOURO()))) &&
            ((this.BAIRRO==null && other.getBAIRRO()==null) || 
             (this.BAIRRO!=null &&
              this.BAIRRO.equals(other.getBAIRRO()))) &&
            ((this.CIDADE==null && other.getCIDADE()==null) || 
             (this.CIDADE!=null &&
              this.CIDADE.equals(other.getCIDADE()))) &&
            ((this.UF==null && other.getUF()==null) || 
             (this.UF!=null &&
              this.UF.equals(other.getUF()))) &&
            this.CEP == other.getCEP();
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
        if (getLOGRADOURO() != null) {
            _hashCode += getLOGRADOURO().hashCode();
        }
        if (getBAIRRO() != null) {
            _hashCode += getBAIRRO().hashCode();
        }
        if (getCIDADE() != null) {
            _hashCode += getCIDADE().hashCode();
        }
        if (getUF() != null) {
            _hashCode += getUF().hashCode();
        }
        _hashCode += getCEP();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Endereco_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "endereco_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOGRADOURO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LOGRADOURO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAIRRO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BAIRRO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CIDADE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CIDADE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CEP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CEP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
