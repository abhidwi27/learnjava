package sortalgo;

import array.ArrayUtil;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 11, 9 , -2, 89, 41, 12, 13};
		int n = a.length;
		
		QuickSortArr(a, 0, n-1);
		ArrayUtil.printArray(a);
		
	}
	
	private static void QuickSortArr(int[] a, int low, int high) {
		if(low < high) {
			int pivot = partition(a, low, high);		
			QuickSortArr(a, low, pivot-1);
			QuickSortArr(a, pivot+1, high);
		}
	}
	private static int partition(int[] a, int low, int high) {
		int pivot = high;
		int lastLowerIdx = low-1;
		for(int j=low; j<high; j++) {
			if(a[j] <= a[pivot]) {
				lastLowerIdx++;
				int temp = a[lastLowerIdx];
				a[lastLowerIdx] = a[j];
				a[j]= temp;				
			}
		}
		
		int temp = a[lastLowerIdx + 1];
		a[lastLowerIdx + 1] = a[pivot];
		a[pivot] = temp;
		return lastLowerIdx+1;
	}
	
	
}
