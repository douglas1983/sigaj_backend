package br.net.at2d.sigaj.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import br.net.at2d.sigaj.Cliente.Cliente;
import br.net.at2d.sigaj.Cliente.ClienteDTO;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteDTO map(Cliente cliente);

    Cliente map(ClienteDTO dto);

    // List<EventLog> map(List<EventLogUpdateDTO> eventlogs);

    List<ClienteDTO> map(List<Cliente> clientes);

}
