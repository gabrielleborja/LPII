package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.Carro;
import br.ufrn.imd.modelo.Veiculo;
import br.ufrn.imd.modelo.ICarbonFootPrint;
import br.ufrn.imd.modelo.Moto;
import br.ufrn.imd.modelo.Taxi;


public class Repositorio {

	private ArrayList<Veiculo> listVeiculos = new ArrayList<>();
	
	public void addVeiculo(Veiculo v) {
		listVeiculos.add(v);
	}
	
	public ArrayList<Veiculo> listVeiculos() {
		return listVeiculos;
	}
	
	public void listCarbonFootPrints() {
		for(Veiculo v : listVeiculos) {
			if(v instanceof Carro) {
				System.out.println("");
				ICarbonFootPrint carro = (ICarbonFootPrint) v;
				System.out.println("Carro - Pegada de Carbono: " + carro.getCarbonFootprint());
				Carro c = (Carro) v; 
	            System.out.println("Motor: " + c.getMotor() + " Quilometragem: " + c.getQuilometragem() + " Custo Mensal: " + c.getCustoMensal());
			}
			else if(v instanceof Moto) {
				System.out.println("");
				ICarbonFootPrint moto = (ICarbonFootPrint) v;
				System.out.println("Moto - " + moto.getCarbonFootprint());
				Moto m = (Moto) v; 
	            System.out.println("Cilindrada: " + m.getCilindrada() + " Quilometragem: " + m.getQuilometragem() + " Custo Mensal: " + m.getCustoMensal());
			}
			else if(v instanceof Taxi) {
				System.out.println("");
				ICarbonFootPrint taxi = (ICarbonFootPrint) v;
				System.out.println("Taxi - " + taxi.getCarbonFootprint());
				Taxi t = (Taxi) v; 
	            System.out.println("Quantidade de pessoas: " + t.getQntdPessoas() + " Quilometragem: " + t.getQuilometragem() + " Custo Mensal: " + t.getCustoMensal());
			}
		}
	}
	
}
