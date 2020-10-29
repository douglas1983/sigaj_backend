/**
 * Pagador_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Pagador_Type implements java.io.Serializable {
    // private long CPF;

    // private java.lang.String NOME;

    private long CNPJ;

    private java.lang.String RAZAO_SOCIAL;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Endereco_Type ENDERECO;

    public Pagador_Type() {
    }

    public Pagador_Type(
            // long CPF,
            // java.lang.String NOME,
            long CNPJ, java.lang.String RAZAO_SOCIAL,
            br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Endereco_Type ENDERECO) {
        // this.CPF = CPF;
        // this.NOME = NOME;
        this.CNPJ = CNPJ;
        this.RAZAO_SOCIAL = RAZAO_SOCIAL;
        this.ENDERECO = ENDERECO;
    }

    // /**
    // * Gets the CPF value for this Pagador_Type.
    // *
    // * @return CPF
    // */
    // public long getCPF() {
    // return CPF;
    // }

    // /**
    // * Sets the CPF value for this Pagador_Type.
    // *
    // * @param CPF
    // */
    // public void setCPF(long CPF) {
    // this.CPF = CPF;
    // }

    // /**
    // * Gets the NOME value for this Pagador_Type.
    // *
    // * @return NOME
    // */
    // public java.lang.String getNOME() {
    // return NOME;
    // }

    // /**
    // * Sets the NOME value for this Pagador_Type.
    // *
    // * @param NOME
    // */
    // public void setNOME(java.lang.String NOME) {
    // this.NOME = NOME;
    // }

    /**
     * Gets the CNPJ value for this Pagador_Type.
     * 
     * @return CNPJ
     */
    public long getCNPJ() {
        return CNPJ;
    }

    /**
     * Sets the CNPJ value for this Pagador_Type.
     * 
     * @param CNPJ
     */
    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * Gets the RAZAO_SOCIAL value for this Pagador_Type.
     * 
     * @return RAZAO_SOCIAL
     */
    public java.lang.String getRAZAO_SOCIAL() {
        return RAZAO_SOCIAL;
    }

    /**
     * Sets the RAZAO_SOCIAL value for this Pagador_Type.
     * 
     * @param RAZAO_SOCIAL
     */
    public void setRAZAO_SOCIAL(java.lang.String RAZAO_SOCIAL) {
        this.RAZAO_SOCIAL = RAZAO_SOCIAL;
    }

    /**
     * Gets the ENDERECO value for this Pagador_Type.
     * 
     * @return ENDERECO
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Endereco_Type getENDERECO() {
        return ENDERECO;
    }

    /**
     * Sets the ENDERECO value for this Pagador_Type.
     * 
     * @param ENDERECO
     */
    public void setENDERECO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Endereco_Type ENDERECO) {
        this.ENDERECO = ENDERECO;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pagador_Type))
            return false;
        Pagador_Type other = (Pagador_Type) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
        // this.CPF == other.getCPF() &&
        // ((this.NOME==null && other.getNOME()==null) ||
        // (this.NOME!=null &&
        // this.NOME.equals(other.getNOME()))) &&
                this.CNPJ == other.getCNPJ()
                && ((this.RAZAO_SOCIAL == null && other.getRAZAO_SOCIAL() == null)
                        || (this.RAZAO_SOCIAL != null && this.RAZAO_SOCIAL.equals(other.getRAZAO_SOCIAL())))
                && ((this.ENDERECO == null && other.getENDERECO() == null)
                        || (this.ENDERECO != null && this.ENDERECO.equals(other.getENDERECO())));
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
        // _hashCode += new Long(getCPF()).hashCode();
        // if (getNOME() != null) {
        // _hashCode += getNOME().hashCode();
        // }
        _hashCode += new Long(getCNPJ()).hashCode();
        if (getRAZAO_SOCIAL() != null) {
            _hashCode += getRAZAO_SOCIAL().hashCode();
        }
        if (getENDERECO() != null) {
            _hashCode += getENDERECO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            Pagador_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName(
                "http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "pagador_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        // elemField.setFieldName("CPF");
        // elemField.setXmlName(new javax.xml.namespace.QName("", "CPF"));
        // elemField.setXmlType(new
        // javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        // elemField.setNillable(false);
        // typeDesc.addFieldDesc(elemField);
        // elemField = new org.apache.axis.description.ElementDesc();
        // elemField.setFieldName("NOME");
        // elemField.setXmlName(new javax.xml.namespace.QName("", "NOME"));
        // elemField.setXmlType(new
        // javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        // elemField.setNillable(false);
        // typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNPJ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CNPJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RAZAO_SOCIAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RAZAO_SOCIAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENDERECO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ENDERECO"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "endereco_Type"));
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
    public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
            java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
            java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
    }

}
