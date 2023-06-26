import java.util.Scanner;

public class BagliListe {
	
	Node head = null;
	Node tail = null;
	Node temp = null;
	Node temp2 = null;
	
	int data,index;
	Scanner scan = new Scanner(System.in);
	
	void basaEkle() 
	{
		
		System.out.print("Data: ");
		data = scan.nextInt();
		Node eleman = new Node(data);
		
		if (head == null) 
		{
			head = eleman;
			tail = eleman;
			
			head.next = tail;
			tail.next = head;
			
			head.prev = tail;
			tail.prev = head;
		}
		/*else if (head== tail)
		{
			eleman.next = head;
			head.prev = eleman;
			
			head = eleman;
			
			tail = head.next;
			
			tail.next = head;
			tail.prev = head;
			
		}*/
		else 
		{
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
			tail.next=head;
			head.prev = tail;
			
			
		}
	}
	
	void sonaEkle()
	{
		
		System.out.print("Data: ");
		data = scan.nextInt();
		Node eleman = new Node(data);
		
		if (head == null) 
		{
			head = eleman;
			tail = eleman;
			
			head.next = tail;
			tail.next = head;
			
			head.prev = tail;
			tail.prev = head;
		}
		
		else 
		{
			tail.next = eleman;
			eleman.prev = tail;
			tail = eleman;
			tail.next = head;
			head.prev = tail;
		}
	}
	
	void arayaEkle() 
	{
		System.out.print("Indi: "); index = scan.nextInt();
		
		System.out.print("Data: "); data = scan.nextInt();
		
		Node eleman = new Node(data);
		
		if (head == null) 
		{
			head = eleman;
			tail = eleman;
			
			head.next = tail;
			tail.next = head;
			
			head.prev = tail;
			tail.prev = head;
		}
		
		else if (index == 0)
		{
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
			tail.next=head;
			head.prev = tail;
		}
		else 
		{
			int n = 0;
			temp = head;
			temp2 = temp;
			
			while (temp != tail) {
				temp = temp.next;
				n++;
			}
			temp = head;
			int i = 0;
			while(i < index) {
				temp2 = temp;
				temp = temp.next;
				i++;
			}
			if ( index > n ) {
				tail.next = eleman;
				eleman.prev = tail;
				tail = eleman;
				tail.next = head;
				head.prev = tail;
			}
			else 
			{
				temp2.next = eleman;
				eleman.prev = temp2;
				
				eleman.next = temp;
				temp.prev = eleman;
			}
			
			
		}
	}
	
	void yazdir () 
	{
		if (head == null) {
			System.out.println("Eleman yok.");
		}
		else
		{
			temp = head;
			System.out.print("Tail -> ");
			while(temp != tail) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(temp.data+ " -> head");
		}
	}
	
	void bastanSil()
	{
		if (head == null) {
			System.out.println("Liste bos.");
		}
		else if(head == tail)
		{
			head = null;
			tail = null;
		}
		else
		{
			head = head.next;
			head.prev = tail;
			tail.next = head;
		}
	}
	
	void sondanSil()
	{
		if (head == null) {
			System.out.println("Liste bos.");
		}
		else if(head == tail)
		{
			head = null;
			tail = null;
		}
		else
		{
			tail = tail.prev;
			tail.prev = head;
			head.prev = tail;
		}
	}
	
	void aradanSil()
	{
		if (head == null) {
			System.out.println("Liste bos.");
		}
		else
		{
			System.out.println("index: "); index = scan.nextInt();
			
			if( index == 0 && head == tail)
			{
				head = null;
				tail = null;
			}
			else if (index == 0 && head != tail) 
			{
				head = head.next;
				head.prev = tail;
				tail.next = head;
			}
			else
			{
				int n = 0;
				Node temp = head;
				
				while (temp != tail) {
					n++;
					temp = temp.next;
				}
				
				
				if (index > n) {
					tail = temp.prev;
					tail.next = head;
					head.prev = tail;
				}
				else
				{
					temp = head;
					temp2 = head;
					int i = 0;
					while(i < index) {
						i++;
						temp2 = temp;
						temp = temp.next;
					}
					
					temp2.next = temp.next;
					temp.next.prev = temp2;
					
				}
			}
		}
	}
}
