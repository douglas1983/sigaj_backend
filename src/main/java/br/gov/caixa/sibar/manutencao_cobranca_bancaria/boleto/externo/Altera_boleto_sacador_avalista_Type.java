/**
 * Altera_boleto_sacador_avalista_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Altera_boleto_sacador_avalista_Type  implements java.io.Serializable {
    private java.lang.Long CPF;

    private java.lang.String NOME;

    private java.lang.Long CNPJ;

    private java.lang.String RAZAO_SOCIAL;

    public Altera_boleto_sacador_avalista_Type() {
    }

    public Altera_boleto_sacador_avalista_Type(
           java.lang.Long CPF,
           java.lang.String NOME,
           java.lang.Long CNPJ,
           java.lang.String RAZAO_SOCIAL) {
           this.CPF = CPF;
           this.NOME = NOME;
           this.CNPJ = CNPJ;
           this.RAZAO_SOCIAL = RAZAO_SOCIAL;
    }


    /**
     * Gets the CPF value for this Altera_boleto_sacador_avalista_Type.
     * 
     * @return CPF
     */
    public java.lang.Long getCPF() {
        return CPF;
    }


    /**
     * Sets the CPF value for this Altera_boleto_sacador_avalista_Type.
     * 
     * @param CPF
     */
    public void setCPF(java.lang.Long CPF) {
        this.CPF = CPF;
    }


    /**
     * Gets the NOME value for this Altera_boleto_sacador_avalista_Type.
     * 
     * @return NOME
     */
    public java.lang.String getNOME() {
        return NOME;
    }


    /**
     * Sets the NOME value for this Altera_boleto_sacador_avalista_Type.
     * 
     * @param NOME
     */
    public void setNOME(java.lang.String NOME) {
        this.NOME = NOME;
    }


    /**
     * Gets the CNPJ value for this Altera_boleto_sacador_avalista_Type.
     * 
     * @return CNPJ
     */
    public java.lang.Long getCNPJ() {
        return CNPJ;
    }


    /**
     * Sets the CNPJ value for this Altera_boleto_sacador_avalista_Type.
     * 
     * @param CNPJ
     */
    public void setCNPJ(java.lang.Long CNPJ) {
        this.CNPJ = CNPJ;
    }


    /**
     * Gets the RAZAO_SOCIAL value for this Altera_boleto_sacador_avalista_Type.
     * 
     * @return RAZAO_SOCIAL
     */
    public java.lang.String getRAZAO_SOCIAL() {
        return RAZAO_SOCIAL;
    }


    /**
     * Sets the RAZAO_SOCIAL value for this Altera_boleto_sacador_avalista_Type.
     * 
     * @param RAZAO_SOCIAL
     */
    public void setRAZAO_SOCIAL(java.lang.String RAZAO_SOCIAL) {
        this.RAZAO_SOCIAL = RAZAO_SOCIAL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Altera_boleto_sacador_avalista_Type)) return false;
        Altera_boleto_sacador_avalista_Type other = (Altera_boleto_sacador_avalista_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CPF==null && other.getCPF()==null) || 
             (this.CPF!=null &&
              this.CPF.equals(other.getCPF()))) &&
            ((this.NOME==null && other.getNOME()==null) || 
             (this.NOME!=null &&
              this.NOME.equals(other.getNOME()))) &&
            ((this.CNPJ==null && other.getCNPJ()==null) || 
             (this.CNPJ!=null &&
              this.CNPJ.equals(other.getCNPJ()))) &&
            ((this.RAZAO_SOCIAL==null && other.getRAZAO_SOCIAL()==null) || 
             (this.RAZAO_SOCIAL!=null &&
              this.RAZAO_SOCIAL.equals(other.getRAZAO_SOCIAL())));
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
        if (getCPF() != null) {
            _hashCode += getCPF().hashCode();
        }
        if (getNOME() != null) {
            _hashCode += getNOME().hashCode();
        }
        if (getCNPJ() != null) {
            _hashCode += getCNPJ().hashCode();
        }
        if (getRAZAO_SOCIAL() != null) {
            _hashCode += getRAZAO_SOCIAL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Altera_boleto_sacador_avalista_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "altera_boleto_sacador_avalista_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CPF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNPJ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CNPJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RAZAO_SOCIAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RAZAO_SOCIAL"));
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
