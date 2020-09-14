package br.net.at2d.sigaj.Protocolo;

import com.querydsl.core.types.Predicate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.net.at2d.sigaj.entity.Protocolo;

public interface ProtocoloRepositoryCustom {
  Page<Protocolo> getCustom(Predicate predicate, Pageable page);
}
