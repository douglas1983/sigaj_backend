package br.net.at2d.sigaj.Protocolo;

import java.time.LocalDateTime;
import java.util.List;

import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.net.at2d.sigaj.entity.Protocolo;
import br.net.at2d.sigaj.entity.QProtocolo;

@Repository
public interface ProtocoloRepository extends JpaRepository<Protocolo, Integer>, QuerydslPredicateExecutor<Protocolo>,
    QuerydslBinderCustomizer<QProtocolo>, ProtocoloRepositoryCustom {

  @EntityGraph(value = "Protocolo.all")
  @Query(value = "From Protocolo p where p.numero = :numero")
  public List<Protocolo> findByNumero(@Param("numero") String numero);

  @EntityGraph(value = "Protocolo.resprot")
  @Query(value = "From Protocolo p inner join p.processo pr where pr.codcli = :codcli")
  public Page<Protocolo> findByProcessoCodcli(@Param("codcli") String codcli, Pageable pageable);

  @EntityGraph(value = "Protocolo.resprot")
  @Query(value = "From Protocolo p inner join p.processo pr where pr.codcli = :codcli and p.numero = :prot")
  public Page<Protocolo> findByProtocolo(@Param("codcli") String codcli, @Param("prot") String protocolo,
      Pageable pageable);

  @EntityGraph(value = "Protocolo.resprot")
  @Query(value = "From Protocolo p inner join p.processo pr where pr.codcli = :codcli and p.protnire = :nire")
  public Page<Protocolo> findByNire(@Param("codcli") String codcli, @Param("nire") String nire, Pageable pageable);

  @EntityGraph(value = "Protocolo.resprot")
  @Query(value = "From Protocolo p inner join p.processo pr where pr.codcli = :codcli and ( p.datainsert between :dataini and :datafim)")
  public Page<Protocolo> findByData(@Param("codcli") String codcli, @Param("dataini") LocalDateTime dataini,
      @Param("datafim") LocalDateTime datafim, Pageable pageable);

  @SuppressWarnings("NullableProblems")
  @Override
  default void customize(QuerydslBindings bindings, QProtocolo prot) {

    bindings.excluding(prot.numero);

    bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);

    // bindings.bind(cliente.).all((path, value) -> {
    // Iterator<? extends Date> it = value.iterator();
    // Date from = it.next();
    // if (value.size() >= 2) {
    // Date to = it.next();
    // return Optional.of(path.between(from, to));
    // } else {
    // return Optional.of(path.eq(from));
    // }

    // });

    // bindings.bind(eventlog.quantity).first((path, value) -> {
    // return path.eq(value);
    // });
  }
}