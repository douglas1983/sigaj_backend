/**
 * SERVICO_SAIDA_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar;

public class SERVICO_SAIDA_TYPE  implements java.io.Serializable {
    private br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE HEADER;

    private java.lang.String COD_RETORNO;

    private java.lang.String ORIGEM_RETORNO;

    private java.lang.String MSG_RETORNO;

    public SERVICO_SAIDA_TYPE() {
    }

    public SERVICO_SAIDA_TYPE(
           br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE HEADER,
           java.lang.String COD_RETORNO,
           java.lang.String ORIGEM_RETORNO,
           java.lang.String MSG_RETORNO) {
           this.HEADER = HEADER;
           this.COD_RETORNO = COD_RETORNO;
           this.ORIGEM_RETORNO = ORIGEM_RETORNO;
           this.MSG_RETORNO = MSG_RETORNO;
    }


    /**
     * Gets the HEADER value for this SERVICO_SAIDA_TYPE.
     * 
     * @return HEADER
     */
    public br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE getHEADER() {
        return HEADER;
    }


    /**
     * Sets the HEADER value for this SERVICO_SAIDA_TYPE.
     * 
     * @param HEADER
     */
    public void setHEADER(br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE HEADER) {
        this.HEADER = HEADER;
    }


    /**
     * Gets the COD_RETORNO value for this SERVICO_SAIDA_TYPE.
     * 
     * @return COD_RETORNO
     */
    public java.lang.String getCOD_RETORNO() {
        return COD_RETORNO;
    }


    /**
     * Sets the COD_RETORNO value for this SERVICO_SAIDA_TYPE.
     * 
     * @param COD_RETORNO
     */
    public void setCOD_RETORNO(java.lang.String COD_RETORNO) {
        this.COD_RETORNO = COD_RETORNO;
    }


    /**
     * Gets the ORIGEM_RETORNO value for this SERVICO_SAIDA_TYPE.
     * 
     * @return ORIGEM_RETORNO
     */
    public java.lang.String getORIGEM_RETORNO() {
        return ORIGEM_RETORNO;
    }


    /**
     * Sets the ORIGEM_RETORNO value for this SERVICO_SAIDA_TYPE.
     * 
     * @param ORIGEM_RETORNO
     */
    public void setORIGEM_RETORNO(java.lang.String ORIGEM_RETORNO) {
        this.ORIGEM_RETORNO = ORIGEM_RETORNO;
    }


    /**
     * Gets the MSG_RETORNO value for this SERVICO_SAIDA_TYPE.
     * 
     * @return MSG_RETORNO
     */
    public java.lang.String getMSG_RETORNO() {
        return MSG_RETORNO;
    }


    /**
     * Sets the MSG_RETORNO value for this SERVICO_SAIDA_TYPE.
     * 
     * @param MSG_RETORNO
     */
    public void setMSG_RETORNO(java.lang.String MSG_RETORNO) {
        this.MSG_RETORNO = MSG_RETORNO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SERVICO_SAIDA_TYPE)) return false;
        SERVICO_SAIDA_TYPE other = (SERVICO_SAIDA_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HEADER==null && other.getHEADER()==null) || 
             (this.HEADER!=null &&
              this.HEADER.equals(other.getHEADER()))) &&
            ((this.COD_RETORNO==null && other.getCOD_RETORNO()==null) || 
             (this.COD_RETORNO!=null &&
              this.COD_RETORNO.equals(other.getCOD_RETORNO()))) &&
            ((this.ORIGEM_RETORNO==null && other.getORIGEM_RETORNO()==null) || 
             (this.ORIGEM_RETORNO!=null &&
              this.ORIGEM_RETORNO.equals(other.getORIGEM_RETORNO()))) &&
            ((this.MSG_RETORNO==null && other.getMSG_RETORNO()==null) || 
             (this.MSG_RETORNO!=null &&
              this.MSG_RETORNO.equals(other.getMSG_RETORNO())));
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
        if (getHEADER() != null) {
            _hashCode += getHEADER().hashCode();
        }
        if (getCOD_RETORNO() != null) {
            _hashCode += getCOD_RETORNO().hashCode();
        }
        if (getORIGEM_RETORNO() != null) {
            _hashCode += getORIGEM_RETORNO().hashCode();
        }
        if (getMSG_RETORNO() != null) {
            _hashCode += getMSG_RETORNO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SERVICO_SAIDA_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "SERVICO_SAIDA_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HEADER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "HEADER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "HEADER_BARRAMENTO_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COD_RETORNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COD_RETORNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORIGEM_RETORNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ORIGEM_RETORNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSG_RETORNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MSG_RETORNO"));
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
