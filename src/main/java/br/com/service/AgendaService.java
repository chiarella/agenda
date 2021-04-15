package br.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.entity.Agenda;
import br.com.repository.AgendaRepository;



@Service
public class AgendaService {
	
	@Autowired
	private AgendaRepository repository;
	
	public void save(Agenda agenda) {
		repository.save(agenda);
	
	
	
	}



}
