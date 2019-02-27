package com.abhi.test;


public class WaitNotify  {
	private volatile static boolean waitFlag = false;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProducerConsumer pc = new ProducerConsumer();
		
		Producer p = new Producer(pc,waitFlag );
		Consumer c = new Consumer(pc,waitFlag);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(10000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Main thread execution completed ...");
	}

	
	
	

}
