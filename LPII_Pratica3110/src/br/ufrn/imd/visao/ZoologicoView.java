package br.ufrn.imd.visao;

import br.ufrn.imd.dao.Zoologico;
import br.ufrn.imd.modelo.*;

public class ZoologicoView {

	public static void main(String[] args) {
		
		Zoologico zoologico = new Zoologico();

		Animal a1 = new Tigre();
		a1.setNome("Simba");
		a1.setAlimentaçao("Carne");
		a1.setIdade(28);
		a1.setPeso(350);
		zoologico.addAnimal(a1);
		
		Animal a2 = new Tigre();
		a2.setNome("Kairos");
		a2.setAlimentaçao("Carne");
		a2.setIdade(24);
		a2.setPeso(300);
		zoologico.addAnimal(a2);
		
		Animal a3 = new Tigre();
		a3.setNome("Jabari");
		a3.setAlimentaçao("Carne");
		a3.setIdade(34);
		a3.setPeso(370);
		zoologico.addAnimal(a3);
		
		Animal a4 = new Girafa();
		a4.setNome("Cristal");
		a4.setAlimentaçao("Verduras e Frutas");
		a4.setIdade(3);
		a4.setPeso(500);
		zoologico.addAnimal(a4);
		
		Animal a5 = new Girafa();
		a5.setNome("Olivia");
		a5.setAlimentaçao("Verduras e Frutas");
		a5.setIdade(8);
		a5.setPeso(450);
		zoologico.addAnimal(a5);
		
		Animal a6 = new Girafa();
		a6.setNome("Rafik");
		a6.setAlimentaçao("Verduras e Frutas");
		a6.setIdade(15);
		a6.setPeso(550);
		zoologico.addAnimal(a6);
		
		Animal a7 = new Elefante();
		a7.setNome("Dumbo");
		a7.setAlimentaçao("Verduras e Frutas");
		a7.setIdade(8);
		a7.setPeso(750);
		zoologico.addAnimal(a7);
		
		Animal a8 = new Elefante();
		a8.setNome("Mandy");
		a8.setAlimentaçao("Verduras e Frutas");
		a8.setIdade(23);
		a8.setPeso(1000);
		zoologico.addAnimal(a8);
		
		Animal a9 = new Elefante();
		a9.setNome("Tantor");
		a9.setAlimentaçao("Verduras e Frutas");
		a9.setIdade(24);
		a9.setPeso(900);
		zoologico.addAnimal(a9);
		
		System.out.println("*******************************************************************");
		for(Animal a : zoologico.listAnimais()) {
			System.out.println("Nome: " + a.getNome() + "    Alimentaçao: " + a.getAlimentaçao());
			System.out.println("Peso: " + a.getPeso() + "       Idade: " + a.getIdade() + "     Alimentado: " + a.isAlimentado());
			System.out.println("*******************************************************************");
		}
	
		System.out.println("");
		System.out.println("*******************************************************************");
		int totalAlimento = 0;
		int alimentoVeg = 0;
		int alimentoCar = 0;
		for(Animal a : zoologico.listAnimais()) {
			a.comer();
			System.out.println("Animal " + a.getNome() + " se alimentou de " + a.getQuantidadeAlimento() + " quilos");
			totalAlimento += a.getQuantidadeAlimento();	
			if(a instanceof Elefante || a instanceof Girafa) {
				alimentoVeg += a.getQuantidadeAlimento();
			}
			else {
				alimentoCar += a.getQuantidadeAlimento();
			}
			System.out.println("*******************************************************************");
		}
		System.out.println("Alimento total usado (Kg): " + totalAlimento);
		System.out.println("Frutas e Legumes: " + alimentoVeg);
		System.out.println("Carne: " + alimentoCar);
		System.out.println("*******************************************************************");
	
		System.out.println("");
		System.out.println("****************** Consulta Animais ***********************************");
		for(Animal a: zoologico.listConsultas()) {
			System.out.println(a.getNome() + " Foi consultado!");
			
		}
		System.out.println("*******************************************************************");

	}
}
