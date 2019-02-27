package array;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {1,2,3,4,5,6,7, 8};
		
		reverse(b);
		
		for(int i=0; i< b.length; i++){
			System.out.print(b[i]);
			if(i< b.length-1){
				System.out.print(", ");
			}
			
		}
	}
	
	public static void reverse(int[] a){
		int mid, temp, len;	
		len = a.length;
		mid = len % 2 ==0 ? len/ 2 : (len- 1) / 2  + 1;
		
		for( int j = 0; j < mid ; j++){
			temp = a[j];
			a[j] = a[len-1-j];
			a[len-1-j] = temp;
		}
	}
}
