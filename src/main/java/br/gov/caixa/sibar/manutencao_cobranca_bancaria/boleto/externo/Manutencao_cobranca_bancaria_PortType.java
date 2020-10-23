/**
 * Manutencao_cobranca_bancaria_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

public interface Manutencao_cobranca_bancaria_PortType extends java.rmi.Remote {
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_saida_negocial_Type INCLUI_BOLETO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_entrada_negocial_Type parameters) throws java.rmi.RemoteException;
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_saida_negocial_Type BAIXA_BOLETO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_entrada_negocial_Type parameters) throws java.rmi.RemoteException;
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_saida_negocial_Type ALTERA_BOLETO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.Servico_entrada_negocial_Type parameters) throws java.rmi.RemoteException;
}
