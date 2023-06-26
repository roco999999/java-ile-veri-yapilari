import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BagliListe liste = new BagliListe();
		
		Scanner scan = new Scanner(System.in);
		
		int secim = -1;
		
		while (secim != 0) {
			System.out.println("1 -- basa ekle.");
			System.out.println("2 -- sona ekle.");
			System.out.println("3 -- araya ekle.");
		
			System.out.println("0 -- cikis.");
			
			System.out.println("Seciminiz: "); secim = scan.nextInt();
			
			switch(secim) {
			
			case 1: liste.basaEkle(); break;
			case 2: liste.sonaEkle(); break;
			case 3: liste.arayaEkle(); break;
			
			
			default : System.out.println("Hatali giris!"); break;
			
			}
			
			liste.yazdir();
			
			
		}
		
	}

}
