import java.util.ArrayList;
import java.util.List;

public class MyClass {
	
	//private static Integer j = new Integer(10);
	
	
	public static void main(String[] args) {
		/*ArrayList<MyClass> myList = new ArrayList<MyClass>();
		MyClass o1 = new MyClass();
		myList.add(o1);
		System.out.println("Object reference hashcode first o1 " +o1.hashCode());
		//o1 = new MyClass();
		o1 = null;
		//myList.add(o1);
		//System.out.println("Object reference hashcode first o1 " +o1.hashCode());
		
		for(MyClass m: myList){
			System.out.println("Object reference List hashcode " +m.hashCode());
		}*/
		List<Domain> list = new ArrayList<Domain>();    
		//Integer tmp;
		Domain j = new Domain();
		for (int i = 0; i < 1; i++) {
		  j.setFirstName("Abhishek");
		  
		  if(i==2){
			  j.setFirstName("Grisha");
		  }
		  if(i==3){
			  j.setFirstName("Chandana");
		  }
		  list.add(j);
		}
		j.setFirstName(null);
		for(Domain m: list){
			System.out.println("Object reference List hashcode " +m.getFirstName());
		}
	}
	
	private void run(){
		ArrayList<MyClass> myList = new ArrayList<MyClass>();
		MyClass o1 = new MyClass();
		myList.add(o1);
		System.out.println("Object reference hashcode first o1 " +o1.hashCode());
		//o1 = new MyClass();
		o1 = null;
		//myList.add(o1);
		//System.out.println("Object reference hashcode first o1 " +o1.hashCode());
		
		for(MyClass m: myList){
			System.out.println("Object reference List hashcode " +m.hashCode());
		}
	}

}
