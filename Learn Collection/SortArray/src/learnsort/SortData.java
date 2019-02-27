package learnsort;

public class SortData {

	public static int[] a = { -1, -3, 6, 8, -1, 4, 8 , 0 , 9, 10, 34, -1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a = sort(a);
		for(int i = 0 ; i < a.length ; i++){
		System.out.println(a[i]);
		}
		
	}
	
	public static  int[]  sort(int[] a){
		int len = a.length;
		int[] temp = new int[len];
		int lastIndex = 0;
		for( int k=0 ; k < len ; k++){
			if( k== 0 ){
				temp[k] = a[k];
				lastIndex= k;
			}else if( a[k] >= temp[lastIndex]){
				temp[lastIndex + 1] = a[k];
				lastIndex++;
				
			}else{
				for ( int j = lastIndex ; j >= 0 ; j--){
					if( ( a[k] > temp[j] ) && j!=0 ){
						temp = shiftarray(temp, j, len, lastIndex);
						temp[j+1] = a[k];
						lastIndex++;
						break;
					}else if ( j == 0){
						temp = shiftarray(temp, 0, len, lastIndex);
						temp[0] = a[k];
						lastIndex++;
					}
				}
			}
			
		}
		return temp;
	}
	
	static int[] shiftarray(int[] arr, int fromIndex, int arrLength, int lastIndex){
		int[] temp = arr;
		int minIndex;
		if(fromIndex == 0){
			minIndex = -1;
		}else{
			minIndex = fromIndex;
		}
		for(int l = lastIndex ; l > minIndex ; l -- ){
			temp[l + 1] = temp[l];
		}
		return temp;
	}
	
	

}
