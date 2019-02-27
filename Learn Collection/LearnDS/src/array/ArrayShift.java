package array;

public class ArrayShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {1,2,3,4,5,6,7};
		
		rotate(b,3,b.length);
		
		for(int i=0; i< b.length; i++){
			System.out.print(b[i]);
			if(i< b.length-1){
				System.out.print(", ");
			}
			
		}
	}
	
	public static void rotate(int[] a, int d,int n){
		
		for(int i=0 ; i<d; i++){
			int temp = a[0];
			for(int j=0; j<a.length-1; j++){				
				a[j] = a[j+1];				
			}
			a[a.length-1] = temp;
		}
	}

}
