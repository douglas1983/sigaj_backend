/**
 * Desconto_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Desconto_Type  implements java.io.Serializable {
    private java.util.Date DATA;

    private java.math.BigDecimal VALOR;

    private java.math.BigDecimal PERCENTUAL;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Desconto_TypeTIPO TIPO;

    public Desconto_Type() {
    }

    public Desconto_Type(
           java.util.Date DATA,
           java.math.BigDecimal VALOR,
           java.math.BigDecimal PERCENTUAL,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Desconto_TypeTIPO TIPO) {
           this.DATA = DATA;
           this.VALOR = VALOR;
           this.PERCENTUAL = PERCENTUAL;
           this.TIPO = TIPO;
    }


    /**
     * Gets the DATA value for this Desconto_Type.
     * 
     * @return DATA
     */
    public java.util.Date getDATA() {
        return DATA;
    }


    /**
     * Sets the DATA value for this Desconto_Type.
     * 
     * @param DATA
     */
    public void setDATA(java.util.Date DATA) {
        this.DATA = DATA;
    }


    /**
     * Gets the VALOR value for this Desconto_Type.
     * 
     * @return VALOR
     */
    public java.math.BigDecimal getVALOR() {
        return VALOR;
    }


    /**
     * Sets the VALOR value for this Desconto_Type.
     * 
     * @param VALOR
     */
    public void setVALOR(java.math.BigDecimal VALOR) {
        this.VALOR = VALOR;
    }


    /**
     * Gets the PERCENTUAL value for this Desconto_Type.
     * 
     * @return PERCENTUAL
     */
    public java.math.BigDecimal getPERCENTUAL() {
        return PERCENTUAL;
    }


    /**
     * Sets the PERCENTUAL value for this Desconto_Type.
     * 
     * @param PERCENTUAL
     */
    public void setPERCENTUAL(java.math.BigDecimal PERCENTUAL) {
        this.PERCENTUAL = PERCENTUAL;
    }


    /**
     * Gets the TIPO value for this Desconto_Type.
     * 
     * @return TIPO
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Desconto_TypeTIPO getTIPO() {
        return TIPO;
    }


    /**
     * Sets the TIPO value for this Desconto_Type.
     * 
     * @param TIPO
     */
    public void setTIPO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Desconto_TypeTIPO TIPO) {
        this.TIPO = TIPO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Desconto_Type)) return false;
        Desconto_Type other = (Desconto_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DATA==null && other.getDATA()==null) || 
             (this.DATA!=null &&
              this.DATA.equals(other.getDATA()))) &&
            ((this.VALOR==null && other.getVALOR()==null) || 
             (this.VALOR!=null &&
              this.VALOR.equals(other.getVALOR()))) &&
            ((this.PERCENTUAL==null && other.getPERCENTUAL()==null) || 
             (this.PERCENTUAL!=null &&
              this.PERCENTUAL.equals(other.getPERCENTUAL()))) &&
            ((this.TIPO==null && other.getTIPO()==null) || 
             (this.TIPO!=null &&
              this.TIPO.equals(other.getTIPO())));
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
        if (getDATA() != null) {
            _hashCode += getDATA().hashCode();
        }
        if (getVALOR() != null) {
            _hashCode += getVALOR().hashCode();
        }
        if (getPERCENTUAL() != null) {
            _hashCode += getPERCENTUAL().hashCode();
        }
        if (getTIPO() != null) {
            _hashCode += getTIPO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Desconto_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "desconto_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA"));
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
        elemField.setFieldName("PERCENTUAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PERCENTUAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIPO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TIPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", ">desconto_Type>TIPO"));
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
