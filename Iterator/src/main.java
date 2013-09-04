import java.util.*;

public class main {
	public static void main(String[] args) {
		int i;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(i=0; i<10; i++) {
			al.add(i);
		}
		
		Iterator<Integer> iter = al.iterator();
		while(iter.hasNext()) {
			Object element = iter.next();
			System.out.print(element + ", ");
		}
	}
}
