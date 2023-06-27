
public class Stack {
	int size;
	int counter;
	
	Node top; // en üst node u tutar 
	
	public Stack(int size) {
		
		this.size = size;
		counter = 0;
		top = null;
	}
	
	
	// ekleme
	void push(int data) {
		
		Node eleman = new Node(data);
		if (isFull()) {
			System.out.println("Stack dolu ekleme yapilamaz.");
		}
		else
		{
			if (isEmpty())
			{
				top = eleman;
				top.next = null;
				System.out.println(top.data+" stack e ilk eleman olarak eklendi");
				
			}
			else
			{
				eleman.next = top;
				top = eleman;
				System.out.println(top.data+" stack e eleman olarak eklendi.");
				
			}
			counter++;
		}
		
		
	
	}
	
	
	
	// cikarma
	void pop () {
		if (isEmpty())
		{
			System.out.println("Stack bos.");
		}
		else
		{
			System.out.println(top.data+" cikarildi.");
			top = top.next;
			counter--;
		}
	}
	void showTop() {
		if (isEmpty()) {
			System.out.println("Stack bos.");
		}
		else
		{
			System.out.print("En ustteki dugumun datasi: ");
			System.out.println(top.data);
		}
	}
	
	
	void print() {
		if (isEmpty()) {
			System.out.println("Stck bos yazdirilacak bir sey yok.");
		}
		else
		{
			Node temp = top;
			System.out.println("Stack deki veriler: ");
			
			while (temp != null)
			{
				System.out.println(temp.data);
				temp  = temp.next;
			}
			System.out.println("\n");
		}
	}
	
	boolean isFull() {
		return counter == size;
	}
	
	boolean isEmpty() {
		return counter == 0;
	}

	
}
