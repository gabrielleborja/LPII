package imd.modelo;

public class Prova {

	private double notaParte1;
	private double notaParte2;
	
	public Prova() {
		notaParte1 = 0.0;
		notaParte2 = 0.0;
	}
	
	public void setNotaParte1(double notaParte1) {
		this.notaParte1 = notaParte1;
	}
	public void setNotaParte2(double notaParte2) {
		this.notaParte2 = notaParte2;
	}
	
	public double calcularNotaTotal(){
        return (this.notaParte1 + this.notaParte2);
    } 
	
}
