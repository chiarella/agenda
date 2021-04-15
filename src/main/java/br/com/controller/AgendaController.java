package br.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.entity.Agenda;
import br.com.service.AgendaService;

@RestController
public class AgendaController {
	
	@Autowired
	private AgendaService service;
	
	@ResponseBody
	@PostMapping(value = "/cadastrar")
	public void save(@RequestBody Agenda agenda) {

		service.save(agenda);
	}
	
	@ResponseBody
	@GetMapping(value = "/about")
	public ResponseEntity<String> about() {
		 
		return new ResponseEntity<String>("Aplicação BACK-END calculo de salario RAIA", HttpStatus.OK);
	}

}
