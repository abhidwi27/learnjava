package array;

public class ArrayReAggrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-1, -1, 7, -1, -1, -1, 2, 1, 4, -1};
		
		/*for(int i=0; i< a.length ; i++){
			for(int j=0; j< a.length; j++){
				if(a[i] != i && !(a[i] == -1)){
					int temp = a[a[i]];
					a[a[i]] = a[i];
					a[i] = temp;
				}
			}
		}
		*/
		
		//int [] b = new int[a.length];
		
		/*for(int i = 0;  i< a.length; i++){
			
			if(a[i] != -1 && b[a[i]] !=a[i]){
				b[a[i]] = a[i];
			}	
			if(b[i] != i & i!=0){
				b[i] = -1;
			}
		}*/
		int count = 0;
		for (int i = 0; i < arr.length;) { 
			count++;
			System.out.println("i= " + i + " count= " + count);
			
			if (arr[i] >= 0 && arr[i] != i) { 
				int ele = arr[arr[i]]; 
				arr[arr[i]] = arr[i]; 
				arr[i] = ele; 
				
			} else { 
				i++; 
				
			} 
			
		} 
		System.out.println("Count is " + count);
		ArrayPrint.printArray(arr);
	}

}
