/**
 * Desconto_TypeTIPO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Desconto_TypeTIPO implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Desconto_TypeTIPO(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ISENTO = "ISENTO";
    public static final java.lang.String _VALOR_FIXO_ATE_DATA = "VALOR_FIXO_ATE_DATA";
    public static final java.lang.String _PERCENTUAL_ATE_DATA = "PERCENTUAL_ATE_DATA";
    public static final java.lang.String _VALOR_ANTECIPACAO_DIA_CORRIDO = "VALOR_ANTECIPACAO_DIA_CORRIDO";
    public static final java.lang.String _VALOR_ANTECIPACAO_DIA_UTIL = "VALOR_ANTECIPACAO_DIA_UTIL";
    public static final java.lang.String _PERCENTUAL_ANTECIPACAO_DIA_CORRIDO = "PERCENTUAL_ANTECIPACAO_DIA_CORRIDO";
    public static final java.lang.String _PERCENTUAL_ANTECIPACAO_DIA_UTIL = "PERCENTUAL_ANTECIPACAO_DIA_UTIL";
    public static final Desconto_TypeTIPO ISENTO = new Desconto_TypeTIPO(_ISENTO);
    public static final Desconto_TypeTIPO VALOR_FIXO_ATE_DATA = new Desconto_TypeTIPO(_VALOR_FIXO_ATE_DATA);
    public static final Desconto_TypeTIPO PERCENTUAL_ATE_DATA = new Desconto_TypeTIPO(_PERCENTUAL_ATE_DATA);
    public static final Desconto_TypeTIPO VALOR_ANTECIPACAO_DIA_CORRIDO = new Desconto_TypeTIPO(_VALOR_ANTECIPACAO_DIA_CORRIDO);
    public static final Desconto_TypeTIPO VALOR_ANTECIPACAO_DIA_UTIL = new Desconto_TypeTIPO(_VALOR_ANTECIPACAO_DIA_UTIL);
    public static final Desconto_TypeTIPO PERCENTUAL_ANTECIPACAO_DIA_CORRIDO = new Desconto_TypeTIPO(_PERCENTUAL_ANTECIPACAO_DIA_CORRIDO);
    public static final Desconto_TypeTIPO PERCENTUAL_ANTECIPACAO_DIA_UTIL = new Desconto_TypeTIPO(_PERCENTUAL_ANTECIPACAO_DIA_UTIL);
    public java.lang.String getValue() { return _value_;}
    public static Desconto_TypeTIPO fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Desconto_TypeTIPO enumeration = (Desconto_TypeTIPO)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Desconto_TypeTIPO fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Desconto_TypeTIPO.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", ">desconto_Type>TIPO"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
