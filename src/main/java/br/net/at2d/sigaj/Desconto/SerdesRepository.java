package br.net.at2d.sigaj.Desconto;

import java.util.Set;

import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import org.springframework.stereotype.Repository;

import br.net.at2d.sigaj.entity.Desconto;
import br.net.at2d.sigaj.entity.QDesconto;
import br.net.at2d.sigaj.entity.QSerdes;
import br.net.at2d.sigaj.entity.Serdes;

@Repository
public interface SerdesRepository
    extends JpaRepository<Serdes, Integer>, QuerydslPredicateExecutor<Serdes>, QuerydslBinderCustomizer<QSerdes> {

  @SuppressWarnings("NullableProblems")
  @Override
  default void customize(QuerydslBindings bindings, QSerdes serder) {

    bindings.excluding(serder.id);

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

  public Set<Serdes> findByIdCoddes(Integer coddes);

}