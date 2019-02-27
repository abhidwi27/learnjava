import java.util.Collection;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorEx {
	
	public static BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(1024);
	public static AtomicInteger counter = new AtomicInteger(0);
	
	
	
	public static void main(String[] args) {
		
		Producer p = new Producer(bq, counter);
		Consumer c = new Consumer(bq);
		
		ExecutorService ex  = Executors.newFixedThreadPool(2);
		
		ex.submit(p);
		ex.submit(c);
		
		
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
