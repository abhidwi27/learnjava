package privatefinalstatic;

public class LearnPrivateFinalStatic {
	private static int i = 10;
	private int a = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnPrivateFinalStatic l = new LearnPrivateFinalStatic();
		l.mul(l);
	}
	
	public static void main(String[] args, Integer[] n){
		
	}
	
	public static void sum(Integer n){
		
	}
	
	public static void sum(Integer n, Double d){
		
	}
	
	public  void divide(LearnPrivateFinalStatic l){
		mul(l);
	}
	
	private int sum(){
		return 10;
	}
	
	private static void mul(LearnPrivateFinalStatic l){
		System.out.println(i);
	}
	
	/*private void mul(LearnPrivateFinalStatic l){
		System.out.println(l.a);
	}*/

}
