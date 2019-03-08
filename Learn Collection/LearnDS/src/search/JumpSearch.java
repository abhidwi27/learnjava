package search;

public class JumpSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 
                34, 55, 89, 144, 233, 377, 610}; 
		int x = 611;
		int high = arr.length - 1;
		int index  = jumpsearch(arr, 0, high, x );
		System.out.println(index);
	}
	
	private static int jumpsearch(int[] a, int low, int high, int x) {
		if( x < a[low] && x > a[high]) {
			return -1;
		}
		int index = -1;
		int m = (int) Math.sqrt(high - low);
		int start = 0, end = 0;
		for(int i=low; i<=high ;) {
			
			if( i + m > high) {
				end  = high;
			}else {
				end = i + m;
			}
			if(x >= a[i] && x <= a[end]) {
				start = i;
				break;
			}
			i = i+m;
		}
		
		for(int j=start; j<= end; j++) {
			if(x == a[j]) {
				index = j;
				break;
			}
		}
		return index;
	}

}
