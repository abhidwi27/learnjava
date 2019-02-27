package array;

public class ArrayPrint {
	
	public static void printArray(int[] a){
		for(int i=0; i< a.length; i++){
			System.out.print(a[i]);
			if(i< a.length-1){
				System.out.print(", ");
			}
			
		}
	} 
	
	public static void reverse(int[] a, int start, int end){
		if(start > end || start < 0 || end < 0 || a == null || a.length == 0 || start > a.length || end > a.length){
			return;
		}else{
			int temp;
			while( start < end){
				temp = a[end];
				a[end] = a[start];
				a[start] = temp;
				start ++;
				end--;
			}
		}
	}
	
	public static int findPivot(int[] a, int start, int end){
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
