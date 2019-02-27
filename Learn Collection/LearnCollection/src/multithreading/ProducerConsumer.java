package multithreading;

public class ProducerConsumer {

	private int i;
	private int sum;

	ProducerConsumer(int i) {
		this.i = i;
	}

	public void produce() {
		while (i <= 1000) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum " + sum);
		/*
		 * System.out.println("Entering Producer"); while(true){ if( i <= 5)
		 * System.out.println("Producer increased to " + (++i)) ;
		 */
		/*
		 * try { Thread.sleep(50); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		// }

	}

	public void consume() {
		System.out.println("Entering Consumer");
		while (i <= 1000)
			sum = sum + i;
		i++;
		System.out.println("sum = " + sum);
		/*
		 * while(true){ if( i > 0 ) System.out.println("Consumer decreased to "
		 * + (--i) ) ;
		 */

		/*
		 * try { Thread.sleep(50); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		// }
	}

}
