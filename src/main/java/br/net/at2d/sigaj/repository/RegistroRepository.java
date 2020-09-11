package br.net.at2d.sigaj.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.net.at2d.sigaj.entity.Registro;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Integer> {

  public Set<Registro> findByProtocoloAndProtseq(String prot, Integer protseq);
}