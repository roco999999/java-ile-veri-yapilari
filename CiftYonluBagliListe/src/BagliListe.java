
public class BagliListe {
	
	// çift yonlu dogrusal baglı liste
	
	Node head = null;
	Node tail = null;
	
	
	void bastanSil() {
		if (head != null) {
			if (head.next == null) {
				head = null;
				tail = null;
			}
			else
			{
				head = head.next;
				head.prev = null;
			}
		}
	}
	
	void sondanSil() {
		if (head != null) {
			if (head.next == null) {
				head = null;
				tail = null;
			}
			else
			{
				tail = tail.prev;
				tail.next = null;
			}
		}
	}

	void aradanSil(int index) {
		if (head != null) {
			if (head.next == null && index <=0) {
				head = null;
				tail = null;
			}
			else if (head.next == null && index <= 0)
			{
				head = head.next;
				head.prev = null;
			}
			else 
			{
				int n = 0;
				Node temp = head;
				while (temp != null) {
					n++;
					temp = temp.next;
				}
				if (index >= (n-1) ) {
					tail=tail.prev;
					tail.next = null;
					
				}
				else {
					int i = 0;
					temp = head;
					
					
					while(index > i) {
						
						temp = temp.next;
						i++;
						
					}
					temp.next.prev = temp.prev;
					temp.prev.next = temp.next;
					
					
				}
				
				
			}
			}
	}
	
	void basaEkle (int data) {
	
		Node eleman = new Node(data);
		
		if (head == null) {
			head = eleman;
			tail = eleman;
			
		}
		else 
		{
			head.prev = eleman;
			eleman.next = head;
			head = eleman;
			
		}
		
	}
	
	void sonaEkle(int data) {
		Node eleman = new Node(data);
		
		if (head == null) {
			head = eleman;
			tail = eleman;
			
		}
		else 
		{
			tail.next = eleman;
			eleman.prev = tail;
			tail = eleman;
			
		}
		
	
	}
	
	void yazdir () {
		
		Node temp = head;
		System.out.print("bas -> ");
		if (head == null) {
			System.out.println("Liste bos.");
		}
		else 
		{
			while (temp != null) {
				System.out.print(temp.data+ " -> ");
				temp = temp.next;
			}
			System.out.println(" son");
		}
		
	}
	
	void sondanYazdir () {
		Node temp = tail;
		System.out.print("bas -> ");
		if (head == null) {
			System.out.println("Liste bos.");
		}
		else 
		{
			while (temp != null) {
				System.out.print(temp.data+ " -> ");
				temp = temp.prev;
			}
			System.out.println(" son");
		}
		
	}
				
	void arayaEkle(int index, int data) {
		
		Node eleman = new Node(data);
		int n = 0;
		int i = 0;
		if (head == null) {
			head = eleman;
			tail = eleman;
			
		}
		else if (head != null && index == 0)
		{
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
		}
		else {
			
			Node temp = head;
			
			while (temp  != null ) {
				temp=temp.next;
				n++;
			}
			
			if (index > n)
			{
				tail.next = eleman;
				eleman.prev = tail;
				tail = eleman;
			}
			else 
			{
				Node temp2 = head;
				temp = head;
				while(i != index) {
					temp2 = temp;
					temp = temp.next;
					i++;
				}
				
				temp2.next = eleman;
				eleman.prev = temp2;
				
				eleman.next = temp;
				temp.prev = eleman;
				
				
			}
			
			
		}
		
	
	}
	
	
	
	
	
}
