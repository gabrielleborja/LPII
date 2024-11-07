package br.ufrn.imd.modelo;

import java.time.LocalDate;

public class ProfessorIntegral extends Professor{

	private LocalDate dataInicio;

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public int lecionarTurmas(){
		if(getNivelEscolaridade().equals("Mestrado")) {
			return 2;
		}
		else {
			return 1;
		}
	}
}
