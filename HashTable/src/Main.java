
public class Main {

	public static void main(String[] args) {

		Table hashTable = new Table(5);
		hashTable.ekle(0, "Ahmet");
		hashTable.ekle(10, "Mehmet");
		hashTable.ekle(3, "Fatih");
		hashTable.ekle(4, "Bugra");
		hashTable.ekle(2, "Oguzhan");
		hashTable.ekle(22, "Hasan");
		hashTable.ekle(15, "Huseyin");
		hashTable.ekle(9, "Murat");

		hashTable.yazdir();

		hashTable.ekle(11, "Zirto");
		hashTable.ekle(1, "Cemealettin");
		hashTable.yazdir();
	}

}
