package sortalgo;

import array.ArrayPrint;

public class BubbleSort {
	static boolean swapped = false;
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-2, 8, 9, 10, 11, 12, 41, 89};
		
		
		for(int i=0; i<a.length; i++) {
			swapped = false;
			swapAdjacent(a, 0, a.length-1);
			if(!swapped) {
				break;
			}
		}
		System.out.println("Count is " + count);
		ArrayPrint.printArray(a);
	}
	
	private static void swapAdjacent(int[] a, int start, int end) {
		int temp;
		for(int i=start; i<end; i++) {
			if(a[i] > a[i+1]) {
				temp=a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				swapped = true;
			}
			count++;
		}
	}
}
