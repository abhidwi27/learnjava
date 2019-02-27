package collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;

public class LearnLinkedHashMap {
	static LinkedHashMap<String, Employee> lmap = new LinkedHashMap<>();
	static Employee e1 = new Employee(2, "Suresh", LocalDate.parse("2006-12-08"));
	static Employee e2 = new Employee(5, "Geeta", LocalDate.parse("2008-12-08"));
	static Employee e3 = new Employee(8, "Seeta", LocalDate.parse("2005-10-08"));
	static Employee e4 = new Employee(9, "Priya", LocalDate.parse("2003-01-08"));
	static Employee e5 = new Employee(10, "Subodh", LocalDate.parse("2003-01-08"));
	Hashtable<Integer, String> ht = new Hashtable<>();
	
	static List<Employee> empList2 = new ArrayList<>(Arrays.asList(new Employee(1, "Ramesh", LocalDate.parse("2002-05-16")), 			 
			new Employee(3, "Mohan", LocalDate.parse("2000-03-01")),
			new Employee(2, "Suresh", LocalDate.parse("2006-12-08"))
			));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lmap.put("Suresh", e1);
		lmap.put("Geeta", e2);
		lmap.put("Seeta", e3);
		
		//System.out.println(lmap);
		System.out.println(1<<4);

	}

}
