package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public class Manutencao_cobranca_bancariaProxy implements br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancaria_PortType {
  private String _endpoint = null;
  private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancaria_PortType manutencao_cobranca_bancaria_PortType = null;
  
  public Manutencao_cobranca_bancariaProxy() {
    _initManutencao_cobranca_bancariaProxy();
  }
  
  public Manutencao_cobranca_bancariaProxy(String endpoint) {
    _endpoint = endpoint;
    _initManutencao_cobranca_bancariaProxy();
  }
  
  private void _initManutencao_cobranca_bancariaProxy() {
    try {
      manutencao_cobranca_bancaria_PortType = (new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancaria_ServiceLocator()).getmanutencao_cobranca_bancariaSOAP();
      if (manutencao_cobranca_bancaria_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)manutencao_cobranca_bancaria_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)manutencao_cobranca_bancaria_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (manutencao_cobranca_bancaria_PortType != null)
      ((javax.xml.rpc.Stub)manutencao_cobranca_bancaria_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Manutencao_cobranca_bancaria_PortType getManutencao_cobranca_bancaria_PortType() {
    if (manutencao_cobranca_bancaria_PortType == null)
      _initManutencao_cobranca_bancariaProxy();
    return manutencao_cobranca_bancaria_PortType;
  }
  
  public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_saida_negocial_Type INCLUI_BOLETO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_entrada_negocial_Type parameters) throws java.rmi.RemoteException{
    if (manutencao_cobranca_bancaria_PortType == null)
      _initManutencao_cobranca_bancariaProxy();
    return manutencao_cobranca_bancaria_PortType.INCLUI_BOLETO(parameters);
  }
  
  public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_saida_negocial_Type BAIXA_BOLETO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_entrada_negocial_Type parameters) throws java.rmi.RemoteException{
    if (manutencao_cobranca_bancaria_PortType == null)
      _initManutencao_cobranca_bancariaProxy();
    return manutencao_cobranca_bancaria_PortType.BAIXA_BOLETO(parameters);
  }
  
  public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_saida_negocial_Type ALTERA_BOLETO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_entrada_negocial_Type parameters) throws java.rmi.RemoteException{
    if (manutencao_cobranca_bancaria_PortType == null)
      _initManutencao_cobranca_bancariaProxy();
    return manutencao_cobranca_bancaria_PortType.ALTERA_BOLETO(parameters);
  }
  
  
}