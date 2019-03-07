package heap;

import array.ArrayUtil;

public class MaxHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//int a[] = {10, 11, 9 , 8, 89, 41, 12, -2};
				int a[] = {-2, 11, 41, 8, 10, 9, 12};
				int n = a.length;
				for(int i= n/2 - 1; i>=0; i--) {
					heapify(a, i, n);
				}
				
				ArrayUtil.printArray(a);
	}
	
	private static void heapify(int[] a, int i, int length) {
		int left = 2*i + 1;
		int right = 2*i + 2;
		int largest = i;
		
		if( left < length && a[left] > a[largest]) {
			largest = left;
		}
		if( right < length && a[right] > a[largest]) {
			largest = right;
		}
		
		if( largest != i ) {
			int temp = a[largest];
			a[largest] = a[i];
			a[i] = temp;
			heapify(a, largest, length);
		}
	}

}
