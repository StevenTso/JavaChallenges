public class InsertionSort {
	private int[] arrayIn;
	private int n;
	
	public InsertionSort(int[] arrayIn) {
		this.arrayIn = arrayIn;
		n = arrayIn.length;
	}
	
	public void sort() {
		int i, j;
		int cur;
		int element;
		for(i=0; i<n; i++) {
			cur = i;
			element = arrayIn[cur];
			while(cur>0 && arrayIn[cur-1]>element) {
				arrayIn[cur] = arrayIn[cur-1];
				cur--;
			}
			arrayIn[cur] = element;
		}
	}
	
	
	public void print() {
		int i;
		for(i=0; i<arrayIn.length; i++) {
			System.out.print(arrayIn[i] + ", ");
		}
	}
}