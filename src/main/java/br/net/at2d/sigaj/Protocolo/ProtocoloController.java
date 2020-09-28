package br.net.at2d.sigaj.Protocolo;

import java.time.LocalDateTime;
import java.util.Set;

import org.springdoc.core.converters.models.PageableAsQueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.web.PageableDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
      // @Parameter(hidden = true) @QuerydslPredicate(root = Protocolo.class)
      // Predicate predicate,
      @RequestParam(name = "codcli") String codcli,
      @RequestParam(name = "protocolo", required = false) String protocolo,
      @RequestParam(name = "nire", required = false) String nire,
      @RequestParam(name = "dataini", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataini,
      @RequestParam(name = "datafim", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime datafim,
      @Parameter(hidden = true) @PageableDefault(size = 10) Pageable pageable) {

    return service.findAll(codcli, protocolo, nire, dataini, datafim, pageable);
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