package algoritmos_ordenacao;

public class OrdenacaoHeapSort {

	public static void heapSort(int[] array) {
		int n = array.length;
		
		for(int i = n/2 - 1; i>=0; i--) {
			heapify(array, n, i);
		}
		
		for(int i = n - 1; i>0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			heapify(array, i, 0);
		}
		
	}
	public static void heapify(int[] array, int n, int i) {
		int largest = i;
		int left = 2*i + 1;
		int right = 2*i +2;
		
		if(left < n && array[left] > array[largest]) {
			largest = left;
		}
		if(right < n && array[right] > array[largest]) {
			largest = right;
		}
		
		if(largest != i) {
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;
			heapify(array, n , largest);
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] array = {2, 5, 4, 8, 1, 3, 9, 6, 7, 10};
		
		System.out.println("Original: " + java.util.Arrays.toString(array));
		
		heapSort(array);
		
		System.out.println("HeapSort: " + java.util.Arrays.toString(array));

	}

}
