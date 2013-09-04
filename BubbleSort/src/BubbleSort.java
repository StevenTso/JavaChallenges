public class BubbleSort {
	private int[] arrayIn;
	private int n;
	
	public BubbleSort(int[] arrayIn) {
		this.arrayIn = arrayIn;
		n = arrayIn.length;
	}
	
	public void sort() {
		int i, j;
		for(i=0; i<n; i++) {
			for(j=1; j<(n-i); j++) {
				if(arrayIn[j-1]>arrayIn[j]) {
					swap(j-1, j);
				}
			}
		}
	}
	
	private void swap(int prev, int curr) {
		int temp = arrayIn[prev];
		arrayIn[prev] = arrayIn[curr];
		arrayIn[curr] = temp;
	}
	
	public void print() {
		int i;
		for(i=0; i<arrayIn.length; i++) {
			System.out.print(arrayIn[i] + ", ");
		}
	}
}

