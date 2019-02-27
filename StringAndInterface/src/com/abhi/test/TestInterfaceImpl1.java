package com.abhi.test;

public class TestInterfaceImpl1 implements test {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("It is starting...");
		
		System.out.println("i in impl is" + i);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("It is initializing...");
	}

	

}
