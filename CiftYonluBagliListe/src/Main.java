import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BagliListe liste = new BagliListe();
		Scanner scan = new Scanner(System.in);
		
		int secim = -1;
		int sayi;
		int index;
		
		while (secim != 0) {
			System.out.println("1 - basa ekle.");
			System.out.println("2 - sona ekle.");
			System.out.println("3 - yazdir.");
			System.out.println("4 - sondan yazdir.");
			System.out.println("5 - araya ekle.");
			System.out.println("6 - bastan sil.");
			System.out.println("7 - sondan sil.");
			System.out.println("8 - aradan sil.");
			System.out.println("0 - cikis.");
		
			secim = scan.nextInt();
			
			if (secim == 1) {
				sayi = scan.nextInt();
				liste.basaEkle(sayi);
			}
			else if (secim == 2) {
				sayi = scan.nextInt();
				liste.sonaEkle(sayi);
			}
			else if (secim == 5) {
				System.out.print("index gir: ");
				index = scan.nextInt();
				
				sayi = scan.nextInt();
				liste.arayaEkle(index, sayi);
			}
			else if (secim == 8) {
				System.out.print("index gir: ");
				index = scan.nextInt();
				

				liste.aradanSil(index);
			}
			else if (secim == 4) {
				
				liste.sondanYazdir();
			}
			else if (secim == 6) {
				
				liste.bastanSil();
			}
			else if (secim == 7) {
	
				liste.sondanSil();
			}
			else if (secim == 3) {
				
				liste.yazdir();
			}
			else {
				System.out.println("Hatali giris.");
			}
			
		}
		
		
		
	}
}
