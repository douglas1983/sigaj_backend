/**
 * Inclui_boleto_entrada_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Inclui_boleto_entrada_Type  implements java.io.Serializable {
    private int CODIGO_BENEFICIARIO;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Titulo_entrada_Type TITULO;

    public Inclui_boleto_entrada_Type() {
    }

    public Inclui_boleto_entrada_Type(
           int CODIGO_BENEFICIARIO,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Titulo_entrada_Type TITULO) {
           this.CODIGO_BENEFICIARIO = CODIGO_BENEFICIARIO;
           this.TITULO = TITULO;
    }


    /**
     * Gets the CODIGO_BENEFICIARIO value for this Inclui_boleto_entrada_Type.
     * 
     * @return CODIGO_BENEFICIARIO
     */
    public int getCODIGO_BENEFICIARIO() {
        return CODIGO_BENEFICIARIO;
    }


    /**
     * Sets the CODIGO_BENEFICIARIO value for this Inclui_boleto_entrada_Type.
     * 
     * @param CODIGO_BENEFICIARIO
     */
    public void setCODIGO_BENEFICIARIO(int CODIGO_BENEFICIARIO) {
        this.CODIGO_BENEFICIARIO = CODIGO_BENEFICIARIO;
    }


    /**
     * Gets the TITULO value for this Inclui_boleto_entrada_Type.
     * 
     * @return TITULO
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Titulo_entrada_Type getTITULO() {
        return TITULO;
    }


    /**
     * Sets the TITULO value for this Inclui_boleto_entrada_Type.
     * 
     * @param TITULO
     */
    public void setTITULO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Titulo_entrada_Type TITULO) {
        this.TITULO = TITULO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Inclui_boleto_entrada_Type)) return false;
        Inclui_boleto_entrada_Type other = (Inclui_boleto_entrada_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CODIGO_BENEFICIARIO == other.getCODIGO_BENEFICIARIO() &&
            ((this.TITULO==null && other.getTITULO()==null) || 
             (this.TITULO!=null &&
              this.TITULO.equals(other.getTITULO())));
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
        _hashCode += getCODIGO_BENEFICIARIO();
        if (getTITULO() != null) {
            _hashCode += getTITULO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Inclui_boleto_entrada_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "inclui_boleto_entrada_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODIGO_BENEFICIARIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CODIGO_BENEFICIARIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITULO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TITULO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "titulo_entrada_Type"));
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
