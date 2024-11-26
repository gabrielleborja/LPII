package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.Pessoa;

public class Repositorio {
	
	private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
	
	public void addPessoa(Pessoa p) {
		listaPessoas.add(p);
	}
	
	 public void listarPessoas() {
	        System.out.println("------------------------------------------------------------------");
	        for (Pessoa p : listaPessoas) {
	            System.out.println(p);
	            System.out.println(p.calcularIMC());
	            System.out.println("------------------------------------------------------------------");
	        }
	    }

}
