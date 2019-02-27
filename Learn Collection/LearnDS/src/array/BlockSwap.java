package array;

public class BlockSwap {
	
	static boolean isRotated = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 2;
		
		int[] b = {1,2,3,4,5,6,7, 8};
		int n = b.length; 
		rotate(b, d, n);
		
		
		for(int i=0; i< b.length; i++){
			System.out.print(b[i]);
			if(i< b.length-1){
				System.out.print(", ");
			}
			
		}
	}
	
	public static void swap(int [] s , int sourceStartIndex, int destStartIndex, int count){
		int temp;
		for(int i=0; i<count; i++){
			temp = s[destStartIndex];
			s[destStartIndex] = s[sourceStartIndex];
			s[sourceStartIndex] = temp;
			sourceStartIndex++;
			destStartIndex++;
		}
		
	}	
	
	
	private static void rotate(int b[], int d, int n){
		while (!isRotated){
			if( d < n-d){
				swap(b, 0, n-d, d);
				for(int i=0; i< b.length; i++){
					System.out.print(b[i]);
					if(i< b.length-1){
						System.out.print(", ");
					}
					
				}
				System.out.println();
				rotate(b, d, n-d );
			}else if( d > n-d){
				swap(b, (int) 2*d-n, d, n-d );
				for(int i=0; i< b.length; i++){
					System.out.print(b[i]);
					if(i< b.length-1){
						System.out.print(", ");
					}
					
				}
				System.out.println();
				rotate(b, (int) 2*d-n, d);
			}else{
				swap(b, 0, d, n-d);
				for(int i=0; i< b.length; i++){
					System.out.print(b[i]);
					if(i< b.length-1){
						System.out.print(", ");
					}
					
				}
				System.out.println();
				isRotated = true;
			}
		}
	}

}
