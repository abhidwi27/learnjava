package sortalgo;

import array.ArrayUtil;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 11, 9 , 8, 89, 41, 12, -2};
		//int a[] = {9, 10, 2, 7, 14, 15};
		int n = a.length;
		mergeSort(a, 0, 7);
		ArrayUtil.printArray(a);
	}
	
	private static void mergeSort(int [] a, int start, int end) {
		if(start < end) {
		int mid = start + (end-start)/2;
		
			mergeSort(a, start, mid);
			mergeSort(a, mid+1, end);
			merge(a, start, mid, mid+1, end);
		}	
		
	}
	
	private static void merge(int[] a, int start1, int end1, int start2, int end2) {
		
		
		int length = end1-start1 + 1;
		int[] temp  = new int[length];
		int lastFilledIdx1 = start1;
		int lastFilledIdx2 = start2;
		int tempIterator=0;
		int arr2Iterator= start2;
		for(int i=0 ; i< length ; i++ ) {
			temp[i] = a[start1];
			start1++;
		}
		
		while( tempIterator < length && arr2Iterator <= end2 ) {
			if( a[arr2Iterator] < temp[tempIterator]) {
				if( lastFilledIdx1 <= end1) {
					a[lastFilledIdx1] = a[arr2Iterator];
					lastFilledIdx1++;
				}else {
					a[lastFilledIdx2] = a[arr2Iterator];
					lastFilledIdx2++;
				}
				arr2Iterator++;
			}else {
				if( lastFilledIdx1 <= end1) {
					a[lastFilledIdx1] = temp[tempIterator];
					lastFilledIdx1++;
				}else {
					a[lastFilledIdx2] = temp[tempIterator];
					lastFilledIdx2++;
				}
				tempIterator++;
				
			}
		}
		
		if(tempIterator <= length-1) {
			for(int i=tempIterator ; i<length ; i++) {
				if( lastFilledIdx1 <= end1) {
					a[lastFilledIdx1] = temp[tempIterator];
					lastFilledIdx1++;
				}else {
					a[lastFilledIdx2] = temp[tempIterator];
					lastFilledIdx2++;
				}
				
				tempIterator++;
				
			}
		}
		
		
		
	}

}
