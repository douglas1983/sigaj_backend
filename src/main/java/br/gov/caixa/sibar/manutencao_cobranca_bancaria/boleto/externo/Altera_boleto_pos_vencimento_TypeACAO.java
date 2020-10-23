/**
 * Altera_boleto_pos_vencimento_TypeACAO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Altera_boleto_pos_vencimento_TypeACAO implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Altera_boleto_pos_vencimento_TypeACAO(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PROTESTAR = "PROTESTAR";
    public static final java.lang.String _DEVOLVER = "DEVOLVER";
    public static final Altera_boleto_pos_vencimento_TypeACAO PROTESTAR = new Altera_boleto_pos_vencimento_TypeACAO(_PROTESTAR);
    public static final Altera_boleto_pos_vencimento_TypeACAO DEVOLVER = new Altera_boleto_pos_vencimento_TypeACAO(_DEVOLVER);
    public java.lang.String getValue() { return _value_;}
    public static Altera_boleto_pos_vencimento_TypeACAO fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Altera_boleto_pos_vencimento_TypeACAO enumeration = (Altera_boleto_pos_vencimento_TypeACAO)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Altera_boleto_pos_vencimento_TypeACAO fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Altera_boleto_pos_vencimento_TypeACAO.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", ">altera_boleto_pos_vencimento_Type>ACAO"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
