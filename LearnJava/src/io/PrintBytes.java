package io;

public class PrintBytes {
	
	public static void main(String args[]){
		byte b[] = {'H', 'E'};
		Byte[] byteObject = new Byte[b.length];
		Byte bt ;
		//int i=0;
		for ( int i= 0; i< b.length ; i++){
			//byteObject[i] = b[i];
			 bt = b[i];
			System.out.println(Integer.toBinaryString(bt));
		}
	}

}
