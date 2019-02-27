package multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PCImpl {

	public static void main(String[] args) {
		int i = 0;
		// TODO Auto-generated method stub
		ProducerConsumer pc = new ProducerConsumer(i);
		
	
		/*Thread t1 = new Thread( () -> pc.produce());
		Thread t2 = new Thread( () -> pc.consume());
		t1.start();
		t2.start();*/
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		ex.execute(() -> pc.produce());
		ex.execute(() -> pc.consume());
		//System.out.println(i);
		
		while(true){
		if ( !ex.isShutdown()){
			try {
				ex.shutdown();
				boolean status = ex.awaitTermination(30, TimeUnit.SECONDS);
				System.out.println("status " + status);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Shutting down now...");
			
			break;
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
		
	}

}
