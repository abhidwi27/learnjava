package collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LearnCopyOnWtireArrayList {

	static CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		l.add("Hari");
		l.add("Ramesh");
		l.add("Seeta");
		l.add("Geeta");
		l.add(null);
		l.add(null);
		
		Iterator<String> it = l.iterator();
		System.out.println(l);
		/*while(it.hasNext()){
			String emp = it.next();
			if(l.indexOf(emp) == l.size() -1 ){
			System.out.println(l.add("Mahesh"));
			System.out.println(l.add("Suresh"));
			}
		}
		System.out.println(l);*/
		
	}

}
