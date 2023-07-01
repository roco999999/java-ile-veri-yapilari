
public class Node {
	
	int key;
	String isim; // value
	Node next;
	
	public Node() {
		next = null;
	}
	
	public Node(int key, String isim) {

		this.key = key;
		this.isim = isim;
		next = null;
	}
	

}
