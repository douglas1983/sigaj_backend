package br.net.at2d.sigaj.Desconto;

import java.util.Optional;
import java.util.Set;

import com.querydsl.core.types.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.net.at2d.sigaj.entity.Desconto;
import br.net.at2d.sigaj.entity.Serdes;
import br.net.at2d.sigaj.utils.MapperUpdate;

@Service
public class DescontoService {

  @Autowired
  private MapperUpdate mapper;

  @Autowired
  private DescontoRepository repository;

  @Autowired
  private SerdesRepository SerdesRepository;

  public Page<Desconto> findAll(Predicate predicate, Pageable pageable) {

    return repository.findAll(predicate, pageable);

  }

  public Page<Serdes> findById(Integer id, Pageable pageable) {

    return SerdesRepository.findByDescontoCodigo(id, pageable);
  }

  public Optional<Desconto> UpdateById(Integer id, Desconto update) {

    Desconto func = repository.findById(id).orElse(null);

    if (func != null) {

      return Optional.of(repository.save((Desconto) mapper.Update((Object) func, (Object) update, "Descontos")));
    }
    return null;
  }

  public Set<Serdes> findByClienteCodigo(Integer coddes) {
    return SerdesRepository.findByIdCoddes(coddes);
  }

}