package test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareList {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		List a = new ArrayList<Integer>();
		List b = new ArrayList<Integer>();
		List c = new ArrayList<String>();
		List d = new ArrayList<String>();
		List e = new ArrayList<Person>();
		List f = new ArrayList<Person>();
		a.add(1);
		a.add(2);
		a.add(3);
		b.add(1);
		b.add(3);
		b.add(2);
		c.add("hello");
		c.add("world");
		d.add("world");
		d.add("hello");

		Collections.sort(a);
		Collections.sort(b);
		e.add(new Person("Hari", 30));
		e.add(new Person("Mohan", 45));
		f.add(new Person("Hari", 30));
		f.add(new Person("Mohan", 45));

		System.out.println("A Equals B is " + a.equals(b));
		System.out.println("C Equals D is " + c.equals(d));
		System.out.println("E Equals F is " + e.equals(f));

	}

}


