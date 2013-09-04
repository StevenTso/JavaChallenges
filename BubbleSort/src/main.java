
public class main {
	public static void main(String[] args) {
		int i;
		int[] arr = new int[10];
		BubbleSort BSort;
		
		for(i=9; i>0; i--) {
			arr[9-i] = i;
		}
		
		BSort = new BubbleSort(arr);
		BSort.sort();
		BSort.print();
	}
}