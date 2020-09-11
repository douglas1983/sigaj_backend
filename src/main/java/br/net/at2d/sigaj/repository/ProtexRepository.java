package br.net.at2d.sigaj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.net.at2d.sigaj.entity.Protex;

@Repository
public interface ProtexRepository extends JpaRepository<Protex, Integer> {

}