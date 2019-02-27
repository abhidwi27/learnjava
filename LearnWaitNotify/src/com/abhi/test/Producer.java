package com.abhi.test;

public class Producer implements Runnable{
	private ProducerConsumer pc;
	private boolean waitFlag;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 
		pc.produces(waitFlag);
	}
	
	public Producer(ProducerConsumer pc, boolean waitFlag){
		this.pc = pc;
		this.waitFlag = waitFlag;
				
	}
	

}
