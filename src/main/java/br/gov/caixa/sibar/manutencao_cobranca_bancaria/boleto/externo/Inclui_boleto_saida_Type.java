/**
 * Inclui_boleto_saida_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Inclui_boleto_saida_Type  implements java.io.Serializable {
    private java.lang.String CODIGO_BARRAS;

    private java.lang.String LINHA_DIGITAVEL;

    private long NOSSO_NUMERO;

    private java.lang.String URL;

    public Inclui_boleto_saida_Type() {
    }

    public Inclui_boleto_saida_Type(
           java.lang.String CODIGO_BARRAS,
           java.lang.String LINHA_DIGITAVEL,
           long NOSSO_NUMERO,
           java.lang.String URL) {
           this.CODIGO_BARRAS = CODIGO_BARRAS;
           this.LINHA_DIGITAVEL = LINHA_DIGITAVEL;
           this.NOSSO_NUMERO = NOSSO_NUMERO;
           this.URL = URL;
    }


    /**
     * Gets the CODIGO_BARRAS value for this Inclui_boleto_saida_Type.
     * 
     * @return CODIGO_BARRAS
     */
    public java.lang.String getCODIGO_BARRAS() {
        return CODIGO_BARRAS;
    }


    /**
     * Sets the CODIGO_BARRAS value for this Inclui_boleto_saida_Type.
     * 
     * @param CODIGO_BARRAS
     */
    public void setCODIGO_BARRAS(java.lang.String CODIGO_BARRAS) {
        this.CODIGO_BARRAS = CODIGO_BARRAS;
    }


    /**
     * Gets the LINHA_DIGITAVEL value for this Inclui_boleto_saida_Type.
     * 
     * @return LINHA_DIGITAVEL
     */
    public java.lang.String getLINHA_DIGITAVEL() {
        return LINHA_DIGITAVEL;
    }


    /**
     * Sets the LINHA_DIGITAVEL value for this Inclui_boleto_saida_Type.
     * 
     * @param LINHA_DIGITAVEL
     */
    public void setLINHA_DIGITAVEL(java.lang.String LINHA_DIGITAVEL) {
        this.LINHA_DIGITAVEL = LINHA_DIGITAVEL;
    }


    /**
     * Gets the NOSSO_NUMERO value for this Inclui_boleto_saida_Type.
     * 
     * @return NOSSO_NUMERO
     */
    public long getNOSSO_NUMERO() {
        return NOSSO_NUMERO;
    }


    /**
     * Sets the NOSSO_NUMERO value for this Inclui_boleto_saida_Type.
     * 
     * @param NOSSO_NUMERO
     */
    public void setNOSSO_NUMERO(long NOSSO_NUMERO) {
        this.NOSSO_NUMERO = NOSSO_NUMERO;
    }


    /**
     * Gets the URL value for this Inclui_boleto_saida_Type.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this Inclui_boleto_saida_Type.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Inclui_boleto_saida_Type)) return false;
        Inclui_boleto_saida_Type other = (Inclui_boleto_saida_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CODIGO_BARRAS==null && other.getCODIGO_BARRAS()==null) || 
             (this.CODIGO_BARRAS!=null &&
              this.CODIGO_BARRAS.equals(other.getCODIGO_BARRAS()))) &&
            ((this.LINHA_DIGITAVEL==null && other.getLINHA_DIGITAVEL()==null) || 
             (this.LINHA_DIGITAVEL!=null &&
              this.LINHA_DIGITAVEL.equals(other.getLINHA_DIGITAVEL()))) &&
            this.NOSSO_NUMERO == other.getNOSSO_NUMERO() &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL())));
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
        if (getCODIGO_BARRAS() != null) {
            _hashCode += getCODIGO_BARRAS().hashCode();
        }
        if (getLINHA_DIGITAVEL() != null) {
            _hashCode += getLINHA_DIGITAVEL().hashCode();
        }
        _hashCode += new Long(getNOSSO_NUMERO()).hashCode();
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Inclui_boleto_saida_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "inclui_boleto_saida_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODIGO_BARRAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CODIGO_BARRAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LINHA_DIGITAVEL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LINHA_DIGITAVEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOSSO_NUMERO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOSSO_NUMERO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
