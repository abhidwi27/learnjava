package nested;

public class NestedClass {
	
	private int i;
	private int y = 30;
	
	NestedClass (int i){
		this.i = i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedClass o1 = new NestedClass(10);
		NestedClass o2 = new NestedClass(20);
		
		Node<Integer> n1 = new Node<>(10, null, null);
		n1.data = 10;
		
		Node<Integer> n2 = new Node<>(20, null, null);
		n1.next = n2;
		System.out.println(n2.data);
		
		/*NestedClass.InnerClass in1 = o1.new InnerClass();
		NestedClass.InnerClass in2 = o2.new InnerClass();
		
		NestedClass.StaticInnerClass inStatic1 = new NestedClass.StaticInnerClass();
		NestedClass.StaticInnerClass inStatic2 = new NestedClass.StaticInnerClass();*/
		
		/*System.out.println(in1.getOuterClassMember());
		System.out.println(in2.getOuterClassMember());
		
		System.out.println(inStatic1.getOuterClassMember());
		System.out.println(inStatic2.getOuterClassMember());
		*/
		/*System.out.println(inStatic1.j);
		System.out.println(inStatic2.j);*/
		/*Thread t = new Thread(){
			
			public void run(){
				System.out.println("Running from thread");
			}
		};
		
		t.start();
		
		MyInterface m = new MyInterface() {
			
			@Override
			public void secondMethod() {
				System.out.println("printing from secondMethod");
				
			}
			
			@Override
			public void firstmMethod() {
				System.out.println("printing from firstMethod");

			}
		};
		
		m.secondMethod();
		m.firstmMethod();
		
		MyChildInterface mc1 = new MyChildInterface() {
			
			@Override
			public void secondMethod() {
				System.out.println();
				
			}
			
			@Override
			public void firstmMethod() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void thirdMethod() {
				// TODO Auto-generated method stub
				
				
				
				class LocalClass{
					
					void myLocalMethod(){
						System.out.println("Runnning Local Class myLocal Method ");
					}
				}
				
				LocalClass l1= new LocalClass(){
					
					@Override
					void myLocalMethod() {
						System.out.println("Printing override Local Class Method ");
					};
				};
				
				LocalClass l2= new LocalClass();
				
				l1.myLocalMethod();
				l2.myLocalMethod();
			}
			
		
		};
		System.out.println("mc1 Execution starts...");
		mc1.thirdMethod();*/
	}
	
	
	/*class InnerClass{
		
		public int getOuterClassMember(){
			return i;
		}
	}
	
	private static class StaticInnerClass{
		private int j = 10;
		public int getOuterClassMember(){
			
			NestedClass nc = new NestedClass(30);
			
			System.out.println(nc.i);
			
			return nc.i;
			
			
		}
	}*/
	
	private static class Node<E>{
		private E data;
		Node<E> next;
		Node<E> prev;
		
		Node(E data, Node<E> next, Node<E> prev ){
			this.data = data;
			this.prev =prev;
			this.next = next;
		}
	}
}


interface MyInterface{
	void firstmMethod();
	void secondMethod();
}

interface MyChildInterface extends MyInterface{
	void thirdMethod();
	
}