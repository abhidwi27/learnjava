package collection;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class LearnHashSet {
	
	static Set<Employee> s = new HashSet<Employee>();
	static Employee e1 = new Employee(2, "Suresh", LocalDate.parse("2006-12-08"));
	static Employee e2 = new Employee(5, "Geeta", LocalDate.parse("2008-12-08"));
	static Employee e3 = new Employee(8, "Seeta", LocalDate.parse("2005-10-08"));
	static Employee e4 = new Employee(9, "Priya", LocalDate.parse("2003-01-08"));
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s.add(e1);
		s.add(e2);
		s.add(e3);
		System.out.println(s);
		s.add(e1);
		System.out.println(s);
		
		Iterator<Employee> it = s.iterator();
		
		while(it.hasNext()){
			if(it.next().getid() == 2)
			it.remove();
			System.out.println(it.next());
		}

	}

}
