package collection;

public class MyLinkdeListImpl {
	
	static MyLinkedList<String> m = new MyLinkedList<>(); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m.add("Abhishek");
		m.add("Grish");
		
		System.out.println(m.get(0));
		System.out.println(m.get(1));
		System.out.println(m.get(2));
	}

}
