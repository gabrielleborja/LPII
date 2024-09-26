
public class MaquinaRefrigerante {
	
    // Atributos.
    private int preco;
    private int balanco;
    private int total;
    private boolean darTroco;

    // Método construtor para inicializar os atributos
    public MaquinaRefrigerante(int valor) {
        preco = valor;
        balanco = 0;
        total = 0;
        darTroco = false;
    }

    // Retorna o preço
    public int getPreco(){
        return preco;
    }

    // Retorna o balanço corrente
    public int getBalanco(){
        return balanco;
    }

    //Setar darTroco
    public void setDarTroco(){
        darTroco = true;
    }

    // Recebe um valor em dinheiro
    public void inserirDinheiro(int valor){
        if(valor>0){
            balanco += valor;
            System.out.println("Valor inserido com sucesso!!!!");
        }
        else{
            System.out.println("Use um valor positivo!!!");
            System.out.println("Tente outra vez!!!");
        }
    }

    // Imprimir o preço do refrigerante
    public void imprimirPreco(){
        System.out.println("##################");
        System.out.println("# Preco ##########");
        System.out.println("# Refrigerante");
        System.out.println("# R$ " + preco + ",00");
        System.out.println("##################");
    }
		
    public void comprarRefrigerante(){
        if(balanco >= preco){
            System.out.println("##################");
            System.out.println("## Recibo ##");
            System.out.println("## Refrigerante ##");
            System.out.println("# R$ " + preco + ",00");
            System.out.println("##################");
            System.out.println();

            //Atualizar Montante Total de vendas da máquina
            total=total+preco;

            //Atualizar o montante do cliente
            balanco=balanco-preco;

            if(balanco> 0 && darTroco == true){
                System.out.println("##################");
                System.out.println("## Troco ##");
                System.out.println("## R$ " + devolverTroco() + ",00");
                System.out.println("##################");
            }
        }
        else{
            System.out.println("Voce precisa inserir pelo menos: R$ " + (preco-balanco) + ",00");
        }
    }

    public int devolverTroco(){
        int valorParaDevolver;
        valorParaDevolver = balanco;
        balanco = 0;
        return valorParaDevolver;
    }
}



