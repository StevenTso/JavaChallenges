
public class BinaryTree {
	
	public class Node {
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			this.value = value;
			left = null;
			right = null;
		}
	}	
	
	
	Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	public boolean find(int value) {
		Node traverse = root;
		while(traverse!=null) {
			if(value == traverse.value) {
				return true;
			}
			else if(value < traverse.value) {
				traverse = traverse.left;
			}
			else {
				traverse = traverse.right;
			}
		}
		return false;
	}
	
	public void insert(int value) {
		Node nodeIn = new Node(value);
		if(root==null) {
			root = nodeIn;
		}
		else {
			Node traverse = root;
			Node parent;
			while(true) {
				parent = traverse;
				if(value<traverse.value) {
					traverse = traverse.left;
					if(traverse==null) {
						parent.left = nodeIn;
						return;
					}
				}
				else {
					traverse = traverse.right;
					if(traverse==null) {
						parent.right = nodeIn;
						return;
					}
				}
			}
		}
	}
	
	public int findMin() {
		Node traverse = root;
		while(traverse.left!=null) {
			traverse = traverse.left;
		}
		return traverse.value;
	}
	
	public int findMax() {
		Node traverse = root;
		while(traverse.right!=null) {
			traverse = traverse.right;
		}
		return traverse.value;
	}
	
	public void printPreorder(Node nodeIn) {
		if(nodeIn!=null) {
			System.out.print(nodeIn.value + ", ");
			printPreorder(nodeIn.left);
			printPreorder(nodeIn.right);
		}
	}
	
	public void printInorder(Node nodeIn) {
		if(nodeIn!=null) {
			printInorder(nodeIn.left);
			System.out.print(nodeIn.value + ", ");
			printInorder(nodeIn.right);
		}
	}
	
	public void printPostorder(Node nodeIn) {
		if(nodeIn!=null) {
			printPostorder(nodeIn.left);
			printPostorder(nodeIn.right);
			System.out.print(nodeIn.value + ", ");
		}
	}
	
}
