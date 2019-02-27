package  com.abhi.learn;


public class MyThreadMain {
	
	public static void main(String args[]){
		
			MyThread t1 = new MyThread();
			MyAnotherThread t2 = new MyAnotherThread();
			t1.start();
			t2.start();
			try {
				//t1.join();
				//t2.join();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
	}
}