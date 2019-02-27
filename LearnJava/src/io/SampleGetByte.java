package io;

import java.io.UnsupportedEncodingException;

public class SampleGetByte {
	
	public static void main(String args[]) throws UnsupportedEncodingException{
		String a = "Hello";
		byte b[] = a.getBytes("UTF-8");
		
		for (int i=0 ; i< b.length ; i++){
			System.out.println(b[i]);
		}
	}

}
