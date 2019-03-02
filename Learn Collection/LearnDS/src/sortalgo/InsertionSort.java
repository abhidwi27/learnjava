package sortalgo;

import array.ArrayPrint;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 11, 9 , 8, 89, 41, 12, -2};
		for(int i=0; i < a.length ; i++) {
			sortSubArray(a, i, 0);
		}
		ArrayPrint.printArray(a);
	}
	
	private static void sortSubArray(int [] a, int start, int end){
		int temp;
		for(int i=start; i> end; i--) {
			if(a[i] < a[i-1]) {
				temp = a[i-1];
				a[i-1] = a[i];
				a[i] = temp;
			}
		}
		
	}

}
