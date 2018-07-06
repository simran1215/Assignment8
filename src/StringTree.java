public class StringTree {
	private Node root;

	public StringTree() {
		root = null;
	}

	public void addWord(String word) {
		if (root == null) {
			root = new Node(word);
		} else {
			addUnder(root, word);
		}
	}

	public void addUnder(Node someNode, String someWord) {
		if (someWord.compareTo(someNode.value) < 0) {
			if (someNode.left == null) {
				someNode.left = new Node(someWord);
			} else {
				addUnder(someNode.left, someWord);
			}
		} else {
			if (someNode.right == null) {
				someNode.right = new Node(someWord);
			} else {
				addUnder(someNode.right, someWord);
			}
		}
	}

	public void printTree() {
		printAllNodes(root);
		System.out.println("");
	}

	public void printAllNodes(Node someNode) {
		if (someNode == null) {
			System.out.print("(_)");
		} else {
			System.out.print("(");
			printAllNodes(someNode.left);
			System.out.print(" " + someNode.value + " ");
			printAllNodes(someNode.right);
			System.out.print(")");
		}
	}

}
