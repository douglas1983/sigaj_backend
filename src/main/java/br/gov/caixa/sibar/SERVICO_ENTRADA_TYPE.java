/**
 * SERVICO_ENTRADA_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar;

public class SERVICO_ENTRADA_TYPE  implements java.io.Serializable {
    private br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE HEADER;

    public SERVICO_ENTRADA_TYPE() {
    }

    public SERVICO_ENTRADA_TYPE(
           br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE HEADER) {
           this.HEADER = HEADER;
    }


    /**
     * Gets the HEADER value for this SERVICO_ENTRADA_TYPE.
     * 
     * @return HEADER
     */
    public br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE getHEADER() {
        return HEADER;
    }


    /**
     * Sets the HEADER value for this SERVICO_ENTRADA_TYPE.
     * 
     * @param HEADER
     */
    public void setHEADER(br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE HEADER) {
        this.HEADER = HEADER;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SERVICO_ENTRADA_TYPE)) return false;
        SERVICO_ENTRADA_TYPE other = (SERVICO_ENTRADA_TYPE) obj;
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
              this.HEADER.equals(other.getHEADER())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SERVICO_ENTRADA_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "SERVICO_ENTRADA_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HEADER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "HEADER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "HEADER_BARRAMENTO_TYPE"));
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
