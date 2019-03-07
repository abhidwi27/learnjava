package array;

public class ArraySunPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =29;
		int[] b = {10, 12, 15, 17, 1, 2};
		
		
		int pivot = ArrayUtil.findPivot(b, 0, b.length);
		
		
		
		int calculatedSum = b[pivot+1] + b[pivot];
		int min = pivot+1;
		int max = pivot;
		while(  min != max){
			if(calculatedSum == sum){
				System.out.println("There exists a pair");
				break;
			}
			if( calculatedSum > sum){
				
				max = max -1;
				if(max < 0){
					max = b.length;
				}
				
				calculatedSum = b[min] + b[max];
			}else if(calculatedSum < sum){
				min = (min + 1) % b.length;
				calculatedSum = b[min] + b[max];
			}
				
			
		}
		
		if(calculatedSum != sum){
			System.out.println("There doesn't exist a pair");
		}
	}

}
