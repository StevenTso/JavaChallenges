
public class main {
	public static void main(String[] args) {
		int i;
		BinaryTree BTree = new BinaryTree();
		
		BTree.insert(4);
		BTree.insert(2);
		BTree.insert(2);
		BTree.insert(5);
		BTree.insert(10);
		BTree.insert(8);
		
		for(i=0; i<10; i++) {
			System.out.println(BTree.find(i));
		}
		
		System.out.println("Min:" + BTree.findMin());
		System.out.println("Max:" + BTree.findMax());
		
		BTree.printPreorder(BTree.root);
		System.out.println();
		BTree.printInorder(BTree.root);
		System.out.println();
		BTree.printPostorder(BTree.root);
		System.out.println();
		
	}
}
