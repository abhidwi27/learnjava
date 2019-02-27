package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LearnIo {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		/*char c;
		String str;
		System.out.println("Please enter a String to read...");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Reading input...");
		
		do{
			str = br.readLine();
			System.out.println(str);
		}while(!str.equals("stop"));
		System.out.println("Execution complete...");*/
		int b;
		b= 'A';
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println(b);
	}

}
