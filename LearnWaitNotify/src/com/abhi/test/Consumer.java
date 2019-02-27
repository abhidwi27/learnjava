package com.abhi.test;

public class Consumer implements Runnable{
	private ProducerConsumer pc;
	private boolean waitFlag;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//ProducerConsumer pc = new ProducerConsumer();
		pc.consumes(waitFlag);
	}
	
	public Consumer(ProducerConsumer pc, boolean waitFlag){
		this.pc = pc;
		this.waitFlag = waitFlag;
				
	}

}
