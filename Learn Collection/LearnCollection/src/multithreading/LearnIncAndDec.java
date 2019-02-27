package multithreading;

public class LearnIncAndDec {
	
	static int  i = 0;
	static int sum = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Thread t1 = new Thread( new Runnable(){
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					if( i == 100){
						System.out.println(sum);
						break;
					}
					else
						sum = sum + i;
						i++;
				/*try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				}
			}
		}, "first");
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true)
				if( i == 100){
					System.out.println(sum);
					break;
				}
				else
					sum = sum + i;
					i++;
					/*try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
					
			}
			
		}, "second" );
		
		
		t1.start();
		t1.setPriority(5);
		t2.start();
		t2.setPriority(5);

	}

}
