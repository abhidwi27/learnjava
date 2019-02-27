package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

	static Queue<String> pq = new PriorityQueue<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pq.add("Hari");
		pq.add("Ramesh");
		pq.add("Seeta");
		pq.add("Geeta");
		pq.add("Mahesh");
		pq.add("Suresh");
		pq.add(null);
		/*Iterator<String> it = pq.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
	}
	

}
