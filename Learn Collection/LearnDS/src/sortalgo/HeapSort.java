package sortalgo;

import array.ArrayUtil;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 11, 9 , 8, 89, 41, 12, -2};
		int n = a.length;
		for(int i=n/2 - 1; i>=0; i--) {
			ArrayUtil.maxheapify(a, i, n);
		}
		
		for(int i=n-1; i>=0; i--) {
			int temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			ArrayUtil.maxheapify(a, 0, i);
		}
		ArrayUtil.printArray(a);
	}

}
