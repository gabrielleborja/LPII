package imd.controle;

public class ProvaControl {

	public boolean verificarNotaParte1 (double notaParte1) {
		if (notaParte1 <= 5 && notaParte1 >= 0) {
			return true;
		}
		else {
			System.out.println("Nota parte 01 - inválida!");
			return false;
		}
	}
	
	public boolean verificarNotaParte2 (double notaParte2) {
		if (notaParte2 <= 5 && notaParte2 >= 0) {
			return true;
		}
		else {
			System.out.println("Nota parte 02 - inválida!");
			return false;
		}
	}
}
