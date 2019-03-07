package array;

public class ReaaragneOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1, 2, 3, 4, 5, 6, 7} ;
		int j, temp,  minElementIdx, maxElementIdx;
		
		
		minElementIdx = 0;
		
		maxElementIdx = 0;
		for( int i = 1; i< a.length; i++){
			j = i;
			while( j >= 0 ){
			
				if(j%2 == 0){
					if(j >= 2 && a[j] > a[j-2] ){
						temp = a[j-2];
						a[j-2] = a[j];
						a[j] = temp;
						
					}else if( j >= 1 && a[j] > a[j-1]){
						temp = a[j-1];
						a[j-1] = a[j];
						a[j] = temp;
					}
				}else{
					if(j >= 2 && a[j] < a[j-2]){
						temp = a[j-2];
						a[j-2] = a[j];
						a[j] = temp;
						
					}else if( j >= 1 &&  a[j] < a[j-1]){
						temp = a[j-1];
						a[j-1] = a[j];
						a[j] = temp;
					}
				}
				
				j--;
			}
		}
		ArrayUtil.printArray(a);

	}

}
