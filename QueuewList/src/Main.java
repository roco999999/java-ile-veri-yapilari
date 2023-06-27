
public class Main {

	public static void main(String[] args) {
		
		QueueYapisi queue = new QueueYapisi(5);
		
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		
	
		queue.deQueue();
		
		queue.yazdir();
	}

}
