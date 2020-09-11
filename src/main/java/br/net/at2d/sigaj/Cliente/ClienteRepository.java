package br.net.at2d.sigaj.Cliente;

import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository
    extends JpaRepository<Cliente, Integer>, QuerydslPredicateExecutor<Cliente>, QuerydslBinderCustomizer<QCliente> {

  @SuppressWarnings("NullableProblems")
  @Override
  default void customize(QuerydslBindings bindings, QCliente CLIENTE) {

    bindings.excluding(CLIENTE.seq);

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

  public Cliente findByLoginnet(String nick);

  public Cliente findByCnpj(String cnpj);
}