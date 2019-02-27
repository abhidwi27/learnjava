package array;

public class ArrayLeftRotateReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {1,2,3,4,5,6,7, 8};
		int d = 2;
		//leftrotate(b , d, b.length);
		rightrotate(b , d, b.length);
		ArrayPrint.printArray(b);
	}
	
	
	private static void leftrotate(int[] a, int d, int n){
		if(d > n){
			d = d%n;
		}
		ArrayPrint.reverse(a, 0, d-1);
		ArrayPrint.reverse(a, d, n-1);
		ArrayPrint.reverse(a, 0, n-1);
	}
	
	private static void rightrotate(int[] a, int d, int n){
		if(d > n){
			d = d%n;
		}
		
		ArrayPrint.reverse(a, 0, (n-1)-(d));
		ArrayPrint.reverse(a, n-d, n-1);
		ArrayPrint.reverse(a, 0, n-1);
	}
}
