package br.net.at2d.sigaj.Protocolo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.querydsl.jpa.impl.AbstractJPAQuery;
import com.querydsl.jpa.impl.JPAQuery;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import br.net.at2d.sigaj.entity.Protocolo;
import br.net.at2d.sigaj.entity.QProtocolo;
import br.net.at2d.sigaj.entity.QResprot;

import br.net.at2d.sigaj.entity.QProcesso;

public class ProtocoloRepositoryImpl implements ProtocoloRepositoryCustom {

  @PersistenceContext
  private EntityManager em;

  @SuppressWarnings("NullableProblems")
  @Override
  public Page<Protocolo> getCustom(String codcli, Pageable page) {

    JPAQuery query = new JPAQuery(em);

    QProtocolo protocolo = QProtocolo.protocolo;
    QResprot resprot = QResprot.resprot;

    QProcesso processo = QProcesso.processo;
    query.from(protocolo).leftJoin(protocolo.processo, processo).leftJoin(protocolo.resprots, resprot)
        .where(processo.codcli.eq(codcli));

    if (page != null) {
      query.offset(page.getOffset());
      query.limit(page.getPageSize());
      // for (Sort.Order o : page.getSort()) {
      // PathBuilder orderByExpression = new PathBuilder(Object.class, "object");

      // query.orderBy(
      // new OrderSpecifier(o.isAscending() ? Order.ASC : Order.DESC,
      // orderByExpression.get(o.getProperty())));
      // }
    }

    List<Protocolo> prot = ((AbstractJPAQuery) query).fetch();
    Page<Protocolo> pages = new PageImpl<Protocolo>(prot, page, prot.size());
    return pages;

  }

}
