/**
 * Dados_saida_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Dados_saida_Type  extends br.gov.caixa.sibar.DADOS_SAIDA_TYPE  implements java.io.Serializable {
    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Inclui_boleto_saida_Type INCLUI_BOLETO;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_saida_Type ALTERA_BOLETO;

    public Dados_saida_Type() {
    }

    public Dados_saida_Type(
           br.gov.caixa.sibar.CONTROLE_NEGOCIAL_TYPE[] CONTROLE_NEGOCIAL,
           java.lang.String EXCECAO,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Inclui_boleto_saida_Type INCLUI_BOLETO,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_saida_Type ALTERA_BOLETO) {
        super(
            CONTROLE_NEGOCIAL,
            EXCECAO);
        this.INCLUI_BOLETO = INCLUI_BOLETO;
        this.ALTERA_BOLETO = ALTERA_BOLETO;
    }


    /**
     * Gets the INCLUI_BOLETO value for this Dados_saida_Type.
     * 
     * @return INCLUI_BOLETO
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Inclui_boleto_saida_Type getINCLUI_BOLETO() {
        return INCLUI_BOLETO;
    }


    /**
     * Sets the INCLUI_BOLETO value for this Dados_saida_Type.
     * 
     * @param INCLUI_BOLETO
     */
    public void setINCLUI_BOLETO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Inclui_boleto_saida_Type INCLUI_BOLETO) {
        this.INCLUI_BOLETO = INCLUI_BOLETO;
    }


    /**
     * Gets the ALTERA_BOLETO value for this Dados_saida_Type.
     * 
     * @return ALTERA_BOLETO
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_saida_Type getALTERA_BOLETO() {
        return ALTERA_BOLETO;
    }


    /**
     * Sets the ALTERA_BOLETO value for this Dados_saida_Type.
     * 
     * @param ALTERA_BOLETO
     */
    public void setALTERA_BOLETO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Altera_boleto_saida_Type ALTERA_BOLETO) {
        this.ALTERA_BOLETO = ALTERA_BOLETO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dados_saida_Type)) return false;
        Dados_saida_Type other = (Dados_saida_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.INCLUI_BOLETO==null && other.getINCLUI_BOLETO()==null) || 
             (this.INCLUI_BOLETO!=null &&
              this.INCLUI_BOLETO.equals(other.getINCLUI_BOLETO()))) &&
            ((this.ALTERA_BOLETO==null && other.getALTERA_BOLETO()==null) || 
             (this.ALTERA_BOLETO!=null &&
              this.ALTERA_BOLETO.equals(other.getALTERA_BOLETO())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getINCLUI_BOLETO() != null) {
            _hashCode += getINCLUI_BOLETO().hashCode();
        }
        if (getALTERA_BOLETO() != null) {
            _hashCode += getALTERA_BOLETO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dados_saida_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "dados_saida_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INCLUI_BOLETO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INCLUI_BOLETO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "inclui_boleto_saida_Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ALTERA_BOLETO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ALTERA_BOLETO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "altera_boleto_saida_Type"));
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
