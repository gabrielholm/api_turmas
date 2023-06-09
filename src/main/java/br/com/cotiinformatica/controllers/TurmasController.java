package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.TurmaPostDTO;
import br.com.cotiinformatica.dtos.TurmaPutDTO;

@RestController
@RequestMapping(value = "/api/turmas")
public class TurmasController {
	
	@PostMapping
	public void post(@RequestBody TurmaPostDTO dto) {
		
	}
	
	@PutMapping
	public void put(@RequestBody TurmaPutDTO dto) {
		
	}
	
	@DeleteMapping("{idTurma}")
	public void delete(@PathVariable("idTurma") Integer idTurma) {
		
	}
	
	@GetMapping
	public void getAll() {
		
	}
	
	@GetMapping("{idTurma}")
	public void getById(@PathVariable("idTurma") Integer idTurma) {
		
	}

}