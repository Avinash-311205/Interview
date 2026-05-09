public class binarytree {

	static class Node {
		int key;
		Node left, right;

		Node(int key) {
			this.key = key;
			left = right = null;
		}
	}

	private Node root;

	public void insert(int key) {
		root = insertRec(root, key);
	}

	private Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);
		// if equal, do nothing (no duplicates)
		return root;
	}

	public void inorder() {
		inorderRec(root);
		System.out.println();
	}

	private void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}

	public void preorder() {
		preorderRec(root);
		System.out.println();
	}

	private void preorderRec(Node root) {
		if (root != null) {
			System.out.print(root.key + " ");
			preorderRec(root.left);
			preorderRec(root.right);
		}
	}

	public void postorder() {
		postorderRec(root);
		System.out.println();
	}

	private void postorderRec(Node root) {
		if (root != null) {
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.print(root.key + " ");
		}
	}

	public static void main(String[] args) {
		binarytree tree = new binarytree();
		int[] values = {50, 30, 20, 40, 70, 60, 80};
		for (int v : values) tree.insert(v);

		System.out.println("Inorder traversal (should be sorted):");
		tree.inorder();

		System.out.println("Preorder traversal:");
		tree.preorder();

		System.out.println("Postorder traversal:");
		tree.postorder();
	}

}
