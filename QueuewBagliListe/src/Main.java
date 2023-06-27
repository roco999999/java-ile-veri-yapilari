import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int secim = -1;
		int size;
		System.out.print("Siranin uzunlugu: "); size = scan.nextInt();
		QueueYapisi queue = new QueueYapisi(size);
		
		while ( secim != 0)
		{
			System.out.println("1 -- kuyruga adam ekle.");
			System.out.println("2 -- kuyruktan adam cikar.");
			System.out.println("3 -- kuyru goster.");
			System.out.println("4 -- kuyrukta kac eleman var?");
			System.out.println("0 -- cikis.");
			
			System.out.print("Seciminizi girin: ");
			secim = scan.nextInt();
			
			switch (secim) {
			case 1: queue.enQueue(); break;
			case 2: queue.deQueue();break;
			case 3: queue.yazdir();break;
			case 4: queue.elemanSayisi();break;
			case 0: System.out.println("cikis yapildi."); break;
				
				
			default: System.out.println("yanlis secim."); break;
			
			}
			
		}
		
		
	}

}
