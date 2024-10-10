package imd.visao;

import imd.controle.ProvaControl;
import imd.modelo.Aluno;
import imd.modelo.Prova;
import imd.modelo.Turma;

public class EscolaView {

	public static void main(String[] args) {
		
		ProvaControl pc = new ProvaControl();
		Prova p1 = new Prova();
		Aluno a1 = new Aluno();
		
		double nota1 = 3;
		double nota2 = 4;
		
		if(pc.verificarNotaParte1(nota1)) {
			p1.setNotaParte1(nota1);
		}
		else {
			System.out.println("nota inválida!");
		}
		
		if(pc.verificarNotaParte2(nota2)) {
			p1.setNotaParte2(nota2);
		}
		else {
			System.out.println("nota inválida!");
		}
		
	    a1.setProva1(p1);
	    a1.setProva2(p1);
	    System.out.println("Média do aluno 1 => " + a1.calcularMedia());

	    Turma t1 = new Turma();
	    t1.inserirAluno(a1);
	    System.out.println("");
	    System.out.println("---------------------------------------");
	    System.out.printf("Média da turma => %.2f%n", t1.calcularMediaTurma());
	    System.out.println("---------------------------------------");

	}

}
