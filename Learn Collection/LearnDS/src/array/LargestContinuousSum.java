package array;

public class LargestContinuousSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-2, -3, 1, -2, 4, -1, -1, 2, -3, 6, -1, -1, -1, -4, -3, 2, 6};
		
		int oldFromIdx,oldToIdx, oldMaxSum, currentFromIdx, currentToIdx, currentMaxSum, currentSum;
		
		oldFromIdx = oldToIdx =  oldMaxSum =  currentFromIdx = currentToIdx =  currentMaxSum = currentSum = 0;
		for(int i=0; i< a.length; i++){
			if( a[i] > 0  && currentMaxSum == 0 ){				
				currentFromIdx = i;
				currentToIdx = i;
				currentMaxSum = a[i];
				currentSum = a[i];		
				
			}else {
				
				currentSum = currentSum + a[i];
				if( currentSum < 0){				
					currentSum = 0;
					oldFromIdx  = currentFromIdx;
					oldToIdx = currentToIdx;
					oldMaxSum = currentMaxSum;
					currentMaxSum = 0;			
				}else if( currentSum >= currentMaxSum){
					currentToIdx = i;
					currentMaxSum = currentSum;
				}
				
			}
		}
		
		if( currentMaxSum > oldMaxSum){
			System.out.println("Largest block is from index " + currentFromIdx + " to " + " index " + currentToIdx + " = " + currentMaxSum);
		}else{
			System.out.println("Largest block is from index " + oldFromIdx + " to " + " index " + oldToIdx + " = " + oldMaxSum) ;
		}
	}

}
