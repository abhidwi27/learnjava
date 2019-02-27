package com.abhi.learn;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i = 10;
			
			List<Integer> list = Arrays.asList(1,2,3,4,5,6);
			
			Callable<Integer> task = () -> list.stream().filter( (n) -> (n%2==0) ).mapToInt( (n) -> n.intValue()).sum(); 
			
			ExecutorService ex = Executors.newFixedThreadPool(3);
			
			Future<Integer> fu1 = ex.submit(() -> {
				return i*2;
				}
			);
			
			Future<Integer> fu2 = ex.submit(() -> {
				return i*3;
				}
			);
			
			Future<Integer> fu3 = ex.submit(task);
			try {
				System.out.println(fu1.get());
				System.out.println(fu2.get());
				System.out.println(fu3.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
