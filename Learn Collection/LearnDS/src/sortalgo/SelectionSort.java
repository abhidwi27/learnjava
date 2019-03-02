package sortalgo;

import array.ArrayPrint;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10, 11, 9 , 8, 89, 41, 12, -2};
		selectionsort(a);
		ArrayPrint.printArray(a);
	}
	
	private static void selectionsort(int[] a) {
		for ( int i=0; i< a.length; i++) {
			a[i] = findMin(a, i, a.length);
		}
		
	}
	
	private static int findMin(int[] a, int start, int end) {
		int temp;
		int min = a[start];
		for(int i=start; i<end; i++) {
			if(a[i] < min) {
				temp = min;
				min = a[i];
				a[i] = temp;
			}
		}
		return min;
	}

}
