
public class QueueYapisi {
	int[] dizi;
	int size;
	int front; // dizinin ilk elemanı
	int rear; // diznin son eleanı
	
	

	void yazdir() { 
	
		for (int i = 0; i<=rear;i++)
		{
			System.out.println("Kuyruktaki " + (i+1) + ".  eleman: " + dizi[i]);
		}
	}
	
	
	
	public QueueYapisi(int size) {

		this.size = size;
		dizi = new int[size]; // kuyruk yapısı
		front = 0;
		rear = -1;
	}

	void enQueue(int data) {
		if (isFull()) {
			System.out.println("Kuyruk dolu");
		} else {
			rear++;
			dizi[rear] = data;
			System.out.println(data + " kuyruga eklendi.");
		}

	}

	private boolean isFull() {

		return rear == size - 1;
	}

	private boolean isEmpty() {

		return rear == -1;
	}
	
	void deQueue() {
		if ( isEmpty() ) 
		{
			System.out.println("Kuyruk bos.");
		} 
		else 
		{
			int sayi = dizi[front];

			for (int i = 1; i <= rear; i++) {

				dizi[i - 1] = dizi[i];
			}
			
			rear--;
			
			System.out.println(sayi + " ELEMANI Kuyruktan eleman cikarildi.");

		}
	}

}
