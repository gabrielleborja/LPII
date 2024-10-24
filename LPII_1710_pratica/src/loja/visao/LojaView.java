package loja.visao;

import java.time.LocalDate;

import loja.modelo.Deposito;
import loja.modelo.Produto;
import loja.modelo.ProdutoDuravel;
import loja.modelo.ProdutoNaoduravel;

public class LojaView {

	public static void main(String[] args) {

		Deposito deposito = new Deposito();
		
		ProdutoDuravel geladeira = new ProdutoDuravel("geladeira", 3500, "eletrolux", "frost free", 5);
		deposito.addProduct(geladeira);
		ProdutoDuravel livro = new ProdutoDuravel("livro", 39.99, "leya", "200 paginas", 10);
		deposito.addProduct(livro);
		ProdutoDuravel celular = new ProdutoDuravel("celular", 2000, "samsung", "memória 128GB", 3);
		deposito.addProduct(celular);

		ProdutoNaoduravel chocolate = new ProdutoNaoduravel("chocolate", 10, "garoto", "chocolate ao leite", LocalDate.of(2025, 12, 02), "alimenticio");
		deposito.addProduct(chocolate);
		ProdutoNaoduravel leite = new ProdutoNaoduravel("leite", 5.40, "nestlé", "leite desnatado", LocalDate.of(2024, 10, 31), "alimenticio");
		deposito.addProduct(leite);
		ProdutoNaoduravel sabonete = new ProdutoNaoduravel("sabonete", 2.10, "dove", "sabonete em barra", LocalDate.of(2030, 07, 15), "higiene pessoal");
		deposito.addProduct(sabonete);
		
		System.out.println("Numero de produtos: ");
		System.out.println(deposito.countProducts());
		
		if(deposito.checkEmptiness()) {
			System.out.println("Deposito vazio");
		}
		else {
			System.out.println("Deposito não vazio!");
		}
		
		
		System.out.println("Produto mais caro: ");
		System.out.println(deposito.searchPrice().getNome());
	

		for(Produto p : deposito.listProdutos()) {
			if(p instanceof ProdutoNaoduravel){
				ProdutoNaoduravel pnd = (ProdutoNaoduravel) p;
				System.out.println("\nNome: " + pnd.getNome() + "  Preço: " + pnd.getPreco() + "  Marca: " + pnd.getMarca() + "  Descrição: " + pnd.getDescricao() + "  Validade: " + pnd.getDataValidade() + "  Gênero: " + pnd.getGenero());
			}
			else if(p instanceof ProdutoDuravel) {
				ProdutoDuravel pd = (ProdutoDuravel) p;
				System.out.println("\nNome: " + pd.getNome() + "  Preço: " + pd.getPreco() + "  Marca: " + pd.getMarca() + "  Descrição: " + pd.getDescricao() + "  Durabilidade: " + pd.getDurabilidade());
			}
		}
	}
}
