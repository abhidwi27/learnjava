package collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class LearnList {
	
	static List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(1, "Ramesh", LocalDate.parse("2002-05-16")), 
								new Employee(2, "Suresh", LocalDate.parse("2006-12-08")), 
								new Employee(3, "Mohan", LocalDate.parse("2000-03-01"))
								));
	
	static Employee e1 = new Employee(2, "Suresh", LocalDate.parse("2006-12-08"));
	static Employee e2 = new Employee(5, "Geeta", LocalDate.parse("2008-12-08"));
	static Employee e3 = new Employee(8, "Seeta", LocalDate.parse("2005-10-08"));
	static Employee e4 = new Employee(9, "Priya", LocalDate.parse("2003-01-08"));
	
	static List<Employee> miniEmpList = new ArrayList<>(Arrays.asList(new Employee(10, "Radha", LocalDate.parse("2001-02-16")), 
											new Employee(11, "Hari", LocalDate.parse("2004-04-07")
												)));
	
	static List<Employee> empList2 = new ArrayList<>(Arrays.asList(new Employee(1, "Ramesh", LocalDate.parse("2002-05-16")), 			 
			new Employee(3, "Mohan", LocalDate.parse("2000-03-01")),
			new Employee(2, "Suresh", LocalDate.parse("2006-12-08"))
			));

	
	public static void main(String[] args) {
		
		
		empList.add(e2);
		empList.add(1, e3);
		empList.addAll(2, miniEmpList);
		empList.add(0, null);
		empList.add(e1);
		//System.out.println(empList.containsAll(miniEmpList));
		//empList.clear();
		//System.out.println();
		empList2.add(e2);
		empList2.add(1, e3);
		empList2.addAll(2, miniEmpList);
		empList2.add(0, null);
		//System.out.println(empList.equals(empList2));
		//System.out.println(empList.get(1));
		//System.out.println(empList.hashCode());
		//System.out.println(empList.indexOf(e3));
		//System.out.println(empList.isEmpty());
		Iterator<Employee> it = empList.iterator();
		//System.out.println(it.next());
		/*System.out.println(empList);
		while(it.hasNext()){
			//System.out.println(it.next());
			if(empList.indexOf(it.next()) == 2){
				it.remove();
			}
			System.out.println(it.next());
			
		}*/
		
		//System.out.println(empList.lastIndexOf(e1));
		//ListIterator<Employee> li = empList.listIterator();
		//System.out.println(li.cursor);
		//System.out.println(li.next());
		//System.out.println(empList);
		//li.set(e4);
		//System.out.println(empList);
		//System.out.println(li.previousIndex());
		
		//System.out.println(li.nextIndex());
		//ListIterator<Employee> li2 = empList.listIterator(2);
		//System.out.println(li2.next());
		//System.out.println(empList2);
		//empList2.remove(2);
		//System.out.println(empList2);
		/*empList2.replaceAll(e -> {
			if( e != null )
			e.setName("Unary");
			return e; 
		});
		System.out.println(empList2);*/
		//empList2.retainAll(miniEmpList);
		//System.out.println(empList2);
		//System.out.println(empList);
		empList.sort((a, b) -> {
			if( a!=null && b!=null)
			return a.getid() - b.getid();
			else return -1;
		});
		//System.out.println(empList);
		
		/*Object [] eArr = empList.toArray();
		for(int i=0; i < eArr.length; i++){
			System.out.println(eArr[i]);
		}*/
		Employee[] eArr1 = new Employee[10];
		
		eArr1[0] = new Employee(-1, "firstval", LocalDate.parse("2000-03-01"));
		
		/*Object [] eArr = empList.toArray(eArr1);
		for(int i=0; i < eArr.length; i++){
			System.out.println(eArr[i]);
		}*/
		
		Spliterator<Employee> si1 = empList.spliterator();
		
		Spliterator<Employee> str = empList.stream().spliterator();
		
		Spliterator<Employee> si2 = si1.trySplit();
		//si.forEachRemaining(System.out::println);
		
		/*if(si2 != null){
			System.out.println("Printing y si2");
			si2.forEachRemaining(System.out::println);
		}
		System.out.println("Printing y si1");
		si1.forEachRemaining(System.out::println);*/
		//System.out.println(empList.length());
		
	}


}


class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getid() - o2.getid();
	}
	
}