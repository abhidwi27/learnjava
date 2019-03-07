package heap;

import array.ArrayUtil;

public class MinHeap {
	
	//static int smallest = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 11, 9 , 8, 89, 41, 12, -2};
		int n = a.length;
		for(int i= n/2 - 1; i>=0; i--) {
			heapify(a, i, n);
		}
		
		ArrayUtil.printArray(a);
	}
	
	
	private static void heapify(int[] a, int i, int length) {
		int left = 2*i + 1;
		int right = 2*i + 2;
		int smallest = i;
		
		if( left < length && a[left] < a[smallest]) {
			smallest = left;
		}
		if( right < length && a[right] < a[smallest]) {
			smallest = right;
		}
		
		if( smallest != i ) {
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;
			heapify(a, smallest, length);
		}
	}
}
