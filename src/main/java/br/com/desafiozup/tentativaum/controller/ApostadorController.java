package br.com.desafiozup.tentativaum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiozup.tentativaum.repository.ApostadorRepository;

@RestController
public class ApostadorController {

	@Autowired
	private ApostadorRepository apostadorRepository;
	
	@GetMapping("/apostar")
	public String apostar() {
		
		
		
		
		
		return "Voce apostou!";
	}
	
	
}
