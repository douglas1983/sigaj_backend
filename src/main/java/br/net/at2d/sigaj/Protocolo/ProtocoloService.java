package br.net.at2d.sigaj.Protocolo;

import java.time.LocalDateTime;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.at2d.sigaj.entity.Protocolo;

import br.net.at2d.sigaj.mappers.ProtocoloMapper;
import br.net.at2d.sigaj.repository.RegistroRepository;

@Service
public class ProtocoloService {
  @Autowired
  ProtocoloRepository repository;

  @Autowired
  RegistroRepository regRepository;

  @Autowired
  ProtocoloMapper mapper;

  @Transactional(readOnly = true)
  public Page<Protocolo> findAll(String codcli, String protocolo, String nire, LocalDateTime dataini,
      LocalDateTime datafim, Pageable pageable) {

    // List<Protocolo> protocolos = repository.findByProtocolosCliente("EC001",
    // pageable);
    // return new PageImpl<>(protocolos, pageable, protocolos.size());

    if (protocolo != null && protocolo.trim() != "")
      return repository.findByProtocolo(codcli, protocolo, pageable);
    else if (nire != null && nire.trim() != "")
      return repository.findByNire(codcli, nire, pageable);
    else if ((dataini != null) && (datafim != null))
      return repository.findByData(codcli, dataini, datafim, pageable);
    else
      return repository.findByProcessoCodcli(codcli, pageable);
  }

  @Transactional(readOnly = true)
  public Set<ProtocoloDTO> findByNumero(String numero) {
    Set<ProtocoloDTO> protocolos = mapper.map(repository.findByNumero(numero));
    return protocolos;
  }

}