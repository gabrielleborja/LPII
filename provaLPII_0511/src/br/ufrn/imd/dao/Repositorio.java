package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.Professor;
import br.ufrn.imd.modelo.ProfessorHorista;

public class Repositorio {
	
	private ArrayList<Professor> professores;

	public Repositorio() {
		professores = new ArrayList<Professor>();
	}
	
	public void addProfessor(Professor p){
		professores.add(p);
	}
	
	public void removeProfessor(Professor p){
		professores.remove(p);
	}
	
	public ArrayList<Professor> listProfessores(){
		return professores;
	}
	
	public Professor bucarMaiorSalario() {
		Professor maiorSalario = null;
		double maior = 0.0;
		for(Professor p : professores) {
			if(p.getSalario()> maior) {
				maiorSalario = p;
			}
		}
		return maiorSalario;
	}
	
	public Professor buscarMaisJovem() {
		  Professor maisNovo = professores.get(0);
	        for (Professor p : professores) {
	            if (p.getDataNascimento().isAfter(maisNovo.getDataNascimento())) {
	                maisNovo = p;
	            }
	        }
	        return maisNovo;
	}
	
	public double CalcularSalarioTotal() {
		double salarioTotal = 0.0;
		for(Professor p : professores) {
			salarioTotal += p.getSalario();
		}
		return salarioTotal;
	}
	
	public double CalcularMediaHorasTrabalhadas() {
		double totalHoras = 0.0;
		int qntd = 0;
		for(Professor p : professores) {
			if(p instanceof ProfessorHorista) {
				totalHoras += ((ProfessorHorista) p).getHorasTrabalhadas();
				qntd += 1;
			}
		}
		double mediaHoras = totalHoras/qntd;
		return mediaHoras;
	}
	
	public ArrayList<Professor> buscarPortOuMat(){
		ArrayList<Professor> portOuMat = new ArrayList<>() ;
		for(Professor p : professores) {
			if(p.getDisciplina().equals("Portugues")||p.getDisciplina().equals("Matematica")) {
				portOuMat.add(p);
			}
		}
		return portOuMat;
	}
	
	public ArrayList<Professor> buscarEspecializacao(){
		ArrayList<Professor> especializacoes = new ArrayList<>() ;
		for(Professor p : professores) {
			if(p.getNivelEscolaridade().equals("Mestrado")||p.getNivelEscolaridade().equals("Doutorado")) {
				especializacoes.add(p);
			}
		}
		return especializacoes;
	}
}
