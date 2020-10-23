/**
 * Pos_vencimento_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Pos_vencimento_Type  implements java.io.Serializable {
    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Pos_vencimento_TypeACAO ACAO;

    private short NUMERO_DIAS;

    public Pos_vencimento_Type() {
    }

    public Pos_vencimento_Type(
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Pos_vencimento_TypeACAO ACAO,
           short NUMERO_DIAS) {
           this.ACAO = ACAO;
           this.NUMERO_DIAS = NUMERO_DIAS;
    }


    /**
     * Gets the ACAO value for this Pos_vencimento_Type.
     * 
     * @return ACAO
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Pos_vencimento_TypeACAO getACAO() {
        return ACAO;
    }


    /**
     * Sets the ACAO value for this Pos_vencimento_Type.
     * 
     * @param ACAO
     */
    public void setACAO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Pos_vencimento_TypeACAO ACAO) {
        this.ACAO = ACAO;
    }


    /**
     * Gets the NUMERO_DIAS value for this Pos_vencimento_Type.
     * 
     * @return NUMERO_DIAS
     */
    public short getNUMERO_DIAS() {
        return NUMERO_DIAS;
    }


    /**
     * Sets the NUMERO_DIAS value for this Pos_vencimento_Type.
     * 
     * @param NUMERO_DIAS
     */
    public void setNUMERO_DIAS(short NUMERO_DIAS) {
        this.NUMERO_DIAS = NUMERO_DIAS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pos_vencimento_Type)) return false;
        Pos_vencimento_Type other = (Pos_vencimento_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACAO==null && other.getACAO()==null) || 
             (this.ACAO!=null &&
              this.ACAO.equals(other.getACAO()))) &&
            this.NUMERO_DIAS == other.getNUMERO_DIAS();
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
        if (getACAO() != null) {
            _hashCode += getACAO().hashCode();
        }
        _hashCode += getNUMERO_DIAS();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pos_vencimento_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "pos_vencimento_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ACAO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", ">pos_vencimento_Type>ACAO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMERO_DIAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NUMERO_DIAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
