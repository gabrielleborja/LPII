public class MaquinaRefrigeranteView {
    //criando o método executável da classe
    public static void main(String args[]){
    
    	//instanciando a classe
    	MaquinaRefrigerante maquina = new MaquinaRefrigerante(5);
    	
    	//chamando um método
    	maquina.imprimirPreco();

        //inserir dinheiro na máquina 
        System.out.println("");
        maquina.inserirDinheiro(20);

        //retornar o balanço corrente
        System.out.println("");
        System.out.println("Balanço atual => " + maquina.getBalanco());

        maquina.setDarTroco();

        //comprar na máquina
        maquina.comprarRefrigerante();
    }
}
