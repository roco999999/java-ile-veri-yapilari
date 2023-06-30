
public class Main {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

		tree.root = tree.insert(tree.root, 10);
		tree.root = tree.insert(tree.root, 5);
		tree.root = tree.insert(tree.root, 15);
		tree.root = tree.insert(tree.root, 20);
		tree.root = tree.insert(tree.root, 9);
		tree.root = tree.insert(tree.root, 12);

		System.out.print("PreOrder prensibiyle dolasir: ");
		tree.preOrder(tree.root);

		System.out.println();

		System.out.print("InOrder prensibiyle dolasir: ");
		tree.inOrder(tree.root);

		System.out.println();

		System.out.print("PostOrder prensibiyle dolasir: ");
		tree.postOrder(tree.root);

		System.out.println("\nAgacin yuksekligi: " + tree.height(tree.root));
		System.out.println("\nAgacin elemansayisi: " + tree.size(tree.root));

		tree.root = tree.deleteNode(tree.root, 15);
		System.out.println();

		System.out.print("PreOrder prensibiyle dolasir: ");
		tree.preOrder(tree.root);

		System.out.println();

		System.out.print("InOrder prensibiyle dolasir: ");
		tree.inOrder(tree.root);

		System.out.println();

		System.out.print("PostOrder prensibiyle dolasir: ");
		tree.postOrder(tree.root);

		System.out.println("\nAgacin yuksekligi: " + tree.height(tree.root));
		System.out.println("\nAgacin elemansayisi: " + tree.size(tree.root));
	}

}
