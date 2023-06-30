
public class BinaryTree {

	Node root;

	public BinaryTree() {
		root = null;
	}

	Node newNode(int data) {

		root = new Node(data);
		return root;
	}

	void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");

		}
	}

	Node deleteNode(Node root, int data) {

		if (root == null)
			return root;

		if (root.data > data) {
			root.left = deleteNode(root.left, data);
			return root;
		} else if (root.data < data) {
			root.right = deleteNode(root.right, data);
			return root;
		}

		if (root.left == null) {
			Node temp = root.right;
			return temp;
		} else if (root.right == null) {
			Node temp = root.left;
			return temp;
		}

		else {

			Node succParent = root;
			Node succ = root.right;
			while (succ.left != null) {
				succParent = succ;
				succ = succ.left;
			}

			if (succParent != root)
				succParent.left = succ.right;
			else
				succParent.right = succ.right;

			root.data = succ.data;

			return root;
		}
	}

	void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);

		}
	}

	void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	Node insert(Node root, int data) {
		if (root != null) {
			if (data < root.data) {
				root.left = insert(root.left, data);
			} else {
				root.right = insert(root.right, data);
			}
		} else {
			root = newNode(data);
		}
		return root;
	}

	int size(Node root) {
		if (root == null) {
			return 0;
		} else {
			return size(root.left) + 1 + size(root.right);
		}
	}

	int height(Node root) {

		if (root == null) {
			return 0; // return 0; dersek root node u 1. kat olarak alır.
		} else {
			int sol = 0, sag = 0;
			sol = height(root.left);
			sag = height(root.right);

			if (sol > sag) {
				return sol + 1;
			} else {
				return sag + 1;
			}
		}
	}

}
