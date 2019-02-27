package com.abhi.learn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyUtility {

	private static File file = new File("C:\\Sample.log");
	private static FileWriter fw;
	
	public static FileWriter getInstance(){
		if(fw == null){
			synchronized(MyUtility.class){
			try {
				if(fw == null){
				fw =  new FileWriter(file, true);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		return fw;
	}
}
