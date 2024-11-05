package br.ufrn.imd.modelo;

public class Animal {

	protected String nome;
	protected int idade;
	protected int peso;
	protected boolean alimentado;
	protected String alimentaçao;
	protected double quantidadeAlimento;
	
	public Animal() {
		nome = "";
		idade = 0;
		peso = 0;
		alimentado = false;
		alimentaçao = "";
		quantidadeAlimento = 0.0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public boolean isAlimentado() {
		return alimentado;
	}
	public void setAlimentado(boolean alimentado) {
		this.alimentado = alimentado;
	}
	public String getAlimentaçao() {
		return alimentaçao;
	}
	public void setAlimentaçao(String alimentaçao) {
		this.alimentaçao = alimentaçao;
	}
	public double getQuantidadeAlimento() {
		return quantidadeAlimento;
	}
	
	public void setQuantidadeAlimento(int quantidadeAlimento) {
		this.quantidadeAlimento = quantidadeAlimento;
	}
	
	public int calcularIdade(Animal a) {
		return 0;
		
	}

	public void comer() {
		quantidadeAlimento = getPeso()*(0.05);
		alimentado = true;
	}
}
