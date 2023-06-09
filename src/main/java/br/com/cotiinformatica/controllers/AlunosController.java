package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.AlunoPostDTO;
import br.com.cotiinformatica.dtos.AlunoPutDTO;

@RestController
@RequestMapping(value = "/api/alunos")
public class AlunosController {
	
	@PostMapping
	public void post(@RequestBody AlunoPostDTO dto) {
		
	}
	
	@PutMapping
	public void put(@RequestBody AlunoPutDTO dto) {
		
	}
	
	@DeleteMapping("{idAluno}")
	public void delete(@PathVariable("idAluno") Integer idAluno) {
		
	}
	
	@GetMapping
	public void getAll() {
		
	}
	
	@GetMapping("{idAluno}")
	public void getById(@PathVariable("idAluno") Integer idAluno) {
		
	}

}
