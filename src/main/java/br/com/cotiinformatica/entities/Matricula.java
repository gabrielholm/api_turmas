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
public class Matricula {
	
	private Integer idTurma;
	private Integer idAluno;
	private LocalDate dataMatricula;

}
