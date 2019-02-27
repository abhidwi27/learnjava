import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable{
	private BlockingQueue<Integer> bq;
	private AtomicInteger counter;
	private Object lock = new Object();


	@Override
	public void run() {
		produce();
	}
	
	public Producer(BlockingQueue<Integer> bq, AtomicInteger counter){
		this.bq = bq;
		this.counter = counter;
		
				
	}
	
	private void produce(){
		while(true){
			try {
				synchronized(lock){
					System.out.println("Adding object " + counter.get() + " int the queue by thread " + Thread.currentThread().getName() );
					bq.put(counter.getAndIncrement());
				}
				
				
				
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
