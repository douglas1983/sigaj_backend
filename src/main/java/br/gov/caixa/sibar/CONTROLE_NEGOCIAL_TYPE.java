/**
 * CONTROLE_NEGOCIAL_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar;

public class CONTROLE_NEGOCIAL_TYPE  implements java.io.Serializable {
    private java.lang.String ORIGEM_RETORNO;

    private java.lang.String COD_RETORNO;

    private java.lang.String MSG_RETORNO;

    private java.lang.String NSU;

    private br.gov.caixa.sibar.Mensagens_controle_negocial_Type MENSAGENS;

    public CONTROLE_NEGOCIAL_TYPE() {
    }

    public CONTROLE_NEGOCIAL_TYPE(
           java.lang.String ORIGEM_RETORNO,
           java.lang.String COD_RETORNO,
           java.lang.String MSG_RETORNO,
           java.lang.String NSU,
           br.gov.caixa.sibar.Mensagens_controle_negocial_Type MENSAGENS) {
           this.ORIGEM_RETORNO = ORIGEM_RETORNO;
           this.COD_RETORNO = COD_RETORNO;
           this.MSG_RETORNO = MSG_RETORNO;
           this.NSU = NSU;
           this.MENSAGENS = MENSAGENS;
    }


    /**
     * Gets the ORIGEM_RETORNO value for this CONTROLE_NEGOCIAL_TYPE.
     * 
     * @return ORIGEM_RETORNO
     */
    public java.lang.String getORIGEM_RETORNO() {
        return ORIGEM_RETORNO;
    }


    /**
     * Sets the ORIGEM_RETORNO value for this CONTROLE_NEGOCIAL_TYPE.
     * 
     * @param ORIGEM_RETORNO
     */
    public void setORIGEM_RETORNO(java.lang.String ORIGEM_RETORNO) {
        this.ORIGEM_RETORNO = ORIGEM_RETORNO;
    }


    /**
     * Gets the COD_RETORNO value for this CONTROLE_NEGOCIAL_TYPE.
     * 
     * @return COD_RETORNO
     */
    public java.lang.String getCOD_RETORNO() {
        return COD_RETORNO;
    }


    /**
     * Sets the COD_RETORNO value for this CONTROLE_NEGOCIAL_TYPE.
     * 
     * @param COD_RETORNO
     */
    public void setCOD_RETORNO(java.lang.String COD_RETORNO) {
        this.COD_RETORNO = COD_RETORNO;
    }


    /**
     * Gets the MSG_RETORNO value for this CONTROLE_NEGOCIAL_TYPE.
     * 
     * @return MSG_RETORNO
     */
    public java.lang.String getMSG_RETORNO() {
        return MSG_RETORNO;
    }


    /**
     * Sets the MSG_RETORNO value for this CONTROLE_NEGOCIAL_TYPE.
     * 
     * @param MSG_RETORNO
     */
    public void setMSG_RETORNO(java.lang.String MSG_RETORNO) {
        this.MSG_RETORNO = MSG_RETORNO;
    }


    /**
     * Gets the NSU value for this CONTROLE_NEGOCIAL_TYPE.
     * 
     * @return NSU
     */
    public java.lang.String getNSU() {
        return NSU;
    }


    /**
     * Sets the NSU value for this CONTROLE_NEGOCIAL_TYPE.
     * 
     * @param NSU
     */
    public void setNSU(java.lang.String NSU) {
        this.NSU = NSU;
    }


    /**
     * Gets the MENSAGENS value for this CONTROLE_NEGOCIAL_TYPE.
     * 
     * @return MENSAGENS
     */
    public br.gov.caixa.sibar.Mensagens_controle_negocial_Type getMENSAGENS() {
        return MENSAGENS;
    }


    /**
     * Sets the MENSAGENS value for this CONTROLE_NEGOCIAL_TYPE.
     * 
     * @param MENSAGENS
     */
    public void setMENSAGENS(br.gov.caixa.sibar.Mensagens_controle_negocial_Type MENSAGENS) {
        this.MENSAGENS = MENSAGENS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CONTROLE_NEGOCIAL_TYPE)) return false;
        CONTROLE_NEGOCIAL_TYPE other = (CONTROLE_NEGOCIAL_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ORIGEM_RETORNO==null && other.getORIGEM_RETORNO()==null) || 
             (this.ORIGEM_RETORNO!=null &&
              this.ORIGEM_RETORNO.equals(other.getORIGEM_RETORNO()))) &&
            ((this.COD_RETORNO==null && other.getCOD_RETORNO()==null) || 
             (this.COD_RETORNO!=null &&
              this.COD_RETORNO.equals(other.getCOD_RETORNO()))) &&
            ((this.MSG_RETORNO==null && other.getMSG_RETORNO()==null) || 
             (this.MSG_RETORNO!=null &&
              this.MSG_RETORNO.equals(other.getMSG_RETORNO()))) &&
            ((this.NSU==null && other.getNSU()==null) || 
             (this.NSU!=null &&
              this.NSU.equals(other.getNSU()))) &&
            ((this.MENSAGENS==null && other.getMENSAGENS()==null) || 
             (this.MENSAGENS!=null &&
              this.MENSAGENS.equals(other.getMENSAGENS())));
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
        if (getORIGEM_RETORNO() != null) {
            _hashCode += getORIGEM_RETORNO().hashCode();
        }
        if (getCOD_RETORNO() != null) {
            _hashCode += getCOD_RETORNO().hashCode();
        }
        if (getMSG_RETORNO() != null) {
            _hashCode += getMSG_RETORNO().hashCode();
        }
        if (getNSU() != null) {
            _hashCode += getNSU().hashCode();
        }
        if (getMENSAGENS() != null) {
            _hashCode += getMENSAGENS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CONTROLE_NEGOCIAL_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "CONTROLE_NEGOCIAL_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORIGEM_RETORNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ORIGEM_RETORNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COD_RETORNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COD_RETORNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSG_RETORNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MSG_RETORNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NSU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NSU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MENSAGENS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MENSAGENS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "mensagens_controle_negocial_Type"));
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
