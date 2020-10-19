package br.net.at2d.sigaj.utils;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorResponse implements Serializable {

  private static final long serialVersionUID = 5926468583005150707L;

  private Integer codigo;
  private String description;
  private String message;

}
