package loja.modelo;

import java.time.LocalDate;

public class ProdutoNaoduravel extends Produto{

	private LocalDate dataValidade;
	private String genero;
	
	public ProdutoNaoduravel(String nome, double preco, String marca, String descricao, LocalDate dataValidade, String genero) {
		super(nome, preco, marca, descricao);
		this.dataValidade = dataValidade;
		this.genero = genero;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	 
}
