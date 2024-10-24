package imd.visao;

import imd.modelo.Carro;
import imd.modelo.Moto;
import imd.modelo.Repositorio;
import imd.modelo.Veiculo;

public class LocaLisaView {

	public static void main(String[] args) {
		Repositorio repositorio = new Repositorio();
		
		Carro c1 = new Carro("", null, 0, 0, 0, 0, false);
		c1.setAlugado(true);
		c1.setMarca("Ford");
		c1.setPlaca("AAA-8888");
		c1.setNumeroPortas(4);
		c1.setPotenciaMotor(1600);
		c1.setValorAluguel(5 * 115.5);
		c1.setQuilometragem(21000);
		repositorio.addVeiculo(c1);
		
		Carro c2 = new Carro(null, null, 0, 0, 0, 0, false);
		c2.setAlugado(true);
		c2.setMarca("Fiat");
		c2.setPlaca("ABB-1000");
		c2.setNumeroPortas(4);
		c2.setPotenciaMotor(1000);
		c2.setValorAluguel(3 * 75.0);
		c2.setQuilometragem(15000);
		repositorio.addVeiculo(c2);
		
		Carro c3 = new Carro(null, null, 0, 0, 0, 0, false);
		c3.setAlugado(false);
		c3.setMarca("Fiat");
		c3.setPlaca("ABC-5501");
		c3.setNumeroPortas(2);
		c3.setPotenciaMotor(1200);
		c3.setValorAluguel(1 * 75.0);
		c3.setQuilometragem(14000);
		repositorio.addVeiculo(c3);
		
		Moto m1 = new Moto(null, null, 0, 0, 0, null, false);
		m1.setAlugado(false);
		m1.setMarca("Honda");
		m1.setPlaca("BBB-2019");
		m1.setCilindradas(850);
		m1.setTipoDePartida("Elétrica");
		m1.setValorAluguel(1 * 55.25);
		m1.setQuilometragem(3500);
		repositorio.addVeiculo(m1);
		
		Moto m2 = new Moto(null, null, 0, 0, 0, null, false);
		m2.setAlugado(true);
		m2.setMarca("Yamaha");
		m2.setPlaca("XYZ-2019");
		m2.setCilindradas(250);
		m2.setTipoDePartida("Elétrica");
		m2.setValorAluguel(2 * 55.25);
		m2.setQuilometragem(4500);
		repositorio.addVeiculo(m2);
		
		System.out.println("Lista de Veiculos: ");
		for(Veiculo v : repositorio.listVeiculos()) {
			System.out.println(v);
		}
		System.out.println("");
		System.out.println("Marca com maior numero de carros: ");
		System.out.println(repositorio.searchBrand());
		
		System.out.println("\n============== Alugados ==============");
		double totalAluguel = 0.0;
		for(Veiculo v: repositorio.listVeiculosAlugados()) {
			if(v instanceof Carro) {
				Carro carro = (Carro) v;
				System.out.println("Carro: " + carro.getMarca() + "  Placa: " + carro.getPlaca() + "  Motor: " + carro.getPotenciaMotor() + "  Portas: " + carro.getNumeroPortas());
				totalAluguel += carro.getValorAluguel();
			}
			else if(v instanceof Moto) {
				Moto moto = (Moto) v;
				System.out.println("Moto: " + moto.getMarca() + "  Placa: " + moto.getPlaca() + "  Partida: " + moto.getTipoDePartida() + "  Cilindradas: " + moto.getCilindradas());
				totalAluguel += moto.getValorAluguel();
			}
		}
		System.out.println("Valor total dos alugueis: " + totalAluguel);
		System.out.println("===============  Fim  ===============");
		System.out.println("");
		
		System.out.println("============== Disponíveis ==============");
		for(Veiculo v: repositorio.listVeiculosDisponiveis()) {
			if(v instanceof Carro) {
				Carro carro = (Carro) v;
				System.out.println("Carro: " + carro.getMarca() + "  Placa: " + carro.getPlaca() + "  Motor: " + carro.getPotenciaMotor() + "  Portas: " + carro.getNumeroPortas() + "  Valor Aluguel: " + carro.getValorAluguel());
			}
			else if(v instanceof Moto) {
				Moto moto = (Moto) v;
				System.out.println("Moto: " + moto.getMarca() + "  Placa: " + moto.getPlaca() + "  Cilindradas: " + moto.getCilindradas() + "  Valor Aluguel: " + moto.getValorAluguel());
			}
		}
		System.out.println("Veiculo com maior valor de aluguel: " + repositorio.seachPrices() );
		System.out.println("===============  Fim  ===============");
		System.out.println("");
		
		System.out.println("============== Manutenção ==============");
		for(Veiculo v: repositorio.listControleManutencao()) {
			System.out.println("Veículo: " + v.getMarca() + " trocou óleo");
		}
		System.out.println("Quantidade total de litros de oleo: " + repositorio.calcularTotalOleo(repositorio.listControleManutencao()));
		System.out.println("===============  Fim  ===============");

	}

}















