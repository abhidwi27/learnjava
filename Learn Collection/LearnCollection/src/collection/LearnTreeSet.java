package collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
	

	static TreeSet<Employee> t = new TreeSet<Employee>();
	static Employee e1 = new Employee(2, "Suresh", LocalDate.parse("2006-12-08"));
	static Employee e2 = new Employee(5, "Geeta", LocalDate.parse("2008-12-08"));
	static Employee e3 = new Employee(8, "Seeta", LocalDate.parse("2005-10-08"));
	static Employee e4 = new Employee(9, "Priya", LocalDate.parse("2003-01-08"));
	static Employee e5 = new Employee(10, "Subodh", LocalDate.parse("2003-01-08"));
	
	static List<Employee> empList2 = new ArrayList<>(Arrays.asList(new Employee(1, "Ramesh", LocalDate.parse("2002-05-16")), 			 
			new Employee(3, "Mohan", LocalDate.parse("2000-03-01")),
			new Employee(2, "Suresh", LocalDate.parse("2006-12-08"))
			));
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e1);
		/*System.out.println(t);
		System.out.println(t.ceiling(e5));
		System.out.println(t.floor(e5));
		System.out.println(t.higher(e5));
		System.out.println(t.lower(e5));
		System.out.println(t.pollFirst());
		System.out.println(t.last());*/
		t.addAll(empList2);
		System.out.println(t);
	
		
	}

}
