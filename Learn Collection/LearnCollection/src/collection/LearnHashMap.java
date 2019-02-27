package collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class LearnHashMap {
	static List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(1, "Ramesh", LocalDate.parse("2002-05-16")), 
			new Employee(2, "Suresh", LocalDate.parse("2006-12-08")), 
			new Employee(3, "Mohan", LocalDate.parse("2000-03-01"))
			));

static Employee e1 = new Employee(2, "Suresh", LocalDate.parse("2006-12-08"));
static Employee e2 = new Employee(5, "Geeta", LocalDate.parse("2008-12-08"));
static Employee e3 = new Employee(8, "Seeta", LocalDate.parse("2005-10-08"));
static Employee e4 = new Employee(9, "Priya", LocalDate.parse("2003-01-08"));

static HashMap<String, Employee> map = new HashMap<>();
static HashMap<String, Employee> map2 = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map.put("Suresh" , e1);
		map.put("Geeta", e2);
		map.put("Seeta", e3);
		//System.out.println(map.put("Geeta", null));
		//System.out.println(map.put("Geeta", e4));
		
		System.out.println(map.replace("Geeta", e4));
		//System.out.println(map);
		Collection<Employee> c = map.values();
		
		for(Employee e : c){
			System.out.println(e.getName());
		}
	}

}
