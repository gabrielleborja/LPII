package br.ufrn.imd.modelo;

public class Girafa extends Animal{
	
	private int tamanhoLingua;

	public int getTamanhoLingua() {
		return tamanhoLingua;
	}

	public void setTamanhoLingua(int tamanhoLingua) {
		this.tamanhoLingua = tamanhoLingua;
	}
	
	public void comer() {
		alimentado = true;
		quantidadeAlimento = getPeso()*(0.1);
		}
}
