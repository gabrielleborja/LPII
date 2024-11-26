package br.ufrn.imd.modelo;

public class Moto extends Veiculo implements ICarbonFootPrint{

	private int cilindrada;
	

	public Moto(int quilometragem, int cilindrada) {
		quilometragem = 0;
		cilindrada = 0;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public double getCarbonFootprint() {
		double carbonFootPrint = 0.0;
		if(getCilindrada()>650) {
			carbonFootPrint = getQuilometragem() * 0.65;
		}
		else if(getCilindrada()<150) {
			carbonFootPrint = getQuilometragem() * 0.2;
		}
		else carbonFootPrint = getQuilometragem() * 0.5;
		return carbonFootPrint;
	}
		
}
