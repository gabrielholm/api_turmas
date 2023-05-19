# Projeto Java

Este é um projeto Java que consiste em uma API para controle de turmas, alunos, professores e matrículas.

## Especificações

- Framework: Spring Boot
- Banco de Dados: PostgreSQL
- Bibliotecas utilizadas: Spring Web, Spring Boot DevTools, Lombok

## Configuração do Banco de Dados

Antes de executar o projeto, é necessário criar o banco de dados e executar um script SQL para criar as tabelas necessárias. Siga as etapas abaixo:

1. Certifique-se de ter o PostgreSQL instalado e em execução no seu sistema.
2. Crie um banco de dados vazio com o nome `bd_api_turmas` (ou escolha o nome desejado).
3. Execute o script SQL abaixo no seu banco de dados:

```sql
-- Script SQL para criar as tabelas do projeto

-- Tabela Aluno
CREATE TABLE Aluno (
  idAluno SERIAL PRIMARY KEY,
  nomeAluno VARCHAR(100) NOT NULL,
  matriculaAluno VARCHAR(20) NOT NULL,
  cpfAluno VARCHAR(11) NOT NULL
);

-- Tabela Professor
CREATE TABLE Professor (
  idProfessor SERIAL PRIMARY KEY,
  nomeProfessor VARCHAR(100) NOT NULL,
  telefoneProfessor VARCHAR(20) NOT NULL
);

-- Tabela Turma
CREATE TABLE Turma (
  idTurma SERIAL PRIMARY KEY,
  nomeTurma VARCHAR(100) NOT NULL,
  dataInicio DATE NOT NULL,
  dataTermino DATE NOT NULL,
  idProfessor BIGINT NOT NULL,
  FOREIGN KEY (idProfessor) REFERENCES Professor(idProfessor)
);

-- Tabela Matricula
CREATE TABLE Matricula (
  id SERIAL PRIMARY KEY,
  idTurma BIGINT NOT NULL,
  idAluno BIGINT NOT NULL,
  dataMatricula DATE NOT NULL,
  FOREIGN KEY (idTurma) REFERENCES Turma(idTurma),
  FOREIGN KEY (idAluno) REFERENCES Aluno(idAluno)
);
