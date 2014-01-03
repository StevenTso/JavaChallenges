public class PairFinder {
	public static void main(String[] args) {
		findPair(10);
	}
	
	public static void findPair(int x) {
		for(int i=0; i<=x/2; i++) {
			int a = x-i;
			int b = i;
			System.out.println(a + ", " + b);
		}
	}

}