package imd.modelo;

public class Carro extends Veiculo{
	
	private int potenciaMotor;
	private int numeroPortas;
	
	public Carro(String marca, String placa, double quilometragem, double valorAluguel, int potenciaMotor,
			int numeroPortas, boolean isAlugado) {
		super(marca, placa, quilometragem, valorAluguel, isAlugado);
		this.potenciaMotor = potenciaMotor;
		this.numeroPortas = numeroPortas;
	}
	
	public int getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	

}
