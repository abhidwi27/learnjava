package search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40 };
		int high = arr.length - 1;
		int x = 4;
		int result = binarysearch(arr, 0, high, x);
		System.out.println(result);

	}

	private static int binarysearch(int[] a, int low, int high, int x) {
		int result = -1;

		if (low > high) {
			return -1;
		}
		if (a[low] == x) {
			return low;
		}
		if (a[high] == x) {
			return high;
		}

		int mid = low + (high - low) / 2;

		if (a[mid] == x) {
			return mid;
		}

		result = binarysearch(a, low, mid - 1, x);
		if (result == -1) {
			result = binarysearch(a, mid + 1, high, x);
		}
		return result;
	}

}
