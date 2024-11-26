package algoritmos_ordenacao;

import java.util.Random;

public class OrdenacaoBogoSort {

	public static void bogoSort(int[] array){
		
		while(!isSorted(array)) {
			shuffle(array);
		}
	}
	
	public static void shuffle(int[] array) {
		Random random = new Random();
		for(int i = 0 ; i < array.length; i++) {
			int j = random.nextInt(array.length);
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
	
	public static boolean isSorted(int[] array) {
		for (int i = 1; i< array.length; i++) {
			if(array[i] < array[i-1]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		int[] array = {2, 5, 4, 8, 1, 3, 9, 6, 7, 10};
		
		System.out.println("Original: " + java.util.Arrays.toString(array));
		
		bogoSort(array);
		
		System.out.println("Bogo: " + java.util.Arrays.toString(array));

	}

}
