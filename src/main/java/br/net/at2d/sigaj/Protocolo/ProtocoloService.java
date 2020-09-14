package br.net.at2d.sigaj.Protocolo;

import java.util.Set;

import com.querydsl.core.types.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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

  public Page<Protocolo> findAll(Predicate predicate, Pageable pageable) {
    return repository.findAll(predicate, pageable);
  }

  public Set<ProtocoloDTO> findByNumero(String numero) {
    Set<ProtocoloDTO> protocolos = mapper.map(repository.findByNumeroAndFetchRolesEagerly(numero));
    return protocolos;
  }

}