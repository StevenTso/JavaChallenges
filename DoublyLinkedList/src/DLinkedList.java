
public class DLinkedList {
	Node head;
	Node tail;
	
	public DLinkedList() {
		head = tail = null;
	}
	
	public void insert(int value) {
		
	}
	
	public void insertEnd(int value) {
		
	}
	
	public void print() {
		Node traverse = head;
		while(traverse!=null) {
			System.out.print(traverse.value + ", ");
			traverse = traverse.next;
		}
	}
}
