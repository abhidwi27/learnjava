package multithreading;

public class LearnMultithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGroup tg = new ThreadGroup("MyGroup");
		MyThread m1 = new MyThread(tg,"firstThread");
		m1.setPriority(10);
		
		m1.start();
		
		MyThread m2 = new MyThread(tg,"secondThread");
		m2.setDaemon(true);
		m2.start();
		
		m2.setPriority(2);
		
		System.out.println("M1 is alive " + m1.isAlive());
		System.out.println("M2 is alive " + m2.isAlive());
		
		try {
			Thread.currentThread().join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
