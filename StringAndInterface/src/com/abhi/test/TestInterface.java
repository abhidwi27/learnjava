package com.abhi.test;

public class TestInterface {

	public static void main(String[] args) {
		TestInterfaceImpl1 t = new TestInterfaceImpl1();
		t.init();
		System.out.println("I in T is " + t.i);
		t.start();
		test.end();
		
		String s1 = "Hello";
		
		System.out.println("S1 first is " + s1);
		
		s1 = s1 + "world";
		
		String s2 = s1 + "world";
		
		System.out.println("S1 second is " + s1);
		System.out.println("S1 second is " + s2);
		
		
		String s3 = new String("new");
		
		System.out.println("S3 before is " + s3);
		System.out.println("S3 before is " + s3.hashCode());
		s3 = s3 + " string";
		String s4 = s3;
		System.out.println("S3 after is " + s3.hashCode());
		System.out.println("S4 after is " + s4.hashCode());
	}
}
