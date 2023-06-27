
public class Stack {
	
	int dizi[] ;
	int size;
	int index;
	public Stack(int size) {
		
		this.size = size;
		dizi = new int[size];
		index = -1;
	}
	
	void push(int data) 
	{
		
	
		if ( isFull() ) {
			System.out.println("Dizi ful");
		}
		else 
		{
			index++;
		dizi[index] = data;
		System.out.println("eklenen() : " + dizi[index]);
		}
		
		
	}
	
	int pop() {
	
		if( isEmpty()) 
		{
			
			System.out.println("Dizi bos.");
			return -1;
		}
		else
		{
			return dizi[index--];
		}
	}
	
	boolean isFull() 
	{
		return (index == size-1);
	}
	
	boolean isEmpty() 
	{
		return (index == -1);
	}
}
