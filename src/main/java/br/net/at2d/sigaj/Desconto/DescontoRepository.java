package br.net.at2d.sigaj.Desconto;

import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.net.at2d.sigaj.entity.Desconto;
import br.net.at2d.sigaj.entity.QDesconto;

@Repository
public interface DescontoRepository
    extends JpaRepository<Desconto, Integer>, QuerydslPredicateExecutor<Desconto>, QuerydslBinderCustomizer<QDesconto> {

  @EntityGraph(value = "Desconto.serdes")
  @Query(value = "From Desconto d where d.codigo = :id")
  public Desconto findByCodigo(@Param("id") Integer id);

  @SuppressWarnings("NullableProblems")
  @Override
  default void customize(QuerydslBindings bindings, QDesconto desconto) {

    bindings.excluding(desconto.codigo);

    bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);

    // bindings.bind(desconto.).all((path, value) -> {
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