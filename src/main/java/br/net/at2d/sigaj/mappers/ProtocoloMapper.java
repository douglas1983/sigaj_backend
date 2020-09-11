package br.net.at2d.sigaj.mappers;

import java.util.List;
import java.util.Set;

import org.mapstruct.Mapper;

import br.net.at2d.sigaj.Protocolo.ProtocoloDTO;
import br.net.at2d.sigaj.entity.Protocolo;

@Mapper(componentModel = "spring")
public interface ProtocoloMapper {

    ProtocoloDTO map(Protocolo Protocolo);

    Protocolo map(ProtocoloDTO dto);

    // List<EventLog> map(List<EventLogUpdateDTO> eventlogs);

    Set<ProtocoloDTO> map(List<Protocolo> Protocolos);

}
