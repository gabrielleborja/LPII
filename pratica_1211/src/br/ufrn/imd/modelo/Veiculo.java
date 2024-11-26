package br.ufrn.imd.modelo;

public class Veiculo {

	protected int quilometragem;
	public static double valorGasolina = 6.09;
	
	public int getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public double getCustoMensal() {
		double custoMensal = 0.0;
		custoMensal = getQuilometragem() * valorGasolina;
		return custoMensal;
	}
	
}
