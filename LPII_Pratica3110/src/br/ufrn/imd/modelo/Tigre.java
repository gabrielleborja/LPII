package br.ufrn.imd.modelo;

public class Tigre extends Animal{

	private String tipoTigre;

	public String getTipoTigre() {
		return tipoTigre;
	}

	public void setTipoTigre(String tipoTigre) {
		this.tipoTigre = tipoTigre;
	}
	
	public void comer() {
		alimentado = true;
		quantidadeAlimento = getPeso()*(0.04);
	}
}
