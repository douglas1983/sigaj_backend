package br.net.at2d.sigaj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.net.at2d.sigaj.entity.Exprot;

import br.net.at2d.sigaj.entity.ExprotPK;

@Repository
public interface ExprotRepository extends JpaRepository<Exprot, ExprotPK> {

}