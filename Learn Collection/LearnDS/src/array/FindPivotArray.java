package array;

public class FindPivotArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] b = {10, 12, 15, 17, 1, 2};
		
		System.out.println(findPivot( b, 0 , b.length-1));
		
		
	
	}
	
	private static int findPivot(int[] a, int start, int end){
		int mid = start + (end-start)/2;
		
		if(a[mid] > a[mid-1] && a[mid] > a[mid+1] ){
			return mid;
		}
		
		if( start < end){
		
			if (a[mid] < a[start]){
				return findPivot(a, start, mid-1);
			}else{
				return findPivot(a, mid+1, end);
			}
		}else{
			return -1;
		}
	}

}
