package br.ufrn.imd.modelo;

public class Taxi extends Veiculo implements ICarbonFootPrint{

	private int qntdPessoas;
	
	public Taxi(int quilometragem, int qntdPessoas) {
		quilometragem = 0;
		qntdPessoas = 0;
	}


	public int getQntdPessoas() {
		return qntdPessoas;
	}

	public void setQntdPessoas(int qntdPessoas) {
		this.qntdPessoas = qntdPessoas;
	}
	
	@Override
	public double getCarbonFootprint() {
		double carbonFootPrint = 0.0;
		carbonFootPrint = getQuilometragem() * 1.1;
		return carbonFootPrint;
	}
}
