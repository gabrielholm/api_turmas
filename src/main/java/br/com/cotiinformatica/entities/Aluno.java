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
public class Aluno {
	
	private Integer idAluno;
	private String nomeAluno;
	private String matriculaAluno;
	private String cpfAluno;
	private List<Aluno> alunos;

}
