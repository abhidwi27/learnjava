package concurrent;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import collection.Employee;

public class LearnSyncronizedMap {
	static Map<String, Employee > map = (Map<String, Employee>) Collections.synchronizedMap(new HashMap<String, Employee>());
	static Employee e1 = new Employee(2, "Suresh", LocalDate.parse("2006-12-08"));
	static Employee e2 = new Employee(5, "Geeta", LocalDate.parse("2008-12-08"));
	static Employee e3 = new Employee(8, "Seeta", LocalDate.parse("2005-10-08"));
	static Employee e4 = new Employee(9, "Priya", LocalDate.parse("2003-01-08"));
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map.put("Suresh", e1);

	}

}
