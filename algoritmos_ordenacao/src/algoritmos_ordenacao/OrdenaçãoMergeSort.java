package algoritmos_ordenacao;

public class OrdenaçãoMergeSort {

	public static void mergeSort(int[] array) {

		if(array.length < 2) return;
		
		int mid = array.length/2;
		int[] left = new int[mid];
		int[] right = new int[array.length - mid];
		
		System.arraycopy(array, 0, left, 0, mid);
		System.arraycopy(array, mid, right, 0, array.length-mid);
		
		mergeSort(left);
		mergeSort(right);
		
		merge(array, left, right);
	}
	
	private static void merge(int[] array, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		
		while(i < left.length && j < right.length) {
			if(left[i]<=right[j]) {
				array[k++] = left[i++];
			} else {
				array[k++]=right[j++];
			}
		}
		
		while(i< left.length) {
			array[k++] = left[i++];
		}
		while(j< right.length) {
			array[k++] = right[j++];
		}
	}
	
	public static void main(String[] args) {
		int[] array = {2, 5, 4, 8, 1, 3, 9, 6, 7, 10};
		
		System.out.println("Original: " + java.util.Arrays.toString(array));
		
		mergeSort(array);
		
		System.out.println("MergeSort: " + java.util.Arrays.toString(array));

	}

}

