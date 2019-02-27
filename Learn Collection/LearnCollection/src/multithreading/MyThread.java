package multithreading;

public class MyThread extends Thread{
	
	//public MyThread m = new MyThread();
	
	MyThread(ThreadGroup group, String name){
		super(group, name);
	}
	public void run(){
		
		m();
		
		
	}
	private void m(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Printed by " + Thread.currentThread().getName());
		System.out.println("Thread Group name " +  this.getThreadGroup().getName());
		System.out.println("Thread Priority " +  this.getPriority() );
		System.out.println("Thread Id " +  this.getId() );
	}
}
