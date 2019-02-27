package com.abhi.learn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;


public class MyAnotherThread extends Thread{
	private static FileWriter fileWriter = null;
	//private static PrintStream o = null;
	//private static File myFile = new File("C:\\sample.log");
	//private static PrintStream console = System.out;
	static class logger{
		
		public static void debug(String message){
			synchronized(logger.class){
		 try {
			 File myFile = new File("C:\\sample.log");
			// o = new PrintStream(myFile);
			 //System.setOut(o);
			fileWriter  = new FileWriter(myFile, true);
			fileWriter.write(message);
			fileWriter.write("\r\n");
			fileWriter.flush();
			fileWriter.close();
			// System.out.append(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		}
	}
	
	@Override
	public void run(){
		try {
			//FileWriter fw = MyUtility.getInstance();
			logger.debug("This is from My Another thread");
			//fw.write("\n");
			//fw.flush();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Running Thread Name " + Thread.currentThread().getId());
		
	}
}
