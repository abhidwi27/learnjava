package collection;

public class MyQueueTest {
	
	static MyQueue<String> m = new MyQueue<>();
	public static void main(String[] args) throws MyQueueException {
		// TODO Auto-generated method stub
		/*m.add("Abhishek");
		m.add("Grisha");
		m.add("Chandana");*/
		//m.add(1);
		
		System.out.println(m.remove());
		System.out.println(m.poll());
		System.out.println(m.poll());
		System.out.println(m.poll());

	}

}
