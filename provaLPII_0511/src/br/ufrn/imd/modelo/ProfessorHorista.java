package br.ufrn.imd.modelo;

public class ProfessorHorista extends Professor{

	private int horasTrabalhadas;
	public static final double valorHora = 55.00;
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public int lecionarTurmas() {
		return 4;
	}
	
	public void calculoSalario() {
		setSalario(horasTrabalhadas*valorHora);
	}
}
