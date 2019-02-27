package io;

import java.util.Scanner;

public class CheckScanner {
	
	public static void main(String args[]){
		Scanner scan = new Scanner ( System.in);
		
		//int i = scan.nextInt();
		//Double d = scan.nextDouble();
		String s1  = scan.nextLine();
		double d  = scan.nextDouble();
		String s3  = scan.nextLine();
		//System.out.println("Int is " + i);
		//System.out.println("Doblue is " + d);
		System.out.printf("String is %2s\n",s1);
		System.out.printf("double is %f\n", d);
		System.out.println("String is " + s3);
		scan.close();
	}

}
