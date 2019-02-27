package collection;

import java.util.ArrayList;
import java.util.List;


public class BatchExample {

	static Batch b = new Batch();
	static List<Object> list = new ArrayList<>(); 
	
	public static void main(String[] args) {
	
		b.addStudent("Abhishek", 1);
		b.addStudent("Chandna", 2);
		
		list = (List<Object>) b.getStudents();
		
		for(Object ob : list){
			System.out.println(ob);
		}
	}

}
