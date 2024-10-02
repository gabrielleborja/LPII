package aula05_pratica;

public class Prova {
    
    private double notaParte1;
    private double notaParte2;

    public Prova(){
        notaParte1 = 0.0;
        notaParte2 = 0.0;
    }

    public double getNotaParte1(){
        return notaParte1;
    }

    public double getNotaParte2(){
        return notaParte2;
    }

    public void setNotaParte1(double notaParte1){
        if ( notaParte1 <=5 && notaParte1 >=0){
        this.notaParte1 = notaParte1;
        }
        else System.out.println("Nota parte 1 - inválida!");
    }

    public void setNotaParte2(double notaParte2){
        if ( notaParte2 <=5 && notaParte2 >=0){
            this.notaParte2 = notaParte2;
        }  
        else System.out.println("Nota parte 2 - inválida!");
    }

    public double calcularNotaTotal(){
        return (this.notaParte1 + this.notaParte2);
    }
}

