package imd.modelo;

public class Moto extends Veiculo{

	private int cilindradas;
	private String tipoDePartida;
	
	public Moto(String marca, String placa, double quilometragem, double valorAluguel, int cilindradas,
			String tipoDePartida, boolean isAlugado) {
		super(marca, placa, quilometragem, valorAluguel, isAlugado);
		this.cilindradas = cilindradas;
		this.tipoDePartida = tipoDePartida;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String getTipoDePartida() {
		return tipoDePartida;
	}

	public void setTipoDePartida(String tipoDePartida) {
		this.tipoDePartida = tipoDePartida;
	}
	
	
}
