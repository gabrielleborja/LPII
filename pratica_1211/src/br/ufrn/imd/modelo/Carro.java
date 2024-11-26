package br.ufrn.imd.modelo;

public class Carro extends Veiculo implements ICarbonFootPrint{

	private double motor;

	public Carro(int quilometragem, double motor) {
		quilometragem = 0;
		motor = 0.0;
	}

	
	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	@Override
	public double getCarbonFootprint() {
		double carbonFootPrint = 0.0;
		if(getMotor()>2) {
			carbonFootPrint = getQuilometragem() * 1.85;
		}
		else if(getMotor()<1) {
			carbonFootPrint = getQuilometragem() * 0.13;
		}
		else carbonFootPrint = getQuilometragem() * 1.22;
		return carbonFootPrint;
	}
}
