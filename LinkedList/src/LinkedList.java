
public class LinkedList {
	Node head;
	Node tail;
	
	public LinkedList() {
		head = tail = null;
	}
	
	public void insert(int value) {
		Node insertNode = new Node(value);
		insertNode.next = head;
		head = insertNode;
	}
	
	public void insertEnd(int value) {
		Node traverse = head;
		Node insert = new Node(value);
		
		while(traverse.next!=null) {
			traverse = traverse.next;
		}
		traverse.next = insert;
	}
	
	public void print() {
		Node traverse = head;
		while(traverse!=null) {
			System.out.print(traverse.value + ", ");
			traverse = traverse.next;
		}
	}
}
