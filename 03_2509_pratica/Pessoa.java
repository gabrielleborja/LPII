
public class Pessoa {

    private double peso;
    private double altura;

public Pessoa(){
    peso = 0.0;
    altura = 0.0;
}

public void setPeso(double peso){
    this.peso = peso;
}

public void setAltura(double altura){
    this.altura = altura;
}

public double getPeso(){
    return peso;
}

public double getAltura(){
    return altura;
}

public double calcularIMC(){
    double IMC = 0.0;
    IMC = peso/(altura*altura);
    return IMC;
}

public void imprimirDados(double IMC){
    System.out.printf("Peso   => %.2f%n", peso);
    System.out.printf("Altura => %.2f%n", altura);
    System.out.printf("IMC = %.2f%n", IMC);
}

public String informarIMC(double IMC){
    if(IMC < 18.5) return "Pessoa Abaixo do peso\n";
    else if(IMC>=18.5 && IMC<=24.9) return "Pessoa com Peso normal\n";
    else if(IMC>24.9 && IMC<=29.9) return "Pessoa com Pré-obesidade\n";
    else if(IMC>29.9 && IMC<=34.9) return "Pessoa com Obesidade grau 1\n";
    else if(IMC>34.9 && IMC<=39.9) return "Pessoa com Obesidade grau 2\n";    
    else return "Pessoa com Obesidade grau 3\n";    
}

}
