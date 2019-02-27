package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringSort {
	
	static public List<String> l = new ArrayList<>();
	static public Map<String, Integer> m = new HashMap<>();
	static public Comparator<Entry<String, Integer>> comp = new MyComparator();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		l.add("Abhishek");
		l.add("Supreeth");
		l.add("Chandana");
		
		
		for(String s : l){
			char[] temp;
			temp = s.toCharArray();
			for( int i = 0; i<temp.length; i++){
				if(m.containsKey(Character.toString(temp[i]).toUpperCase())){
					int count = m.get(Character.toString(temp[i]).toUpperCase());
					m.put(Character.toString(temp[i]).toUpperCase(), count+1);
				}else{
					m.put(Character.toString(temp[i]).toUpperCase(), 1);
				}
				
			}
		}
		
		Set<Entry<String, Integer>> s = m.entrySet();
		List<Entry<String, Integer>>l2 = new ArrayList<Entry<String, Integer>>(s);
		Collections.sort(l2, comp);
		
		for(Entry<String, Integer> e : l2){
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
