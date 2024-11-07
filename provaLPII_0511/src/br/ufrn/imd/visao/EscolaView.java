package br.ufrn.imd.visao;

import java.time.LocalDate;

import br.ufrn.imd.dao.Repositorio;
import br.ufrn.imd.modelo.Professor;
import br.ufrn.imd.modelo.ProfessorHorista;
import br.ufrn.imd.modelo.ProfessorIntegral;

public class EscolaView {

	public static void main(String[] args) {

		Repositorio repositorio = new Repositorio();
		
		ProfessorHorista prof1 = new ProfessorHorista();
		prof1.setMatricula("20150234");
		prof1.setNome("Joao Fernandes Silva");
		prof1.setDataNascimento(LocalDate.of(1975, 6, 16));
		prof1.setHorasTrabalhadas(200);
		prof1.setSalario(prof1.getHorasTrabalhadas());
		prof1.setDisciplina("Portugues");
		prof1.setNivelEscolaridade("Mestrado");
		prof1.calculoSalario();
		repositorio.addProfessor(prof1);
		
		ProfessorIntegral prof2 = new ProfessorIntegral();
		prof2.setDataNascimento(LocalDate.of(2001, 2, 5));
		prof2.setDataInicio(LocalDate.of(2019, 10, 15));
		prof2.setMatricula("20110001");
		prof2.setNome("Francisco Silva Lopes");
		prof2.setSalario(4800);
		prof2.setDisciplina("Fisica");
		prof2.setNivelEscolaridade("Doutorado");
		repositorio.addProfessor(prof2);
		
		ProfessorHorista prof3 = new ProfessorHorista();
		prof3.setDataNascimento(LocalDate.of(1999, 3, 5));
		prof3.setMatricula("20161254");
		prof3.setNome("Maria das Virtudes");
		prof3.setHorasTrabalhadas(150);
		prof3.setSalario(prof3.getHorasTrabalhadas());
		prof3.setDisciplina("Matematica");
		prof3.setNivelEscolaridade("Mestrado");
		prof3.calculoSalario();
		repositorio.addProfessor(prof3);
		
		ProfessorIntegral prof4 = new ProfessorIntegral();
		prof4.setDataNascimento(LocalDate.of(1989, 5, 10));
		prof4.setDataInicio(LocalDate.of(2015, 9, 30));
		prof4.setMatricula("20180102");
		prof4.setNome("Ana Maria dos Santos");
		prof4.setSalario(4800);
		prof4.setDisciplina("Portugues");
		prof4.setNivelEscolaridade("Mestrado");
		repositorio.addProfessor(prof4);
		
		ProfessorIntegral prof5 = new ProfessorIntegral();
		prof5.setDataNascimento(LocalDate.of(1971, 5, 25));
		prof5.setDataInicio(LocalDate.of(2018, 5, 25));
		prof5.setMatricula("19800001");
		prof5.setNome("Raimundo Chico Nonato");
		prof5.setSalario(11500);
		prof5.setDisciplina("Biologia");
		prof5.setNivelEscolaridade("Doutorado");
		repositorio.addProfessor(prof5);
		
		System.out.println("************************* Professores *************************");
		for(Professor p : repositorio.listProfessores()) {
			System.out.println("Nome: " + p.getNome() + "    Disciplina: " + p.getDisciplina() + "   Turmas: " + p.lecionarTurmas());
		}
		System.out.println("***************************************************************");
		System.out.println("");


		System.out.println("************** Professor com Maior Salario ***************");
		System.out.println("Nome: " + repositorio.bucarMaiorSalario().getNome());
		System.out.println("Salario: " + repositorio.bucarMaiorSalario().getSalario());
		System.out.println("*********************************************************");

		System.out.println("");
		System.out.println("************** Professor mais Jovem ***************");
		System.out.println("Nome: " + repositorio.buscarMaisJovem().getNome() + "  Dt. Nascimento: " + repositorio.buscarMaisJovem().getDataNascimento());
		System.out.println("***************************************************");

		System.out.println("");
		System.out.println("***************** Total Salarios *****************");
		System.out.println("Total de Salarios pagos: " + repositorio.CalcularSalarioTotal());
		System.out.println("*************************************************");

		System.out.println("");
		System.out.println("***************** Media de Horas *****************");
		System.out.println("Media dos Professores Horistas: " + repositorio.CalcularMediaHorasTrabalhadas());
		System.out.println("**************************************************");

		System.out.println("");
		System.out.println("********* Professores que lecionam Portugues ou Matematica *************");
		for(Professor p : repositorio.buscarPortOuMat()) {
			System.out.println(p.getNome() + " - " + p.getDisciplina() + "  (" + p.getMatricula() + ")");
		}
		System.out.println("************************************************************************");
		
		System.out.println("");
		System.out.println("********* Professores com Mestrado ou Doutorado *************");
		for(Professor p : repositorio.buscarEspecializacao()) {
			System.out.println(p.getNome() + " - " + p.getNivelEscolaridade() + "  (" + p.getMatricula() + ")");
		}
		System.out.println("***************************************************************");

	}

}
