package backtrack;

import java.util.ArrayList;
import java.util.LinkedList;

public class BackTrack {
	
	static ArrayList<Integer> al = new ArrayList<>();
	LinkedList<Integer> l = new LinkedList<>();
	static int [] a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = new int[5];
		printString(5, 3);
	}
	
	static void printString(int n){
		if ( n < 1) {
			for(int c =0 ; c<a.length; c++){
				System.out.print(a[c]);
			}
			System.out.println();
		}else{
			a[n-1] = 0;
			printString(n-1);
			a[n-1] = 1;
			printString(n-1);
		}
	}
	
	static void printString(int n, int k){
		if ( n < 1) {
			for(int c =0 ; c<a.length; c++){
				System.out.print(a[c]);
		}
			System.out.println();
		}else{
			for( int j=0 ; j< k ; j++){
				a[n-1] = j;
				printString(n-1,k);
			}
			}
		}
	

}
