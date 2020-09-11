package br.net.at2d.sigaj.Security;

import java.io.Serializable;

import br.net.at2d.sigaj.Cliente.ClienteDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class JwtResponse implements Serializable {

  private static final long serialVersionUID = -8091879091924046844L;

  private final String token;
  private final ClienteDTO usuario;
}
