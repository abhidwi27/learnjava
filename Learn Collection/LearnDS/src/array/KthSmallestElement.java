package array;

import java.util.Arrays;
import java.util.Comparator;

public class KthSmallestElement {

	public static void main(String[] args) {

		int[] a = { 7, 10, 4, -3, 20, 15, -1, 2, 1, -4, 22, 11, 45, 98, 34, 9, 6 };
		int n = a.length;
		int k = 2;
		int start1, start2, diff;

		int endIdx;
		for (int startIdx = 0; startIdx < a.length;) {
			if (startIdx + k > n) {
				endIdx = n - 1;
			} else {
				endIdx = startIdx + k;
			}
			Arrays.sort(a, startIdx, endIdx);

			startIdx = startIdx + k;
		}

		start1 = 0;
		diff = k;
		start2 = start1 + diff;

		while (start2 < n) {
			int innerStart1 = start1;
			int innerEnd1 = start1 + k;
			int innerStart2 = start2;
			int innerEnd2 = start2 + k;
			
			while (innerStart1 < n && innerStart2 < n) {
				if (innerStart1 + k > n) {
					innerEnd1 = n;
				}
				if (innerStart2 + k > n) {
					innerEnd2 = n;
				}
				mergeArrays(a, innerStart1, innerEnd1, a, innerStart2, innerEnd2);
				innerStart1 = innerStart1 + 2 * diff;
				innerEnd1 = innerStart1 + k;
				innerStart2 = innerStart2 + 2 * diff;
				innerEnd2 = innerStart2 + k;

			}
			diff = diff * 2;
			start2 = start1 + diff;
		}

		System.out.println("kth Smallest integer is " + a[k - 1]);

	}
	
	// Following method rearranges 2 sorted arrays such that 
	// arr1 will have all values less then arr2.
	// arr1 and arr2 will be sorted.
	// Time complexity O( n1 + n2 )
	// Space complexity O ( n1 )
 	private static void mergeArrays(int[] arr1, int start1, int end1, int[] arr2, int start2, int end2) {
		int len = end1 - start1;
		int arr1FillIdx = start1;
		int arr2FillIdx = start2;
		int arr2NavigateIdx = start2;
		int tempNavigateIdx = 0;
		int[] temp = new int[end1 - start1];
		for (int i = 0; i < len; i++) {
			temp[i] = arr1[start1];
			start1++;
		}

		while (tempNavigateIdx < len && arr2NavigateIdx < end2) {
			if (temp[tempNavigateIdx] > arr2[arr2NavigateIdx]) {
				if (arr1FillIdx < end1) {
					arr1[arr1FillIdx] = arr2[arr2NavigateIdx];
					arr1FillIdx++;
				} else {
					arr2[arr2FillIdx] = arr2[arr2NavigateIdx];
					arr2FillIdx++;
				}
				arr2NavigateIdx++;
			} else {
				if (arr1FillIdx < end1) {
					arr1[arr1FillIdx] = temp[tempNavigateIdx];
					arr1FillIdx++;
				} else {
					arr2[arr2FillIdx] = temp[tempNavigateIdx];
					arr2FillIdx++;
				}
				tempNavigateIdx++;

			}
		}

	}
}
