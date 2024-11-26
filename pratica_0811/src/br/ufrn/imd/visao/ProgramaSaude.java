package br.ufrn.imd.visao;

import br.ufrn.imd.modelo.*;
import java.time.LocalDate;

import br.ufrn.imd.dao.Repositorio;

public class ProgramaSaude {

	public static void main(String[] args) {

		Repositorio repositorio = new Repositorio();
		
		Pessoa m = new Mulher("Frida Kahlo", LocalDate.of(1907, 07, 06), 50.2, 1.69);
		Pessoa h = new Homem("Zé Lezin", LocalDate.of(1945, 01, 20), 74.8, 1.75);
		
		repositorio.addPessoa(m);
		repositorio.addPessoa(h);
	
		repositorio.listarPessoas();
	}

}
