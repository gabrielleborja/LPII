import java.util.Scanner;

public class PessoaView {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o Peso: ");
        double peso = scanner.nextDouble();
        pessoa.setPeso(peso);

        System.out.print("Digite a Altura: ");
        double altura = scanner.nextDouble();
        pessoa.setAltura(altura);

        double IMC = pessoa.calcularIMC();
        System.out.printf("Peso   => %.2f%n", peso);
        System.out.printf("Altura => %.2f%n", altura);
        System.out.printf("IMC = %.2f%n", IMC);        
        System.out.printf(pessoa.informarIMC(IMC));

        scanner.close();
    }
}
