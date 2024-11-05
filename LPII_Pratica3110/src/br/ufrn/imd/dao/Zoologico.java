package br.ufrn.imd.dao;


import java.util.ArrayList;

import br.ufrn.imd.modelo.Animal;
import br.ufrn.imd.modelo.Elefante;
import br.ufrn.imd.modelo.Girafa;
import br.ufrn.imd.modelo.Tigre;

public class Zoologico {
	
private ArrayList<Animal> animais;
	
	public Zoologico() {
		animais = new ArrayList<Animal>();
	}

	public ArrayList<Animal> listAnimais(){
		return animais;
	}
	
	public void addAnimal(Animal a){
		animais.add(a);
	}
	
	
	
	public ArrayList<Animal> listConsultas(){
		ArrayList<Animal> animaisConsultados;
		animaisConsultados = new ArrayList<Animal>();
		for(Animal a : animais)
			if(a instanceof Girafa) {
				if(a.getIdade()%5 == 0) {
					animaisConsultados.add(a);
				}
			}
			else if(a instanceof Elefante) {
				if(a.getIdade()%7 == 0) {
					animaisConsultados.add(a);
				}
			}
			else if(a instanceof Tigre) {
				if(a.getIdade()%3 == 0) {
					animaisConsultados.add(a);
				}
			}
		return animaisConsultados;
	}
	
	public void comer() {
		for (Animal a : animais ) {
			a.comer();		
		}
	}
	
	
}
