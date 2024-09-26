import java.util.Scanner;

public class PessoaView {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o Peso: ");
        Double peso = scanner.nextDouble();

        System.out.print("Digite a Altura: ");
        Double altura = scanner.nextDouble();

        pessoa.setPeso(peso);
        pessoa.setAltura(altura);

        Double IMC = pessoa.calcularIMC();
        pessoa.imprimirDados(IMC);

        String resultadoIMC = pessoa.informarIMC(IMC);
        
        System.out.printf(resultadoIMC);

        scanner.close();
    }
}
