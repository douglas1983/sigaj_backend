package br.net.at2d.sigaj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.net.at2d.sigaj.entity.Processo;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Integer> {

}