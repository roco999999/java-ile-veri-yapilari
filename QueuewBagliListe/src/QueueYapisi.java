import java.util.Scanner;

public class QueueYapisi {

	Scanner scan = new Scanner(System.in);

	Node front;
	Node rear;
	int size;
	int counter = 0;

	public QueueYapisi(int size) {
		front = null;
		rear = null;
		this.size = size;
	}

	void yazdir() {

		if (isEmpty()) {
			System.out.println("Kuyruk bos.");
		} else {
			Node temp = front;
			System.out.print("kuyrugun basi || ");
			while (temp != rear) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(temp.data + " -> null || kuyrugun sonu.");

		}

	}

	void elemanSayisi() {
		
		System.out.println("Kuyruktaki eleman sayisi: "+counter);
		
	}
	
	void enQueue() {
		if (isFull()) {
			System.out.println("Kuyruk dolu.");
		} else {
			int data;

			System.out.println("Qeueu ya eklenecek eleman: ");
			data = scan.nextInt();

			Node eleman = new Node(data);

			if (isEmpty()) {
				front = eleman;
				rear = eleman;
				System.out.println(data + "datasi kuyruga eklendi ilk eleman olarak.");
			} else {
				rear.next = eleman;
				rear = rear.next;
				rear.next = null;
			}
			counter++;
		}
	}

	void deQueue() {
		if (isEmpty()) {
			System.out.println("Kuyruk bos silinecek eleman yok.");
		} else {
			if (rear == front) {
				rear = null;
				front = null;
			} else {
				System.out.println(front.data + " Silindi.");
				front = front.next;
			}
			counter--;
		}

	}

	private boolean isEmpty() {

		return (counter == 0);
	}

	private boolean isFull() {

		return (counter == size);
	}

}
