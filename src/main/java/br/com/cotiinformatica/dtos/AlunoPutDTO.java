package br.com.cotiinformatica.dtos;

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
public class AlunoPutDTO {

	private Integer idAluno;
	private String nomeAluno;
	private String matriculaAluno;
	private String cpfAluno;
}
