package loja.modelo;

import java.util.ArrayList;


public class Deposito {

	private ArrayList<Produto> produtos;
	
	public Deposito() {
		produtos = new ArrayList<Produto>();
	}

	public ArrayList<Produto> listProdutos(){
		return produtos;
	}
	
	public void addProduct(Produto p){
		produtos.add(p);
	}
	
	public void removeProduct(Produto p) {
		produtos.remove(p);
	}
	
	public int countProducts() {
		return this.produtos.size();
	}
	
	public boolean checkEmptiness() {
		if(this.produtos.size() == 0) {
			return true;
		}
		else return false;
	}
	
	public Produto searchPrice() {
		double maiorPreco = 0.0;
		Produto produtoMaisCaro = null;
		for(Produto p: produtos) {
			if(p.getPreco() > maiorPreco) {
				maiorPreco = p.getPreco();
				produtoMaisCaro = p;
			}
		}
		return produtoMaisCaro;
	}
	
}
