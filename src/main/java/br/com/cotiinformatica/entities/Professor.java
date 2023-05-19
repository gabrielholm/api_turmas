package br.com.cotiinformatica.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Professor {
	
	private Integer idProfessor;
	private String nomeProfessor;
	private String telefoneProfessor;
	private List<Professor> professores;

}
