/**
 * Mensagens_controle_negocial_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar;

public class Mensagens_controle_negocial_Type  implements java.io.Serializable {
    private java.lang.String RETORNO;

    private java.lang.String INSTITUCIONAL;

    private java.lang.String INFORMATIVA;

    private java.lang.String TELA;

    private java.lang.String[] MENSAGEM;

    public Mensagens_controle_negocial_Type() {
    }

    public Mensagens_controle_negocial_Type(
           java.lang.String RETORNO,
           java.lang.String INSTITUCIONAL,
           java.lang.String INFORMATIVA,
           java.lang.String TELA,
           java.lang.String[] MENSAGEM) {
           this.RETORNO = RETORNO;
           this.INSTITUCIONAL = INSTITUCIONAL;
           this.INFORMATIVA = INFORMATIVA;
           this.TELA = TELA;
           this.MENSAGEM = MENSAGEM;
    }


    /**
     * Gets the RETORNO value for this Mensagens_controle_negocial_Type.
     * 
     * @return RETORNO
     */
    public java.lang.String getRETORNO() {
        return RETORNO;
    }


    /**
     * Sets the RETORNO value for this Mensagens_controle_negocial_Type.
     * 
     * @param RETORNO
     */
    public void setRETORNO(java.lang.String RETORNO) {
        this.RETORNO = RETORNO;
    }


    /**
     * Gets the INSTITUCIONAL value for this Mensagens_controle_negocial_Type.
     * 
     * @return INSTITUCIONAL
     */
    public java.lang.String getINSTITUCIONAL() {
        return INSTITUCIONAL;
    }


    /**
     * Sets the INSTITUCIONAL value for this Mensagens_controle_negocial_Type.
     * 
     * @param INSTITUCIONAL
     */
    public void setINSTITUCIONAL(java.lang.String INSTITUCIONAL) {
        this.INSTITUCIONAL = INSTITUCIONAL;
    }


    /**
     * Gets the INFORMATIVA value for this Mensagens_controle_negocial_Type.
     * 
     * @return INFORMATIVA
     */
    public java.lang.String getINFORMATIVA() {
        return INFORMATIVA;
    }


    /**
     * Sets the INFORMATIVA value for this Mensagens_controle_negocial_Type.
     * 
     * @param INFORMATIVA
     */
    public void setINFORMATIVA(java.lang.String INFORMATIVA) {
        this.INFORMATIVA = INFORMATIVA;
    }


    /**
     * Gets the TELA value for this Mensagens_controle_negocial_Type.
     * 
     * @return TELA
     */
    public java.lang.String getTELA() {
        return TELA;
    }


    /**
     * Sets the TELA value for this Mensagens_controle_negocial_Type.
     * 
     * @param TELA
     */
    public void setTELA(java.lang.String TELA) {
        this.TELA = TELA;
    }


    /**
     * Gets the MENSAGEM value for this Mensagens_controle_negocial_Type.
     * 
     * @return MENSAGEM
     */
    public java.lang.String[] getMENSAGEM() {
        return MENSAGEM;
    }


    /**
     * Sets the MENSAGEM value for this Mensagens_controle_negocial_Type.
     * 
     * @param MENSAGEM
     */
    public void setMENSAGEM(java.lang.String[] MENSAGEM) {
        this.MENSAGEM = MENSAGEM;
    }

    public java.lang.String getMENSAGEM(int i) {
        return this.MENSAGEM[i];
    }

    public void setMENSAGEM(int i, java.lang.String _value) {
        this.MENSAGEM[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mensagens_controle_negocial_Type)) return false;
        Mensagens_controle_negocial_Type other = (Mensagens_controle_negocial_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RETORNO==null && other.getRETORNO()==null) || 
             (this.RETORNO!=null &&
              this.RETORNO.equals(other.getRETORNO()))) &&
            ((this.INSTITUCIONAL==null && other.getINSTITUCIONAL()==null) || 
             (this.INSTITUCIONAL!=null &&
              this.INSTITUCIONAL.equals(other.getINSTITUCIONAL()))) &&
            ((this.INFORMATIVA==null && other.getINFORMATIVA()==null) || 
             (this.INFORMATIVA!=null &&
              this.INFORMATIVA.equals(other.getINFORMATIVA()))) &&
            ((this.TELA==null && other.getTELA()==null) || 
             (this.TELA!=null &&
              this.TELA.equals(other.getTELA()))) &&
            ((this.MENSAGEM==null && other.getMENSAGEM()==null) || 
             (this.MENSAGEM!=null &&
              java.util.Arrays.equals(this.MENSAGEM, other.getMENSAGEM())));
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
        if (getRETORNO() != null) {
            _hashCode += getRETORNO().hashCode();
        }
        if (getINSTITUCIONAL() != null) {
            _hashCode += getINSTITUCIONAL().hashCode();
        }
        if (getINFORMATIVA() != null) {
            _hashCode += getINFORMATIVA().hashCode();
        }
        if (getTELA() != null) {
            _hashCode += getTELA().hashCode();
        }
        if (getMENSAGEM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMENSAGEM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMENSAGEM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Mensagens_controle_negocial_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "mensagens_controle_negocial_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETORNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RETORNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSTITUCIONAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INSTITUCIONAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INFORMATIVA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INFORMATIVA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TELA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MENSAGEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MENSAGEM"));
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
