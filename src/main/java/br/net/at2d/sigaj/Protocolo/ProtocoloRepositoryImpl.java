package br.net.at2d.sigaj.Protocolo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.AbstractJPAQuery;
import com.querydsl.jpa.impl.JPAQuery;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import br.net.at2d.sigaj.entity.Protocolo;
import br.net.at2d.sigaj.entity.QProtocolo;
import br.net.at2d.sigaj.entity.QResprot;
import br.net.at2d.sigaj.entity.QSertipo;
import br.net.at2d.sigaj.entity.QProcesso;

public class ProtocoloRepositoryImpl implements ProtocoloRepositoryCustom {

  @PersistenceContext
  private EntityManager em;

  @Override
  public Page<Protocolo> getCustom(Predicate predicate, Pageable page) {

    JPAQuery query = new JPAQuery(em);

    QProtocolo protocolo = QProtocolo.protocolo;
    QResprot resprot = QResprot.resprot;
    QSertipo servico = QSertipo.sertipo;
    QProcesso processo = QProcesso.processo;
    List<Protocolo> prot = ((AbstractJPAQuery) query.select(protocolo, processo, resprot).from(protocolo)
        .leftJoin(protocolo.processo, processo).leftJoin(protocolo.resprots, resprot)
        .leftJoin(protocolo.servico, servico).limit(1)).fetch();

    Page<Protocolo> pages = new PageImpl<Protocolo>(prot, page, prot.size());
    return pages;

  }

}
