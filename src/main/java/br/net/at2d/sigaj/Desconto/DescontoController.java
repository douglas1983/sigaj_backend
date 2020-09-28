package br.net.at2d.sigaj.Desconto;

import com.querydsl.core.types.Predicate;

import org.springdoc.core.converters.models.PageableAsQueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.at2d.sigaj.entity.Desconto;
import br.net.at2d.sigaj.entity.Serdes;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping("/descontos")
public class DescontoController {
  @Autowired
  DescontoService service;

  @GetMapping()
  @PageableAsQueryParam
  public Page<Desconto> getDescontos(
      @Parameter(hidden = true) @QuerydslPredicate(root = Desconto.class) Predicate predicate,
      @Parameter(hidden = true) @PageableDefault(size = 10) Pageable pageable) {

    return service.findAll(predicate, pageable);
  }

  @GetMapping("/{id}")
  public Page<Serdes> findById(@PathVariable Integer id,
      @Parameter(hidden = true) @PageableDefault(size = 10) Pageable pageable) {
    return service.findById(id, pageable);
  }

  // @PutMapping("/{id}")
  // public Desconto UpdateById(@PathVariable Integer id, @RequestBody Desconto
  // cli) {
  // return service.UpdateById(id, cli).orElse(null);
  // }
}