import java.util.Scanner;

public class BagliListe {
	
	Node head = null;
	Node tail = null;
	
	Scanner scan = new Scanner(System.in);
	
	void basaEkle() {
		int data;
		data = scan.nextInt();
		Node eleman = new Node(data);
		
		if (head == null) {
			head  = eleman;
			tail = eleman;
			tail.next = head;
		}
		else
		{
			eleman.next = head;
			head = eleman;
			tail.next = head;
		}
		
		
	}

	void sonaEkle() {
		int data;
		System.out.println("Data: ");
		data = scan.nextInt();
		Node eleman = new Node(data);
		
		if (head == null) {
			head  = eleman;
			tail = eleman;
			tail.next = head;
		}
		else
		{
			tail.next = eleman;
			tail= eleman;
			tail.next = head;
			
			
		}
		
		
	}
	
	void yazdir() {
		if (head == null) {
			System.out.println("liste bos.");
		}
		else
		{
			Node temp = head;
			System.out.print("bas -> ");
			while(temp != tail) {
				System.out.print(temp.data+ " -> ");
				temp=temp.next;
			}
			System.out.println(temp.data+"-> son");
		}
	}
	
	void arayaEkle() {
		int data, indis;
		System.out.println("Indis: ");
		indis = scan.nextInt();
		System.out.println("Data: ");
		data = scan.nextInt();
		
		Node eleman = new Node(data);
		
		if (head == null) {
			head  = eleman;
			tail = eleman;
			tail.next = head;
		}
		else if (indis == 0)
		{
			eleman.next = head;
			head = eleman;
			tail.next = head;
		}
		else 
		{
			int n = 0;
			Node temp = head;
			Node temp2 = head;
			
			while(temp != tail) 
			{
			
				temp = temp.next;
				n++;
			}
			n++;
			
			if(indis >= (n)) {
				tail.next = eleman;
				tail= eleman;
				tail.next = head;
			}
			else
			{
				int i =0;
				temp = head;
				temp2 = head;
				while(i<indis) {
					i++;
					temp2 = temp;
					temp = temp.next;
				}
				temp2.next = eleman;
				eleman.next = temp;
			}
		
		}



	}
	
	void bastanSil() {
		if (head == null)
		{
			System.out.println("Liste bos");
			
		}
		else if(head == tail){
			head = null;
			tail=null;
		}
		else
		{
			head = head.next;
			tail.next = head;
		}
		
	}
	
	void sondanSil() {
		if (head == null)
		{
			System.out.println("Liste bos");
			
		}
		else if(head == tail){
			head = null;
			tail=null;
		}
		else
		{
			Node temp = head;
			while(temp.next != tail) {
				temp = temp.next;
			}
			
			tail = temp;
			temp.next = head;
			
		}
		
	}
	void aradanSil() {
	
		
		if (head == null)
		{
			System.out.println("Liste bos");
			
		}
		else if(head == tail){
			head = null;
			tail=null;
		}
		else
		{
			
			int n=0,indis;
			System.out.println("indis: ");
			indis = scan.nextInt();
			scan.nextLine();
			
			Node temp = head;
			Node temp2 = head;
			while(temp != tail) {
				n++;
				temp = temp.next;
			}
			n++;
			int i = 0;
			temp = head;
			while(i<indis) {
				temp2 = temp;
				temp = temp.next;
				i++;
			}
			
			temp2.next = temp.next;
			
		}
		
	}
	

}
