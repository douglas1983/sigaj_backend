/**
 * Manutencao_cobranca_bancaria_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Manutencao_cobranca_bancaria_ServiceLocator extends org.apache.axis.client.Service implements br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancaria_Service {

    public Manutencao_cobranca_bancaria_ServiceLocator() {
    }


    public Manutencao_cobranca_bancaria_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Manutencao_cobranca_bancaria_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for manutencao_cobranca_bancariaSOAP
    private java.lang.String manutencao_cobranca_bancariaSOAP_address = "https://barramento.caixa.gov.br/sibar/ManutencaoCobrancaBancaria/Boleto/Externo";

    public java.lang.String getmanutencao_cobranca_bancariaSOAPAddress() {
        return manutencao_cobranca_bancariaSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String manutencao_cobranca_bancariaSOAPWSDDServiceName = "manutencao_cobranca_bancariaSOAP";

    public java.lang.String getmanutencao_cobranca_bancariaSOAPWSDDServiceName() {
        return manutencao_cobranca_bancariaSOAPWSDDServiceName;
    }

    public void setmanutencao_cobranca_bancariaSOAPWSDDServiceName(java.lang.String name) {
        manutencao_cobranca_bancariaSOAPWSDDServiceName = name;
    }

    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancaria_PortType getmanutencao_cobranca_bancariaSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(manutencao_cobranca_bancariaSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getmanutencao_cobranca_bancariaSOAP(endpoint);
    }

    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancaria_PortType getmanutencao_cobranca_bancariaSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancariaSOAPStub _stub = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancariaSOAPStub(portAddress, this);
            _stub.setPortName(getmanutencao_cobranca_bancariaSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setmanutencao_cobranca_bancariaSOAPEndpointAddress(java.lang.String address) {
        manutencao_cobranca_bancariaSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancaria_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancariaSOAPStub _stub = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancariaSOAPStub(new java.net.URL(manutencao_cobranca_bancariaSOAP_address), this);
                _stub.setPortName(getmanutencao_cobranca_bancariaSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("manutencao_cobranca_bancariaSOAP".equals(inputPortName)) {
            return getmanutencao_cobranca_bancariaSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "manutencao_cobranca_bancaria");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "manutencao_cobranca_bancariaSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("manutencao_cobranca_bancariaSOAP".equals(portName)) {
            setmanutencao_cobranca_bancariaSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
