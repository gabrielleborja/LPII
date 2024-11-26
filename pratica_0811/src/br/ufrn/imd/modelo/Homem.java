package br.ufrn.imd.modelo;

import java.time.LocalDate;

public class Homem extends Pessoa {

	public Homem(String nome, LocalDate dataNascimento, double peso, double altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		this.altura = altura;
	}
	
	@Override
	public String calcularIMC() {
		double imc = peso/(altura * altura);
		 if (imc < 20.7) {
	            return String.format("IMC: %.2f - abaixo do peso ideal", imc);
	        } else if (imc <= 26.4) {
	            return String.format("IMC: %.2f - peso ideal", imc);
	        } else {
	            return String.format("IMC: %.2f - acima do peso ideal", imc);
	        }
	}

	
}
