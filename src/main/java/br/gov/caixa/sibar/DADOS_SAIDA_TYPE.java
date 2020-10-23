/**
 * DADOS_SAIDA_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar;

public class DADOS_SAIDA_TYPE  implements java.io.Serializable {
    private br.gov.caixa.sibar.CONTROLE_NEGOCIAL_TYPE[] CONTROLE_NEGOCIAL;

    private java.lang.String EXCECAO;

    public DADOS_SAIDA_TYPE() {
    }

    public DADOS_SAIDA_TYPE(
           br.gov.caixa.sibar.CONTROLE_NEGOCIAL_TYPE[] CONTROLE_NEGOCIAL,
           java.lang.String EXCECAO) {
           this.CONTROLE_NEGOCIAL = CONTROLE_NEGOCIAL;
           this.EXCECAO = EXCECAO;
    }


    /**
     * Gets the CONTROLE_NEGOCIAL value for this DADOS_SAIDA_TYPE.
     * 
     * @return CONTROLE_NEGOCIAL
     */
    public br.gov.caixa.sibar.CONTROLE_NEGOCIAL_TYPE[] getCONTROLE_NEGOCIAL() {
        return CONTROLE_NEGOCIAL;
    }


    /**
     * Sets the CONTROLE_NEGOCIAL value for this DADOS_SAIDA_TYPE.
     * 
     * @param CONTROLE_NEGOCIAL
     */
    public void setCONTROLE_NEGOCIAL(br.gov.caixa.sibar.CONTROLE_NEGOCIAL_TYPE[] CONTROLE_NEGOCIAL) {
        this.CONTROLE_NEGOCIAL = CONTROLE_NEGOCIAL;
    }

    public br.gov.caixa.sibar.CONTROLE_NEGOCIAL_TYPE getCONTROLE_NEGOCIAL(int i) {
        return this.CONTROLE_NEGOCIAL[i];
    }

    public void setCONTROLE_NEGOCIAL(int i, br.gov.caixa.sibar.CONTROLE_NEGOCIAL_TYPE _value) {
        this.CONTROLE_NEGOCIAL[i] = _value;
    }


    /**
     * Gets the EXCECAO value for this DADOS_SAIDA_TYPE.
     * 
     * @return EXCECAO
     */
    public java.lang.String getEXCECAO() {
        return EXCECAO;
    }


    /**
     * Sets the EXCECAO value for this DADOS_SAIDA_TYPE.
     * 
     * @param EXCECAO
     */
    public void setEXCECAO(java.lang.String EXCECAO) {
        this.EXCECAO = EXCECAO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DADOS_SAIDA_TYPE)) return false;
        DADOS_SAIDA_TYPE other = (DADOS_SAIDA_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CONTROLE_NEGOCIAL==null && other.getCONTROLE_NEGOCIAL()==null) || 
             (this.CONTROLE_NEGOCIAL!=null &&
              java.util.Arrays.equals(this.CONTROLE_NEGOCIAL, other.getCONTROLE_NEGOCIAL()))) &&
            ((this.EXCECAO==null && other.getEXCECAO()==null) || 
             (this.EXCECAO!=null &&
              this.EXCECAO.equals(other.getEXCECAO())));
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
        if (getCONTROLE_NEGOCIAL() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCONTROLE_NEGOCIAL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCONTROLE_NEGOCIAL(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEXCECAO() != null) {
            _hashCode += getEXCECAO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DADOS_SAIDA_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "DADOS_SAIDA_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTROLE_NEGOCIAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTROLE_NEGOCIAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "CONTROLE_NEGOCIAL_TYPE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXCECAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EXCECAO"));
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
