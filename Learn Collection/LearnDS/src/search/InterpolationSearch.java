package search;

public class InterpolationSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 
                24, 33, 35, 42, 47}; 
		
		int high = arr.length -1;
		int low = 0;
		int x = 48;
		int result = interpolationsearch( arr, low, high, x);
		System.out.println(result);
	}
	
	private static int interpolationsearch(int[] a, int low, int high, int x) {
		
		if( high < low || x < a[low] || x > a[high] ) {
			return -1;
		}
		int pos = 0;
		while( low<=high && x>= a[low] && x<=a[high]) {
			pos = low + (( x - a[low]) * ( high - low)) / (a[high] - a[low]);
			
			if( a[pos] == x) {
				return pos;
			}
			if( x < a[pos]) {
				high = pos-1;
			}
			if( x > a[pos]) {
				low = pos + 1;
			}
		}
		return -1;
	}

}
