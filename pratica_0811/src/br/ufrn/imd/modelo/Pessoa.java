package br.ufrn.imd.modelo;

import java.time.LocalDate;

public abstract class Pessoa {
	
	protected String nome;
	protected LocalDate dataNascimento;
	protected double peso;
	protected double altura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public abstract String calcularIMC();
	
	@Override
	public String toString() {
		return String.format(
			"Nome: %s/nData de Nascimento: %s/nPeso: %.2f kg/nAltura: %.2f m",
			nome, dataNascimento, peso, altura
		);
	}
}
