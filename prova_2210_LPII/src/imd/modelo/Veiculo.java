package imd.modelo;

public class Veiculo {
	
	protected String marca;
	protected String placa;
	protected double quilometragem;
	protected double valorAluguel;
	protected boolean isAlugado;
	
	public Veiculo(String marca, String placa, double quilometragem, double valorAluguel, boolean isAlugado) {
		this.marca = marca;
		this.placa = placa;
		this.quilometragem = quilometragem;
		this.valorAluguel = valorAluguel;
		isAlugado = false;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public boolean isAlugado() {
		return isAlugado;
	}

	public void setAlugado(boolean isAlugado) {
		this.isAlugado = isAlugado;
	}
	
	@Override
    public String toString() {
		return String.format(
	           "%-30s %-18s %-10s", 
	           "Veiculo: " + getClass().getName(), 
               "Marca: " + marca, 
               "Placa: " + placa
               );
    }
}

