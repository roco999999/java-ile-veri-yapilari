import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		TekYonluListeYapisi liste = new TekYonluListeYapisi();

		Scanner scan = new Scanner(System.in);
		int secim =90;
		int sayi;
		int index;
		
		while ( secim != 0) {
			System.out.println("1 - Basa ekle");
			System.out.println("2 - sona ekle");
			System.out.println("3 - araya ekle");
			System.out.println("4 - bastan sil");
			System.out.println("5 - sondan sil");
			System.out.println("6 - aradan sil");
			System.out.println("0 - cikis.");
			
			System.out.println("Seciminizi yapin: ");
			secim = scan.nextInt();
			
			if (secim == 1) {
				System.out.println("Sayi: ");
				sayi = scan.nextInt();
				liste.basaEkle(sayi);
			}
			else if (secim == 2)
			{
				System.out.println("Sayi: ");
				sayi = scan.nextInt();
				liste.sonaEkle(sayi);
			}
			else if (secim == 3)
			{
				System.out.println("Sayi: ");
				sayi = scan.nextInt();
				System.out.println("Hangi indexe eklenecek: ");
				index = scan.nextInt();
				liste.arayaElemanEkle(index, sayi);
			}
			else if (secim == 4)
			{
				
				liste.bastanSil();
			}
			else if (secim == 5)
			{
				liste.sondanSil();
			}
			else if (secim == 6)
			{
				System.out.println("Handi indexi silmek istersiniz: ");
				index = scan.nextInt();
				liste.aradanSil(index);
			}
			else if(secim == 0) {
				System.out.println("Cikis yapildi");
				
			}
			else {
				System.out.println("Hatali giris.");
			}
			
			liste.yazdir();
			
			
			
		}
	}

}
