package nested;

public class PrintSpiralMatrix {
	
	private static int [][] a;
	private static int MAX;
	private static int currentCount = 1;
	private static int leftToRightRowIdx;
	private static int leftToRightStartColIdx;
	private static int leftToRightEndColIdx;
	private static int rightToLeftRowIdx;
	private static int rightToLeftStartColIdx;
	private static int rightToLeftEndColIdx;
	private static int topToBottomColIdx;
	private static int topToBottomStartRowIdx;
	private static int topToBottomEndRowIdx;
	private static int bottomToTopColIdx;
	private static int bottomToTopStartRowIdx;
	private static int bottomToTopEndRowIdx;
	
	
	
	public PrintSpiralMatrix(int n){
		MAX = n*n;
		a = new int[n][n];
		leftToRightRowIdx = 0;
		leftToRightStartColIdx = 0;
		leftToRightEndColIdx = n-1;
		topToBottomColIdx = n-1;
		topToBottomStartRowIdx = 1;
		topToBottomEndRowIdx = n -1;
		rightToLeftRowIdx = n - 1;
		rightToLeftStartColIdx = n - 2;
		rightToLeftEndColIdx = 0;
		bottomToTopColIdx = 0;
		bottomToTopStartRowIdx = n - 2;
		bottomToTopEndRowIdx = 1;
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintSpiralMatrix p = new PrintSpiralMatrix(5);
		
		while( currentCount <= MAX){
			//if(currentCount > MAX) break;
			printHorizantalLeftToRight(leftToRightRowIdx, leftToRightStartColIdx, leftToRightEndColIdx, currentCount);
			//if(currentCount > MAX) break;
			printVerticalTopToBottom(topToBottomColIdx, topToBottomStartRowIdx,topToBottomEndRowIdx, currentCount);
			//if(currentCount > MAX) break;
			printHorizontalRightToLeft(rightToLeftRowIdx, rightToLeftStartColIdx, rightToLeftEndColIdx, currentCount);
			//if(currentCount > MAX) break;
			printVerticalBottomToTop(bottomToTopColIdx, bottomToTopStartRowIdx, bottomToTopEndRowIdx, currentCount);
		}
		
		for(int i=0 ; i <= a.length - 1 ; i ++) {
			for(int j = 0; j<= a.length -1 ; j++){
				System.out.print(a [i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printHorizantalLeftToRight(int leftToRightRowIndex, int leftToRightStartColIndex, int leftToRightEndColIndex, int number){
		for(int col=leftToRightStartColIndex; col<= leftToRightEndColIndex; col++){
			a[leftToRightRowIdx][col] = number;
			number++;
		}
		currentCount = number;
		leftToRightRowIdx = 	leftToRightRowIndex + 1;
		leftToRightStartColIdx = leftToRightStartColIndex + 1;
		leftToRightEndColIdx = leftToRightEndColIndex - 1;
		
		
	}
	
	public static void printVerticalTopToBottom(int topToBottomColIndex, int topToBottomStartRowIndex, int topToBottomEndRowIndex, int number){
		for(int row=topToBottomStartRowIndex; row<= topToBottomEndRowIndex; row++){
			a[row][topToBottomColIndex] = number;
			number++;
		}
		currentCount = number;
		topToBottomColIdx = topToBottomColIndex - 1;
		topToBottomStartRowIdx = topToBottomStartRowIndex + 1;
		topToBottomEndRowIdx = topToBottomEndRowIndex - 1;
		
	}
	
	public static void printHorizontalRightToLeft(int rightToLeftRowIndex, int rightToLeftStartColIndex, int rightToLeftEndColIndex, int number){
		for(int col = rightToLeftStartColIndex; col >= rightToLeftEndColIndex; col -- ){
			a[rightToLeftRowIndex][col] = number;
			number++;
		}
		currentCount = number;
		rightToLeftRowIdx = rightToLeftRowIndex - 1;
		rightToLeftStartColIdx = rightToLeftStartColIndex - 1;
		rightToLeftEndColIdx = rightToLeftEndColIndex + 1;
		
		
	}
	
	public static void printVerticalBottomToTop(int bottomToTopColIndex, int bottomToTopStartRowIndex, int bottomToTopEndRowIndex, int number){
		for( int row = bottomToTopStartRowIndex ; row >= bottomToTopEndRowIndex ; row--){
			a[row][bottomToTopColIndex] = number;
			number++;
		}
		currentCount = number;
		bottomToTopColIdx = bottomToTopColIndex + 1;
		bottomToTopStartRowIdx = bottomToTopStartRowIndex - 1;
		bottomToTopEndRowIdx = bottomToTopEndRowIndex + 1;
		
	}
}
