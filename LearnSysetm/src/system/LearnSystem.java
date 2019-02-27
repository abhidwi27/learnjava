package system;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LearnSystem {
	
	public static void main(String[] args) {
		
		Map<String,String> m = System.getenv();
		Set<String> keySet = m.keySet();
		
		/*for(String key: keySet){
			System.out.println(key + " = " + m.get(key));
		}*/
		/*System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());*/
		/*System.out.println(System.getenv("MAAVEN_HOME"));
		System.out.println(System.lineSeparator());
		System.out.println("Hello");*/
		
		System.out.println(10 + 20 + "Javatpoint");   
        System.out.println("Javatpoint" + 10 + 20); 
	}

}
