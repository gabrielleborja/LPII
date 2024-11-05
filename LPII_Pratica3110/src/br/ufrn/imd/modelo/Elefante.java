package br.ufrn.imd.modelo;

public class Elefante extends Animal{

	private int tamanhoTromba;

	public int getTamanhoTromba() {
		return tamanhoTromba;
	}

	public void setTamanhoTromba(int tamanhoTromba) {
		this.tamanhoTromba = tamanhoTromba;
	}
	
	
	public void comer() {
		alimentado = true;
		quantidadeAlimento = getPeso()*(0.15);
	}
	
}
