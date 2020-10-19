package br.net.at2d.sigaj.Cliente;

import com.querydsl.core.types.Predicate;

import org.springdoc.core.converters.models.PageableAsQueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
  @Autowired
  ClienteService service;

  @GetMapping()

  @PageableAsQueryParam
  public Page<ClienteDTO> getClientes(
      @Parameter(hidden = true) @QuerydslPredicate(root = Cliente.class) Predicate predicate,
      @Parameter(hidden = true) @PageableDefault(size = 10) Pageable pageable) {

    return service.findAll(predicate, pageable);
  }

  @GetMapping("/{id}")
  public ClienteDTO findById(@PathVariable Integer id) {
    return service.findById(id);
  }

  @PutMapping("/{id}")
  public Cliente UpdateById(@PathVariable Integer id, @RequestBody ClienteDTO cli) {
    return service.UpdateById(id, cli).orElse(null);
  }
}