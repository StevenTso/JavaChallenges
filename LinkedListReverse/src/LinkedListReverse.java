//print a singly linked list in reverse

import java.util.LinkedList;
import java.util.Stack;


public class LinkedListReverse {

	public static void main(String[] args) {
		//Creation
		LinkedList<Integer> ll = new LinkedList<Integer>();
		Stack<Integer> st = new Stack<Integer>();
		
		//Addition
		for(int i=1; i<10; i++)
			ll.add(i);
		
		//Pushation
		int incrementer = 0;
		while(incrementer < ll.size())
			st.add(ll.get(incrementer++));
		
		//Printation
		while(!st.isEmpty())
			System.out.print(st.pop() + ", ");
		
	}

}
