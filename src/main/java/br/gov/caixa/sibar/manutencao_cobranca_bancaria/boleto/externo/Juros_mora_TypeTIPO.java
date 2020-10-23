/**
 * Juros_mora_TypeTIPO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Juros_mora_TypeTIPO implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Juros_mora_TypeTIPO(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _VALOR_POR_DIA = "VALOR_POR_DIA";
    public static final java.lang.String _TAXA_MENSAL = "TAXA_MENSAL";
    public static final java.lang.String _ISENTO = "ISENTO";
    public static final java.lang.String _PERCENTUAL_DIA_CORRIDO = "PERCENTUAL_DIA_CORRIDO";
    public static final java.lang.String _PERCENTUAL_ANO_DIA_CORRIDO = "PERCENTUAL_ANO_DIA_CORRIDO";
    public static final java.lang.String _VALOR_DIA_UTIL = "VALOR_DIA_UTIL";
    public static final java.lang.String _PERCENTUAL_DIA_UTIL = "PERCENTUAL_DIA_UTIL";
    public static final java.lang.String _PERCENTUAL_MES_DIA_UTIL = "PERCENTUAL_MES_DIA_UTIL";
    public static final java.lang.String _PERCENTUAL_ANO_DIA_UTIL = "PERCENTUAL_ANO_DIA_UTIL";
    public static final Juros_mora_TypeTIPO VALOR_POR_DIA = new Juros_mora_TypeTIPO(_VALOR_POR_DIA);
    public static final Juros_mora_TypeTIPO TAXA_MENSAL = new Juros_mora_TypeTIPO(_TAXA_MENSAL);
    public static final Juros_mora_TypeTIPO ISENTO = new Juros_mora_TypeTIPO(_ISENTO);
    public static final Juros_mora_TypeTIPO PERCENTUAL_DIA_CORRIDO = new Juros_mora_TypeTIPO(_PERCENTUAL_DIA_CORRIDO);
    public static final Juros_mora_TypeTIPO PERCENTUAL_ANO_DIA_CORRIDO = new Juros_mora_TypeTIPO(_PERCENTUAL_ANO_DIA_CORRIDO);
    public static final Juros_mora_TypeTIPO VALOR_DIA_UTIL = new Juros_mora_TypeTIPO(_VALOR_DIA_UTIL);
    public static final Juros_mora_TypeTIPO PERCENTUAL_DIA_UTIL = new Juros_mora_TypeTIPO(_PERCENTUAL_DIA_UTIL);
    public static final Juros_mora_TypeTIPO PERCENTUAL_MES_DIA_UTIL = new Juros_mora_TypeTIPO(_PERCENTUAL_MES_DIA_UTIL);
    public static final Juros_mora_TypeTIPO PERCENTUAL_ANO_DIA_UTIL = new Juros_mora_TypeTIPO(_PERCENTUAL_ANO_DIA_UTIL);
    public java.lang.String getValue() { return _value_;}
    public static Juros_mora_TypeTIPO fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Juros_mora_TypeTIPO enumeration = (Juros_mora_TypeTIPO)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Juros_mora_TypeTIPO fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Juros_mora_TypeTIPO.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", ">juros_mora_Type>TIPO"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
