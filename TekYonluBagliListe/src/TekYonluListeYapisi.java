
public class TekYonluListeYapisi {
	
	Node head = null;
	Node tail = null;
	
	
	void aradanSil(int index) {
		if (head == null) {
			System.out.println("Liste boş, silinecek eleman yok.");
		}
		else if (head.next == null && index == 0) {
			head = null;
			tail = null;
			System.out.println("Listedeki son eleman da silindi.");
		}
		else if (head.next != null && index == 0) {
			head = head.next;
			System.out.println("Bastaki eleman silindi.");
		}
		else
		{
			int i = 0;
			Node temp = head;
			Node temp2 = head;
			while(temp != null) {
				i++;
				temp2 = temp;
				temp = temp.next;
			}
			if (i == index) {
				temp2.next = null;
				tail = temp2;
			}
			else
			{
				temp = head;
				temp2 = head;
				
				int j = 0;
				while(j != index) {
					
					j++;
					temp2 = temp;
					temp = temp.next;
				}
				
				temp2.next = temp.next;
				System.out.println(index + ". eleman silindi.");
				
			
			
			}
			
			
			
		}
		
	}
	
	void bastanSil () {
		if (head == null) {
			System.out.println("Silinecek nesne yok.");
		}
		else if (head.next == null) {
			head = null;
			tail = null;
			System.out.println("Kalan son eleman da silindi.");
		}
		else
		{
			head = head.next;
		}
	}
	
	void sondanSil () {
		if (head == null) {
			System.out.println("Silinecek nesne yok.");
		}
		else if (head.next == null) {
			head = null;
			tail = null;
			System.out.println("Kalan son eleman da silindi.");
		}
		else
		{
			Node temp = head;
			Node temp2 = head;
			
			while(temp.next != null) {
				
				temp2 = temp;
				temp = temp.next;
				
			}
			temp2.next = null;
			tail = temp2;
			
			System.out.println("Sondan eleman silindi.");
			
		}
	}
		
	void yazdir() {
		if (head == null) {
			System.out.println("Liste henuz bos.");
		}
		
		else {
			
			Node temp = new Node();
			temp = head;
			while(temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println("son");
			
		}
	}
	
	void arayaElemanEkle (int index, int x) {
		Node eleman = new Node();
		eleman.data = x;
		
		if(head == null && index == 0) {
			
			eleman.next = null;
			head = eleman;
			tail = eleman;
			
			System.out.println("Liste olusturuldu. Eleman eklendi.");
		}
		else if (head != null && index == 0) {
			
			eleman.next = null;
			head = eleman;
			
			System.out.println(index + ". indexe eleman eklendi.");
		}
	
		else {
			int n = 0;
			Node temp = head;
			Node temp2 = head;
		
			while (temp.next != null) {
				
				n++;
				temp2 = temp;
				temp = temp.next;
			}
			
			if (n == index) {
				temp2.next = eleman;
				eleman.next = temp;
				System.out.println("eleman eklendi.");
			}
			else
			{
				temp = head;
				temp2 = head;
				int i = 0;
				
				while(i != index ) {
					
					temp2 = temp;
					temp = temp.next;
					
					i++; 
				}
				
				temp2.next = eleman;
				eleman.next = temp;
				
				System.out.println("Index "+index+". elemana eklendi.");
				
			}
		}
	}
	
	void basaEkle(int x) 
	{
		Node eleman = new Node();
		eleman.data = x;
		
		if(head == null) {
			
			eleman.next = null;
			head = eleman;
			tail = eleman;
			System.out.println("Liste olusturuldu. Eleman eklendi.");
		}
		else {
			
			eleman.next=head;
			head = eleman;
			System.out.println("Basa eleman eklendi.");
		}
		
		
	}
	
	void sonaEkle(int x) 
	{
		Node eleman = new Node();
		eleman.data = x;
		
		if(head == null) {
			
			eleman.next = null;
			head = eleman;
			tail = eleman;
			
			System.out.println("Liste olusturuldu. Eleman eklendi.");
		}
		else {
			
			eleman.next=null;
			tail.next = eleman;
			tail=eleman;
			
			
			System.out.println("Sona eleman eklendi.");
		}
		
		
	}
	
}
