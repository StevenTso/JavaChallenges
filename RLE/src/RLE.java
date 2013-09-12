/*
 * Implement a method to perform basic string compression using the counts of 
 * repeated characters. For example, the string aabcccccaaa would become a2b1c5a3.
 * If the "compressed" string would not become smaller than the original string,
 * your method should return the original string. 
 */
public class RLE {

	public static void main(String[] args) {
		String stringIn = "aabcccccaaa";
		String stringOut = "";
		char curr = stringIn.charAt(0);
		char next;
		int counter = 1;
		for(int i=1; i<stringIn.length(); i++) {
			next = stringIn.charAt(i);
			if(curr==next) {
				counter++;
			}
			else {
				stringOut += curr;
				stringOut += counter;
				counter = 1;
				curr = next;
			}
		}
		stringOut += curr;
		stringOut += counter;
		if(stringOut.length() > stringIn.length())
				System.out.println(stringIn);
		else
			System.out.println(stringOut);
	}

}
