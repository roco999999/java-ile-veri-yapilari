import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int n;
		System.out.println("Stack kapasitesi: ");
		n = scan.nextInt();
		
		Stack stack = new Stack(n);
		
		int secim = -1,sayi;
		
		while (secim != 0) {
			System.out.println("1 -- ekle");
			System.out.println("2 -- cikar");
			System.out.println("3 -- en usttekini goster");
			System.out.println("4 -- yazdir");
			System.out.println("0 -- cikis");
			
			System.out.println("Secim:");
			secim = scan.nextInt();
			
			switch (secim) {
			case 1: System.out.println("sayi: "); sayi = scan.nextInt(); stack.push(sayi); break; 
			case 2: stack.pop(); break;
			case 3: stack.showTop(); break;
			case 4: stack.print(); break;
			case 0: System.out.println("Cikis yapildi."); break;
				
			default: System.out.println(" [0-4] arasi secim yapin."); break;
				
			}
			
		}
	}

}
