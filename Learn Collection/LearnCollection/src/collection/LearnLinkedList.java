package collection;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;

public class LearnLinkedList {

	static LinkedList<Employee> l = new LinkedList<Employee>();
	static Employee e1 = new Employee(2, "Suresh", LocalDate.parse("2006-12-08"));
	static Employee e2 = new Employee(5, "Geeta", LocalDate.parse("2008-12-08"));
	static Employee e3 = new Employee(8, "Seeta", LocalDate.parse("2005-10-08"));
	static Employee e4 = new Employee(9, "Priya", LocalDate.parse("2003-01-08"));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e1);
		
		//l.removeFirstOccurrence(e1);
		//System.out.println(l);
		//l.removeLastOccurrence(e1);
		
		
		l.offer(new Employee(3, "Mohan", LocalDate.parse("2000-03-01")));
		//l.remove();
		/*System.out.println(l);
		
		
		Iterator<Employee> it = l.descendingIterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		System.out.println(l.get(6));
	}

}
