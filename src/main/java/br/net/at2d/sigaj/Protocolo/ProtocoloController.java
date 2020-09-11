package br.net.at2d.sigaj.Protocolo;

import java.util.Set;

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

import br.net.at2d.sigaj.entity.Protocolo;

import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping("/protocolos")
public class ProtocoloController {

  @Autowired
  ProtocoloService service;

  @GetMapping()
  @PageableAsQueryParam
  public Page<Protocolo> getClientes(
      @Parameter(hidden = true) @QuerydslPredicate(root = Protocolo.class) Predicate predicate,
      @Parameter(hidden = true) @PageableDefault(size = 10) Pageable pageable) {

    return service.findAll(predicate, pageable);
  }

  @GetMapping("/{numero}")
  public Set<ProtocoloDTO> findByNumero(@PathVariable String numero) {
    return service.findByNumero(numero);
  }

  // @PutMapping("/{id}")
  // public Cliente UpdateById(@PathVariable Integer id, @RequestBody ClienteDTO
  // cli) {
  // return service.UpdateById(id, cli).orElse(null);
  // }

}