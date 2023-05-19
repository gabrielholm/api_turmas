package br.com.cotiinformatica.entities;

import java.time.LocalDate;

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
public class Turma {
	
	private Integer idTurma;
	private String nomeTurma;
	private LocalDate dataInicio;
	private LocalDate dataTermino;
	private Integer idProfessor;

}
