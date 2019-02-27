package com.abhi.test;

public class ProducerConsumer  {
	
	public volatile int order;
	
	public synchronized void produces(boolean waitFlag){
		for ( int i = 0 ; i < 10 ; i++){
			order++;
			System.out.println("Placed order " + order);
			
			try {
				//while(waitFlag){
				System.out.println("Producer waiting");
				
				wait();
				
				System.out.println("Producer Resuming");
				//}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		waitFlag = true;
	}
	
	public synchronized void consumes(boolean waitFlag){
		
		System.out.println("EnteredConsumer Thread...");
		while(!waitFlag){
			while(order > 0){
				System.out.println("Consuming order " + order);
				order--;
				waitFlag  = true;
				notifyAll();
				//while(waitFlag){
				//waitFlag = false;
				//System.out.println("Consumer waiting");	
				/*try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				
			}
			System.out.println("There are no objects to consume...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	}
