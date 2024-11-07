package br.ufrn.imd.modelo;

import java.time.LocalDate;

public class Professor {

	protected String nome;
	protected String matricula;
	protected LocalDate dataNascimento;
	protected double salario;
	protected String nivelEscolaridade;
	protected String disciplina;
	
	public Professor() {
		nome = "";
		matricula = "";
		dataNascimento = LocalDate.of(1999, 1, 1);;
		salario = 0.0;
		nivelEscolaridade = "";
		disciplina = "";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNivelEscolaridade() {
		return nivelEscolaridade;
	}
	public void setNivelEscolaridade(String nivelEscolaridade) {
		this.nivelEscolaridade = nivelEscolaridade;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public int lecionarTurmas() {
		return 3;
	}
	
}
