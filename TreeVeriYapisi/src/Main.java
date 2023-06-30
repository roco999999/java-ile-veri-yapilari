
public class Main {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		tree.root = tree.insert(tree.root, 10);
		tree.root = tree.insert(tree.root, 15);
		tree.root = tree.insert(tree.root, 8);
		tree.root = tree.insert(tree.root, 20);
		tree.root = tree.insert(tree.root, 4);
		tree.root = tree.insert(tree.root, 12);
		
		System.out.println("kokun data: "+tree.root.data);
		System.out.println("kokun sagindaki data: "+tree.root.right.data);
		System.out.println("kokun solundaki data: "+tree.root.left.data);
	}

}
