package br.ufrn.imd.visao;

import br.ufrn.imd.dao.Repositorio;
import br.ufrn.imd.modelo.Carro;
import br.ufrn.imd.modelo.Moto;
import br.ufrn.imd.modelo.Taxi;

public class PegadaCarbono {

	public static void main(String[] args) {

		Repositorio repositorio = new Repositorio();
		
		Carro c1 = new Carro(0, 0);
		c1.setMotor(1.0);
		c1.setQuilometragem(1000);
		repositorio.addVeiculo(c1);
		
		Carro c2 = new Carro(0, 0);
		c2.setMotor(2.5);
		c2.setQuilometragem(2400);
		repositorio.addVeiculo(c2);
		
		Moto m1 = new Moto(0, 0);
		m1.setCilindrada(800);
		m1.setQuilometragem(2000);
		repositorio.addVeiculo(m1);
		
		Moto m2 = new Moto(0, 0);
		m2.setCilindrada(100);
		m2.setQuilometragem(10000);
		repositorio.addVeiculo(m2);
		
		Taxi t1 = new Taxi(0, 0);
		t1.setQntdPessoas(3);
		t1.setQuilometragem(5000);
		repositorio.addVeiculo(t1);
		
		Taxi t2 = new Taxi(0, 0);
		t2.setQntdPessoas(5);
		t2.setQuilometragem(100);
		repositorio.addVeiculo(t2);
		
		repositorio.listCarbonFootPrints();
	}

}
