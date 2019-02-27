package multithreading;

import java.util.Queue;

public class Consumer implements Runnable{
	
	private Queue<Integer> q;
	Consumer(Queue<Integer> q){
		this.q = q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		consume();
	}
	
	private void consume(){
		while(true){
			if ( q.size() > 0) {
				
				System.out.println("Consumer consumed " + q.poll() );
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				System.out.println("Queue is Empty..");
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
