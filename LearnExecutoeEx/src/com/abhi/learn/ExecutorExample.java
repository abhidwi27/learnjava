package com.abhi.learn;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
	
	public static void main(String[] args) {
		
		ExecutorService ex = Executors.newFixedThreadPool(3);
		
		Runnable task = () -> {
			
				System.out.println("This is printed by " + Thread.currentThread().getName());
			
		};	
		
		ex.execute(() -> {
			System.out.println("This is printed by " + Thread.currentThread().getName());
		});
		
		ex.execute(() -> {
			System.out.println("This is printed by " + Thread.currentThread().getName());
		});
		
		ex.execute(task);
		
		
	}

}
