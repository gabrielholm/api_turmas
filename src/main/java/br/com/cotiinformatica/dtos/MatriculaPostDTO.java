package br.com.cotiinformatica.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MatriculaPostDTO {
	
	private Integer idTurma;
	private Integer idAluno;
	private LocalDate dataMatricula;

}
