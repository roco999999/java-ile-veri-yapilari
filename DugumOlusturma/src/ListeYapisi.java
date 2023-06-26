
public class ListeYapisi {
	
	Node head = null;
	Node tail = null;
	
	void yazdir () {
		if (head == null)
		{
			System.out.println("Liste boş.");
		}
		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data + " -> ");

				temp = temp.next;
				
			}
			System.out.println("Linkeddlist sonu.");
			
		}
		
		
	}
	
	void ekle(int x) 
	{
		Node eleman = new Node();	// eklenecek olan dugum
		eleman.data = x;
		eleman.next = null;
		
		if(head == null)
		{
			head = eleman;
			tail = eleman;
			System.out.println("Liste olusturuldu ve ilk node eklendi.");
		}
		
		else
		{
			tail.next = eleman;  // son elemanın devamına yeni dügüü ekledik
			tail = eleman;
			System.out.println("Listenin sonuna yeni eleman eklendi.");
		}
		
		
	}
	
	
	
}
