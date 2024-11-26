package br.ufrn.imd.modelo;

import java.time.LocalDate;

public class Mulher extends Pessoa {

	public Mulher(String nome, LocalDate dataNascimento, double peso, double altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String calcularIMC() {
		double imc = peso / (altura * altura);
        if (imc < 19) {
            return String.format("IMC: %.2f - abaixo do peso ideal", imc);
        } else if (imc <= 25.8) {
            return String.format("IMC: %.2f - peso ideal", imc);
        } else {
            return String.format("IMC: %.2f - acima do peso ideal", imc);
        }
	}
	
}
