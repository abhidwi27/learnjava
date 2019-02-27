package array;

public class BinarySearchArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 22;
		
		int[] b = {10 ,15, 18, 20 , 21, 28, 30, 40};
		
		System.out.println(search( b, d, 0 , b.length-1));
		
		
	
	}
	
	private static int search(int[] a, int d, int startIndex, int endIndex){
		
		int index = -1;
		if(a[startIndex] == d) {
			index = startIndex;
			return index;
		}
		if(a[endIndex] == d){
			index = endIndex;
			return index;
		}
		if( endIndex > startIndex){
		int mid = startIndex + (endIndex-startIndex)/2;
		
		if(a[mid] == d){
			index = mid;
			return index;
		}
		
		if( d > a[mid]){
			index  = search(a, d, mid+1, endIndex);
		}else if ( d < a[mid]){
			index = search(a , d, startIndex , mid-1);
		}else{
			return index;
		}
		}
		
		return index;
	}
	
}
