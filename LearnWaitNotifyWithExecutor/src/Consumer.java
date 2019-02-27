import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	private BlockingQueue<Integer> bq;
	
	
	@Override
	public void run() {
		consume();
	}
	
	public Consumer(BlockingQueue<Integer> bq){
		this.bq = bq;
		
				
	}
	
	private void consume(){
		try {
			while(true){
				if(!bq.isEmpty()){
					System.out.println("Taking object from queue " + bq.take() + " by " + Thread.currentThread().getName());
					
				}else{
					System.out.println("Queue is empty...");
				}
				Thread.sleep(100);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
