package imd.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Repositorio {
	
	private ArrayList<Veiculo> veiculos; 
	
	public Repositorio() {
		veiculos = new ArrayList<Veiculo>();
	}
	
	public void addVeiculo(Veiculo v) {
		veiculos.add(v);
	}
	
	public String searchBrand() {
		Map<String, Integer> frequencia = new HashMap<>();
		String marca = null;
		ArrayList<String> listaMarcas = new ArrayList<>();
		for(Veiculo v : veiculos) {
			listaMarcas.add(v.getMarca());
		}
		for(String s : listaMarcas) {
			frequencia.put(s, frequencia.getOrDefault(s, 0) + 1);
		}
        int maxContagem = 0;

        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            if (entry.getValue() > maxContagem) {
                marca = entry.getKey();
                maxContagem = entry.getValue();
            }
        }
		return marca;
	}
	
	public ArrayList<Veiculo> listVeiculos(){
		return veiculos;
	}
	
	public ArrayList<Veiculo> listVeiculosAlugados(){
		ArrayList<Veiculo> veiculosAlugados = new ArrayList<>();
		for(Veiculo v : veiculos) {
			if(v.isAlugado()) {
				veiculosAlugados.add(v);
			}
		}
		return veiculosAlugados;
	}
	
	public ArrayList<Veiculo> listVeiculosDisponiveis(){
		ArrayList<Veiculo> veiculosDisponiveis = new ArrayList<>();
		for(Veiculo v : veiculos) {
			if(!v.isAlugado()) {
				veiculosDisponiveis.add(v);
			}
		}
		return veiculosDisponiveis;
	}
	
	public String seachPrices() {
		
		Optional<Veiculo> maisCaro = veiculos.stream().filter(v -> !v.isAlugado()) .max((v1,v2) -> Double.compare(v1.getValorAluguel(), v2.getValorAluguel()));
		 // Retorna a placa do veículo mais caro, ou "Não encontrado" se não houver veículos
	    return maisCaro.map(Veiculo::getPlaca).orElse("Não encontrado");
	}
	
	public ArrayList<Veiculo> listControleManutencao(){
		ArrayList<Veiculo> veiculosEmManutencao = new ArrayList<>();
		for(Veiculo v : veiculos) {
			if(v instanceof Carro) {
				if(v.getQuilometragem()% 7000 == 0) {
				veiculosEmManutencao.add(v);
				}
			}
			else if(v instanceof Moto) {
				if(v.getQuilometragem()% 3500 == 0) {
					veiculosEmManutencao.add(v);
					}
			}	
		}
		return veiculosEmManutencao;
	}
	
	public double calcularTotalOleo(ArrayList<Veiculo> veiculosEmManutencao) {
		double oleoTotal = 0.0;
		for(Veiculo v: veiculosEmManutencao) {
			if(v instanceof Carro) {
				oleoTotal += 3.5;
			}
			else if(v instanceof Moto) {
				oleoTotal += 1.5;
			}
		}
		return oleoTotal;
	}
	
}

	
