package br.net.at2d.sigaj.Cliente;

import java.util.List;
import java.util.Optional;

import com.querydsl.core.types.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.net.at2d.sigaj.mappers.ClienteMapper;
import br.net.at2d.sigaj.utils.MapperUpdate;

@Service
public class ClienteService implements UserDetailsService {

  @Autowired
  private MapperUpdate mapper;

  @Autowired
  private ClienteMapper clienteMapper;

  @Autowired
  private ClienteRepository repository;

  @Override
  public Cliente loadUserByUsername(String username) throws UsernameNotFoundException {
    Cliente applicationUser = repository.findByEmail(username);
    if (applicationUser == null) {
      throw new UsernameNotFoundException(username);
    }
    return applicationUser;
  }

  public Page<ClienteDTO> findAll(Predicate predicate, Pageable pageable) {
    Page<Cliente> clientes = repository.findAll(predicate, pageable);
    List<ClienteDTO> clientesDTO = clienteMapper.map(clientes.toList());
    // .map(mapper::map).collect(Collectors.toList());
    return new PageImpl<ClienteDTO>(clientesDTO, clientes.getPageable(), clientes.getTotalElements());

  }

  public Cliente Save(Cliente cliente) {
    return repository.save(cliente);
  }

  public ClienteDTO findById(Integer id) {

    return clienteMapper.map(repository.findById(id).orElse(null));
  }

  public Cliente findByResetCode(String resetcode) {
    List<Cliente> clientes = repository.findByResetcode(resetcode);
    if (clientes.size() > 0)
      return repository.findByResetcode(resetcode).get(0);
    return null;
  }

  public Cliente findByEmail(String email) {
    return repository.findByEmail(email);
  }

  public Cliente loadByCnpj(String cnpj) {
    Cliente applicationUser = repository.findByCnpj(cnpj);
    if (applicationUser == null) {
      throw new UsernameNotFoundException(cnpj);
    }
    return applicationUser;
  }

  public Optional<Cliente> UpdateById(Integer id, ClienteDTO update) {

    Cliente func = repository.findById(id).orElse(null);

    if (func != null) {

      return Optional.of(repository.save((Cliente) mapper.Update((Object) func, (Object) update, "Clientes")));
    }
    return null;
  }

}