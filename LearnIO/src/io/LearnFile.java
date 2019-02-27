package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin;
		File f = new File("C:\\sample.log");
		fin = new FileInputStream(f);
		BufferedReader br = new BufferedReader(new FileReader(f));
		String str;
		while( (str = br.readLine()) != null){
			System.out.println(str);
		}
	}

}
