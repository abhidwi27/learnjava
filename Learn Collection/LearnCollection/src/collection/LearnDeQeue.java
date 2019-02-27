package collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class LearnDeQeue {
	
	static ArrayList<Integer> aList = new ArrayList<>();
	static ArrayDeque<Integer> adq = new ArrayDeque<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collections.addAll(aList, 1,2,3,4);
		
		/*for(int i : aList){
			System.out.println(i);
		}*/
		adq.add(1);
		adq.addFirst(5);
		adq.addLast(8);
		
		//System.out.println(adq.getFirst());
		//System.out.println(adq.peek());
		//System.out.println(adq.contains(5));
		adq.offer(10);
		
		//System.out.println(adq.pop());
		//System.out.println(adq.poll());
		adq.push(11);
		System.out.println(adq.getFirst());
		
		
	}

}
