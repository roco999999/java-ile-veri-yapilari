
public class Table {

	Node dizi[];
	int size;
	public Table(int size) {
	
		this.size = size;
		dizi = new Node [size];
			
		for (int i = 0 ; i<size ; i++)
		{
			dizi[i] = new Node();
		}
		
	}
	
	int indexUret(int key) {
		return (key%size);
	}
	
	void yazdir() 
	{
		Node temp = null;
		
		for(int i = 0;i<size;i++)
		{
			System.out.print(i+". index:  -> ");
			temp = dizi[i].next;
			while(temp != null)
			{
				System.out.print(temp.isim+", key = " + temp.key+ " -> ");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}
	
	void sil(int key)
	{
		int index = indexUret(key);
		
		Node temp = dizi[index];
		Node temp2 = dizi[index];
		
		if(temp.next == null)
		{
			System.out.println("Dizinin bu kisminda eleman yok.");
		}
		else if(temp.next.next == null && temp.next.key == key)
		{
			System.out.println(temp.next.isim + " son kisi silindi");
			temp.next = null;
			
		}
		else
		{
			while(temp.next != null)
			{
				if( temp.key == key)
				{
					temp2.next = temp.next;
					System.out.println(temp.isim + " silindi.");
				}
				temp2 = temp;
				temp = temp.next;
			}
		}
		
	}
	
	void ekle(int key, String isim) 
	{
		int index = indexUret(key);
		Node eleman = new Node(key, isim);
		Node temp = dizi[index];
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = eleman;
		System.out.println(eleman.isim + " eklendi.");
	}




}
