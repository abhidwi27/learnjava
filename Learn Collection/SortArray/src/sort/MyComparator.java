package sort;

import java.util.Comparator;
import java.util.Map.Entry;


public class MyComparator implements Comparator <Entry<String, Integer>  >{

	@Override
	public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
		// TODO Auto-generated method stub
		return e2.getValue() - e1.getValue();
	}

}
