package nested;

public class LearnParentChild {

	public static void m1(){
		System.out.println("m1 from Parent");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnParentChild l = new Child();
		l.m1();
	}
	
	/*public void m1(){
		System.out.println("m1 from Parent");
	}*/
}

class Child extends LearnParentChild{
	
	
	public static void m1(){
		System.out.println("m1 from Child");
	}
}
