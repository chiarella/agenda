package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.entity.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long>{

	
}
