
public class main {
	public static void main(String[] args) {
		int i;
		LinkedList LL = new LinkedList();
		
		for(i=9; i>=0; i--) {
			LL.insert(i);
		}
		
		LL.insertEnd(10);
		
		LL.print();
	}
}
